public class DoggieInheritance {
    public static void main(String[] args) {
        Animal cat = new Animal (500, "feline", true);
        Dog myDog = new Dog (1, "pupper", true, "GSD", "Grizzly");
        System.out.println(cat.getAge());
        System.out.println(myDog.getName());
    }
}
