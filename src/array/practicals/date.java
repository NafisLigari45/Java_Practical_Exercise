package CompanyExercise;
import java.util.Calendar;
import java.util.Date;

public class date {

    public static Date getLastMonthLastDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);

        int max = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, max);

        return calendar.getTime();
    }
    public static void main(String args[]) {
    	System.out.println(getLastMonthLastDate()); 
    }
}

