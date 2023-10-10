package Practicals;
//WRITE A PROGRAM TO PRINT FIBONACCI SERIES...
public class FibonacciSeries {
    public static void main(String[] args) {
        int number1=0,number2=1,number3,count=30;

        for (int i=0;i<=count;i++){

            number3=number1+number2;
            number1=number2;
            number2=number3;

            System.out.println(number3);
        }
    }
}
