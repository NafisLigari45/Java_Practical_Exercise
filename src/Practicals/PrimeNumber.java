package Practicals;
// WRITE A JAVA PROGRAM TO FIND THE NUMBER IS PRIME OR NOT USING FOR LOOP...
public class PrimeNumber {
    public static void main(String[] args) {
         int n=79;

         for(int i=2;i<=Math.sqrt(n);i++){
             if(n%i==0){
                 System.out.println("Not Prime");
                 return;
             }
         }
        System.out.println("Prime");
    }
}
