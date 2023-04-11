package string.problems;

import org.bson.io.BsonOutput;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        Scanner sc=new Scanner(System.in);
        String original;
        String reverse="";

        System.out.println("Enter your word:");
        original= sc.nextLine();

    for(int i=original.length()-1;i>=0;i--){
        reverse += original.charAt(i);
    }

    boolean palindrome=true;
    for(int i=0;i<original.length();i++){
        if(original.charAt(i) != reverse.charAt(i)){
        palindrome=false;
            System.out.println("not palindrome");

        }



    }}}








