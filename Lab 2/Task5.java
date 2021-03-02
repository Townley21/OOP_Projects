import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number of Seconds: ");
        int seconds = scan.nextInt();

        int secondsLeft;

        int hours = seconds / 3600;
        secondsLeft = seconds % 3600;
        int minutes = secondsLeft / 60;
        secondsLeft = secondsLeft % 60;

        System.out.println("Hours: " + hours + "\nMinutes: " + minutes + "\nseconds: " + secondsLeft);
    }
}
