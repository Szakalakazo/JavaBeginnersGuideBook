package p07_inheritance;

class TwoDShapes7 {
    private double height;
    private double width;

    TwoDShapes7() {
        width = height = 0;
    }

    TwoDShapes7(double width, double height) {
        this.width = width;
        this.height = height;
    }

    TwoDShapes7(double x) {
        width = height = x;
    }

    TwoDShapes7(TwoDShapes7 ob) {
        this.width = ob.width;
        this.height = ob.height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    void showDim() {
        System.out.println("Height and Width: " + height + " and " + width);
    }
}

class Triangle7 extends TwoDShapes7 {
    private String style;

    Triangle7() {
        super();
        style = "undefined";
    }

    Triangle7(String style, double width, double height) {
        super(width, height);
        this.style = style;
    }

    Triangle7(double x) {
        super(x);
        style = "filled";
    }

    Triangle7(Triangle7 ob) {
        super(ob);
        this.style = ob.style;
    }

    void showStyle() {
        System.out.println("Style: " + style);
    }

    double area() {
        return (getHeight() * getWidth() / 2);
    }

}

public class Shapes7_7_13 {
    public static void main(String[] args) {
        Triangle7 t1 = new Triangle7("epmty", 8,9);

        Triangle7 t2 = new Triangle7(t1); //copy of object t1

        System.out.println("Info about t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is equal: " + t1.area());
        System.out.println();

        System.out.println("Info about t2, copy of t1:");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is equal: " + t2.area());



    }
}
