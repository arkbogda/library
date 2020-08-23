package pl.ab.library.app;

import pl.ab.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.5";

       Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2012, 296,
               "Greg", "1");
       Book book2 = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009,
               352, "Helion", "2");
       Book book3 = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Batesm Katherinw Sierra",
               2008, 296, "Greg");

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece: ");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

    }
}
