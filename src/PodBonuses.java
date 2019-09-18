import java.util.Scanner;

public class PodBonuses {

    public static void main(String[] args) {
        //random easy stuff that I made up:
        String buffalo = "Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo ";
        String bison = "Buffalo bison, that other Buffalo bison bully, also bully Buffalo bison.";
        String connectingSentence = "is a valid sentence and is translated to";

        System.out.print(buffalo);
        System.out.println(connectingSentence);
        System.out.println(bison);

//================================= JAVA STRING BONUSES
//
//                ----BONUS 1
//
//        Create date format converter application.
//                Take in the following format:
//
//        MM/DD/YYYY
//
//        Output the following:
//
//        MonthName DD, YYYY
//
//        Example:
//
//        input - 12/01/1999
//        output - December 12, 1999




//                ----BONUS 2
//
//        Create an application that allows the user to enter a sentence
//        and tells them how many vowels and consonants were used.
//
//        Example:
//
//        input - "The hill are alive."
//        output - 5 vowels and 10 consonants

        int consonantCount = 0;
        int vowelCount = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a random sentence to get " +
                "the amount of vowels and consonants in said sentence.");
        String input = scan.nextLine();
        for (int i = 0; i < input.length(); ++i) {
            char letter = input.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' ||
                    letter == 'o' || letter == 'u') {
                vowelCount++;
            } else if ((letter >= 'a') && (letter <= 'z')) {
                consonantCount++;
            }
        }
            System.out.println("Vowels: " + vowelCount);
            System.out.println("Consonants: " + consonantCount);




//                ----BONUS 3
//
//        Create a command line calculator application.
//
//        The program should welcome the user, prompt them for a calculation,
//        and give the result. The user should be prompted after each result is
//        outputted if they want to enter another calculation. When they
//        say no, give them an exit message. Allow the user first to specify
//        how many operands they will enter. Do not worry about
//        input validation (assume user enters correct data type).
//
//        Example program:
//
//...
//
//        WELCOME TO THE CALCULATOR APP!!! (program output)
//
//        Do you wish to enter a new calculation? (program output)
//        yes (user inputs this)
//
//        How many operands will you calculate? (program output)
//        2 (user inputs this)
//
//        Please enter a calculation: (program output)
//        2 + 2 (user enters this or something like this)
//        The output of 2 + 2 is 4. (program outputs this)
//
//        Do you wish to enter a new calculation? (program outputs this)
//        no (user enters this)
//
//        GOODBYE!!!



    }


}
