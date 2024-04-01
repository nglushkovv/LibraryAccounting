package com.mycompany.libraryaccounting.models.books;

/**
 *
 * @author 79175
 */
public class RussianStudyBook extends StudyBook {
    private String type;
    
    public RussianStudyBook(String name, int pageNumber, String id, String type,
            String disc) {
        super(name, pageNumber, id, disc);
        this.type = type;
        
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String newtype) {
        type = newtype;
    }
    
}
