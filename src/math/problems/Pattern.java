package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		int num = 100;
		int diff = 1;



		while (num >= 32) {

			System.out.print(num + ", ");
			if (num == 90) {
				diff = 2;
			} else if (num == 70) {
				diff = 3;
			} else if (num == 40) {
				diff = 4;
			}
			num -= diff;
		}


	}
}
