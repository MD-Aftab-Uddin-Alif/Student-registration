/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class view extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    public view() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        account = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        admission_office = new javax.swing.JButton();
        history = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ceo = new javax.swing.JButton();
        portal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        account.setBackground(new java.awt.Color(51, 204, 255));
        account.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        account.setForeground(new java.awt.Color(0, 0, 204));
        account.setText("Account section");
        account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountActionPerformed(evt);
            }
        });

        admin.setBackground(new java.awt.Color(255, 51, 51));
        admin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 0));
        admin.setText("Administration office");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        admission_office.setBackground(new java.awt.Color(102, 0, 102));
        admission_office.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        admission_office.setForeground(new java.awt.Color(0, 204, 204));
        admission_office.setText("Admission office");
        admission_office.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admission_officeActionPerformed(evt);
            }
        });

        history.setBackground(new java.awt.Color(0, 204, 51));
        history.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        history.setForeground(new java.awt.Color(255, 0, 0));
        history.setText("Check history");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Welcome BAIUST");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));

        ceo.setBackground(new java.awt.Color(0, 102, 102));
        ceo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ceo.setForeground(new java.awt.Color(102, 0, 102));
        ceo.setText("CEO office");
        ceo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceoActionPerformed(evt);
            }
        });

        portal.setBackground(new java.awt.Color(255, 255, 0));
        portal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        portal.setForeground(new java.awt.Color(102, 102, 0));
        portal.setText("Student portal");
        portal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(admin)
                            .addComponent(account)
                            .addComponent(ceo))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(history)
                            .addComponent(admission_office)
                            .addComponent(portal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel7)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admin)
                    .addComponent(admission_office))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(account)
                    .addComponent(history))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(ceo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(portal)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountActionPerformed
        session_clearance field=new session_clearance();
            field.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_accountActionPerformed

    private void admission_officeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admission_officeActionPerformed
        student field=new student();
            field.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_admission_officeActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        all_information field=new all_information();
            field.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_historyActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        department field=new department();
            field.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_adminActionPerformed

    private void ceoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceoActionPerformed
        result field=new result();
            field.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_ceoActionPerformed

    private void portalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portalActionPerformed
        information field=new information();
            field.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_portalActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account;
    private javax.swing.JButton admin;
    private javax.swing.JButton admission_office;
    private javax.swing.JButton ceo;
    private javax.swing.JButton history;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton portal;
    // End of variables declaration//GEN-END:variables
}