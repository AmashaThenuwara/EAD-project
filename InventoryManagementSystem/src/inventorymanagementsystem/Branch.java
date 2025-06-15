package inventorymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Branch extends javax.swing.JFrame {

    public Branch() {
        initComponents();
        loadBranchData(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        branchtable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtbid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtbname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtblocation = new javax.swing.JTextField();
        btn21 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Panel1.setBackground(new java.awt.Color(158, 111, 78));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        branchtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Branch ID", "Branch Name", "Location"
            }
        ));
        jScrollPane1.setViewportView(branchtable);

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Branch ID :");

        txtbid.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Branch Name :");

        txtbname.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Location :");

        txtblocation.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        txtblocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtblocationActionPerformed(evt);
            }
        });

        btn21.setBackground(new java.awt.Color(204, 173, 152));
        btn21.setFont(new java.awt.Font("Kristen ITC", 1, 8)); // NOI18N
        btn21.setText("BACK");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn16.setBackground(new java.awt.Color(204, 173, 152));
        btn16.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btn16.setText("ADD");
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn17.setBackground(new java.awt.Color(204, 173, 152));
        btn17.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btn17.setText("UPDATE");
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn18.setBackground(new java.awt.Color(204, 173, 152));
        btn18.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btn18.setText("DELETE");
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtbname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtblocation))
                        .addGap(13, 13, 13))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addContainerGap(130, Short.MAX_VALUE)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtblocation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btn21)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void txtblocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtblocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtblocationActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
        Dashboard dashboardForm = new Dashboard();
        dashboardForm.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        // TODO add your handling code here:
        String branch_id = txtbid.getText();
        String branch_name = txtbname.getText();
        String branch_location=txtblocation.getText();
        
        try (Connection con = DataBaseConnection.connect(); PreparedStatement ps = con.prepareStatement(
               "INSERT INTO branch (branch_id,branch_name,branch_location) VALUES (?, ?, ?)")) {
               ps.setString(1, branch_id);
               ps.setString(2, branch_name);
               ps.setString(3, branch_location);
               
               ps.executeUpdate();
               JOptionPane.showMessageDialog(this, "Branch added successfully!");
               
               DefaultTableModel model = (DefaultTableModel) branchtable.getModel();
               model.addRow(new Object[]{branch_id, branch_name,branch_location});

               txtbid.setText("");
               txtbname.setText("");
               txtblocation.setText("");
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
           }
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        // TODO add your handling code here:
        int selectedRow = branchtable.getSelectedRow(); 

        if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        return;
    }

    int branch_id = (int) branchtable.getValueAt(selectedRow, 0);

    String url = "jdbc:mysql://localhost:3306/inventorymanagementsystem";
    String user = "root";
    String password = "";

    try {
        Connection con = DriverManager.getConnection(url, user, password);
        String sql = "DELETE FROM branch WHERE branch_id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, branch_id);
        ps.executeUpdate();
        
        loadBranchData(); 

        JOptionPane.showMessageDialog(this, "Branch deleted successfully.");
        
        ps.close();
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error deleting branch.");
      } 
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        // TODO add your handling code here:                                            
    int selectedRow = branchtable.getSelectedRow();
    
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Please select a row to update.");
        return;
    }
   
    String url = "jdbc:mysql://localhost:3306/inventorymanagementsystem";
    String user = "root";
    String password = "";

    String branch_id = txtbid.getText().trim();
    String branch_name = txtbname.getText().trim();
    String branch_location = txtblocation.getText().trim();
    
    try {
        Connection con = DriverManager.getConnection(url, user, password);
        String query = "UPDATE branch SET branch_name=?, branch_location=? WHERE branch_id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, branch_name);
        ps.setString(2, branch_location);
        ps.setInt(3, Integer.parseInt(branch_id));

        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Branch updated successfully");
            
            DefaultTableModel model = (DefaultTableModel) branchtable.getModel();
            model.setRowCount(0);
            loadBranchData();
        } else {
            JOptionPane.showMessageDialog(null, "Error: Branch id not found");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid number format: " + e.getMessage());
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_btn17ActionPerformed

    public void loadBranchData(){
    String url = "jdbc:mysql://localhost:3306/inventorymanagementsystem"; 
    String user = "root"; 
    String password = ""; 

    try {
        Connection con = DriverManager.getConnection(url, user, password);
        String sql = "SELECT * FROM branch"; 
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        DefaultTableModel model = (DefaultTableModel) branchtable.getModel();
        model.setRowCount(0); 

        while(rs.next()) {
            Object[] row = {
                rs.getInt("branch_id"),
                rs.getString("branch_name"),
                rs.getString("branch_location"),
            };
            model.addRow(row);
        }

        rs.close();
        ps.close();
        con.close();
        
    } catch(Exception e) {
        JOptionPane.showMessageDialog(this, "Error Loading Data: " + e.getMessage());
    }                                     
}
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Branch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JTable branchtable;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn21;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtblocation;
    private javax.swing.JTextField txtbname;
    // End of variables declaration//GEN-END:variables
}
