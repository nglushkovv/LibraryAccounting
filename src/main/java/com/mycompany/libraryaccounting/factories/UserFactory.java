/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryaccounting.factories;

import com.mycompany.libraryaccounting.Library;
import com.mycompany.libraryaccounting.data.DataWorker;
import com.mycompany.libraryaccounting.models.Ticket;
import com.mycompany.libraryaccounting.models.users.Student;
import com.mycompany.libraryaccounting.models.users.Teacher;
import com.mycompany.libraryaccounting.models.users.User.TYPE;

/**
 *
 * @author 79175
 */
public class UserFactory {
    private static int id = 1;
    
    public static void createUser(String what, int count, Library library) {
        Ticket ticket;
        String[] name;
        for(int i = 0; i < count; i++) {
            switch (what) {
                case "Teacher" -> {
                    name = DataWorker.generateTeacherName().split(" ");
                    ticket = new Ticket();
                    Teacher teacher = new Teacher(String.valueOf(id),
                            name[0],
                            name[2],
                            ticket,
                            "Кафедра физического воспитания (№15)",
                            name[1], TYPE.TEACHER);
                    
                    ticket.setUser(teacher);
                    ticket.setId(String.valueOf(id));
                    id += 1;
                    library.addTicketToList(ticket);
                }

                case "Student" -> {
                    name = DataWorker.generateStudentName().split(" ");
                    ticket = new Ticket();
                    Student student = new Student(String.valueOf(id),
                            name[0],
                            name[1],
                            ticket,
                            "B" + String.valueOf((int) (Math.random() * 4 + 19)) +
                                    "-" + String.valueOf((int) (Math.random() * 800 + 102)),
                            TYPE.STUDENT);
                                    
                    ticket.setUser(student);
                    ticket.setId(String.valueOf(id));
                    id += 1;
                    library.addTicketToList(ticket);
                } 
                }
                
            } 
        }
    }
    

