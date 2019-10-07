package JavaAssessmentReview;

import java.util.ArrayList;

public class Assessment2 {

    public static void main(String[] args) {
        System.out.println(square(4));
        System.out.println(sum(3, 8));
        System.out.println(sum(3.7, 9.1));

        int[] numbers = {1,2};
        System.out.println(numbers);

        ArrayList<User> users = new ArrayList<>();

        User b = new User("captain", "redbeard", true);
        User a = new User("sailor", "morgan", false);

        users.add(a);
        users.add(b);

        users = capitalizeRecords(users);

        for(User user: users) {

        }
    }


    public static int square(int x) {
        return x * x;
    }


    public static double sum(double j, double r) {
        return j + r;
    }


    public static double sum(int s, int t) {
        return s + t;
    }

    public static double average(int[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
//            total = total + numbers[1];
            total += numbers[i];
        }
        double numberOfItems = numbers.length;
        double average = total / numberOfItems;
        return average;
    }

    public static ArrayList<User> capitalizeRecords(ArrayList<User> users) {
        //googled "iterating an ArrayList"
        //if returning an array list, declare an empty one at the top of the method

        // this is our output
        ArrayList<User> capitalizedUsers = new ArrayList<>();
        String firstName;
        String lastName;

        for (User user : users) {
            firstName = user.getFirstName();
            lastName = user.getLastName();

            firstName = capitalize(firstName);
            lastName = capitalize(lastName);

            user.setFirstName(firstName);
            user.setLastName(lastName);

            capitalizedUsers.add(user);
        }
        return capitalizedUsers;
    }

    private static String capitalize(String name) {
        String firstLetter = name.substring(0, 1);
        firstLetter = firstLetter.toUpperCase();

        String restOfName = name.substring(1);
        restOfName = restOfName.toLowerCase();

        return firstLetter + restOfName;
    }
}
