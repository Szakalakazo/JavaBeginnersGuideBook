package p08_interface.default_and_static_methods;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        System.out.println("User ID: " + obj.getUserId());
        System.out.println("Admin ID: " + obj.getAdminId());
        int uID = MyIF2.getUniversalID();
    }
}
