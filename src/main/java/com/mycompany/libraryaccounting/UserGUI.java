/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.libraryaccounting;


import com.mycompany.libraryaccounting.models.Ticket;
import com.mycompany.libraryaccounting.models.books.Book;
import static com.mycompany.libraryaccounting.models.books.Book.TYPE.*;
import com.mycompany.libraryaccounting.models.users.*;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author 79175
 */
public final class UserGUI extends javax.swing.JFrame {
    private DefaultMutableTreeNode libraryModel = new DefaultMutableTreeNode("Библиотека");
    private final ManagementController managementController;
    private ImageIcon nullUserIcon;
    private ImageIcon introIcon;
    private ImageIcon bookIcon;;
    private ImageIcon logo;
            
    /**
     * Creates new form UserGUI
     * @param managementController
     */
    public UserGUI(ManagementController managementController) {
        this.managementController = managementController;
        initComponents();
        initOtherComponents();
        
        
        
    }
    
    public void initOtherComponents() {
        URL inputStream = this.getClass().getResource("/nullPersonPhoto.png");
        nullUserIcon = new ImageIcon(
                inputStream);
        inputStream = this.getClass().getResource("/Introduction.png");
        introIcon = new ImageIcon(
                inputStream);
        inputStream = this.getClass().getResource("/bookImage.png");
        bookIcon = new ImageIcon(
                inputStream);
        inputStream = this.getClass().getResource("/logo.jpg");
        logo = new ImageIcon(inputStream);
        this.setIconImage(logo.getImage());
        mainImage.setIcon(introIcon);
        InfoDialog.setIconImage(logo.getImage());
        AddBookDialog.setIconImage(logo.getImage());
        ReturnBookDialog.setIconImage(logo.getImage());
        
        
        
        FullNameLabel.setText("Система библиотечного учета");
        ExtraInformationLabel.setText("by Глушков Никита Б22-902");
        bookTypeComboBox.addItem("Русская учебная литература");
        bookTypeComboBox.addItem("Иностранная учебная литература");
        bookTypeComboBox.addItem("Русская художественная литература");
        bookTypeComboBox.addItem("Иностранная художественная литература");
        configureJTree();
    }

    
    public void configureJTree() {
        libraryModel = new DefaultMutableTreeNode("Библиотека");
        ErrorMessage.setVisible(false);
        DefaultMutableTreeNode user;
        
        for(Ticket t: managementController.getMainLibrary().getAllTicketsList()) {
            user = new DefaultMutableTreeNode(t.getUser().getFirstName() + " " +
                    t.getUser().getLastName() + " | " + t.getUser().getId());
            
            libraryModel.add(user);
            for(Book b: t.getListOfTakenBooks()) {
                user.add(new DefaultMutableTreeNode(b.getName()));
            } 
            
        }
        
        JTree.setModel(new javax.swing.tree.DefaultTreeModel(libraryModel));

    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddBookDialog = new javax.swing.JDialog();
        addBookToUser = new javax.swing.JButton();
        listOfLibrarysBooks = new javax.swing.JComboBox<>();
        AddLabel = new javax.swing.JLabel();
        ReturnBookDialog = new javax.swing.JDialog();
        returnSelectedBook = new javax.swing.JButton();
        listOfUserBooks = new javax.swing.JComboBox<>();
        DeleteLable = new javax.swing.JLabel();
        InfoDialog = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        bookTypeComboBox = new javax.swing.JComboBox<>();
        ScrollPane = new javax.swing.JScrollPane();
        JTree = new javax.swing.JTree(libraryModel);
        addBookButton = new javax.swing.JButton();
        removeBookButton = new javax.swing.JButton();
        ErrorMessage = new javax.swing.JLabel();
        FullNameLabel = new javax.swing.JLabel();
        ExtraInformationLabel = new javax.swing.JLabel();
        mainImage = new javax.swing.JLabel();
        InformationBar = new javax.swing.JMenuBar();
        Information = new javax.swing.JMenu();
        ShowListOfBooks = new javax.swing.JMenuItem();

        addBookToUser.setBackground(new java.awt.Color(255, 255, 255));
        addBookToUser.setForeground(new java.awt.Color(51, 51, 51));
        addBookToUser.setText("Добавить");
        addBookToUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookToUserActionPerformed(evt);
            }
        });

        listOfLibrarysBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOfLibrarysBooksActionPerformed(evt);
            }
        });

        AddLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AddLabel.setText("Добавление");

        javax.swing.GroupLayout AddBookDialogLayout = new javax.swing.GroupLayout(AddBookDialog.getContentPane());
        AddBookDialog.getContentPane().setLayout(AddBookDialogLayout);
        AddBookDialogLayout.setHorizontalGroup(
            AddBookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddBookDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddBookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addComponent(listOfLibrarysBooks, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(addBookToUser, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        AddBookDialogLayout.setVerticalGroup(
            AddBookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBookDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddBookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listOfLibrarysBooks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBookToUser))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        returnSelectedBook.setText("Удалить книгу");
        returnSelectedBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnSelectedBookActionPerformed(evt);
            }
        });

        listOfUserBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOfUserBooksActionPerformed(evt);
            }
        });

        DeleteLable.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        DeleteLable.setText("Удаление");

        javax.swing.GroupLayout ReturnBookDialogLayout = new javax.swing.GroupLayout(ReturnBookDialog.getContentPane());
        ReturnBookDialog.getContentPane().setLayout(ReturnBookDialogLayout);
        ReturnBookDialogLayout.setHorizontalGroup(
            ReturnBookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReturnBookDialogLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(ReturnBookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReturnBookDialogLayout.createSequentialGroup()
                        .addComponent(DeleteLable, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(ReturnBookDialogLayout.createSequentialGroup()
                        .addComponent(listOfUserBooks, 0, 505, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(returnSelectedBook, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        ReturnBookDialogLayout.setVerticalGroup(
            ReturnBookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReturnBookDialogLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(DeleteLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReturnBookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnSelectedBook)
                    .addComponent(listOfUserBooks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(bookTable);

        bookTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTypeComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InfoDialogLayout = new javax.swing.GroupLayout(InfoDialog.getContentPane());
        InfoDialog.getContentPane().setLayout(InfoDialogLayout);
        InfoDialogLayout.setHorizontalGroup(
            InfoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoDialogLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(InfoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        InfoDialogLayout.setVerticalGroup(
            InfoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoDialogLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(bookTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTreeMouseClicked(evt);
            }
        });
        ScrollPane.setViewportView(JTree);

        getContentPane().add(ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 20, 292, 408));

        addBookButton.setBackground(new java.awt.Color(255, 255, 255));
        addBookButton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        addBookButton.setForeground(new java.awt.Color(51, 51, 51));
        addBookButton.setText("Добавить книгу");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 134, -1));

        removeBookButton.setBackground(new java.awt.Color(255, 255, 255));
        removeBookButton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        removeBookButton.setForeground(new java.awt.Color(51, 51, 51));
        removeBookButton.setText("Вернуть книгу");
        removeBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 131, -1));

        ErrorMessage.setText("Ошибка. Выберите пользователя!");
        getContentPane().add(ErrorMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 208, -1));

        FullNameLabel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        FullNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FullNameLabel.setText("fnl");
        getContentPane().add(FullNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 340, 40));

        ExtraInformationLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ExtraInformationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExtraInformationLabel.setText("jb");
        ExtraInformationLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(ExtraInformationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 360, 130));

        mainImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainImage.setText("img");
        getContentPane().add(mainImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 150, 151));

        Information.setText("Информация");

        ShowListOfBooks.setText("Список книг");
        ShowListOfBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowListOfBooksActionPerformed(evt);
            }
        });
        Information.add(ShowListOfBooks);

        InformationBar.add(Information);

        setJMenuBar(InformationBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void ShowListOfBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowListOfBooksActionPerformed

        InfoDialog.setVisible(true);
        InfoDialog.setSize(700, 350);
        InfoDialog.setLocationRelativeTo(null);
        drawBookTable();
        
        
    }//GEN-LAST:event_ShowListOfBooksActionPerformed

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        
        String[] userData;
       
        try{
            
            userData = JTree.getLastSelectedPathComponent().toString().split(" | ");
            ErrorMessage.setVisible(false);
            AddBookDialog.setVisible(true);
            AddBookDialog.setSize(680,150);
            AddBookDialog.setTitle("Добавление книги");
            AddBookDialog.setLocationRelativeTo(null);
            listOfLibrarysBooks.removeAllItems();
            
            for(Book book: managementController.getMainLibrary().getAllBooksList()) {
                if (!(book == null)) {
                    listOfLibrarysBooks.addItem(book.getName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            ErrorMessage.setVisible(true);
        }
        
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void removeBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBookButtonActionPerformed
        String[] userData;
       
        try{
            if (!(JTree.getLastSelectedPathComponent().toString().contains("|"))) {
                DefaultMutableTreeNode selectedNode = 
                        (DefaultMutableTreeNode)JTree.getLastSelectedPathComponent();
                userData = selectedNode.getParent().toString().split(" | ");
                Ticket ticket = managementController.getMainLibrary().findTicketByUserID(userData[3]);
                ticket.returnBook(ticket.findBookByName(selectedNode.toString()));
                configureJTree();
            }
            else {
                userData = JTree.getLastSelectedPathComponent().toString().split(" | ");
                Ticket ticket = managementController.getMainLibrary().findTicketByUserID(userData[3]);
                ErrorMessage.setVisible(false);
                ReturnBookDialog.setVisible(true);
                ReturnBookDialog.setSize(680,150);
                ReturnBookDialog.setTitle("Удаление книги");
                ReturnBookDialog.setLocationRelativeTo(null);
                listOfUserBooks.removeAllItems();

                for(Book book: ticket.getListOfTakenBooks()) {
                    listOfUserBooks.addItem(book.getName());
                 
                }
            }    
        } catch (Exception e) {
            ErrorMessage.setVisible(true);
        }
        
    }//GEN-LAST:event_removeBookButtonActionPerformed

    private void addBookToUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookToUserActionPerformed
        String[] userData;
        try {
            String nameOfBook = (String) listOfLibrarysBooks.getSelectedItem();
            userData = JTree.getLastSelectedPathComponent().toString().split(" | ");           
            Ticket ticket = managementController.getMainLibrary().findTicketByUserID(userData[3]);
            ticket.takeBook(managementController.getMainLibrary().findBookByName(nameOfBook));
            AddBookDialog.setVisible(false);
            configureJTree();
            
;
        } catch (IllegalArgumentException ex){
            showErrorMessage();
        }
        
    }//GEN-LAST:event_addBookToUserActionPerformed

    private void listOfLibrarysBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOfLibrarysBooksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listOfLibrarysBooksActionPerformed

    private void returnSelectedBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnSelectedBookActionPerformed
        String[] userData;
        try {
            String nameOfBook = (String) listOfUserBooks.getSelectedItem();
            userData = JTree.getLastSelectedPathComponent().toString().split(" | ");;            
            Ticket ticket = managementController.getMainLibrary().findTicketByUserID(userData[3]);
            ticket.returnBook(ticket.findBookByName(nameOfBook));
            ReturnBookDialog.setVisible(false);
            configureJTree();
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_returnSelectedBookActionPerformed

    private void listOfUserBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOfUserBooksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listOfUserBooksActionPerformed
    
    private void handleTreeClickOnUser(User user) {
        switch(user.getType()) {
            case STUDENT:
                Student student = (Student) user;
                FullNameLabel.setText(student.getFirstName() + " " +
                        student.getLastName());
                ExtraInformationLabel.setText(student.getGroupNumber());
            case TEACHER:
                Teacher teacher = (Teacher) user;
                FullNameLabel.setText(teacher.getFirstName() + " " +
                        teacher.getPatronymic() + " " +
                        teacher.getLastName());
                ExtraInformationLabel.setText(teacher.getDepartment());
                
        }
    }
    
    private void handleTreeClickOnBook(Book book) {
        ExtraInformationLabel.setText(book.getInfo());
                
        
    }
    private void JTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTreeMouseClicked

        DefaultMutableTreeNode selectedNode = 
                        (DefaultMutableTreeNode)JTree.getLastSelectedPathComponent();
        if (selectedNode != null && selectedNode.toString().contains("|")){
            FullNameLabel.setVisible(true);
            ExtraInformationLabel.setVisible(true);
            mainImage.setIcon(nullUserIcon);
            String[] userData = selectedNode.toString().split(" | ");
            Ticket ticket = managementController.getMainLibrary().findTicketByUserID(userData[3]);
            mainImage.setVisible(true);
            handleTreeClickOnUser(ticket.getUser());

        } else if (selectedNode != null && "Библиотека".equals(selectedNode.toString())) {
            mainImage.setIcon(introIcon);
            mainImage.setVisible(true);
            FullNameLabel.setText("Система библиотечного учета");
            ExtraInformationLabel.setText("by Глушков Никита Б22-902");
        } else if (selectedNode != null){
            mainImage.setIcon(bookIcon);
            mainImage.setVisible(true);
            FullNameLabel.setText(selectedNode.toString());
            Book book = managementController.getMainLibrary()
                    .findBookByName(selectedNode.toString());
            handleTreeClickOnBook(book);

        }
        
    }//GEN-LAST:event_JTreeMouseClicked
    private void parseBooksToTable(Book book, DefaultTableModel model) {
              
        
        String[] line = book.getLine();
        model.addRow(line);
    }
    
    private void fillBookTable(DefaultTableModel model, String choice) {
        
        switch (choice) {
            case "Русская учебная литература":
                model.addColumn("Тип");
                model.addColumn("Дисциплина");
                model.addColumn("Кол-во страниц");
                for(Book book: managementController.getMainLibrary().getAllBooksList()) {
                    if(book.getBookType() == RUSSIAN_STUDY){
                        parseBooksToTable(book, model);
                    }
                }
                
                break;
            case "Иностранная учебная литература":
                model.addColumn("Уровень");
                model.addColumn("Университет");
                model.addColumn("Дисциплина");
                model.addColumn("Язык");
                model.addColumn("Кол-во страниц");
                for(Book book: managementController.getMainLibrary().getAllBooksList()) {
                    if(book.getBookType() == FOREIGN_STUDY){
                        parseBooksToTable(book, model);
                    }
                }
                
                break;
            case "Иностранная художественная литература":
                model.addColumn("Жанр");
                model.addColumn("Место издания");
                model.addColumn("Кол-во страниц");
                for(Book book: managementController.getMainLibrary().getAllBooksList()) {
                    if(book.getBookType() == FOREIGN_FICTION){
                        parseBooksToTable(book, model);
                    }
                }
                
               break;
            case "Русская художественная литература":
               model.addColumn("Жанр");
               model.addColumn("Издатель");
               model.addColumn("Кол-во страниц");
               for(Book book: managementController.getMainLibrary().getAllBooksList()) {
                    if(book.getBookType() == RUSSIAN_FICTION){
                        parseBooksToTable(book, model);
                    }
                }
              
               break;
        }
        
        
    }
    private void drawBookTable() {
        DefaultTableModel model = new DefaultTableModel() {
             @Override
             public boolean isCellEditable(int row, int column) {
                return false;
             };
        };
        model.addColumn("Название");
        String choice = bookTypeComboBox.getSelectedItem().toString();
        fillBookTable(model,choice);
        bookTable.setModel(model);
        
 
    }
    private void bookTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTypeComboBoxActionPerformed
        drawBookTable();
        
    }//GEN-LAST:event_bookTypeComboBoxActionPerformed
    private void showErrorMessage() {
        JOptionPane.showMessageDialog(rootPane, "У пользователя уже есть такая книга.", "Ошибка.",
                JOptionPane.ERROR_MESSAGE);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddBookDialog;
    private javax.swing.JLabel AddLabel;
    private javax.swing.JLabel DeleteLable;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JLabel ExtraInformationLabel;
    private javax.swing.JLabel FullNameLabel;
    private javax.swing.JDialog InfoDialog;
    private javax.swing.JMenu Information;
    private javax.swing.JMenuBar InformationBar;
    private javax.swing.JTree JTree;
    private javax.swing.JDialog ReturnBookDialog;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JMenuItem ShowListOfBooks;
    private javax.swing.JButton addBookButton;
    private javax.swing.JButton addBookToUser;
    private javax.swing.JTable bookTable;
    private javax.swing.JComboBox<String> bookTypeComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listOfLibrarysBooks;
    private javax.swing.JComboBox<String> listOfUserBooks;
    private javax.swing.JLabel mainImage;
    private javax.swing.JButton removeBookButton;
    private javax.swing.JButton returnSelectedBook;
    // End of variables declaration//GEN-END:variables
}
