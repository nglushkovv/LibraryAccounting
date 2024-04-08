package com.mycompany.libraryaccounting.factories;

import com.mycompany.libraryaccounting.models.books.Book;
import com.mycompany.libraryaccounting.models.books.Book.TYPE;
import com.mycompany.libraryaccounting.models.books.ForeignFictionBook;
import com.mycompany.libraryaccounting.models.books.ForeignStudyBook;
import com.mycompany.libraryaccounting.models.books.RussianFictionBook;
import com.mycompany.libraryaccounting.models.books.RussianStudyBook;

public class BookFactory {
    private static int id = 1;
    
    public static Book addBook(String what, String data) {
        Book book = null;
        String[] attributes;
        String pageNumber;
        if (isValid(data)) {
            try{
                switch (what) { 
                        case "RussianStudyBook" -> {
                            attributes =  data.split(",");
                            pageNumber = attributes[3].replace(" страниц", "")
                                    .replace(" ", "").replace("ы", "");
                            book = new RussianStudyBook(attributes[0],
                                    Integer.parseInt(pageNumber),
                                    String.valueOf(id),
                                    attributes[1],
                                    attributes[2], TYPE.RUSSIAN_STUDY);
                            id += 1;
                            break;
                    }

                        case "ForeignStudyBook" -> {
                            attributes =  data.split(",");
                            pageNumber = attributes[attributes.length-1].replace(" страниц", "")
                                    .replace("ы", "")
                                    .replace(" ", "");
                            book = new ForeignStudyBook(attributes[0],
                                    Integer.parseInt(pageNumber),
                                    String.valueOf(id),
                                    attributes[4],
                                    attributes[1],
                                    attributes[2],
                                    attributes[3], TYPE.FOREIGN_STUDY);
                            id += 1;
                            break;
                    }

                        case "RussianFictionBook" -> {
                            attributes = data.split(",");
                            pageNumber = attributes[1].replace(" страниц", "").replace(" ", "")
                                    .replace("ы", "");
                            book = new RussianFictionBook(attributes[0],
                                    Integer.parseInt(pageNumber),
                                    String.valueOf(id),
                                    attributes[3].replace(" RU", ""),
                                    attributes[2], TYPE.RUSSIAN_FICTION);
                            id += 1;
                            break;
                    }

                        case "ForeignFictionBook" -> {
                            attributes = data.split(",");
                            pageNumber = attributes[1].replace(" страниц", "").replace(" ", "")
                                    .replace("ы", "");
                            book = new ForeignFictionBook(attributes[0],
                                    Integer.parseInt(pageNumber),
                                    String.valueOf(id),
                                    attributes[3].replace(" FL", ""),
                                    attributes[2], TYPE.FOREIGN_FICTION);
                            
                            id += 1;
                            break;
                    }
                
                }
                return book;
                
                } catch (Exception e) {
                    e.printStackTrace();
                }
                    
         }
        return null;
    }

    
    public static Boolean isValid(String data) {
        for(String symbol: data.split("")) {
            if("@#/<>[]{}$*^".contains(symbol)) {
                return false;
            }
        }
        return true;
    }
}
