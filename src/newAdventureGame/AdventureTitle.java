package newAdventureGame;

import java.util.Scanner;

public class AdventureTitle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("______________________     ____________  ___ ______________________________________________     _______________________________\n" +
                "7      77  7  77     7=====7  _  77    \\ 7  V  77     77     77      77  7  77  _  77     7=====7     77  _  77        77     7\n" +
                "!__  __!|  !  ||  ___!=====|  _  ||  7  ||  |  ||  ___!|  _  |!__  __!|  |  ||    _||  ___!=====|   __!|  _  ||  _  _  ||  ___!\n" +
                "==7  |==|     ||  __|======|  7  ||  |  ||  !  ||  __|_|  7  |==7  7==|  |  ||  _ \\ |  __|_=====|  !  7|  7  ||  7  7  ||  __|_\n" +
                "==|  |==|  7  ||     7=====|  |  ||  !  ||     ||     7|  |  |==|  |==|  !  ||  7  ||     7=====|     ||  |  ||  |  |  ||     7\n" +
                "==!__!==!__!__!!_____!=====!__!__!!_____!!_____!!_____!!__!__!==!__!==!_____!!__!__!!_____!=====!_____!!__!__!!__!__!__!!_____!\n" +
                "                                                                                                                               ");
        System.out.println("___ __ ______________   ___________________________________     ___ __ _________________________     ___________     ____________________________     ______________________________________\n" +
                "7  V  V  77     77  7   7     77     77        77     77  7     7  V  V  77  7  77  _  77      7     7  77     7     7  7  77     77  7  77  _  7     7     77  _  77        77     77     7\n" +
                "|  |  |  ||  ___!|  |   |  ___!|  7  ||  _  _  ||  ___!|  |     |  |  |  ||  !  ||  _  |!__  __!     |  ||  ___!     |  !  ||  7  ||  |  ||    _|     |  _  ||  _  ||  _  _  ||  ___!!__!  |\n" +
                "|  !  !  ||  __|_|  !___|  7___|  |  ||  7  7  ||  __|_!__!     |  !  !  ||     ||  7  |  7  7       |  |!__   7     !_   _!|  |  ||  |  ||  _ \\      |  7  ||  7  ||  7  7  ||  __|_   !__!\n" +
                "|        ||     7|     7|     7|  !  ||  |  |  ||     7____     |        ||  7  ||  |  |  |  |       |  |7     |      7   7 |  !  ||  !  ||  7  |     |  |  ||  |  ||  |  |  ||     7   ____\n" +
                "!________!!_____!!_____!!_____!!_____!!__!__!__!!_____!7__7     !________!!__!__!!__!__!  !__!       !__!!_____!      !___! !_____!!_____!!__!__!     !__!__!!__!__!!__!__!__!!_____!   7__7\n" +
                "                                                                                                                                                                                            ");

        System.out.println("  ");
        System.out.println("Type start.");
        String input = scan.nextLine();
        if (input.equalsIgnoreCase("Start")) {
            System.out.println("Hello there.");
        } else {
            System.out.println(("I guess you don't want to save the world... That's cool man."));
        }


    }

}
