import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> books;

    public BookList(ArrayList<Book> books){
        this.books = books;
    }

    public int getNumberCount(){
        return this.books.size();
    }
}
