package pl.ab.library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LibraryUser extends User {
    private List<Publication> publicationsHistry = new ArrayList<>();
    private List<Publication> borrowedPublications = new ArrayList<>();

    public LibraryUser(String firstName, String lastName, String pesel) {
        super(firstName, lastName, pesel);
    }

    public List<Publication> getPublicationsHistry() {
        return publicationsHistry;
    }

    public List<Publication> getBorrowedPublications() {
        return borrowedPublications;
    }

    private void addPublicationToHistory(Publication pub) {
        publicationsHistry.add(pub);
    }

    public void borrowPublication(Publication pub) {
        borrowedPublications.add(pub);
    }

    public boolean returnPublication(Publication pub) {
        boolean result = false;
        if (borrowedPublications.contains(pub)) {
            borrowedPublications.remove(pub);
            addPublicationToHistory(pub);
            result = true;
        }
        return result;
    }

    @Override
    public String toCsv() {
        return getFirstName() + ";" + getLastName() + ";" + getPesel();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(publicationsHistry, that.publicationsHistry) &&
                Objects.equals(borrowedPublications, that.borrowedPublications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), publicationsHistry, borrowedPublications);
    }
}
