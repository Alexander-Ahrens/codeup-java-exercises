import java.util.*;
import java.lang.String;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You see Bob walking down the road. What do you say?");
        String userInput = scan.nextLine();
//        System.out.println(userInput);
        if (userInput.endsWith("?")) {
            System.out.println("Sure maaaaaan.");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa bruhhhh, chill outttt...");
        } else if (userInput.equals("")) {
            System.out.println("Fine! BE THAT WAY! I'M GOING TO MY ROOM!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
