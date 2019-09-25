public class ServerNameGenerator {

    String[] adjectives = {"Ghostly", "Sickened", "Rockin", "Dashing", "Sinister", "Scary", "Happy", "Missing", "Glaring", "Programming"};
    String[] nouns = {"Noun", "System", "Cloud", "Panda", "Macho Man Randy Savage", "Napkin", "Program", "Garbage", "Otter", "Leftovers"};


    public void randomAdjectiveAndNoun() {
        for (int i = 0; i <= 9; i++) {
            double adjective = (int) Math.floor(Math.random() * 100);
            double noun = (int) Math.floor(Math.random() * 100);
        }

    }

    public static void main(String[] args) {
        return randomAdjectiveAndNoun;
    }
}
