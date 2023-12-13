package CompanyExercise;

public class methodOverloading {
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static int sum(int c,int d,int e) {
		return c+d+e;
	}
	
	public static int mul(int f,int g) {
		return f*g;
	}
	
	public static int mul(int h,int i,int j) {
		return h*i*j;
	}
	
	public static void main(String args[]) {
		methodOverloading mo=new methodOverloading();
		System.out.println("Sum Of Two values:- "+mo.sum(50, 60));
		
		System.out.println("Multiplication Of Two Values:- "+mo.mul(5, 5));
		
		System.out.println("Sum of Three Values :-"+mo.sum(10, 50, 40));
		
		System.out.println("Multiplivcation of three Values :-"+mo.mul(10, 5, 3));
	}
}
