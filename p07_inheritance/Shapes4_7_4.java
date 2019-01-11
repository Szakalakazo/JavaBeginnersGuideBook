package p07_inheritance;

class TwoDShape4 {
    private double width;
    private double height;

    TwoDShape4() {
        width = height = 0;
    }

    TwoDShape4(double width, double height) {
        this.height = height;
        this.width = width;
    }

    TwoDShape4(double x) {
        width = height = x;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    void showDim() {
        System.out.println("Height and Width: " + height + " and " + width);
    }
}

class Triangle4 extends TwoDShape4 {
    private String style;

    Triangle4() {
        super();
        style = "undefined";
    }

    Triangle4(String style, double height, double width) {
        super(height, width);
        this.style = style;
    }

    Triangle4(double x) {
        super(x);
        style = "filled";
    }


    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is: " + style);
    }
}

public class Shapes4_7_4 {
    public static void main(String[] args) {

        Triangle4 t1 = new Triangle4();
        Triangle4 t2 = new Triangle4("empty", 5, 4);
        Triangle4 t3 = new Triangle4(5);

        t1 = t2;


        System.out.println("Info about t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is equal: " + t1.area());

        System.out.println();

        System.out.println("Info about t3:");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is equal: " + t3.area());
    }
}
