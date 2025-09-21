package GuessMyNumber;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isRunning = true;
        int guess = 0;
        int attempts = 0;
        int rN = random.nextInt(1, 101);
        System.out.println(rN);
        System.out.println("---Aeris Guessing Game---");
        do {
            System.out.print("Guess a number from 1-100: ");
            guess = scanner.nextInt();
            while (guess < 0 || guess > 100) {
                System.out.print("Only enter a number from 1-100: ");
                guess = scanner.nextInt();
            }
            if (guess > rN) {
                System.out.println("Your number is greater than my number!");
            } else if (guess < rN) {
                System.out.println("Your number is less than my number!");
            } else if (guess == rN) {
                System.out.println("Congratulations! you guessed correctly.");
            }
            attempts++;
        } while (attempts < 3);
        if (attempts == 3 && guess != rN) {
            System.out.println("You have exceeded the maximum amount of tries. The number was " + rN + ".");
            scanner.close();
        }
    }
}