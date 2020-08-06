/**
 * Class for storing each question and answer as an object
 */
class FlashCard {

    private String question;
    private String answer;

    /**
     * Constructor for FlashCard
     * @param question .
     * @param answer .
     */
    FlashCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    /**
     * @return questions
     */
    String getQuestion() {
        return question;
    }

    /**
     * @return answer
     */
    String getAnswer() {
        return answer;
    }

}
