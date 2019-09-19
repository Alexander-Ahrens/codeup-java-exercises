public class MethodsExercise {
    public static void main(String[] args) {
        System.out.println(add(2, 8));
        System.out.println(subtract(93, 18));
        System.out.println(multiply(16, 4));
        System.out.println(divide(32, 8));

    }

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
}
