package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> foods = new ArrayList<String>();
		foods.add("pizza");
		foods.add("burgers");
		foods.add("hotdogs");
		foods.add("steaks");
		foods.add("chicken");
		foods.remove("burgers");

		for(String food:foods){
			System.out.println(food);


			Iterator<String> it = foods.iterator();

			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
	}

}
