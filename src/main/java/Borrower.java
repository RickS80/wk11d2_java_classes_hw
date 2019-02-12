import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> booklist;

    public Borrower(){
        this.booklist = new ArrayList<>();
    }

    public int booklistSize(){
        return this.booklist.size();
    }

    public void borrowBook(Library library){
        Book book = library.removeBook();
        this.booklist.add(book);
    }
}
