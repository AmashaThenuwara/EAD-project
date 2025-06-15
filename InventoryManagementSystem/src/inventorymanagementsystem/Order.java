package inventorymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Order extends javax.swing.JFrame {

    public Order() {
        initComponents();
        loadOrdersData(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordertable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtbname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        btn21 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtoid = new javax.swing.JTextField();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtpname = new javax.swing.JTextField();
        txttprice = new javax.swing.JLabel();

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

        ordertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Product Name", "Branch Name", "Quantity", "price", "total price"
            }
        ));
        jScrollPane1.setViewportView(ordertable);

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Branch Name :");

        txtbname.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity :");

        txtquantity.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price :");

        txtprice.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Order ID :");

        txtoid.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        txtoid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtoidActionPerformed(evt);
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

        btn9.setBackground(new java.awt.Color(204, 173, 152));
        btn9.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btn9.setText("UPDATE");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product Name :");

        txtpname.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N

        txttprice.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtoid, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtbname)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtquantity)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtprice)
                                .addComponent(txtpname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                            .addComponent(txttprice, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(277, 277, 277))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txttprice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn21)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtoid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
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

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
        Dashboard dashboardForm = new Dashboard();
        dashboardForm.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn21ActionPerformed

    private void txtoidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtoidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtoidActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        String order_id = txtoid.getText();
        String product_name = txtpname.getText();
        String branch_name = txtbname.getText();
        String product_quantity=txtquantity.getText();
        String product_price=txtprice.getText();
        
        try{
            double quantity=Double.parseDouble(txtquantity.getText());
            double price=Double.parseDouble(txtprice.getText());
            double total_price=quantity*price;
            Connection con = DataBaseConnection.connect(); PreparedStatement ps = con.prepareStatement(
            "INSERT INTO orders (order_id,product_name,branch_name,product_quantity,product_price,total_price) VALUES (?,?,?,?,?,?)");
            ps.setString(1, txtoid.getText());
            ps.setString(2, txtpname.getText());
            ps.setString(3, txtbname.getText());
            ps.setString(4, txtquantity.getText());
            ps.setString(5, txtprice.getText());
            ps.setDouble(6, total_price);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Order added successfully!");

            DefaultTableModel model = (DefaultTableModel) ordertable.getModel();
            model.addRow(new Object[]{order_id,product_name,branch_name,product_quantity,product_price,total_price});

        txtoid.setText("");
        txtpname.setText("");
        txtbname.setText("");
        txtquantity.setText("");
        txtprice.setText("");
        txttprice.setText("");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:                                           
        int selectedRow = ordertable.getSelectedRow();
    
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to update.");
            return;
        }
   
        String url = "jdbc:mysql://localhost:3306/inventorymanagementsystem";
        String user = "root";
        String password = "";

        String order_id = txtoid.getText().trim();
        String product_name = txtpname.getText().trim();
        String branch_name = txtbname.getText().trim();
        String product_quantity = txtquantity.getText().trim();
        String product_price = txtprice.getText().trim();

        try {
            double quantity=Double.parseDouble(txtquantity.getText());
            double price=Double.parseDouble(txtprice.getText());
            double total_price=quantity*price;

            Connection con = DriverManager.getConnection(url, user, password);
            String query = "UPDATE orders SET product_name=?, branch_name=?, product_quantity=?, product_price=?, total_price=? WHERE order_id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, product_name);
            ps.setString(2, branch_name); 
            ps.setInt(3, Integer.parseInt(product_quantity));
            ps.setDouble(4, Double.parseDouble(product_price));
            ps.setDouble(5, (total_price));
            ps.setInt(6, Integer.parseInt(order_id));

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Order updated successfully");
            
                DefaultTableModel model = (DefaultTableModel) ordertable.getModel();
                model.setRowCount(0);
                loadOrdersData();
            } else {
                JOptionPane.showMessageDialog(null, "Error: Order id not found");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
        int selectedRow = ordertable.getSelectedRow(); 

        if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        return;
    }

    int order_id = (int) ordertable.getValueAt(selectedRow, 0);

    String url = "jdbc:mysql://localhost:3306/inventorymanagementsystem";
    String user = "root";
    String password = "";

    try {
        Connection con = DriverManager.getConnection(url, user, password);
        String sql = "DELETE FROM orders WHERE order_id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, order_id);
        ps.executeUpdate();
        
        loadOrdersData(); 

        JOptionPane.showMessageDialog(this, "Order deleted successfully.");
        
        ps.close();
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error deleting order.");
      } 
    }//GEN-LAST:event_btn10ActionPerformed

    public void loadOrdersData(){
    String url = "jdbc:mysql://localhost:3306/inventorymanagementsystem"; 
    String user = "root"; 
    String password = ""; 

    try {
        Connection con = DriverManager.getConnection(url, user, password);
        String sql = "SELECT * FROM orders"; 
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        DefaultTableModel model = (DefaultTableModel) ordertable.getModel();
        model.setRowCount(0); 

        while(rs.next()) {
            Object[] row = {
                rs.getInt("order_id"),
                rs.getString("product_name"),
                rs.getString("branch_name"),
                rs.getInt("product_quantity"),
                rs.getDouble("product_price"),
                rs.getDouble("total_price")
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
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ordertable;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtoid;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JLabel txttprice;
    // End of variables declaration//GEN-END:variables
}
