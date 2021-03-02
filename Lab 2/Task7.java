import java.util.Scanner;
import java.util.Random;
import java.util.stream.IntStream;

public class Task7 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Guess a number between 1 - 100: ");
        byte guess = scan.nextByte();

        int randoNum = random.nextInt(100);

        if (randoNum == guess) {
            System.out.println("You got it!\nYou Guessed: " + guess + "\nRandom #: " + randoNum);
        } else {
            System.out.println("Incorrect.\nYou Guessed: " + guess + "\nRandom #: " + randoNum);
        }
    }
}
