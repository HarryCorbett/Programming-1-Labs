import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    /**
     * main method for testing functionality of WordGroup class
     */
    public static void main(String[] args) {

        // create two new wordgroups
        WordGroup group1 = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup group2 = new WordGroup("When you play play hard when you work dont play at all");

        System.out.println("Word group 1: You can discover more about a person in an hour of play than in a year of conversation");
        System.out.println("Word group 2: When you play play hard when you work dont play at all");

        System.out.println();

        // Output the hashset containing all words from both word groups but no repeats
        System.out.println("Hash set of all words From both groups with no repeats:");
        for (String word : group1.getWordSet(group2)) {
            System.out.print(word + " ");
        }

        System.out.println();

        // Output list of words that appear with the amount of times they appear for each word group
        // Outputting word group 1
        System.out.println();
        System.out.println("Words that appear in Group 1 and the number of times they occur:");

        HashMap<String, Integer> hashMap1 = group1.getWordCounts();
        Set<String> keys1 = hashMap1.keySet();

        for (String word : keys1) {

            System.out.println(word + ": " + hashMap1.get(word).toString());
        }

        // Outputting word group 2
        System.out.println();
        System.out.println("Words that appear in Group 2 and the number of times they occur:");

        HashMap<String, Integer> hashMap2 = group2.getWordCounts();
        Set<String> keys2 = hashMap2.keySet();

        for (String word : keys2) {

            System.out.println(word + ": " + hashMap2.get(word).toString());
        }

        // Outputting combined groups and the amount of times each word appears
        System.out.println();
        System.out.println("Words that appear in either group and the number of total times they occur in both groups");

        //create a hash set containing all appearing words (no repeats)
        HashSet<String> completeWordSet = new HashSet<String>();
        completeWordSet = group1.getWordSet(group2);

        // Output each word and the amount of times it appears
        for(String word : completeWordSet) {
            if(keys1.contains(word) && keys2.contains(word)){
                System.out.println(word + ": " + (hashMap1.get(word) + hashMap2.get(word)));
            }else if(keys1.contains(word)){
                System.out.println(word + ": " + hashMap1.get(word));
            }else if(keys2.contains(word)){
                System.out.println(word + ": " + hashMap2.get(word));
            }
        }

    }
}
