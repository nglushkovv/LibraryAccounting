/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libraryaccounting;

import com.mycompany.libraryaccounting.models.Ticket;
import com.mycompany.libraryaccounting.models.books.Book;
import java.util.Arrays;




public class LibraryAccounting {
    

    public static void main(String[] args) {
        
        
        ManagementController managementController = new ManagementController();
        managementController.start();

        UserGUI gui = new UserGUI(managementController);
        gui.setVisible(true);
        gui.setSize(700,530);
        gui.setTitle("Library Accounting");
        gui.setLocationRelativeTo(null);
        gui.configureJTree();
        
    }
}
