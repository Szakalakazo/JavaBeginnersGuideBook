package p06_more_about_methods_and_classes;

class Block {
    int a, b, c;
    int volume;

    Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        volume = a * b * c;
    }

    //Returns true if obj has the same volume
    boolean sameBlock(Block ob) {
        return (ob.a == a) & (ob.b == b) & (ob.c == c);
    }

    boolean sameVoluem(Block ob) {
        return ob.volume == volume;
    }
}

public class PassObject {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 has the same dimensions as ob2: " + ob1.sameBlock(ob2));
        System.out.println("ob1 has the same dimensions as ob3: " + ob1.sameBlock(ob3));
        System.out.println("ob1 has the same volume as ob2: " + ob1.sameVoluem(ob3));
    }

}
