package CompanyExercise;
//Write A Program to Print Number Is Odd Or Even Frome Given Value Using Recursive Function.

public class oddevenRecursive {
	public static void main(String args[]) {
		int n = 1;
		int count = 15;
		oddeven(count, n);
	}

	static void oddeven(int count, int n) {
		if (count > 0) {

			if (n % 2 == 0) {
				System.out.println(n + " is Even Number\n");
			} else {
				System.out.println(n + " is Odd Number\n");
			}
			oddeven(count - 1, n + 1);
		}
	}
}
