package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Rectangle(5, 4);

        Measurable myOtherShape = new Square(5) {

        };



        Measurable myShape = new Rectangle(5, 4);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println(myOtherShape.getPerimeter());
        System.out.println(myOtherShape.getArea());

    }
}
