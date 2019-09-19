import java.math.*;
import java.util.*;
import java.lang.Integer;
import java.lang.String;

public class MethodsExercise {

    public static void main(String[] args) {
//        System.out.println(add(2, 8));
//        System.out.println(subtract(93, 18));
//        System.out.println(multiply(16, 4));
//        System.out.println(divide(32, 4));
//        System.out.println(modulo(8, 2));
        count(5);
        System.out.println(recursiveProduct(3, 22));
//        System.out.println(oneToTen());
//        getInteger(1, 10);

    }

    //============================================================ EXERCISE ONE ============================================================//
    //========== ADDS TWO NUMBERS ==========//
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    //========== SUBTRACTS TWO NUMBERS ==========//
    public static int subtract(int int1, int int2) {
        return int1 - int2;
    }

    //========== MULTIPLIES TWO NUMBERS ==========//
    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    //========== DIVIDES TWO NUMBERS ==========//
    public static int divide(int numero1, int numero2) {
        return numero1 / numero2;
    }

    //========== FIND THE MODULO ==========//
    public static int modulo(int potMod1, int potMod2) {
        return potMod1 % potMod2;
    }

    //========== MULTIPLY USING RECURSION WITHOUT * OPERATOR ==========//
    public static int recursiveProduct(int mult1, int mult2) {
        if (mult1 < mult2) {
            return recursiveProduct(mult2, mult1);
        } else if (mult2 != 0) {
            return (mult1 + recursiveProduct(mult1, mult2 - 1));
        } else {
            return 0;
        }
    }

    //========== RECURSION EXAMPLE ==========//
    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
        //count(5); is called in the main method.
    }

    //============================================================  EXERCISE 2 ============================================================//
    // Prompt the user to enter an integer from 1 to 10.

    // With recursion
//        public static int getInteger(int min, int max) {
//            Scanner scan = new Scanner(System.in);
//            if (scan.hasNextInt()) {
//    //            System.out.println("Valid input!");
//    //            Integer input = scan.nextInt();
//                int userNum = scan.nextInt();
//                if (userNum >= min && userNum >= max) {
//                    return userNum;
//                } else {
//                    System.out.println("Invalid Range");
//                    return getInteger(min, max);
//                }
//            } else {
//                System.out.println("Invalid input");
//                return getInteger(min, max);
//                }
//            return 0;
//        }

//    public static int oneToTen() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter any number between 1 and 10.");
//        Integer input = scan.nextInt();
//        if (input >= 1 && input <= 10) {
//            return input;
////            System.out.println(input);
//        } else {
////            System.out.println("Hey person! That ain't no number between one and ten! Try again lil' buddy!");
//            return input;
//        }
//    }




    // Display the factorial of the number entered by the user.
    // Ask if the user wants to continue.
    // Use a for loop to calculate the factorial.
    // Assume that the user will enter an integer, but verify it’s between 1 and 10.
    // Use the long type to store the factorial.
    // Continue only if the user agrees to.
    // A factorial is a number multiplied by each of the numbers before it.
    // Factorials are denoted by the exclamation point (n!).

    //============================================================  EXERCISE 3 ============================================================//


    //============================================================  EXERCISE 4 ============================================================//




}
