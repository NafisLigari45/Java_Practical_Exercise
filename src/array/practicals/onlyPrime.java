package CompanyExercise;

import java.util.Scanner;

public class onlyPrime {
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value:-");
		
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			int j;
			for(j=2;j<Math.sqrt(i);j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j>Math.sqrt(i)) {
				System.out.println(i);
			}
		}
	}
}	
