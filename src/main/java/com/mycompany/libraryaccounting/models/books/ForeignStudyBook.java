package com.mycompany.libraryaccounting.models.books;

/**
 *
 * @author 79175
 */
public class ForeignStudyBook extends StudyBook {

    private String level;
    private String university;
    private String language;
    
    public ForeignStudyBook(String name, int pageNumber, String id,
            String disc, String level, String univ, String lang, TYPE type) {
        super(name, pageNumber, id, disc, type);
        this.university = univ;
        this.level = level;
        this.language = lang; 
        
    }
    
    public String getLevel() {
        return level;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public String getUniversity() {
        return university;
    }
    
    public void setLevel(String lvl) {
        this.level = lvl;
    }
    
    public void setUniversity(String univ) {
        this.university = univ;
    }
    
    public void setLanguage(String lang) {
        this.language = lang;
    }
}
