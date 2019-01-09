package p06_more_about_methods_and_classes;

class MyClass {
    private int alpha;
    private int beta;
    int gamma;

    void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    int getAlpha() {
        return alpha;
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.setAlpha(99);
        //ob.beta = 77      //won' work!!
        ob.gamma = 11;      // will work cuz gamma set to default access modifier
    }
}
