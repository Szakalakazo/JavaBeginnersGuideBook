package p06_more_about_methods_and_classes;

class CallByVal {
    int a, b;

/*    CallByVal(int a, int b) {
        this.a = a;
        this.b = b;
    }*/

    void noChanges(int a, int b) {
        a = a + b;
        b = -b;
    }
}

class CallByReference {
    int a, b;

    CallByReference(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void change(CallByReference ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

public class CallByValueOrReference {
    public static void main(String[] args) {
        CallByVal valOb = new CallByVal();
        CallByReference refOb = new CallByReference(15, 20);

        //Passing value
        int a = 15, b = 20;
        System.out.println("a & b before calling the method: " + a + " " + b);
        valOb.noChanges(a, b);
        System.out.println("a & b after calling the method: " + a + " " + b);

        //Passing reference
        System.out.println("a & b before calling the method: " + refOb.a + " " + refOb.b);
        refOb.change(refOb);
        System.out.println("a & b after calling the method: " + refOb.a + " " + refOb.b);
    }
}
