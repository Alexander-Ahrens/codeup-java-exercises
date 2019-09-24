import java.util.*;
import java.lang.*;


public class HighLow {

    public static void main(String[] args) {
        randNum(1, 10);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number.");
        String input = scan.nextLine();
//        if (randNum() < ) {
            System.out.println("Too high, guess lower.");
        }

//while guess is not number, check whether its higher or lower.
    public static double randNum(double max, double min) {
//        double num = Math.random() *
        min = 1;
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println(x);
        return x;
    }}

/**
 *
 * The specs for the game are:
 *
 * Game picks a random number between 1 and 100.
 * Prompts user to guess the number.
 * All user inputs are validated.
 * If user's guess is less than the number, it outputs "HIGHER".
 * If user's guess is more than the number, it outputs "LOWER".
 * If a user guesses the number, the game should declare "GOOD GUESS!"
 *
 */






//}
