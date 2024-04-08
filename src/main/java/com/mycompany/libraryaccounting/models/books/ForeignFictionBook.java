/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryaccounting.models.books;

/**
 *
 * @author 79175
 */
public class ForeignFictionBook extends FictionBook {
    private String placeOfPublishing;
    
    public ForeignFictionBook(String name, int pageNumber, String id,
            String genre, String placeOfPublishing, TYPE type) {
        super(name, pageNumber, id, genre, type);
        this.placeOfPublishing = placeOfPublishing;
        
    }
    
    public String getPlaceOfPublishing() {
        return placeOfPublishing;
    }
    
    public void setPlaceOfPublishing(String placeOfPublishing) {
        this.placeOfPublishing = placeOfPublishing;
    }
}
