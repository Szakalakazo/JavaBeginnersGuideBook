package p09_exception_handling;

public class ExcDemo1 {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            System.out.println("Before generating an exception");

            nums[7] = 10;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out of range!");
        }
        System.out.println("After catch.");
    }
}
