import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int day;
        int month;
        final int YEAR = 2021;
        long secondsLeft;

        System.out.println("Enter your birthday.");
        System.out.print("Day: ");
        day = scan.nextInt();
        System.out.print("Month: ");
        month = scan.nextInt();



        if(month == 12) {
            month -= 12;
        } else {
            month -= 1;
        }


        Date today = Calendar.getInstance().getTime();
        Date birthday = new Date(YEAR - 1900, month, day, 0, 0,0);

        //Milliseconds Time Difference
        long time_difference = birthday.getTime() - today.getTime();

        if (time_difference < 0) {
            time_difference *= -1;

        }

        secondsLeft = time_difference / 1000;

        long days_difference = secondsLeft / 86400;
        secondsLeft = secondsLeft % 86400;

        long hours_difference = secondsLeft / 3600;
        secondsLeft = secondsLeft % 3600;

        long minutes_difference = secondsLeft / 60;
        secondsLeft = secondsLeft % 60;


        System.out.println("Days Difference: " + days_difference);
        System.out.println("Hours Difference: " + hours_difference);
        System.out.println("Minutes Difference: " + minutes_difference);
        System.out.println("Seconds Difference: " + secondsLeft);



    }
}
