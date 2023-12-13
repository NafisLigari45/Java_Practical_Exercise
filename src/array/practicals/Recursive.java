//print 1 to 10 using recursive function.
package CompanyExercise;

public class Recursive {
	public static void main(String args[]) {

		int n = 1;
		int last = 10;

		Recursive recursive = new Recursive();
		recursive.number(n, last);

	}

	public Boolean number(int n, int last) {

		if (n < last) {
			System.out.println(n);

		} else {
			return false;
		}
		return number(n + 1, last);
	}
}
