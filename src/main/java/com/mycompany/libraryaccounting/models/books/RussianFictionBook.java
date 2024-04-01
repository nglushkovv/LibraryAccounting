package com.mycompany.libraryaccounting.models.books;


public class RussianFictionBook extends FictionBook {
    private String publisher;
    
    public RussianFictionBook(String name, int pageNumber, String id,
            String genre, String publisher) {
        super(name, pageNumber, id, genre);
        this.publisher = publisher;
        
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
}
