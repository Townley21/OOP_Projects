import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double input;

        System.out.print("Enter Degrees: ");
        input = scan.nextDouble();

        double radians = input * Math.PI / 180;

        System.out.println(input + " in radians is: " + radians);


    }
}
