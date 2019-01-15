package p08_interface.default_and_static_methods;

public interface MyIF {
    int getUserId();

    default int getAdminId() {
        return 1;
    }
}
