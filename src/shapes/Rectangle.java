package shapes;

public class Rectangle {
    private int length;
    private int width;
    private int perimeter = (2 * length) + (2 * width);
    private int area = (length * width);

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //=============== Gets and sets length ===============//
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = width;
    }

    //=============== Gets and sets width ===============//
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //=============== Gets and sets perimeter ===============//
    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter() {
        this.perimeter = perimeter;
    }

    //=============== Gets and sets area ===============//
    public int getArea() {
        return area;
    }

    public void setArea() {
        this.area = area;
    }
}
