import java.io.*;
import java.util.ArrayList;
class FlashCardReader {

    private BufferedReader reader;

    /**
     * Constructor for the file and reader
     *
     * @param fileName name of the file to read
     */
    FlashCardReader(String fileName) {

        try {
            this.reader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found, error:");
            e.printStackTrace();
            this.reader = null;
        }
    }

    /**
     * get the next line of the file
     */
    private String getLine() {

        try {
                return reader.readLine();
        } catch (IOException e) {
            return "failed to read";
        }
    }

    /**
     * Find out if the reader is ready to read the file
     *
     * @return true if ready
     */
    private Boolean fileIsReady() {
        try {
            return (reader != null && reader.ready());
        } catch (IOException e) {
            return false;
        }
    }

    /**
     * Create an array list containing h card objects, created from the questions in the text file
     * @return flashCards
     */
    ArrayList<FlashCard> getFlashCards(){

        ArrayList<FlashCard> flashCards = new ArrayList<FlashCard>();

        while(this.fileIsReady()) {
            String line = getLine();
            if(line != null) {
                String[] parts = line.split(":");
                String question = parts[0];
                String answer = parts[1];

                flashCards.add(new FlashCard(question, answer));
            }
        }

        return flashCards;
    }
}