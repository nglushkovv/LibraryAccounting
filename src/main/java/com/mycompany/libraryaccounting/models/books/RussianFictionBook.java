package com.mycompany.libraryaccounting.models.books;


public class RussianFictionBook extends FictionBook {
    private String publisher;
    
    public RussianFictionBook(String name, int pageNumber, String id,
            String genre, String publisher, TYPE type) {
        super(name, pageNumber, id, genre, type);
        this.publisher = publisher;
        
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    @Override
    public String[] getLine() {
        String[] line = new String[] {this.getName(), this.getGenre(), this.getPublisher(),
                        String.valueOf(this.getPageNumber())};
        return line;
    }
    
    @Override
    public String getInfo() {
        String info =  "<html><center>" + this.getGenre() + "<br>"
                        + this.getPublisher() + "<br>" + this.getPageNumber() 
                        + " страниц <center><html>";
        return info;
    }
    
}
