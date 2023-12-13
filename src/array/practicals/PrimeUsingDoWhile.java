package CompanyExercise;
	
public class PrimeUsingDoWhile {
	public static void main(String args[]) {
		int n=10;
		int i=2;
		
		do {
			if(n%i==0) {
				System.out.println("This Is Not Prime Number");
				return;
			}
			i++;
		}while(i<=Math.sqrt(n)+1);
		
		System.out.println("This Is Prime Number");
	}
}
