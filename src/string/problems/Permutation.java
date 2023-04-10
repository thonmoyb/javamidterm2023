package string.problems;
import java.util.HashSet;
import java.util.Set;

public class Permutation {


    public static class StringPermutations {
        public static void main(String[] args) {
            String input = "abc";
            Set<String> permutations = getPermutations(input);
            System.out.println("Permutations of " + input + ":");
            System.out.println(permutations);
        }

        private static Set<String> getPermutations(String str) {
            Set<String> result = new HashSet<>();
            if (str == null || str.length() == 0) {
                result.add("");
                return result;
            }

            char firstChar = str.charAt(0);
            String remainingString = str.substring(1);
            Set<String> words = getPermutations(remainingString);

            for (String word : words) {
                for (int i = 0; i <= word.length(); i++) {
                    String permutation = insertCharAt(word, firstChar, i);
                    result.add(permutation);
                }
            }

            return result;
        }

        private static String insertCharAt(String str, char ch, int index) {
            String start = str.substring(0, index);
            String end = str.substring(index);
            return start + ch + end;
        }
    }}



/*
         * Permutation of String "ABC" is "ABC"                   "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
