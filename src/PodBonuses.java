import java.util.*;

public class PodBonuses {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //random easy stuff that I made up:
//        String buffalo = "Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo ";
//        String bison = "Buffalo bison, that other Buffalo bison bully, also bully Buffalo bison.";
//        String connectingSentence = "is a valid sentence and is translated to";
//
//        System.out.print(buffalo);
//        System.out.println(connectingSentence);
//        System.out.println(bison);

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
//        output - December 01, 1999



//            method: Set-format-date
//        System.out.println("Enter a date in the DD/MM/YYYY format.");
//        String input = scan.nextLine();
//        input.indexOf(1,2).replace(12, 'December');


//                ----BONUS 2
//
//        Create an application that allows the user to enter a sentence
//        and tells them how many vowels and consonants were used.
//
//        Example:
//
//        input - "The hill are alive."
//        output - 5 vowels and 10 consonants

//        int consonantCount = 0;
//        int vowelCount = 0;

//        System.out.println("Enter a random sentence to get " +
//                "the amount of vowels and consonants in said sentence.");
//        String input = scan.nextLine();
//        for (int i = 0; i < input.length(); ++i) {
//            char letter = input.charAt(i);
//            if (letter == 'a' || letter == 'e' || letter == 'i' ||
//                    letter == 'o' || letter == 'u') {
//                vowelCount++;
//            } else if ((letter >= 'a') && (letter <= 'z')) {
//                consonantCount++;
//            }
//        }
//            System.out.println("Vowels: " + vowelCount);
//            System.out.println("Consonants: " + consonantCount);


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

        int num1 = 0;
        int num2 = 0;
        char operator;
        int total = 0;

        System.out.println("CALCULATOR");
//        System.out.println("Do you want to add, subtract, multiply or divide?");
        System.out.println("Enter first number.");
        num1 = scan.nextInt();
        System.out.println("Enter second number.");
        num2 = scan.nextInt();
        System.out.println("Do you want to add, subtract, multiply, or divide? use +, -, *, or /.");
        operator = scan.next().charAt(0);

        switch (operator) {
            case '+':
                total = num1 + num2;
                break;
            case '-':
                total = num1 - num2;
                break;
            case '*':
                total = num1 * num2;
                break;
            case '/':
                total = num1 / num2;
                break;
        }
        System.out.println(total);
//        String add = "add";
//        String subtract = "subtract";
//        String multiply = "multiply";
//        String divide = "divide";
//        if (input1 == "add") {
//            System.out.println("What numbers do you want to add?");
//            int input2 = scan.nextInt();
//            int input3 = scan.nextInt();
//            System.out.println(input2 + input3);

//        STRING BONUS CHALLENGE
//        Create a command line Hangman game!
//                Create a Java class called Hangman. In the main method, you may find defining the following variables helpful (you decide which variables need an initialized starting value):
//        Scanner sc;
//        String wordSoFar;
//        String wordGuess;
//        String wordCopy = "";
//        String chooseGuessLetterOrWord;
//        String letterGuess;
//        int noOfRounds;
//        You decide how many guesses the user has before the game is over. You should start trying to make the game work with only three letter words.
//        Can you prevent the user from entering an invalid choice when asked to guess a letter or a word?
//                Can you make the console output look fancy?
//


    }


//}


}
