// Write a program to reverse String 
package CompanyExercise;

public class reverseString {
	public static void main(String args[]) {
		String a="Nafis";
		
		String n="";
		char ch;
		for(int i=0;i<a.length();i++) {
			ch=a.charAt(i);
			n=ch+n;
		}
		
		System.out.println(n);
	}
}
