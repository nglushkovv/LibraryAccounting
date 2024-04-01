/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryaccounting;

import com.mycompany.libraryaccounting.data.DataWorker;
import com.mycompany.libraryaccounting.factories.BookFactory;
import com.mycompany.libraryaccounting.factories.UserFactory;
import java.util.ArrayList;

/**
 *
 * @author 79175
 */
public class ManagementController {
    private ArrayList<String> bookList;
    private Library MainLibrary;
    
    public void start(){
        MainLibrary = new Library();
        updateAllBooks();
        registerBooks();
        UserFactory.createUser("Teacher", 50, MainLibrary);
        UserFactory.createUser("Student", 50, MainLibrary);
    }
    
    public ArrayList<String> updateAllBooks() {
        ArrayList<String>  read =  DataWorker.readBooks();
        bookList = read;
        return read;
    }
    
    public Library getMainLibrary() {
        return MainLibrary;
    }
    
    
    public void registerBooks() {
        for(String s: bookList) {
               if(s.contains(" RU")) {
                    MainLibrary.addBookToList(BookFactory.addBook("RussianFictionBook", s));
                    
                    }
                else if (s.contains(" FL")){
                    MainLibrary.addBookToList(BookFactory.addBook("ForeignFictionBook", s));
                    }
                else if (s.length() - s.replace(",", "").length() >= 5) {
                    MainLibrary.addBookToList(BookFactory.addBook("ForeignStudyBook", s));
                    }
                else {
                    MainLibrary.addBookToList(BookFactory.addBook("RussianStudyBook", s));
                    }
                    
            }
        }
    }


