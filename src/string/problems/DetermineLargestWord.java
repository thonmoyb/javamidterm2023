package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement


                String sentence = "Human brain is a biological learning machine";
                String[] words = sentence.split(" "); // split the sentence into an array of words

                int maxLength = 0;
                String longestWord = "";

                for (String word : words) {
                    if (word.length() > maxLength) { // if the length of the current word is greater than maxLength
                        maxLength = word.length(); // update maxLength to the length of the current word
                        longestWord = word; // set longestWord to the current word
                    }
                }

                System.out.println(maxLength+" "+longestWord);
            }





    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement

        return map;
    }
}
