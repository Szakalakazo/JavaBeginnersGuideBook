package p07_inheritance;

class A {
    int i;
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;    // 'i' in class A
        i = b;          //'i' in class B
    }

    void show() {
        System.out.println("'i' in parent class (A): " + super.i);
        System.out.println("'i' in child class (B): " + i);
    }
}

public class UseSuper_7_7 {
    public static void main(String[] args) {

        B subOb = new B(1,2);
        subOb.show();
    }
}
