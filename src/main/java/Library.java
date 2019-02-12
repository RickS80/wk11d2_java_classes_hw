import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> booklist;


    public Library(int capacity) {
        this.capacity = capacity;
        this.booklist = new ArrayList<>();
    }

    public int bookCount(){
        return this.booklist.size();
    }

    public void addBook(Book book) {
        if (bookCount() < this.capacity) {
            this.booklist.add(book);
        }
    }

    public Book removeBook() {
        return this.booklist.remove(0);
    }



    }




