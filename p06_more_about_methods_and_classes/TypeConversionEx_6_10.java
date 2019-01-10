package p06_more_about_methods_and_classes;

class Overload2 {
    void f(int x) {
        System.out.println("Inside of f(int): " + x);
    }

    void f(double x) {
        System.out.println("Inside of f(double): " + x);
    }

    void f(byte x){
        System.out.println("Inside of f(byte): " + x);
    }
}

public class TypeConversionEx_6_10 {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;


        ob.f(i);
        ob.f(d);
        ob.f(b);
        ob.f(s);
        ob.f(f);
    }
}
