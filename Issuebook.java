/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagementsystem;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.text.SimpleDateFormat;

import librarymanagementsystem.Common.DBConnection;


/**
 *
 * @author HP
 */
public class Issuebook extends javax.swing.JFrame {

    //private Object DriverManager;

    /**
     * Creates new form Category
     */       
    DBConnection dbc = new DBConnection();
    private boolean flase;
       
    public Issuebook() {
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
        txtmemberid = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        txtupdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtbook = new javax.swing.JComboBox<>();
        txtmembername = new javax.swing.JTextField();
        txtissuedate = new com.toedter.calendar.JDateChooser();
        txtreturndate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Issue Book");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Member ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Member Name ");

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
                "id", "Member ID", "Member Name", "Book", "Date", "ReturnDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jLabel4.setText("Book");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Date ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Return Date ");

        txtbook.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maths ", "English ", "Science", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(1140, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtupdate)
                                            .addComponent(jButton8))
                                        .addGap(43, 43, 43))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtissuedate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtmemberid, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                            .addComponent(txtbook, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtmembername)
                                            .addComponent(txtreturndate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(36, 36, 36)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(78, 78, 78)))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtmemberid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtmembername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtissuedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtreturndate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:]
        
      String memberid = txtmemberid.getText();
      String membername = txtmembername.getText();
 
        String book = txtbook.getSelectedItem().toString();
        
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        String issuedate =dt.format(txtissuedate.getDate());
        
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        String returndate = dt1.format(txtreturndate.getDate());
        



        
        try {
           
            dbc.Open();
            
            pst = dbc.getCon().prepareStatement("INSERT INTO issuebook(memberid,membername,book,issuedate,returndate)VALUES(?,?,?,?,?)");
            pst.setString(1, memberid);
            pst.setString(2, membername);
            pst.setString(3, book);
            pst.setString(4, issuedate);        
            pst.setString(5, returndate);
           // pst.setInt(5, selectedid); // 6
            
            
            
            
            int k = pst.executeUpdate();
            
            dbc.Close();

            if(k== 1)
            {
                JOptionPane.showMessageDialog(this, "Data inserted");
                
                refresh();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Error");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Issuebook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_AddActionPerformed

    private void txtupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateActionPerformed
        String memberid = txtmemberid.getText();
        String membername = txtmembername.getText();
        String book = txtbook.getSelectedItem().toString();     
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        String issuedate =dt.format(txtissuedate.getDate());    
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        String returndate = dt1.format(txtreturndate.getDate());
        
        
        try {
           
            dbc.Open();
            
            
            pst = dbc.getCon().prepareStatement("UPDATE issuebook SET memberid=?,membername=?,book=?,issuedate=?,returndate=? WHERE id=?");
            pst.setString(1, memberid);
            pst.setString(2, membername);
            pst.setString(3, book);
            pst.setString(4, issuedate);
            pst.setString(5, returndate);
            pst.setInt(6, selectedid);
          
            
            int k = pst.executeUpdate();
            
            dbc.Close();

            if( k == 1 )
            {
                JOptionPane.showMessageDialog(this, "Data inserted");
                
                refresh();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Error");
            }
            
        } catch (SQLException ex) {
          //  ex.printStackTrace(); // excetion handling - this is not a best practice.
            Logger.getLogger(Issuebook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtupdateActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        System.out.println("Clicked on a table record!");
        
        int columnNo = 0;
        // get the selected row by the user
        int row = jTable2.getSelectedRow();
        selectedid = (int) jTable2.getModel().getValueAt(row, columnNo++ ); // 0
        txtmemberid.setText(jTable2.getModel().getValueAt(row, columnNo++).toString()); //1
        txtmembername.setText(jTable2.getModel().getValueAt(row, columnNo++).toString()); // 2
        txtbook.setSelectedItem(jTable2.getModel().getValueAt(row, columnNo++).toString());
        try{
            Date issueDate = new SimpleDateFormat("yyyy-MM-dd").parse( jTable2.getModel().getValueAt(row, columnNo++).toString() );
            Date returnDate = new SimpleDateFormat("yyyy-MM-dd").parse( jTable2.getModel().getValueAt(row, columnNo++).toString() );
            txtissuedate.setDate( issueDate );
            txtreturndate.setDate( returnDate );
        }catch( ParseException ex ){
            ex.printStackTrace();
        }
   
//        txtissuedate.setDateFormatString( jTable2.getModel().getValueAt(row, columnNo++).toString() );
//        txtreturndate.setDateFormatString( jTable2.getModel().getValueAt(row, columnNo++).toString() ); 
// txtreturndate.setDateFormatString( jTable2.getModel().getValueAt(row, columnNo++).toString() ); //5
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
            
            pst = dbc.getCon().prepareStatement("DELETE FROM issuebook WHERE id=?");
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
            Logger.getLogger(Issuebook.class.getName()).log(Level.SEVERE, null, ex);
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

    
    public final void DisplayTable() {
    
        try {
            dbc.Open();
            pst = dbc.getCon().prepareStatement("SELECT * FROM issuebook Order BY id DESC");
            
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
                    v2.add(resultSet.getString("memberid"));
                    v2.add(resultSet.getString("membername"));
                    v2.add(resultSet.getString("book"));
                    v2.add(resultSet.getString("issuedate"));
                    v2.add(resultSet.getString("returndate"));
                   
                    
                //}
                 
                dtm.addRow(v2);
            }
            
            
            dbc.Close();

        } catch (SQLException ex) {
            Logger.getLogger(Issuebook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void refresh(){
        
        selectedid = -1;
        
        txtmemberid.setText("");
        txtmembername.setText("");
        txtbook.setSelectedItem("");
        txtissuedate.setDateFormatString("");
        txtreturndate.setDateFormatString("");
        txtmemberid.requestFocus();

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
            java.util.logging.Logger.getLogger(Issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Issuebook().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> txtbook;
    private com.toedter.calendar.JDateChooser txtissuedate;
    private javax.swing.JTextField txtmemberid;
    private javax.swing.JTextField txtmembername;
    private com.toedter.calendar.JDateChooser txtreturndate;
    private javax.swing.JButton txtupdate;
    // End of variables declaration//GEN-END:variables
}
