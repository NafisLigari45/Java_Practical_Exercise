package CompanyExercise;

public class fibboRecursion {
	
	public static void main(String args[]) {
		int number1=0,number2=1,number3;
		int count=20;
		
		fibbo(count, number1, number2, number3=0);
	}
	static void fibbo(int count,int number1,int number2,int number3) {
		if(count>0) {
			number3=number1+number2;
			number1=number2;
			number2=number3;
			
			System.out.println(number3);
			
			fibbo(count-1, number1, number2, number3);
		}
		
	}

}
