package CompanyExercise;

public class bubbleSort {
	public static void main(String args[]) {
		int temp = 0;
		int a[] = new int[] { 6, 12, 15, -1, 3, 5, 2, 1, 16 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.println(a[i]);
		}
	}
}
