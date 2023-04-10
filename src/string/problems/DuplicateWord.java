package string.problems;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {

            String inputString = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
                String[] words = inputString.split(" ");
                Map<String, Integer> wordCountMap = new HashMap<>();

                for (String word : words) {
                    if (wordCountMap.containsKey(word)) {
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    } else {
                        wordCountMap.put(word, 1);
                    }
                }

                System.out.println("Duplicate words in the string:");
                for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                    if (entry.getValue() > 1) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                }
            }
        }

        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        //String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";




