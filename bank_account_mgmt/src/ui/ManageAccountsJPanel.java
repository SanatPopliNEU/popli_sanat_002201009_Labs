/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.User;
import model.UserList;

/**
 *
 * @author sanatpopli
 */
public class ManageAccountsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAccountsJPanel
     * 
     * 
     */
    
    private String datafrommodel;
   
    
    public ManageAccountsJPanel(String neuid) {
        
        this.datafrommodel=neuid;
    }
    
    public String getDataFrommanage() {
        return datafrommodel;}
            
            
    private JPanel userProcessContainer;
    private UserList userlist;
    private String result;
    ManageAccountsJPanel(JPanel userProcessContainer, UserList userlist) {
        
        initComponents();
        
        this.userProcessContainer=userProcessContainer;
     this.userlist=userlist;
     populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel dtm= (DefaultTableModel) tblAdmin.getModel();
        dtm.setRowCount(0);
        for(User user:userlist.getHistory()){
            Object[] row=new Object[4];
            row[0]=user;
            row[1]=user.getUserid();
            row[2]=user.getUsername();
            row[3]=user.getPassword();
            
            dtm.addRow(row);
    }}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        viewjButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));

        tblAdmin.setAutoCreateRowSorter(true);
        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Accountno", "USERID", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAdmin.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAdmin);
        if (tblAdmin.getColumnModel().getColumnCount() > 0) {
            tblAdmin.getColumnModel().getColumn(0).setResizable(false);
            tblAdmin.getColumnModel().getColumn(1).setResizable(false);
            tblAdmin.getColumnModel().getColumn(2).setResizable(false);
            tblAdmin.getColumnModel().getColumn(3).setResizable(false);
        }

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        viewjButton.setText("View");
        viewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewjButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewjButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(viewjButton)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(btnBack))
                .addContainerGap(224, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout= (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
       datafrommodel=userlist.searchUser(txtSearch.getText());
        
        for(User user : userlist.getHistory()){
            if(user.getUserid().equals(txtSearch.getText())){
                
                ViewAccountJPanel panel=new ViewAccountJPanel(userProcessContainer,user);
             userProcessContainer.add("ViewAccountJPanel",panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
            }else{
                JOptionPane.showMessageDialog(null, "Not found");
            }
                
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void viewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewjButtonActionPerformed
        // TODO add your handling code here:
        int selectedrow=tblAdmin.getSelectedRow();
         if(selectedrow<0){
             JOptionPane.showMessageDialog(this, "Please select the row");
         }
         else{
             User user=(User) tblAdmin.getValueAt(selectedrow, 0);
             ViewAccountJPanel panel=new ViewAccountJPanel(userProcessContainer,user);
             userProcessContainer.add("ViewAccountJPanel",panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }               
    }//GEN-LAST:event_viewjButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedrow=tblAdmin.getSelectedRow();
        if(selectedrow>=0){
            int dialogueButton= JOptionPane.YES_NO_OPTION;
            int dialogueResult= JOptionPane.showConfirmDialog(null, "would you like to delete", "Warning", dialogueButton);
            if(dialogueResult==JOptionPane.YES_OPTION){
                User user=(User) tblAdmin.getValueAt(selectedrow,0);
                userlist.deleteUser(user);
                populateTable();
            }
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select the row");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAdmin;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JButton viewjButton;
    // End of variables declaration//GEN-END:variables
}