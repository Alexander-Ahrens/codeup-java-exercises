import java.util.Random;

public class ServerNameGenerator {
//
    public static String[] adjectives = {
        "Ghostly",
        "Salty",
        "Rockin",
        "Dashing",
        "Sinister",
        "Scary",
        "Happy",
        "Missing",
        "Glaring",
        "Programming"
    };

    public static String[] nouns = {
            "Puppy",
            "System",
            "Cloud",
            "Panda",
            "Macho Man Randy Savage",
            "Napkin",
            "Program",
            "Garbage",
            "Otter",
            "Leftovers"
    };

    public static String returnRandEle(String[] arr) {
        int index = (int)(Math.random() * ((arr.length - 1) + 1));
        return arr[index];
    }

    public static void main(String[] args) {

//        for (int i = 0; i < 100; i++) {
//            System.out.println(returnRandEle(nouns));
//        }
        String message = String.format("Your server's name is now: %s-%s", returnRandEle(adjectives),returnRandEle(nouns));
        System.out.println(message);
    }

////
////    public static String randomAdjectiveAndNoun() {
////        Random random = new Random();
////    }
////
////    public static void main(String[] args) {
////        System.out.println("Here is your server name:");
////        System.out.println();
////    }
//


}

//
////======================================== HOW TO DO IT ONLY IN THE MAIN ========================================//
//
////    public static void main(String[] args) {
////        String[] adjectives = {"Ghostly", "Salty", "Rockin", "Dashing", "Sinister", "Scary", "Happy", "Missing", "Glaring", "Programming"};
////        String[] nouns = {"Puppy", "System", "Cloud", "Panda", "Macho Man Randy Savage", "Napkin", "Program", "Garbage", "Otter", "Leftovers"};
////        Random random = new Random();
////        int randomAdj = random.nextInt(adjectives.length);
////        int randomNoun = random.nextInt(nouns.length);
////        System.out.println("Here is your server name: ");
////        System.out.println(randomAdj + "-" + randomNoun);
////    }
//}
