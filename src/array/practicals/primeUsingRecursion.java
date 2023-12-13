package CompanyExercise;

import java.util.Scanner;

public class primeUsingRecursion {
	public static void main(String args[]) {
		int n = 1000;
		int i = 2;

		for (int j = 0; j < n; j++) {
			if(prime(j, i)) {
				System.out.println(j);
			}
		}	
	}
	
	static boolean prime(int n, int i) {
		
		if (n % i == 0 && n != 2 || n == 1) {

			return false;
		}

		if (i < Math.sqrt(n)) {

			return prime(n, i + 1);
		}
		return true;

	}
}
