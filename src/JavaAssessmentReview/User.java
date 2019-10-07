package JavaAssessmentReview;

public class User extends Poysson {
    protected boolean admin;

    public User(String firstName, String lastName, boolean admin) throws IllegalArgumentException {
        super(firstName, lastName);
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }

    public static void main(String[] args) {

    }
}
