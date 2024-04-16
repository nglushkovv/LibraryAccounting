/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryaccounting.models.users;

import com.mycompany.libraryaccounting.models.Ticket;

/**
 *
 * @author 79175
 */
public class Student extends User {

    private String groupNumber;
    
    public Student (String id, String firstName, String lastName,
            Ticket ticket, String groupNumber, TYPE type) {
        super(id, firstName, lastName, ticket, type);
        this.groupNumber = groupNumber;
    }
    
    public String getGroupNumber() {
        return groupNumber;
    }
    
    public void setGroupNumber(String gn) {
        this.groupNumber = gn;
    }
    
    @Override
    public String getFullname(){
        String name = this.getFirstName() + " " +this.getLastName();
        return name;
    }
    
    @Override
    public String getExtraInformation(){
        return this.getGroupNumber();
    }
}
