/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryaccounting.models.books;

/**
 *
 * @author 79175
 */
public class StudyBook extends Book {
    private String name;
    private int pageNumber;
    private String id;
    private String discipline;
    
    public StudyBook(String name, int pageNumber, String id, String disc) {
        super(name, pageNumber, id);
        this.discipline = disc;
    }
    
    public String getDiscipline(){
        return discipline;
    }
    
    public void setDiscipline(String disc) {
        this.discipline = disc;
    }
    
    
}
