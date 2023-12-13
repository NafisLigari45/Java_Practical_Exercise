package CompanyExercise;

public class arrayMax {
	public static void main(String args[]) {
		int a[]=new int[] {55,1,2,3,66,8,44};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
