package math.problems;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the pyramid: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }
  }
