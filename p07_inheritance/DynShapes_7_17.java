package p07_inheritance;

class Shape {
    private double width;
    private double height;
    private String name;
     String test;

    Shape() {
        width = height = 0;
        name = "none";
    }

    Shape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    Shape(double x, String name) {
        width = height = x;
        this.name = name;
    }

    Shape(Shape ob) {
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

    void showDim() {
        System.out.println("Height and Width: " + height + " and " + width);
    }

    double area() {
        System.out.println("area() must be hidden in children classes ");
        return 0;
    }
}


class BigTriangle extends Shape {
    private String style;

    BigTriangle() {
        super();
        style = "unknow";
    }

    BigTriangle(double width, double height, String style) {
        super(width, height, "triangle");
        this.style = style;
    }

    BigTriangle(double x) {
        super(x, "triangle");
        style = "filled";
    }

    BigTriangle(BigTriangle ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        super.area();
        return (getHeight() * getWidth() / 2);
    }

    void showStyle() {
        System.out.println("Triangle is: " + style);
    }
}

class Rectangle extends Shape {

    Rectangle() {
        super();
    }

    Rectangle(double width, double height) {
        super(height, width, "rectangle");
    }

    Rectangle(double x) {
        super(x, "rectangle");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        if (getHeight() == getWidth()) return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}

public class DynShapes_7_17 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new BigTriangle(8, 8.0, "empty");
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new BigTriangle(7);
        shapes[4] = new Shape(10, 20, "general");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Type of object: " + shapes[i].getName());
            System.out.println("Area is: " + shapes[i].area());
            System.out.println();
        }

    }
}
