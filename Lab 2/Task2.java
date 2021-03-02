import java.util.Scanner;

public class Task2 {

        public static void main(String[] args)
        {
            Scanner scan = new Scanner( System.in );
            System.out.print("Enter the radius of a circle : ");

            double radius = scan.nextDouble();

            // TODO find and print the area and circumference of the circle.
            double circumference = 2 * Math.PI * radius;
            double area = Math.PI * Math.pow(radius, 2);

            System.out.println("The area is " + area + " and the circumference is " + circumference);
        }
}
