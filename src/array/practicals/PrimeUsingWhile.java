// Write a program to find the given number is prime or not using While loop.
package CompanyExercise;

public class PrimeUsingWhile {
	public static void main(String args[]) {
		int n = 10;
		int i = 2;

		while (i < Math.sqrt(n) + 1) {
			if (n % i == 0) {
				System.out.println("This Is Not Prime Number");
				return;
			}
			i++;
		}
		System.out.println("This Is Prime Number");
	}
}
