package p07_inheritance;

class TwoDShape6 {
    private double width;
    private double height;

    TwoDShape6() {
        width = height = 0;
    }

    TwoDShape6(double width, double height) {
        this.height = height;
        this.width = width;
    }

    TwoDShape6(double x) {
        width = height = x;
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


    void showDim() {
        System.out.println("Height and Width: " + height + " and " + width);
    }
}

class Triangle6 extends TwoDShape6 {
    private String style;

    Triangle6() {
        super();
        style = "unknow";
    }

    Triangle6(String style, double width, double height) {
        super(width, height);
        this.style = style;
    }

    Triangle6(double x) {
        super(x);
        style = "filled";
    }

    void showStyle() {
        System.out.println("Style: " + style);
    }

    double area() {
        return (getHeight() * getWidth() / 2);
    }
}

class ColorTriangle extends Triangle6 {
    private String color;

    ColorTriangle(String color, String style, double width, double height) {
        super(style, width, height);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void showColor() {
        System.out.println("Color: " + color);
    }

}

public class Shapes6_7_11 {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("blue", "empty", 8, 12);
        ColorTriangle t2 = new ColorTriangle("red", "filled", 1, 2);

        System.out.println("Info about t1:");
        t1.showStyle();
        t1.showColor();
        t1.showDim();
        System.out.println("Area is equal: " + t1.area());
    }
}
