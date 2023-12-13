// Write a program to Find Prime Number Using Recurcive Function.

package CompanyExercise;

import java.util.Scanner;

public class primeRecursion {
	public static void main(String args[]) {
		int n=13;
		
		if(isPrime(n, 2))
			System.out.println("This Is Prime Number");
		else
			System.out.println("This Is Not Prime Number");
	}
	
	static boolean isPrime(int n, int i) {
		/*
		 * if(n<=2) return (n==2)? true:false;
		 */
		if(n%i==0)
			return false;
		
		if(i*i>n)
			return true;
		
		return isPrime(n, i+1);
		
	}
	
}
