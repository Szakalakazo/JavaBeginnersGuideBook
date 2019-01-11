package p07_inheritance;

class X {
    int a;

    X(int a) {
        this.a = a;
    }
}

class Y extends X {
    int b;

    Y(int b, int a) {
        super(a);
        this.b = b;
    }
}

public class SupSubRef_7_12 {

    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5, 6);

        x2 = x;
        System.out.println("x2.a: " + x2.a);

        x2 = y;
        System.out.println("x2.a: " + x2.a);

        x2.a = 17;
        //x2.b = 4;     WON'T WORK
    }
}
