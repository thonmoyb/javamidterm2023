package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

		int lowest = array[0]; // initialize the variable to the first element of the array
		for (int i = 1; i < array.length; i++) {
			if (array[i] < lowest) {
				lowest = array[i]; // update the lowest variable if a lower number is found
			}
		}
		System.out.println("The lowest number in the array is: " + lowest);
	}


}


		//Find and return lowest integer in array


		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */


		//find lowest number from the array






