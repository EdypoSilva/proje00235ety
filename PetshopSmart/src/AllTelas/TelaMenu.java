/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllTelas;

import AllClass.Repositorio.RepositorioCliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Felly
 */
public class TelaMenu extends javax.swing.JFrame {

    
    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
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

        jTelaMenuImg = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jInserir = new javax.swing.JMenu();
        jInserirCliente = new javax.swing.JMenu();
        jCCliente = new javax.swing.JMenuItem();
        jACliente = new javax.swing.JMenuItem();
        jInserirAnimal = new javax.swing.JMenu();
        jCAnimal = new javax.swing.JMenuItem();
        jAAnimal = new javax.swing.JMenuItem();
        jInserirProduto = new javax.swing.JMenu();
        jCProduto = new javax.swing.JMenuItem();
        jAProduto = new javax.swing.JMenuItem();
        jRemover = new javax.swing.JMenu();
        jRCliente = new javax.swing.JMenuItem();
        jRAnimal = new javax.swing.JMenuItem();
        jRProduto = new javax.swing.JMenuItem();
        jListar = new javax.swing.JMenu();
        jListarCliente = new javax.swing.JMenu();
        jLCliente = new javax.swing.JMenuItem();
        jLClienteeAnimal = new javax.swing.JMenuItem();
        jLAnimal = new javax.swing.JMenuItem();
        jLProduto = new javax.swing.JMenuItem();
        jComprar = new javax.swing.JMenu();
        jComprarProduto = new javax.swing.JMenuItem();
        jFinalizar = new javax.swing.JMenu();
        jFAnimal = new javax.swing.JMenuItem();
        jSair = new javax.swing.JMenu();
        jFecharSIstema = new javax.swing.JMenuItem();
        jBloquearSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");

        jTelaMenuImg.setBackground(new java.awt.Color(255, 255, 255));
        jTelaMenuImg.setPreferredSize(new java.awt.Dimension(800, 600));
        jTelaMenuImg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Stencil Std", 1, 60)); // NOI18N
        jLabel5.setText("Bem Vindo");
        jTelaMenuImg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 244, 400, 49));

        jInserir.setText("Inserir");

        jInserirCliente.setText("Inserir Cliente");

        jCCliente.setText("Cadastrar");
        jCCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCClienteActionPerformed(evt);
            }
        });
        jInserirCliente.add(jCCliente);

        jACliente.setText("Alterar");
        jInserirCliente.add(jACliente);

        jInserir.add(jInserirCliente);
        jInserirCliente.getAccessibleContext().setAccessibleDescription("");

        jInserirAnimal.setText("Inserir Animal");

        jCAnimal.setText("Cadastrar");
        jCAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAnimalActionPerformed(evt);
            }
        });
        jInserirAnimal.add(jCAnimal);

        jAAnimal.setText("Alterar");
        jInserirAnimal.add(jAAnimal);

        jInserir.add(jInserirAnimal);

        jInserirProduto.setText("Inserir Produto");

        jCProduto.setText("Cadastrar");
        jCProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCProdutoActionPerformed(evt);
            }
        });
        jInserirProduto.add(jCProduto);

        jAProduto.setText("Alterar");
        jInserirProduto.add(jAProduto);

        jInserir.add(jInserirProduto);

        jMenuBar1.add(jInserir);

        jRemover.setText("Remover");

        jRCliente.setText("Cliente");
        jRemover.add(jRCliente);

        jRAnimal.setText("Animal");
        jRemover.add(jRAnimal);

        jRProduto.setText("Produto");
        jRemover.add(jRProduto);

        jMenuBar1.add(jRemover);

        jListar.setText("Listar");

        jListarCliente.setText("Cliente");

        jLCliente.setText("Cliente");
        jLCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLClienteActionPerformed(evt);
            }
        });
        jListarCliente.add(jLCliente);

        jLClienteeAnimal.setText("Cliente&Animal");
        jListarCliente.add(jLClienteeAnimal);

        jListar.add(jListarCliente);

        jLAnimal.setText("Animal");
        jListar.add(jLAnimal);

        jLProduto.setText("Produto");
        jListar.add(jLProduto);

        jMenuBar1.add(jListar);

        jComprar.setText("Comprar");

        jComprarProduto.setText("Comprar Produto");
        jComprar.add(jComprarProduto);

        jMenuBar1.add(jComprar);

        jFinalizar.setText("Finalizar");

        jFAnimal.setText("Acompanhamento Animal");
        jFinalizar.add(jFAnimal);

        jMenuBar1.add(jFinalizar);

        jSair.setText("Sair");

        jFecharSIstema.setText("Fechar Sistema");
        jFecharSIstema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFecharSIstemaActionPerformed(evt);
            }
        });
        jSair.add(jFecharSIstema);

        jBloquearSistema.setText("Bloquear Sistema");
        jBloquearSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBloquearSistemaActionPerformed(evt);
            }
        });
        jSair.add(jBloquearSistema);

        jMenuBar1.add(jSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTelaMenuImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTelaMenuImg, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBloquearSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBloquearSistemaActionPerformed

        this.dispose();
        new TelaLogin().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBloquearSistemaActionPerformed

    private void jFecharSIstemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFecharSIstemaActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jFecharSIstemaActionPerformed

    private void jCProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCProdutoActionPerformed
        this.dispose();
        new TelaCadastroProduto().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jCProdutoActionPerformed

    private void jCAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAnimalActionPerformed
        this.dispose();
        new TelaCadastroAnimal().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jCAnimalActionPerformed

    private void jCClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCClienteActionPerformed

        this.dispose();
        new TelaCadastroCliente().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jCClienteActionPerformed

    private void jLClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLClienteActionPerformed

        String Consult;
        
        Consult = JOptionPane.showInputDialog("Digite o CPF do Cliente a consultar: ");
        RepositorioCliente.setConsultaCliente(Consult);

        // TODO add your handling code here:
    }//GEN-LAST:event_jLClienteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAAnimal;
    private javax.swing.JMenuItem jACliente;
    private javax.swing.JMenuItem jAProduto;
    private javax.swing.JMenuItem jBloquearSistema;
    private javax.swing.JMenuItem jCAnimal;
    private javax.swing.JMenuItem jCCliente;
    private javax.swing.JMenuItem jCProduto;
    private javax.swing.JMenu jComprar;
    private javax.swing.JMenuItem jComprarProduto;
    private javax.swing.JMenuItem jFAnimal;
    private javax.swing.JMenuItem jFecharSIstema;
    private javax.swing.JMenu jFinalizar;
    private javax.swing.JMenu jInserir;
    private javax.swing.JMenu jInserirAnimal;
    private javax.swing.JMenu jInserirCliente;
    private javax.swing.JMenu jInserirProduto;
    private javax.swing.JMenuItem jLAnimal;
    private javax.swing.JMenuItem jLCliente;
    private javax.swing.JMenuItem jLClienteeAnimal;
    private javax.swing.JMenuItem jLProduto;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jListar;
    private javax.swing.JMenu jListarCliente;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jRAnimal;
    private javax.swing.JMenuItem jRCliente;
    private javax.swing.JMenuItem jRProduto;
    private javax.swing.JMenu jRemover;
    private javax.swing.JMenu jSair;
    private javax.swing.JDesktopPane jTelaMenuImg;
    // End of variables declaration//GEN-END:variables
}