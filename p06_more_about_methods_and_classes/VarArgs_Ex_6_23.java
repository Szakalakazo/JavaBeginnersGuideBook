package p06_more_about_methods_and_classes;

public class VarArgs_Ex_6_23 {

    static void vaTest(int... v) {
        System.out.println("Numbers of arguments: " + v.length);
        System.out.println("Contains: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("   argument " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest();
        vaTest(1,2,3,4);
    }

}
