/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryaccounting.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import com.github.javafaker.Faker;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author 79175
 */
//src/main/resources/Books.txt"
public class DataWorker {
    
    public static ArrayList<String> readBooks() {
        ArrayList<String> books = new ArrayList<>();
        try {
            InputStream inputStream = DataWorker.class.getResourceAsStream("/Books.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            
            while ((line = reader.readLine()) != null) {
                if (line!=null) {
                    books.add(line);
                } 
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
