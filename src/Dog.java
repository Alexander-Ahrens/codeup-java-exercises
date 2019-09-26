public class Dog extends Animal {
    private String breed;
    private String name;

    public Dog(int age, String species, boolean isAlive, String breed, String name) {
        super(age, species, isAlive);
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}




//    Inheritance conclusions so far...
//        - Java allows classes and objects to inherit properties and methods.
//        - Inheritance keeps similar classes from requiring duplicate code and organizes our classes into groups, subgroups, subsubgroups, etc.
//        - The subclass/child class can access all public properties and methods from its super/parent class.
//        - A subclass can have additional properties and methods that don't exist on the the super class.
//        - A class can only extend from one other direct parent.
//        - Classes can keep extending down into more and more specific classes:
//        Person
//        is extended by Employee
//        Employee
//        is extended by Engineer
//        Engineer
//        is exteded by JuniorEngineer
//        etc.