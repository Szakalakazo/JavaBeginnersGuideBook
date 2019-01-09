package p06_more_about_methods_and_classes;

class FailSoftArray {
    private int[] a;            //array reference
    private int errVal;         // val returned by get() in case of error
    public int length;

    public FailSoftArray(int length, int errVal) {
        a = new int[length];
        this.errVal = errVal;
        this.length = length;
    }

    public int get(int index) {
        if (indexOK(index)) return a[index];
        return errVal;
    }

    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    private boolean indexOK(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}

public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        /*Example of bad referencing*/
        System.out.println("Bad array access example");
        for (int i = 0; i < (fs.length * 2); i++) {
            fs.put(i, i * 10);
        }

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
        }
        System.out.println();

        //catching error access
        System.out.println("Bat gateway access");
        for (int i = 0; i < (fs.length * 2); i++) {
            if (!fs.put(i, i * 10)) System.out.println("Index " + i + " out of array range");
        }
        System.out.println();

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else System.out.println("Index " + i + " out of array range");
        }
    }
}
