/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllTelas;

import AllClass.Usuario;

/**
 *
 * @author Felly
 */
public class TelaLogin extends javax.swing.JFrame {

    public boolean Status;

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }
    public boolean getStatus() {
    return Status;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTelaLoginImg = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSenha = new javax.swing.JPasswordField();
        jUsuario = new javax.swing.JTextField();
        jCancelar = new javax.swing.JButton();
        jEntrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acessando o Sistema");

        jTelaLoginImg.setBackground(new java.awt.Color(255, 255, 255));
        jTelaLoginImg.setToolTipText("");
        jTelaLoginImg.setName(""); // NOI18N
        jTelaLoginImg.setPreferredSize(new java.awt.Dimension(800, 600));
        jTelaLoginImg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Usuário:");
        jTelaLoginImg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 184, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Senha:");
        jTelaLoginImg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 217, -1, -1));

        jSenha.setColumns(2);
        jTelaLoginImg.add(jSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 221, 100, -1));

        jUsuario.setColumns(1);
        jTelaLoginImg.add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 184, 100, -1));

        jCancelar.setText("Cancelar");
        jCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarActionPerformed(evt);
            }
        });
        jTelaLoginImg.add(jCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 100, -1));

        jEntrar.setText("Entrar");
        jEntrar.setToolTipText("");
        jEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEntrarActionPerformed(evt);
            }
        });
        jTelaLoginImg.add(jEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 310, 94, -1));

        jLabel5.setFont(new java.awt.Font("Stencil Std", 1, 60)); // NOI18N
        jLabel5.setText("Tela Login");
        jTelaLoginImg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 61, 400, 49));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTelaLoginImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTelaLoginImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEntrarActionPerformed

        String nometest = "";
        String senhatest = "";
        boolean Status = true;
        char [] password = jSenha.getPassword();
        for (int x = 0; x<password.length; x++){
            senhatest += password[x];
        }
        nometest = jUsuario.getText();
        Usuario usuario = new Usuario();
        usuario.setUsuario(nometest, senhatest, Status);
        
        this.dispose();
        //this.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jEntrarActionPerformed

    private void jCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelarActionPerformed
        
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancelar;
    private javax.swing.JButton jEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jSenha;
    private javax.swing.JDesktopPane jTelaLoginImg;
    private javax.swing.JTextField jUsuario;
    // End of variables declaration//GEN-END:variables
}
