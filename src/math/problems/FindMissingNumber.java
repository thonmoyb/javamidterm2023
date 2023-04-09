package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);

    }

    public static int findMissingNumber(int[] array) {
            // Calculate the expected sum
            int n = array.length + 1;
            int expectedSum = (n * (n + 1)) / 2;

            // Calculate the actual sum
            int actualSum = 0;
            for (int i = 0; i < array.length; i++) {
                actualSum += array[i];
            }

            // Calculate the missing number
            int missingNumber = expectedSum - actualSum;

            return missingNumber;
        }
    }

    /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */

