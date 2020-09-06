package pl.ab.library.model;

public class Library {

    private final int maxBooks = 1000;
    private Book[] books = new Book[maxBooks];
    private int booksNumber = 0;

    public void addBook(Book book) {
        if (booksNumber < maxBooks) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Maksymalna liczba książek została osiągnięta");
        }
    }

    public void printBooks() {
         if (booksNumber == 0) {
             System.out.println("Brak książek");
         }

        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }

//        while (booksNumber >= 0) {
//            books[booksNumber].printInfo();
//            booksNumber--;
//        }
    }
}
