package p07_inheritance;

abstract class AbsShape {
    private double width;
    private double height;
    private String name;

    AbsShape() {
        width = height = 0;
        name = "none";
    }

    AbsShape(double height, double width, String name) {
        this.height = height;
        this.width = width;
        this.name = name;
    }

    AbsShape(double x, String name) {
        height = width = x;
        this.name = name;
    }

    AbsShape(AbsShape ob) {
        this.name = ob.name;
        this.height = ob.height;
        this.width = ob.width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract double area();
}

class AbsTriangle extends AbsShape {
    private String style;

    AbsTriangle() {
        super();
        style = "unknown";
    }

    AbsTriangle(double height, double width, String style) {
        super(height, width, "triangle");
        this.style = style;
    }

    AbsTriangle(double x) {
        super(x, "triangle");
        style = "filled";
    }

    AbsTriangle(AbsTriangle ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is: " + style);
    }
}

class AbsRectangle extends AbsShape {

    AbsRectangle() {
        super();
    }

    AbsRectangle(double width, double height) {
        super(height, width, "rectangle");
    }

    AbsRectangle(double x) {
        super(x,"rectangle");
    }

    AbsRectangle(AbsRectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        return getHeight() == getWidth();
    }

    double area() {
        return getWidth() * getHeight();
    }
}

public class AbstractShape_7_18 {

    public static void main(String[] args) {
        AbsShape[] shapes = new AbsShape[4];

        shapes[0] = new AbsTriangle(8, 8.0, "empty");
        shapes[1] = new AbsRectangle(10);
        shapes[2] = new AbsRectangle(10, 4);
        shapes[3] = new AbsTriangle(7);

        for(AbsShape ob : shapes) {
            System.out.println("Object type: " + ob.getName());
            System.out.println("Object area: " + ob.area());
            System.out.println();
        }

    }
}