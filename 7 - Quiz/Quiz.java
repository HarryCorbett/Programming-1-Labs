import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class used to run the Quiz
 */
public class Quiz {

    private ArrayList<FlashCard> flashCards;
    private FileOutputStream fos;

    private Scanner sc = new Scanner(System.in);

    // create a new file output stream for writing to the save.txt file
    {
        try {
            fos = new FileOutputStream("save.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * Construcotr for the Quiz
     *
     * @param fileName , Name of the file containing the questions and answers
     */
    private Quiz(String fileName) {

        FlashCardReader fcr = new FlashCardReader(fileName);
        this.flashCards = fcr.getFlashCards();

        play();
    }

    /**
     * Main method to create the quiz off of a given question file
     */
    public static void main(String[] args) {
        Quiz quiz = new Quiz("Questions.txt");
    }

    /**
     * Play the quiz
     */
    private void play() {

        int questionCount = 0;
        int correctAnswers = 0;

        System.out.println("Would you like to save this quiz? ");

        // take user answer
        String saveAnswer = sc.nextLine();

        // Output the quiz questions
        for (FlashCard flashCard : flashCards) {

            String userAnswer;
            String correct;

            System.out.println(flashCard.getQuestion());

            // take user answer
            userAnswer = sc.nextLine();

            // Output if the user is correct and save if they were correct so it can be written to the file
            if (userAnswer.equals(flashCard.getAnswer())) {
                System.out.println("right");
                correct = "right";
                correctAnswers += 1;

            } else {
                System.out.println("wrong");
                System.out.println("Correct answer: " + flashCard.getAnswer());
                correct = "wrong";
            }

            // count that a question has been asked
            questionCount += 1;

            // If the quiz is to be saved, output the questions details into the file
            if (saveAnswer.equals("Y")) {

                save(flashCard, correct, userAnswer);

            }
        }

        // Save the marks and total questions of the quiz into the file
        if (saveAnswer.equals("Y")) {

            double percentage = (double) correctAnswers / (double) questionCount * 100;


            PrintStream print = new PrintStream(fos);

            print.println(correctAnswers + "," + questionCount + "," + percentage);

        }


    }

    /**
     * Save the information of the given question to the file
     * @param flashcard for the question to write to the file
     * @param correct stores "right" or "wrong" depending on if the users answer was correct
     * @param answer Users answer to the question
     */
    private void save(FlashCard flashcard, String correct, String answer) {

        PrintStream print = new PrintStream(fos);

        print.println(flashcard.getQuestion() + "," + answer + "," + correct);

    }

}
