package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    //=============== Rectangle constructor ===============//
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //=============== Gets and sets length ===============//
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    //=============== Gets and sets width ===============//
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //=============== Gets perimeter ===============//
    public int getPerimeter() {
        int perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    //=============== Gets area ===============//
    public int getArea() {
        int area = (length * width);
        return area;
    }

}
