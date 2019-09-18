import java.util.Scanner;


//  String cat = "cat"; // "atcay

//String word1 = "cat";
//        String pigLatinWord = word1
//        .trim()
//        .toLowerCase()
//        .substring(1)
//        .concat(word1.substring(0, 1).toLowerCase())
//        .concat("ay");
//        System.out.println(pigLatinWord);

public class PigLatinBonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String word = "";
        System.out.println("Type a word to convert it to pig latin.");
        String input = scan.nextLine();
        String word = input.trim()
                            .toLowerCase()
                            .substring(1)
                            .concat(input.substring(0, 1).toLowerCase())
                            .concat("ay");
        System.out.println(word);

    }
}

