package p09_exception_handling;

public class ExcDemo3 {
    public static void main(String[] args) {
        int[] num1 = {4, 8, 16, 32, 64, 128};
        int[] num2 = {2, 0, 4, 4, 8, 0};

        for (int i = 0; i < num1.length; i++) {
            try {
                System.out.println(num1[i] + " / " +
                                    num2[i] + " is equal to " +
                                    num1[i]/num2[i]);
            }catch (ArithmeticException exc){
                System.out.println("Can't divide by 0!!");
            }

        }

    }
}
