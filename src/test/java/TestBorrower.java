import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBorrower {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Lethal White","JK Galbraith", "Thriller");
        library = new Library(10);
    }

    @Test
    public void borrowerHasNilBooks() {
        assertEquals(0, borrower.booklistSize());
    }

    @Test
    public void borrowerHasBookAndLibraryHasNilBooks(){
        library.addBook(book);
        borrower.borrowBook(library);
        assertEquals(1, borrower.booklistSize());
        assertEquals(0, library.bookCount());
    }




}
