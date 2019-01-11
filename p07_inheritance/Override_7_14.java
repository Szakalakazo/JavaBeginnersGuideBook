package p07_inheritance;

class A2 {
    int i, j;

    A2(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.println("method show() from A2 class: \n'i' and 'j': " + i + " " + j);
    }
}

class B2 extends A2 {
    int k;

    B2(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show() {
        super.show();
        System.out.println("method show() from B2 class: \n'k': " + k);
    }
}

public class Override_7_14 {
    public static void main(String[] args) {
        B2 ob2 = new B2(1,3,9);
        ob2.show();
    }
}
