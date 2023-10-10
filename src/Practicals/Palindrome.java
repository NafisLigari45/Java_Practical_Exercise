package Practicals;
//WRITE A PROGRAM TO PRINT PALINDROME NUMBER...
public class Palindrome {
    public static void main(String[] args) {
        int num=121;
        int num1=0;
        int rem;
        int count;
        count=num;
        while(num>0){
            rem=num%10;
            num1=num1*10+rem;
            num=num/10;

        }
        if(count==num1){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
    }
}
