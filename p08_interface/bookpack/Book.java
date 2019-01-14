package p08_interface.bookpack;

public class Book {
    private String title;
    private String author;
    private int pubData;

    public Book(String title, String author, int pubData) {
        this.title = title;
        this.author = author;
        this.pubData = pubData;
    }

    void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubData);
        System.out.println();
    }
}
