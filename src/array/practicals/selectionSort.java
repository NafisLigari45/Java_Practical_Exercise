package CompanyExercise;

public class selectionSort {
	public static void main(String args[]) {
		int temp = 0;
		int a[] = new int[] { 8, 4, 6, 5, 55, 44, -9, 2,1 };
		for (int i = 0; i < a.length-1; i++) {
			int index = i;

			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[index]) {
					index = j;
				}
			}
			if (index != i) {
				temp = a[i];
				a[i] = a[index];
				a[index] = temp;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
