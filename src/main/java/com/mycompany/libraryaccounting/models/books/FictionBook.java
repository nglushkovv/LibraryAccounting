package com.mycompany.libraryaccounting.models.books;


public abstract class FictionBook extends Book {
    private String genre;

    public FictionBook(String name, int pageNumber, String id, String genre, TYPE type) {
        super(name, pageNumber, id, type);
        this.genre = genre;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    @Override
    public abstract String[] getLine();
    @Override
    public abstract String getInfo();
}
