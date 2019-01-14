package p08_interface.bookpack;

public class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("Java. Przewodnik dla początkujących", "Schildt", 2015);
        books[1] = new Book("Java. Kompedium programisty", "Schildt", 2012);
        books[2] = new Book("Pan Tateusz", "Mickiewicz", 1974);
        books[3] = new Book("Stan zagrożenia", "Clancy", 2003);
        books[4] = new Book("Ogniem i mieczem", "Sienkiewicz", 1995);

        for (Book book : books) book.show();

    }
}
