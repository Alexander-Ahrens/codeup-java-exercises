package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("What is your name?");
        return this.scanner.nextLine();
    }

    boolean yesNo() {
        if (this.scanner.nextLine().equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    int getInt(int min, int max) {

    }

    int getInt() {

    }

    double getDouble(double min, double max) {

    }

    double getDouble() {

    }

    public inputTest() {
        Input input  = new Input();
    }

}
