package p06_more_about_methods_and_classes;

class ErrMsg {
    String[] msgs = {
            "Błąd wejscia",
            "Błąd wyjścia",
            "Dysk pełny",
            "Index spoza dozwolonego zakresu"};

    String getErrorMsg(int i ) {
        if(i >=0 & i < msgs.length)
            return msgs[i];
        else
            return "Niepoprawny kod błędu";

    }

}
public class ErrorMsg{
    public static void main(String[] args) {
        ErrMsg err = new ErrMsg();
        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(22));

    }

}
