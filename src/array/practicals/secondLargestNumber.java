// Write a program to find Second Largest Number Of Given Array.
package CompanyExercise;

import java.util.Arrays;

public class secondLargestNumber {
	public static void main(String args[]) {
		int a[]=new int[] {55,44,641,115,810,321,810};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int secondlargest=a[a.length-2];
		System.out.println(secondlargest);
	}
}
