// Write a program to find previous months last date and upcoming months last date.

package CompanyExercise;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;

public class FindDate {
	 public static void main(String[] args) throws ParseException {
		    	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a date (dd/mm/yyyy):");		
			String inputdate=sc.nextLine();
			
			DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
			
			Date date = dateFormat.parse(inputdate);
			System.out.println("\nInput date:"+dateFormat.format(date));	
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
		// Previous Month First and Last Date	
			cal.add(Calendar.MONTH, -1);
			cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
			Date previousFirst=cal.getTime();
			cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
			Date previousLast=cal.getTime();
			System.out.println("\nFirst Date of Previous Month : "+dateFormat.format(previousFirst)+"\nLast date of previous month : "+dateFormat.format(previousLast));
			cal.setTime(date);
		// Next Month First And Last Date
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
			Date nextFirst=cal.getTime();
			cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
			Date nextLast=cal.getTime();
			System.out.println("\nNext Months First Date :"+dateFormat.format(nextFirst)+"\nNext Months Last Date : "+dateFormat.format(nextLast));
	 }
}


