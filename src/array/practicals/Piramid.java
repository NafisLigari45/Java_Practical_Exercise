// Write a program to print Piramid.
package CompanyExercise;

public class Piramid {
	public static void main(String args[]) {
		int renge=5;
		for(int i=1;i<=renge;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
