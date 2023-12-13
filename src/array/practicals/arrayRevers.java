	package CompanyExercise;

import java.util.Arrays;

public class arrayRevers {
	public static void main(String args[]) {
		/*
		 * int a[] = new int[] { 1, 2, 3, 4, 5, 6 };
		 * 
		 * int i = 0; while (i < a.length / 2) { int temp=a[i]; a[i]=a[a.length-i-1];
		 * a[a.length-i-1]=temp;
		 * 
		 * System.out.println(Arrays.toString(a)); i++; }
		 */

//		for(int i=a.length-1;i>=0;i--) {
//			
//			System.out.println(a[i]);
//			
//		
//		}

//		for (int i = 0; i < a.length/2; i++) {
//			int temp = a[i];
//			a[i] = a[a.length-i-1];
//			a[a.length-i-1] = temp;
//			System.out.println(Arrays.toString(a));
//		}
//		
	reverseArray();
//		gtlt();
	//	arrayFindMaxandSmall();
	}

	public static void swap() {
		int a = 5;
		int b = 6;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	}

	public static void reverseArray() {
		int a[] = new int[] { 11, 8, 45, 63, 88 };

		for (int i = 0; i < a.length / 2; i++) {
			a[i] = a[i] + a[a.length - 1 - i];
			a[a.length - 1 - i] = a[i] - a[a.length - 1 - i];
			a[i] = a[i] - a[a.length - 1 - i];

		}
		System.out.println(Arrays.toString(a));
	}

	public static void gtlt() {
		int a = 566, b = 66, c = 445;

		if (a > b && a > c) {

			System.out.println("a is Bigest");
			if (b > c) {
				System.out.println("c is smmalest ");
			} else {
				System.out.println("b is smallest");
			}
		}
		if (b > a && b > c) {
			System.out.println("b is biggest");
			if (c > a) {
				System.out.println("a is smalest");
			} else {
				System.out.println("c is smallest");
			}
		}
		if (c > a && c > b) {
			System.out.println("c is biggest");
			if (a > b) {
				System.out.println("b is smallest");
			} else {
				System.out.println("a is smallestS");
			}
		}

	}
	
	public static void arrayFindMaxandSmall() {
		int a[]=new int[] {1,8,99,66,10};
		
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length-1;i++) {
			if(max<a[i]) {
				
				max=a[i];
			}
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Biggest Value is:-"+max);
		System.out.println("Smallest value is:-"+min);
	}
}
