package p08_interface.default_and_static_methods;

public interface MyIF2 {
    int getUserID();

    default int getAdminID() {
        return 1;
    }

    static int getUniversalID() {
        return 0;
    }
}
