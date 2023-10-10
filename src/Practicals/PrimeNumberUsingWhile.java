package Practicals;
// WRITE A JAVA PROGRAM TO FIND THE NUMBER IS PRIME OR NOT USING WHILE LOOP
public class PrimeNumberUsingWhile {

    public static void main(String[] args) {
        int n=79;
        int i=2;
        while(i<=Math.sqrt(n)){
            if(n%i==0){
                System.out.println("Not Prime...");
                return;
            }
            i++;
        }
        System.out.println("Prime Number..");
    }
}
