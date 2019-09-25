package util;
import java.util.Scanner;

public class Input {

    //======================== THIS IS A SCANNER ========================//

    // Creates scanner variable
    private Scanner scanner;

    // Grabs input class with "this" and instantiates scanner...
    // ...so that every new object that is created has a scanner.
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    // Returns whatever is input by the user.
    public String getString() {          // used as "input.getString" to scan.
        return this.scanner.nextLine();
    }
    // Just a copy of the previous constructor
    public String getString(String prompt) {
        if (prompt.isEmpty()) {
            System.out.println("Type something.");
        } else {
            System.out.println(prompt);
        }
        return getString();
    }

    //====================================================================//

    // If "y" or "yes" or any variation thereof is input, then
    // method will return true. If anything else is input then method will
    // return false.
    public boolean yesNo() {
//        if (this.scanner.nextLine().equalsIgnoreCase("y") ||
//                this.scanner.nextLine().equalsIgnoreCase("yes")) {
//            return true;
//        } else {
//            return false;
//        }
        // OR (different solution)
        System.out.println("Type y/n");
        String answer = this.scanner.nextLine();
        return (answer.equalsIgnoreCase("y") ||  // Ternary operator?
                answer.equalsIgnoreCase("yes")); // Ternary operator?
    }


    //
    public int getInt(int min, int max) {
        System.out.println("Give me a number: ");
        int num = Integer.parseInt(this.scanner.nextLine());  // this.scanner... is always a scanner.
        if (num >= min && num <= max) {
            return num;
        } else {
            System.out.println("Number is out of range. Try a different number.");
            return getInt(min, max);  // How Recursion actually works.
        }
    }


    // Sometimes we have a range, sometimes we don't care
    // That's why overloading is a thing. (Overloading = More than one constructor (method?) with the same name.)
    public int getInt() {
        System.out.println("Give me a number: ");
        return Integer.parseInt(this.scanner.nextLine());
    }


    public double getDouble(double min, double max) {
        System.out.println("Give me a number: ");
        double num = Integer.parseInt(this.scanner.nextLine());
        if (num >= min && num <= max) {
            return num;
        } else {
            System.out.println("Number is out of range. Try a different number.");
            return getDouble(min, max);
        }
    }


    public double getDouble() {
        System.out.println("Give me a number: ");
        return Double.parseDouble(this.scanner.nextLine());
    }
}

//==================== Bonus ====================//


