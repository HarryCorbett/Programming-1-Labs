import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

class WordGroup {

    private String words;

    /**
     * Constructor for words, converts to lower case
     *
     * @param words stores the string of words
     */
    WordGroup(String words) {
        this.words = words.toLowerCase();
    }

    /**
     * converts a string of words into an array with each element being a single word
     *
     * @return array of words from the string
     */
    private String[] getWordArray() {
        return words.split(" ");
    }

    /**
     * Produce an set containing all the words that appear, but with no repeats
     *
     * @param wordGroup passes through object containing strings
     * @return set
     */
    HashSet<String> getWordSet(WordGroup wordGroup) {
        HashSet<String> set = new HashSet<String>();
        Collections.addAll(set, this.getWordArray());
        Collections.addAll(set, wordGroup.getWordArray());
        return set;
    }

    /**
     * Create a hash map containing the words that appear and how many times they appear
     *
     * @return hashMap
     */
    HashMap<String, Integer> getWordCounts() {

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        for (String word : getWordArray()) {

            if(hashMap.containsKey(word)){
                hashMap.put(word,hashMap.get(word)+1);
            }else{
                hashMap.put(word,1);
            }

        }

        return hashMap;
    }
}

