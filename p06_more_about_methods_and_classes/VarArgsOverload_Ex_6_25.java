package p06_more_about_methods_and_classes;

public class VarArgsOverload_Ex_6_25 {

    static void vaTest(int... v) {
        System.out.println("vaTest(int... v): " + "Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + "; " + v[i]);
        }
    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean... v): " + "Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + "; " + v[i]);
        }
    }

    static void vaTest(String msg, int... v) {
        System.out.println("vaTest(String msg, int... v): " + "Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + "; " + v[i]);
        }
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Test:", 4, 5, 6);
        vaTest(true, false, false);
    }


}
