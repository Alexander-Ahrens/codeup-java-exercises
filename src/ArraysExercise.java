import java.util.Arrays;

public class ArraysExercise {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        // Why is "toString" required to make the code work?

//        Person han = new Person("Han");
//        Person vader = new Person("Vader");
//        Person chewy = new Person("Chewbacca");
        String[] people = {"Han", "Vader", "Chewbacca"};

        for (int i = 0; i < 3; i++) {
            System.out.println(people[i]);
        }
        // ---OR---
//        for (String person : people) {
//            System.out.println(person);
//        }

    }
}
