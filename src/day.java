import java.util.Calendar;
import java.util.Scanner;
public class day {
    public static String getDay(Integer day, Integer month, Integer year) {
        Calendar calendar=Calendar.getInstance();
        calendar.set(year,month-1,day);
        String dayOfWeek = "";

        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
        }

        return dayOfWeek.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer month = in.nextInt();
        Integer day = in.nextInt();
        Integer year = in.nextInt();
        System.out.println(getDay(day, month, year));
    }
}