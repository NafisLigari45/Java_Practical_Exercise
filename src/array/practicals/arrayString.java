
//Write a program to print sum of given Array.
package CompanyExercise;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfArray {
	public static void main(String args[]) {
	int a[]=new int[] {45,45,10};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
