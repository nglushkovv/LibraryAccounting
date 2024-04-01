/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryaccounting.models.books;

/**
 *
 * @author 79175
 */
public abstract class Book {
    private String name;
    private int pageNumber;
    private String id;
    
    public Book (String name, int pageNumber, String id) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.id = id;
    }
    
    
    public String getName(){
        return name;
    }
    
    public int getPageNumber(){
        return pageNumber;
    }
    
    public String getId(){
        return id;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setPageNumber(int q){
        pageNumber = q;
    }
    
    
    public void setId(String ID){
        id = ID;
    }
    

    
    
    
}
