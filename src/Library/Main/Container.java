package Library.Main;

import java.util.List;

public class Container {
    public List<Book> allBooks;


    private Book findBook(String bookName) {
        Book foundBook = null;

        for (Book book : allBooks) {
            if (book.getTitle().equals(bookName)) {
                foundBook = book;
                break;
            }

        }
        return foundBook;
    }

//    public void giveBookToPerson(String bookName, Person pers) {
//
//        Book foundBook = findBook(bookName);
//        if (assignmentBook.containsKey(foundBook)) {
//            System.out.println("The Book " + foundBook.getTitle() + " Alredy on hand on " + pers.getFirstName());
//
//        } else if (foundBook != null) {
//            assignmentBook.put(foundBook, pers);
//            pers.historyList.add(foundBook);
//            System.out.println("The book " + "'" + bookName + "'" + " was given " + pers.getFirstName());
//        }
//    }
}
