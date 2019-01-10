// Klasa implementująca kolejkę znaków.


class Queue {
    private char q[]; // tablica przechowująca elementy kolejki
    private int putloc, getloc; // indeksy operacji put i get

    // Tworzy pustą kolejkę o podanym rozmiarze.
    Queue(int size) {
        q = new char[size]; // przydziela pamięć kolejki
        putloc = getloc = 0;
    }

    // Tworzy obiekt Queue na podstawie innego obiektu Queue.
    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // kopiuje elementy
        for (int i = getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }

    // Tworzy kolejkę, umieszczając w niej elementy.
    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for (int i = 0; i < a.length; i++) put(a[i]);
    }

    // umieszcza znak w kolejce.
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" -- Kolejka pełna.");
            return;
        }
        //q[putloc++] = ch;
        q[putloc] = ch;
        putloc++;

    }

    // Pobiera znak z kolejki.
    char get() {
        if (getloc == putloc) {
            System.out.println(" -- Kolejka pusta.");
            return (char) 0;
        }
        return q[getloc++];
    }
}


// Demonstruje użycie klasy Queue.
class QDemo2 {
    public static void main(String args[]) {
        // tworzy 10-elementową pustą kolejkę
        Queue q1 = new Queue(10);

        char name[] = {'J', 'a', 'n'};
        // tworzy kolejkę na podstawie tablicy
        Queue q2 = new Queue(name);

        char ch;
        int i;

        // umieszcza znaki w kolejce q1
        for (i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        // tworzy kolejkę z innej kolejki
        Queue q3 = new Queue(q1);

        // Wyświetla kolejki.
        System.out.print("Zawartość q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Zawartość q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Zawartość q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
