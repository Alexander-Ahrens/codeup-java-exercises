//import java.util.Scanner;
//
public class Person {
    // name property.
    private String name;


    // Constructor ALWAYS has to be public
    // can use setter to pass name.
    public Person (String name) {  // <-----THIS SHIT IS A CONSTRUCTOR!!!
//        setName(name);
        // OR
        this.name = name;
    }

            // Returns the person's name (does nothing but returns name).
            // Also called a "getter".
            public String getName() {
                return this.name;
            }

            // changes the name property to the passed value
            // Needs a parameter
            // Also called a "setter"
            public void setName(String name) {

                // "this.name" refers to the private String name
                // and " = name " is the name of the parameter.
                this.name = name;
            }

            // prints a message to the console using the person's name
            public void sayHello() {
                System.out.printf("Hello, %s", name);
                // OR use the getter
                System.out.println("Hello, " + this.getName());
            }


    public static void main(String[] args) {
        Person alex = new Person("Alex"); // <---- THIS BITCH IS AN OBJECT!!!
//        Person p1 = new Person("");
//        Person pr = new Person("");
//        System.out.println(s1.getName());
//        System.out.println(s2.getName());

//            Person person1 = new Person("John");
//            Person person2 = new Person("John");
//            System.out.println(person1.getName().equals(person2.getName()));
//            System.out.println(person1 == person2);

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

