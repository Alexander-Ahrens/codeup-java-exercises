package JavaAssessmentReview;


// Called a Java Bean (class that is only
// getters and setters as private properties)
public class Poysson implements HelloThere{
    private String firstName;
    private String lastName;

    // shadowing
    public Poysson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Neither argument can be null.");
        }
    }

    @Override
    public String sayHell0() {
        return "Hello from " + firstName + " " + lastName + ".";
    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Poysson person = new Poysson("Jane", "Doe");
        person.setFirstName(("Janice"));

        System.out.println(person.getFirstName() + " " +person.getLastName());

        Poysson Poysson = new Poysson("John", "Wayne");

        System.out.println(Poysson.sayHell0());
    }
}

