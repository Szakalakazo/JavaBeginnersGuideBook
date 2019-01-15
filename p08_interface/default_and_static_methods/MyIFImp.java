package p08_interface.default_and_static_methods;

public class MyIFImp implements MyIF{
    @Override
    public int getUserId() {
        return 100;
    }

    //Optional method overwriting
    public int getAdminId(){
        return 45;
    }

}
