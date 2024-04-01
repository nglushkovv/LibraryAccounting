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
public class Teacher extends User {
    
    private String department;
    private String patronymic;
    
    public Teacher (String id, String firstName, String lastName,
            Ticket ticket, String department, String patronymic) {
        super(id, firstName, lastName, ticket);
        this.patronymic = patronymic;
        this.department = department;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public String getPatronymic() {
        return patronymic;
    }
    
    public void setDepartment(String dep) {
        this.department = dep;
    }
    
    public void setPatronymic(String patr) {
        this.patronymic = patr;
    }
}
