/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagementsystem;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import librarymanagementsystem.Common.DBConnection;


/**
 *
 * @author HP
 */
public class Book extends javax.swing.JFrame {

    //private Object DriverManager;

    /**
     * Creates new form Category
     */       
    DBConnection dbc = new DBConnection();
    private boolean flase;
       
    public Book() {
        initComponents();
        
        DisplayTable();
    }
    
//    Connection con;
 
    PreparedStatement pst;
    int selectedid = -1;
    
//    public void Connect()
//    {
//        try {
//            //Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/library","root","123456");
//            
//            
////        } catch (ClassNotFoundException ex) {
////            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
//        
//        } catch (SQLException ex) { 
//            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//        
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        txtupdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtpublisher = new javax.swing.JComboBox<>();
        txtcategory = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtauthor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtcontents = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtedition = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Book");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Category");

        Add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Add.setText("Add");
        Add.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                AddAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        txtupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtupdate.setText("Update");
        txtupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtupdateMouseClicked(evt);
            }
        });
        txtupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setText("Cancel ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Category", "Book Name", "Author ", "Publisher", "Contents ", "No of Pages ", "Edition"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(0, 0, 0));
        jTable2.setName("TableCategory"); // NOI18N
        jTable2.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable2.setShowGrid(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Author ");

        txtpublisher.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtpublisher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wiley ", "McGraw Hill Education ", "Penguin Random House " }));

        txtcategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student ", "Author " }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Publisher");

        txtauthor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtauthor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stephen King ", "J K Rowling ", "Leo Tolstoy ", "Nora Roberts ", " " }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Contents ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("No of Pages");

        txtedition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteditionActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Edition");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDelete)
                                    .addComponent(Add))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtupdate)
                                    .addComponent(jButton8))
                                .addGap(43, 43, 43))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtname)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(jLabel1))
                                            .addComponent(txtpublisher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtcategory, 0, 234, Short.MAX_VALUE)
                                            .addComponent(txtauthor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtcontents)
                                            .addComponent(txtedition, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(36, 36, 36)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcontents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtedition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtupdate)
                            .addComponent(Add))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(btnDelete))
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:]
        
      String name = txtname.getText();
        String category = txtcategory.getSelectedItem().toString();
        String publisher = txtpublisher.getSelectedItem().toString();
        String author = txtauthor.getSelectedItem().toString();
        String Contents = txtcontents.getText();
        String Noofpages = txtno.getText();
        String edition = txtedition.getText();
        



        
        try {
           
            dbc.Open();
            
            pst = dbc.getCon().prepareStatement("INSERT INTO book(name,category,author,publisher,contents,noofpages,edition) VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, name);
            pst.setString(2, category);
            pst.setString(3, author);
            pst.setString(4, publisher);        
            pst.setString(5, Contents);
            pst.setString(6, Noofpages);   
            pst.setString(7, edition);
            
            
            
            
            int k = pst.executeUpdate();
            
            dbc.Close();

            if(k== 1)
            {
                JOptionPane.showMessageDialog(this, "Book Created");
                
                refresh();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Error");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_AddActionPerformed

    private void txtupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateActionPerformed
         String name = txtname.getText();
        String category = txtcategory.getSelectedItem().toString();
        String author = txtauthor.getSelectedItem().toString();
        String publisher = txtpublisher.getSelectedItem().toString();
        String contents = txtcontents.getText();
        String noofpages = txtno.getText();
        String edition = txtedition.getText();
       
        
        
        try {
           
            dbc.Open();
            
            
            pst = dbc.getCon().prepareStatement("UPDATE book SET name=?,category=?,author=?,publisher=?,contents=?,noofpages=?,edition=? WHERE id=?");
            pst.setString(1, name);
            pst.setString(2, category);
             pst.setString(3, author);
              pst.setString(4, publisher);
               pst.setString(5, contents);
            pst.setString(6, noofpages);
             pst.setString(7, edition);
            pst.setInt(8, selectedid); // 6
            
            int k = pst.executeUpdate();
            
            dbc.Close();

            if( k == 1 )
            {
                JOptionPane.showMessageDialog(this, "book Updated");
                
                refresh();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Error");
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(); // excetion handling - this is not a best practice.
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtupdateActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int r = jTable2.getSelectedRow();
        selectedid = (int)jTable2.getModel().getValueAt(r, 0);
        txtname.setText(jTable2.getModel().getValueAt(r, 1).toString());
       txtcategory.setSelectedItem(jTable2.getModel().getValueAt(r, 2).toString());
        txtauthor.setSelectedItem(jTable2.getModel().getValueAt(r, 3).toString());
        txtpublisher.setSelectedItem(jTable2.getModel().getValueAt(r, 3).toString());
        txtcontents.setText(jTable2.getModel().getValueAt(r, 1).toString());
        txtno.setText(jTable2.getModel().getValueAt(r, 1).toString());
        txtedition.setText(jTable2.getModel().getValueAt(r, 1).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if(selectedid == -1){
            JOptionPane.showMessageDialog(this, "Select Table Row First", "Warning", JOptionPane.WARNING_MESSAGE );
            return;
        }
        
        int reply = JOptionPane.showConfirmDialog(this, "Confirm To Delete", "Confirm", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.NO_OPTION) {
           return;
        }
        
        try {
           
            dbc.Open();
            
            pst = dbc.getCon().prepareStatement("DELETE FROM book WHERE id=?");
            pst.setInt(1, selectedid);
            
            int k = pst.executeUpdate();
            
            dbc.Close();

            if(k== 1)
            {
                JOptionPane.showMessageDialog(this, "book Deleted");
                refresh();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Error");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.setVisible(flase);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void AddAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_AddAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_AddAncestorAdded

    private void txtupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtupdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtupdateMouseClicked

    private void txteditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteditionActionPerformed

    
    public final void DisplayTable() {
    
        try {
            dbc.Open();
            pst = dbc.getCon().prepareStatement("SELECT * FROM book Order BY id DESC");
            
            ResultSet resultSet = pst.executeQuery();  

            //ResultSetMetaData rsmd = resultSet.getMetaData();
            //int colcount = rsmd.getColumnCount();//3
                    
            DefaultTableModel dtm = (DefaultTableModel)jTable2.getModel();//get model from JTable
         
            dtm.setRowCount(0);//View
            
            
            while (resultSet.next()) {  //row wise 1 2 3    
                
                Vector v2 = new Vector(); //actual row           
                
                //for (int i = 0; i < colcount; i++) {
                    //Retrieving details from the database and storing it in the String variables
                    //add columns
                    v2.add(resultSet.getInt("id"));
                    v2.add(resultSet.getString("name"));
                    v2.add(resultSet.getString("category"));
                    v2.add(resultSet.getString("author"));
                    v2.add(resultSet.getString("publisher"));
                    v2.add(resultSet.getString("contents"));
                    v2.add(resultSet.getString("noofpages"));
                    v2.add(resultSet.getString("edition"));
                    
                //}
                 
                dtm.addRow(v2);
            }
            
            
            dbc.Close();

        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void refresh(){
        
        selectedid = -1;
        
        txtname.setText("");
        txtcategory.setSelectedItem("");
        txtauthor.setSelectedItem("");
        txtpublisher.setSelectedItem("");
        txtcontents.setText("");
        txtno.setText("");
        txtedition.setText("");
        txtname.requestFocus();

        DisplayTable();                
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> txtauthor;
    private javax.swing.JComboBox<String> txtcategory;
    private javax.swing.JTextField txtcontents;
    private javax.swing.JTextField txtedition;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtno;
    private javax.swing.JComboBox<String> txtpublisher;
    private javax.swing.JButton txtupdate;
    // End of variables declaration//GEN-END:variables
}
