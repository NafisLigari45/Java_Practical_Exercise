// Write a program to Sort Array and print in Ascending order.

package CompanyExercise;

import java.util.Arrays;

public class arraySorting {
	public static void main(String args[]) {
		int a[]=new int[]{8,7,8,1,2,3,5,4};
		
		Arrays.sort(a);
		System.out.println("Array Sorted in Ascending order:");
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
