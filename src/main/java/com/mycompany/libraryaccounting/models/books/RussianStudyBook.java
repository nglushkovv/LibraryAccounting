package com.mycompany.libraryaccounting.models.books;

/**
 *
 * @author 79175
 */
public class RussianStudyBook extends StudyBook {
    private String type;
    
    public RussianStudyBook(String name, int pageNumber, String id, String type,
            String disc, TYPE Type) {
        super(name, pageNumber, id, disc, Type);
        this.type = type;
        
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String newtype) {
        type = newtype;
    }
    
    @Override
    public String[] getLine() {
        String[] line = new String[] {this.getName(), this.getType(), this.getDiscipline(),
            String.valueOf(this.getPageNumber())};
        return line;
    }
    
    public String getInfo(){
        String info = "<html><center>" + this.getType()
                        + "<br>" + this.getDiscipline() + "<br>"
                        + this.getPageNumber() + " страниц <center><html>";
        return info;
    };
}
