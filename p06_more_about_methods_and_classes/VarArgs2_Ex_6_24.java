package p06_more_about_methods_and_classes;

public class VarArgs2_Ex_6_24 {

    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length);
        System.out.println("Contains:");

        for (int i = 0; i < v.length; i++)
            System.out.println(" argument " + i + ": " + v[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One arg on int...v list: ", 100);
        vaTest("Three args on int...v list: ", 10,20,30);
        vaTest("No args on list: ");
    }
}
