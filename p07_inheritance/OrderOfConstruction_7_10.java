package p07_inheritance;


class A1 {

    A1() {
        System.out.println("A class constructor ");
    }
}

class B1 extends A1 {
    B1() {
        System.out.println("B class constructor");
    }
}

class C extends B1 {
    C() {
        System.out.println("C class constructor");
    }
}

public class OrderOfConstruction_7_10 {
    public static void main(String[] args) {
        C c = new C();

    }

}
