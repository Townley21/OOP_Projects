public class Task1 {


    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        double c = 0;

        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);

        System.out.println("\nSetting c to the sum of a and b.");
        // TODO set c equal to the sum of a and b ("set c" means "assign c's value").
        c = a + b;
        System.out.println("c is now " + c);

        System.out.println("\nDeclaring d, setting its value to a's value.");
        // TODO declare a new double with identifier d, and set its value to a's value.
        double d = a;
        System.out.println("d is now " + d);

        System.out.println("\nSetting d to 4 times the sum of a and d.");
        // TODO set d equal to 4 times the sum of a and d.
        d = 4 * (a + d);
        System.out.println("d is now " + d);

        System.out.println("\nSetting c to the average of a and b.");
        // TODO set c equal to the average of a and b (without loss of precision).
        c = ((float) a + (float) b) / 2.0;
        System.out.println("c is now " + c);
    }
}
