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
public abstract class User {
    private String id;
    private String firstName;
    private String lastName;
    private Ticket ticket;
    private TYPE type;
    
    public enum TYPE{
        STUDENT, TEACHER
        
    }
    
    public User(String id, String firstName, String lastName, Ticket ticket, TYPE type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticket = ticket;
        this.type = type;
    }
    
    public String getId(){
        return id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public Ticket getTicket() {
        return ticket;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
    public TYPE getType() {
        return type;
    }
    

    
}
