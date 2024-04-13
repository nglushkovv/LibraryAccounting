/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryaccounting.models.books;

/**
 *
 * @author 79175
 */
public abstract class StudyBook extends Book {
    private String discipline;
    
    public StudyBook(String name, int pageNumber, String id, String disc, TYPE type) {
        super(name, pageNumber, id, type);
        this.discipline = disc;
    }
    
    public String getDiscipline(){
        return discipline;
    }
    
    public void setDiscipline(String disc) {
        this.discipline = disc;
    }
    
    @Override
    public abstract String[] getLine();
    @Override
    public abstract String getInfo();
    
    
}
