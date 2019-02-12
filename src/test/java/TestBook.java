import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBook {

    Book book;

    @Before
    public void before(){
        book = new Book("Lethal White","JK Galbraith", "Thriller");

    }

    @Test
    public void bookHasName(){
        assertEquals("Lethal White", book.getName());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("JK Galbraith", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Thriller", book.getGenre());
    }

}
