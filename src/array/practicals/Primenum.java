//Write a program to find the given number is prime or not using Math.sqrt function.
package CompanyExercise;

public class Primenum {
   public static void main(String args[]) {
	   int n=13;
	 //  boolean flag=true;
	 
	   for(int i=2;i<=Math.sqrt(n);i++) {
		
		   if(n%i==0) {
			   System.out.println("This Is Not Prime Number");
			   return;
		   }
	   }
	   System.out.println("This Is Prime number");
   }
}



 

