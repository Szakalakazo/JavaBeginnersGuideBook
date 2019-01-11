package p07_inheritance;

class TwoDShapes2 {
    private double width;
    private double height;

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

class Triangle2 extends TwoDShapes2 {
    String style;

    double area() {
        return getHeight() * getWidth() / 2;
    }

    public void showStyle() {
        System.out.println("Triangle is: " + style);
    }
}

public class Shapes2_7_3 {
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2();
        Triangle2 t2 = new Triangle2();

        t1.setHeight(4);
        t1.setWidth(4);
        t1.style ="Filled";

        t2.setHeight(8);
        t2.setWidth(2);
        t2.style ="Empty";

        System.out.println("Info about t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is equal: " + t1.area());

        System.out.println("Info about t2:");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is equal: " + t2.area());
    }
}
