package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> lines = new LinkedList<>() {
		};
		lines.add("john");
		lines.add("doe");
		lines.add("jane");
		lines.add("joe");
		lines.remove("doe");
		System.out.println(lines.peek());//checks who is first in line,output john
		lines.poll();//takes john off-line,remaining two people are printed

		for(String line:lines) {
			System.out.println(line);

		}

		Iterator<String> it = lines.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}}
