package CompanyExercise;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//write program to find input months previous months last date and next months last date 

public class findMonth {

	public static void main(String args[]) throws ParseException  {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a date (dd/mm/yyyy):");		
		
		String inputdate=sc.nextLine();
		
		DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		
		Date date = dateFormat.parse(inputdate);

		System.out.println("Input date:"+dateFormat.format(date));		

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		

	// Previous Month First And Last Date
		
		cal.add(Calendar.MONTH, -1);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		Date previousFirst=cal.getTime();
		System.out.println();
		System.out.println("First Date of Previous Month : "+dateFormat.format(previousFirst));
		
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		Date previousLast=cal.getTime();
		
		System.out.println("last date of previous month : "+dateFormat.format(previousLast));
		
		cal.setTime(date);
		
		
	//	 input field current entered months First and Last date 
		
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		Date monthdate=cal.getTime();
		System.out.println();
		System.out.println("First Date of current Entered Month :"+dateFormat.format(monthdate));
		
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		Date lastdate=cal.getTime();
		System.out.println("Last Date of Current Entered Month :"+dateFormat.format(lastdate));
		
		
		
    // Next month First and Last date
		
		cal.add(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		Date nextFirst=cal.getTime();
		System.out.println();
		System.out.println("Next Months First Date :"+dateFormat.format(nextFirst));
		
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		Date nextLast=cal.getTime();
		
		System.out.println("Next Months Last Date : "+dateFormat.format(nextLast));
	
		
	}
	
}


































