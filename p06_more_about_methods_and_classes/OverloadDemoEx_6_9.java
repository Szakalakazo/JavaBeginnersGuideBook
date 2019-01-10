package p06_more_about_methods_and_classes;

class Overload {
    void ovlDemo() {
        System.out.println("No parameters.");
    }

    void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }

    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
        return a + b;
    }

    double ovlDemo(double a, double b) {
        System.out.println("Two double type parameters : " + a + ", " + b);
        return a + b;
    }
}

public class OverloadDemoEx_6_9 {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        ob.ovlDemo();
        System.out.println();
        ob.ovlDemo(2);
        System.out.println();
        resI = ob.ovlDemo(1, 5);
        System.out.println("\nResult of calling ob.ovlDemo(1, 5): " + resI);
        resD = ob.ovlDemo(10.2,15.3);
        System.out.println("\nResult of calling ob.ovlDemo(10.2, 15.3): " + resD);


    }
}
