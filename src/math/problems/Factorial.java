package math.problems;


import org.junit.Assert;

import java.util.Scanner;

public class Factorial {

    //iteration
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int factorial;
        int n=1;
        int answer=0;
        do {
            System.out.println("What number factorial do you want?");
            factorial= sc.nextInt();
            for(int i=1;i<=factorial;i++)
            {
                n=n*i;
            }
            System.out.println(n);

            int expectedNum=120;
            Assert.assertEquals(expectedNum,n);


            System.out.println("Do you want another factorial?");
            System.out.println("1-yes");
            System.out.println("2-no");
            answer=sc.nextInt();

        }while(answer==1);
        System.out.println("have a good day");



    }

    }




    /*recursion
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
    }

    public static int factorial(int n)
    {

        if (n == 1)
        {
            return 1;
        } else
        {
            return n * factorial(n - 1);
        }

    }
    */
            /*
             * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
             * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
             *
             */



