import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a temperature in Fahrenheit: ");
        double fahr = scan.nextDouble();

        double cels = ((float) fahr - 32.0f) / 1.8f;

        System.out.print(cels);
    }
}
