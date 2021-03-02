import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Why did the chickens cross the road?");
        String answer1 = scan.next();

        System.out.println("How many toes do you have?");
        int toes = scan.nextInt();

        System.out.println("True or False: Radishes are the coolest vegetable?");
        boolean veggie = scan.nextBoolean();

        System.out.println("===SURVEY SUMMARY===");
        System.out.println("The chicken crossed the road because \"" + answer1 + "\"");
        System.out.println("You have \"" + toes + "\" toes");
        System.out.println("Radishes are the coolest vegetable: \"" + veggie + "\"");


    }
}
