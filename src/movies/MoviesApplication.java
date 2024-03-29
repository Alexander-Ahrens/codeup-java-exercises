package movies;

import util.Input;

public class MoviesApplication {
    static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        Input scan = new Input();
        boolean next;
        System.out.println("Suh duue... Welcome to Notflix2!");
        do {
            System.out.println("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n");

            int userAnswer = scan.getInt(0, 5);

            switch (userAnswer) {
                case 0:
                    System.out.println("Cowabunga duue");
                    break;
                case 1:
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 2:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                default:
                    System.err.println("That's not right at all...");
            }
            System.out.println("\nWould you like to continue using Notflix2?");
            next = scan.yesNo();
        } while (next);
    }
}

//package movies;
//import util.Input;
//public class MovieApplication {
//
//    public static void main(String[] args) {
//        for(i = 0; i <= 6; i++) {
//            System.out.println("0 - exit");
//            System.out.println("1 - view all movies");
//            System.out.println("2 - view movies in the animated category");
//            System.out.println("3 - view movies in the drama category");
//            System.out.println("4 - view movies in the horror category");
//            System.out.println("5 - view movies in the scifi category");
//        }
//    }
//}
//
////    What would you like to do?
////
////        0 - exit
////        1 - view all movies
////        2 - view movies in the animated category
////        3 - view movies in the drama category
////        4 - view movies in the horror category
////        5 - view movies in the scifi category
////
////        Enter your choice: 1
////
////        Frankenstein -- horror
////        Goodfellas -- drama
////        Pulp Fiction -- drama
////        ...
