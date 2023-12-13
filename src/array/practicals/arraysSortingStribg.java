package CompanyExercise;

import java.util.Arrays;
import java.util.Collections;

public class arraysSortingStribg {
	public static void main(String args[]) {
		String a[]= {"Volvo","BMW","Ford","Suzuki","Tata","MG","Toyota"};
		Arrays.sort(a,Collections.reverseOrder());
	
		System.out.print("Acsending String is:"+Arrays.toString(a));
		
	}
}

