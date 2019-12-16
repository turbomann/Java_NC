package Library.Main;

import Library.Main.Book;
import java.util.HashMap;
import java.util.Map;

public class Library {

    Map<String , Book> listOfBooks = new HashMap<String, Book>();

    public Map<String, Book> getListOfBooks() {
        return listOfBooks;
    }
}

