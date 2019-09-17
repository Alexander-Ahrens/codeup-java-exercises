

public class ControlFlowExercises {
    public static void main(String[] args) {


//        //========== QUESTION 1a ==========//
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }
//

//        //========== QUESTION 1b-1 ==========//
//        int v = 0;
//        do {
//            System.out.println(v += 2);
//        } while (v < 100);
//

//        //========== QUESTION 1b-2 ==========//
//        int c = 100;
//        do {
//            System.out.println(c -= 5);
//        } while (c > -10);


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


        //========== Refactor to For Loop ==========//
//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }


        //========== QUESTION 3 ==========//
        System.out.println("What number do you want to go up to?");
        System.out.println("number | squared | cubed");
        System.out.println("------------------------");
        int i = 1;
        int j = i++;
//        double s = Math.pow(i, 2);
//        double c = Math.pow(i, 3);
        while(i < 10) {
            System.out.println("|" + j + "|" + Math.pow(i, 2) + "|" + Math.pow(i, 3) + "|");
        }

    }
}
