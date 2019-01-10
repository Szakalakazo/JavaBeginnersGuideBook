package p06_more_about_methods_and_classes;

class Err{
    String msg;
    int severity;

    Err(String msg, int severity){
        this.msg = msg;
        this.severity = severity;
    }
}


class ErrorInfo {
    String[] msgs = {
            "Błąd wejscia",
            "Błąd wyjścia",
            "Dysk pełny",
            "Index spoza dozwolonego zakresu"};
    int[] howBad = {3,3,2,4};

    Err getErrorInfo(int i) {
        if(i >= 0 & i < msgs.length)
            return new Err(msgs[i], howBad[i]);
        else
            return new Err("Niepoprawny kod błędy", 0);
    }
}

public class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + ", poziom blędu: " + e.severity);
    }
}
