import java.text.DecimalFormat;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        int a;
        int b;

        System.out.print("\nEnter 2 integers: ");
        a = scan.nextInt();
        b = scan.nextInt();

        float f = (float) a / b;

        System.out.println("Your Quotient: " + df.format(f));
        System.out.printf("Your Quotient: %.2f", f);

    }
}
