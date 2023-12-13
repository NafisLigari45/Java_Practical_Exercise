package CompanyExercise;

import java.util.Scanner;

public class reverseString {
	public static void main(String args[]) {
		String n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:-");
		
		n=sc.next();
		
		for(int i=n.length();i>0;i--) {
			System.out.print(n.charAt(i-1));
		}
	}
}
