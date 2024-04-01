/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryaccounting.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import com.github.javafaker.Faker;

/**
 *
 * @author 79175
 */
public class DataWorker {
    
    public static ArrayList<String> readBooks() {
        ArrayList<String> books = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(
                "src/main/java/com/mycompany/libraryaccounting/resources/Books.txt"))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                books.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
    
    public static String generateStudentName() {;
        Faker faker = new Faker(Locale.forLanguageTag("ru"));
        String name = faker.name().firstName() + " " + faker.name().lastName();
        return name;
        
    }
    
    public static String generateTeacherName() {
            Faker faker = new Faker(Locale.forLanguageTag("ru"));
            String name = faker.name().fullName();
            while (name.length() - name.replace(" ", "").length() < 2){
                name = faker.name().fullName();
            }
            return name;
        
        
    }
    
}
