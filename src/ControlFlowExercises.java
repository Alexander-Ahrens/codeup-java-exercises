import java.lang.Math;
import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //========== QUESTION 1a ==========//
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i + " ");
//            i++;
//        }


        //========== QUESTION 1b-1 ==========//
//        int x = 0;
//        do {
//            System.out.println(x);
//            x += 2;
//        } while (x <= 100);


        //========== QUESTION 1b-2 ==========//
//        int c = 100;
//        do {
//            System.out.println(c);
//            c -= 5;
//        } while (c >= -10);


        //========== QUESTION 1b-3 ==========//
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i < 1000000);


        //========== QUESTION 2 ==========//
//        for (int i = 1; i <= 100; i++){
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz" + " ");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz" + " ");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz" + " ");
//            } else {
//                System.out.println(i);
//            }
//        }

        //========== QUESTION 2 But In A Switch! ==========//UNFINISHED
//        for (int i = 1; i <= 100; i++) {
//            int x = 0;
//            int res = x % 3;
//            switch (res) {
//
//            }
//        }

        //========== Refactor to For Loop ==========//
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (int x = 0; x <= 100; x += 2) {
//            System.out.println(x);
//        }  x = 100;

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }


        //========== QUESTION 3 ==========//
//        String yesNo = "Y";
//
//        while (yesNo.equalsIgnoreCase("y")) {
//
//            System.out.println("What number would you like to go up to?");
//            int answer = Integer.parseInt(scan.nextLine());
//            System.out.println("Here is your table");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int counter = 1; counter <= answer; counter++) {
//                System.out.println(String.format("%-6d | %-7d | %-5d", counter,
//                        (int) Math.pow(counter, 2),(int) Math.pow(counter, 3)));
//             }
//            System.out.println("Would you like to test another number? Y/N");
//
//            yesNo = scan.nextLine();
//            System.out.println("Okay, you have a wonderful day.");
//        }

//        int i;
//        int square;
//        int cube;
//
//        System.out.println("What number do you want to go up to?");
//        System.out.println("| number | squared | cubed |");
//        System.out.println("----------------------------");
//        for(i = 1; i <= 10; i++) {
//            square = i * i;
//            cube = i * square;
//            System.out.println(i + "\t" + square + "\t" + cube);
//        }

        String yesNo = "Y";
        while(yesNo.equalsIgnoreCase("y")) {

            System.out.println("What is your grade in the class?");
            int grade = scan.nextInt();
            if (grade >= 88 && grade <= 100) {
                System.out.println("A");
            } else if (grade >= 80 && grade <= 87) {
                System.out.println("B");
            } else if (grade >= 67 && grade <= 79) {
                System.out.println("C");
            } else if (grade >= 60 && grade <= 66) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Would you like to get another grade? Y/N");
            yesNo = scan.nextLine();

        }
    }
}

