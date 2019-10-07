package newAdventureGame;

import java.util.Scanner;

public class Hero {

    public static void main(String[] args) {

    }


    public String heroName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String input = scan.nextLine();
        System.out.println(input);
        return input;
    }

    public void heroStats() {
        int heroHealth = 120;
        int heroAttack = 45;
        int heroDefence = 40;
    }

    public void heroLevel() {
        int currentExp = 0;
        // if hero kills a monster, add a certain amount of exp.
    }

}
