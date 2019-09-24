//import java.util.Scanner;
//
public class Person {
    private String name;

            // returns the person's name
            public String getName() {
                return this.name;
            }

            // changes the name property to the passed value
            public void setName(String name) {
                this.name = name;
            }

            // prints a message to the console using the person's name
            public void sayHello() {
                System.out.printf("Name: %s", name);
            }

        public Person(String person) {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("What is your name?");
            this.name = person;

//

        }

    public static void main(String[] args) {
//        Person p1 = new Person("");
//        Person pr = new Person("");
//        System.out.println(s1.getName());
//        System.out.println(s2.getName());
        Person alex = new Person("Alex");

            Person person1 = new Person("John");
            Person person2 = new Person("John");
            System.out.println(person1.getName().equals(person2.getName()));
            System.out.println(person1 == person2);

//            Person person1 = new Person("John");
//            Person person2 = person1;
//            System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}

