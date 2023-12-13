package CompanyExercise;

public class recursionEx {
	static int num = 1;

	public static void main(String args[]) {
		int n = 1000;
		
		printNumber(n);
	}
	static void printNumber(int n) {
		if (n > 0) {
			System.out.println(n+"=="+num++);
			printNumber(n - 1);
		}
	}
}
