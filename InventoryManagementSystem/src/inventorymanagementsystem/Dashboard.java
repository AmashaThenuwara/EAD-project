package inventorymanagementsystem;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        Label2 = new javax.swing.JLabel();
        btn20 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setBackground(new java.awt.Color(204, 173, 152));
        btn1.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        btn1.setText("MANAGE PRODUCT");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        Panel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 270, 40));

        btn4.setBackground(new java.awt.Color(204, 173, 152));
        btn4.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        btn4.setText("ORDER");
        btn4.setMaximumSize(new java.awt.Dimension(83, 24));
        btn4.setMinimumSize(new java.awt.Dimension(83, 24));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        Panel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 270, 40));

        btn7.setBackground(new java.awt.Color(204, 173, 152));
        btn7.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        btn7.setText("STATISTICS");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        Panel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 270, 40));

        Label2.setFont(new java.awt.Font("Ink Free", 1, 48)); // NOI18N
        Label2.setText("AKStockMaster");
        Panel1.add(Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, -1, -1));

        btn20.setBackground(new java.awt.Color(204, 173, 152));
        btn20.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        btn20.setText("CLOSE");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        Panel1.add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 270, 40));

        btn2.setBackground(new java.awt.Color(204, 173, 152));
        btn2.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        btn2.setText("BRANCH");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        Panel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 270, 40));

        Label1.setForeground(new java.awt.Color(255, 255, 255));
        Label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cms.jpg"))); // NOI18N
        Panel1.add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));

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

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        ManageProduct manageproductForm = new ManageProduct();
        manageproductForm.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        Order orderForm = new Order();
        orderForm.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        Branch branchForm = new Branch();
        branchForm.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn7;
    // End of variables declaration//GEN-END:variables
}
