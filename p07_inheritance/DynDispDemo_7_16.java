package p07_inheritance;

//example of dynamic method choice(?)

class Sup {
    void who() {
        System.out.println("who() from class Sup");
    }
}

class Sub1 extends Sup {
    void who(){
        System.out.println("who() from class Sub1");
    }
}

class Sub2 extends Sup {
    void who(){
        System.out.println("who() from class Sub2");
    }
}

public class DynDispDemo_7_16 {
    public static void main(String[] args) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();


        Sup supRef;

        supRef = superOb;
        supRef.who();

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();

    }
}
