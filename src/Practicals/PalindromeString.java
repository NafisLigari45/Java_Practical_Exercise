package Practicals;
// WRITE A PROGRAM TO PRINT THE GIVEN STRING IS PALINDROME OR NOT....
public class PalindromeString {
    public static void main(String [] args) {
        String name="anna";
        String rev="";

        for(int i=name.length()-1;i>=0;i--) {
            rev=rev+name.charAt(i);
        }
        if(name.equals(rev)) {
            System.out.println("Palindrome String");
        }
        else {
            System.out.println("Not palindrome");
        }

    }
}

