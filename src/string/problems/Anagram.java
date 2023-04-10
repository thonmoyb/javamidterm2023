package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two words:");
        String string1= sc.next();
        String string2= sc.next();

        char[] array1 = string1.toUpperCase().toCharArray();
        char[] array2 = string2.toUpperCase().toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        if (Arrays.equals(array1, array2)) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("String are NOT anagram");

        }






    }
}
