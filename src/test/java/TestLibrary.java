import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Book book1;
    Book book2;
    Book book3;
    Library library;
    private BookList bookList;

    @Before
    public void before(){
        library = new Library(10);
        book1 = new Book("Lethal White","JK Galbraith", "Thriller");
        book2 = new Book("To Kill a Mocking Bird","Harper Lee", "Thriller");
        book3 = new Book("BFG","Author", "Children");
        ArrayList<Book> bookArray = new ArrayList <>();
        bookArray.add(book1);
        bookArray.add(book2);
        bookArray.add(book3);
        bookList = new BookList(bookArray);

    }

    @Test
    public void libraryIsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBooktoLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void addBooktoLibraryFail(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book1);
        assertEquals(10, library.bookCount());
    }

    @Test
    public void testRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook();
        assertEquals(1, library.bookCount());
    }

    @Test
    public void testBookListArray(){
        assertEquals(3, bookList.getNumberCount());

    }


}
