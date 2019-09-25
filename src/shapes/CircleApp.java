package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble();
        Circle circle = new Circle(input.getDouble()); // Need a double to work with pi.

        System.out.println("circle.getCircumference() = " + circle.getCircumference());
    }
}
