public class ConstuctorTest {

    private boolean onOff;

    public ConstuctorTest() {
        this.turnOn();
    }

    public String turnOn() {
        System.out.println("Phone is turned on!");
        return "This works!";
    }


}
