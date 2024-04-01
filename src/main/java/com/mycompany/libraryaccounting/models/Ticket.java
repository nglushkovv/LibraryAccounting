package com.mycompany.libraryaccounting.models;
import com.mycompany.libraryaccounting.models.users.User;
import com.mycompany.libraryaccounting.models.books.Book;
import java.util.ArrayList;
/**
 *
 * @author 79175
 */
public class Ticket {
    private User user;
    private String id;
    private final ArrayList<Book> listOfTakenBooks = new ArrayList<Book>();
    
    public User getUser() {
        return user;
    }
    
    public String getId() {
        return id;
    }
    
    public ArrayList<Book> getListOfTakenBooks() {
        return listOfTakenBooks;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void takeBook(Book book) {
        listOfTakenBooks.add(book);
    }
    
    public void returnBook(Book book) {
        listOfTakenBooks.remove(listOfTakenBooks.indexOf(book));
    }
    
    public Book findBookByName(String nameOfBook) {
         for (Book book: listOfTakenBooks) {
            if (nameOfBook.equals(book.getName())) {
                return book;
            }
        }
        return null;
    }
}
