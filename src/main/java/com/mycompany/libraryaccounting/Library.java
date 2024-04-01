/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryaccounting;

import com.mycompany.libraryaccounting.models.Ticket;
import com.mycompany.libraryaccounting.models.books.Book;
import java.util.ArrayList;

/**
 *
 * @author 79175
 */
public class Library {
    private ArrayList<Book> allBooksList = new ArrayList<Book>();
    private ArrayList<Ticket> allTicketsList = new ArrayList<Ticket>();
    
    public ArrayList<Book> getAllBooksList() {
        return allBooksList;
    }
    
    public ArrayList<Ticket> getAllTicketsList() {
        return allTicketsList;
    }
    
    public void addBookToList(Book book) {
        allBooksList.add(book);
    }
    
    public void addTicketToList(Ticket ticket) {
        allTicketsList.add(ticket);
    }
    
    public Ticket findTicketByUserID(String id){
        for(Ticket ticket: allTicketsList) {          
            if (ticket.getUser().getId().equals(id)) {
                return ticket;
            }
        }
        return null;
        
    }
    
    public Book findBookByName(String nameOfBook) {
        for (Book book: allBooksList) {
            if (nameOfBook.equals(book.getName())) {
                return book;
            }
        }
        return null;
    }
}
