package p06_more_about_methods_and_classes;

class Factorial {
    int factR(int n) {
        int result;

        if (n == 1) return 1;
        System.out.println("Lalal");
        result = factR(n - 1) * n;
        return result;
    }

    int factI(int n) {
        int result;
        result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}


public class RecursionEx_6_15 {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factI(3));

        System.out.println(f.factR(3));
    }
}
