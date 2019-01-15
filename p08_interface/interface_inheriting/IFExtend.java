package p08_interface.interface_inheriting;


class MyClass implements B {

    @Override
    public void meth1() {
        System.out.println("Method meth1() implementation.");
    }

    @Override
    public void meth2() {
        System.out.println("Method meth2() implementation.");
    }

    @Override
    public void meth3() {
        System.out.println("Method meth3() implementation.");
    }
}

public class IFExtend {
    public static void main(String[] args) {
        MyClass ob1 = new MyClass();

        ob1.meth1();
        ob1.meth2();
        ob1.meth3();
    }
}