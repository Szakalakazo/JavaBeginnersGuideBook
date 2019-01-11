package p07_inheritance;

class TwoDShapes {
    double width;
    double height;

    void showDim() {
        System.out.println("Width and height of object: " + width + ", " + height);
    }
}

class Triangle extends TwoDShapes {
    String style;

    double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

public class Shapes_7_1 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4;
        t1.height = 4;
        t1.style = "filled";

        t2.width = 8;
        t2.height = 12;
        t2.style = "empty";

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
