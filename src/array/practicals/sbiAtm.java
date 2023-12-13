package CompanyExercise;

import java.util.Scanner;

public class sbiAtm {
	static int number=0;
	public static void Withdraw() {
		if(number==0) {
			System.out.println("Your Account is Empty");
			System.out.println("");
			System.out.println("");
		}
		else {
			int m;
			
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter Amount For Withdraw");
			
			m=sc1.nextInt();
			
			number=number-m;
		}
	}
	
	
	public static void Diposite() {
		int n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount to Deposite :- ");
		
		n=sc.nextInt();
		number=number+n;
	} 
	
	public static void Balance() {
		if(number==0) {
			System.out.println("Sorry you dont have money in your Account ");
		}
		else {
		System.out.println("Youre Account Has :-"+number);
		}
	}
	
	
	
	public  static void main(String args[]) {
		
	while(true) {
		
		int choice;
		System.out.println("");
		System.out.println("Welcome TO SBI");
		System.out.println("Press 1 For Withdraw");
		System.out.println("Press 2 For Deposite");
		System.out.println("Press 3 For Account Details ");
		System.out.println("Press 0 For Exit");
		
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter choice");
	
		
		choice=ch.nextInt();
		
		if(choice==0) {
			System.out.println("Thank you!! SBI");
			break;
		}
		
		switch (choice) {
		case 1:
			sbiAtm.Withdraw();
			break;
			
		case 2:
			sbiAtm.Diposite();
			break;
			
		case 3:
			sbiAtm.Balance();
			break;
			
		default:
			System.out.println("Wrong Choice!!");;
		}
		
		}
	}
}
