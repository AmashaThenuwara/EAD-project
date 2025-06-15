package inventorymanagementsystem;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageProduct extends javax.swing.JFrame {
    private File file;

    public ManageProduct() {
        initComponents();
        loadManageProductData();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn10 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtsquantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn20 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        producttable = new javax.swing.JTable();
        btn21 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtpname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtpid = new javax.swing.JTextField();

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

        btn10.setBackground(new java.awt.Color(204, 173, 152));
        btn10.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btn10.setText("DELETE");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(204, 173, 152));
        btn9.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btn9.setText("UPDATE");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(204, 173, 152));
        btn8.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btn8.setText("ADD");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price :");

        txtprice.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stock Quantity :");

        txtsquantity.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Image :");

        btn20.setBackground(new java.awt.Color(237, 226, 219));
        btn20.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        btn20.setText("Browse");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        producttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Price", "Stock Quantity", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(producttable);

        btn21.setBackground(new java.awt.Color(204, 173, 152));
        btn21.setFont(new java.awt.Font("Kristen ITC", 1, 8)); // NOI18N
        btn21.setText("BACK");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Product Name :");

        txtpname.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        txtpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpnameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product ID :");

        txtpid.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        txtpid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addContainerGap(65, Short.MAX_VALUE)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)))))
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addComponent(btn21)
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

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setMultiSelectionEnabled(false);
        if(jFileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
            this.file=jFileChooser.getSelectedFile();
            jLabel1.setText(file.getName());
        }
    }//GEN-LAST:event_btn20ActionPerformed
 
    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
        Dashboard dashboardForm = new Dashboard();
        dashboardForm.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        String product_id = txtpid.getText();
        String product_name = txtpname.getText();
        String product_price=txtprice.getText();
        String product_squantity=txtsquantity.getText();
        String product_image=jLabel1.getText();
           
        try (Connection con = DataBaseConnection.connect(); PreparedStatement ps = con.prepareStatement(
               "INSERT INTO manageproduct (product_id,product_name,product_price,product_squantity,product_image) VALUES (?,?,?,?,?)")){
               ps.setString(1, product_id);
               ps.setString(2, product_name);
               ps.setString(3, product_price);
               ps.setString(4, product_squantity);
               ps.setString(5, product_image);
               
               ps.executeUpdate();
               JOptionPane.showMessageDialog(this, "Product added successfully!");
               
               DefaultTableModel model = (DefaultTableModel) producttable.getModel();
               model.addRow(new Object[]{product_id,product_name,product_price,product_squantity,product_image});

               txtpid.setText("");
               txtpname.setText("");
               txtprice.setText("");
               txtsquantity.setText("");
               jLabel1.setText("");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
           }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:                                             
    int selectedRow = producttable.getSelectedRow();
    
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Please select a row to update.");
        return;
    }
   
    String url = "jdbc:mysql://localhost:3306/inventorymanagementsystem";
    String user = "root";
    String password = "";

    String product_id = txtpid.getText().trim();
    String product_name = txtpname.getText().trim();
    String product_price = txtprice.getText().trim();
    String product_squantity = txtsquantity.getText().trim();
    String product_image = jLabel1.getText().trim();

    try {
        Connection con = DriverManager.getConnection(url, user, password);
        String query = "UPDATE manageproduct SET product_name=?, product_price=?, product_squantity=?, product_image=? WHERE product_id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, product_name);
        ps.setDouble(2, Double.parseDouble(product_price)); 
        ps.setInt(3, Integer.parseInt(product_squantity));
        ps.setString(4, product_image);
        ps.setInt(5, Integer.parseInt(product_id));

        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Product updated successfully");
            
            DefaultTableModel model = (DefaultTableModel) producttable.getModel();
            model.setRowCount(0);
            loadManageProductData();
        } else {
            JOptionPane.showMessageDialog(null, "Error: Product id not found");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid number format: " + e.getMessage());
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_btn9ActionPerformed

    private void txtpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpnameActionPerformed

    private void txtpidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpidActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
        int selectedRow = producttable.getSelectedRow(); 

        if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        return;
    }

    int product_id = (int) producttable.getValueAt(selectedRow, 0);

    String url = "jdbc:mysql://localhost:3306/inventorymanagementsystem";
    String user = "root";
    String password = "";

    try {
        Connection con = DriverManager.getConnection(url, user, password);
        String sql = "DELETE FROM manageproduct WHERE product_id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, product_id);
        ps.executeUpdate();
        
        loadManageProductData(); 

        JOptionPane.showMessageDialog(this, "Product deleted successfully.");
        
        ps.close();
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error deleting product.");
      } 
    }
    
    public void loadManageProductData(){
    String url = "jdbc:mysql://localhost:3306/inventorymanagementsystem"; 
    String user = "root"; 
    String password = ""; 

    try {
        Connection con = DriverManager.getConnection(url, user, password);
        String sql = "SELECT * FROM manageproduct"; 
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        DefaultTableModel model = (DefaultTableModel) producttable.getModel();
        model.setRowCount(0); 

        while(rs.next()) {
            Object[] row = {
                rs.getInt("product_id"),
                rs.getString("product_name"),
                rs.getDouble("product_price"),
                rs.getString("product_squantity"),
                rs.getString("product_image")
            };
            model.addRow(row);
        }

        rs.close();
        ps.close();
        con.close();
        
    } catch(Exception e) {
        JOptionPane.showMessageDialog(this, "Error Loading Data: " + e.getMessage());
    }//GEN-LAST:event_btn10ActionPerformed
}
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable producttable;
    private javax.swing.JTextField txtpid;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtsquantity;
    // End of variables declaration//GEN-END:variables
}
