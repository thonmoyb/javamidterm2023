package math.problems;
import java.util.ArrayList;
import java.util.List;


public class PrimeNumber {

		public static void main(String[] args) {
			int limit = 1000000;
			List<Integer> primeNumbers = new ArrayList<>();

			for (int i = 2; i <= limit; i++) {
				if (isPrime(i)) {
					primeNumbers.add(i);
				}
			}

			System.out.println("Prime numbers from 2 to 1 million:");
			System.out.println(primeNumbers);
		}

		private static boolean isPrime(int num) {
			if (num < 2) {
				return false;
			}

			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}

			return true;
		}
	}


