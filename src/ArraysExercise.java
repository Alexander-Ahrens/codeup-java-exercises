import java.util.Arrays;

public class ArraysExercise {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        // Why is "toString" required to make the code work?



//        String[] people = {"Han", "Vader", "Chewbacca"};
        String[] people = new String[3]; {
        Person han = new Person("Han");
        Person vader = new Person("Vader");
        Person chewy = new Person("Chewbacca"); }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        // ---OR---
//        for (String person : people) {
//            System.out.println(person);
//        }
    }

//    public static String addPerson(){
//        return;
//    }
}
