/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllTelas;

import AllClass.Cliente;
import AllClass.Compra;
import AllClass.Produto;
import AllControlador.ControladorCliente;
import AllControlador.ControladorEstoque;
import AllControlador.ControladorProduto;
import AllControlador.ControladorSuporte;
import static BancoDeDados.BancoPetshop.BancoListCompra;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felly
 */
public class TelaCompra extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelCompra
     */
    public TelaCompra() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jValorComprar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jConsultCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCodigoConsultar = new javax.swing.JTextField();
        jConsultar = new javax.swing.JButton();
        jNomeComprar = new javax.swing.JTextField();
        jComprar = new javax.swing.JButton();
        jCancelar = new javax.swing.JButton();
        jNomeCLiente = new javax.swing.JTextField();
        jCPFDono = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jQuantCompra = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCompra = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Realizando Compra");
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Dados do Compra");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, 20));

        jLabel3.setText("Valor:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, 20));

        jValorComprar.setEditable(false);
        jValorComprar.setEnabled(false);
        getContentPane().add(jValorComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 83, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Código da Compra (Serviço/Produto)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jConsultCliente.setText("Consultar Cliente");
        jConsultCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jConsultCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 220, -1));

        jLabel6.setText("CPF do Cliente:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Stencil Std", 1, 60)); // NOI18N
        jLabel5.setText("Realizar Compra");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 47, -1, 49));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Dados do Cliente");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jCodigoConsultar.setEnabled(false);
        getContentPane().add(jCodigoConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 130, -1));

        jConsultar.setText("Consultar Serviço");
        jConsultar.setEnabled(false);
        jConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 125, -1));

        jNomeComprar.setEditable(false);
        jNomeComprar.setEnabled(false);
        getContentPane().add(jNomeComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 83, -1));

        jComprar.setText("Comprar");
        jComprar.setEnabled(false);
        jComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComprarActionPerformed(evt);
            }
        });
        getContentPane().add(jComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        jCancelar.setText("Cancelar");
        jCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jNomeCLiente.setEditable(false);
        jNomeCLiente.setEnabled(false);
        getContentPane().add(jNomeCLiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 128, -1));

        try {
            jCPFDono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jCPFDono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 140, -1));

        jLabel9.setText("Nome:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jQuantCompra.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        jQuantCompra.setEnabled(false);
        getContentPane().add(jQuantCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 60, 30));

        jLabel10.setText("Quantidade:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Compras Realizadas:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 20));

        jTableCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Compra", "Nome", "Valor", "ID Produto", "Data&Hora", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(jTableCompra);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 760, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felly\\Desktop\\Programas Java\\PetshopSmart\\IMG\\TelaCadastro22.png")); // NOI18N
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(0, 0, 900, 600);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 610));
        jDesktopPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConsultClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultClienteActionPerformed

        String cpf = jCPFDono.getText();
        Cliente x = ControladorCliente.exibirCliente(cpf);
        if (x != null) {
            jCodigoConsultar.setEnabled(true);
            jConsultar.setEnabled(true);
            jNomeCLiente.setEnabled(true);
            jCPFDono.setEditable(false);
            jNomeCLiente.setText(x.getNome());

            Object[] colunas = {"ID Compra", "Nome", "Valor", "ID Produto", "Data&Hora", "Quantidade"};
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(colunas);
            jTableCompra.setModel(modelo);
            for (int i = 0; i < BancoListCompra.size(); i++) {
                Compra c = BancoListCompra.get(i);
                if (c.getCPFCompra().equals(cpf)) {
                    modelo.addRow(new String[]{c.getCodigoCompra() + "",
                        c.getNomeCompra(),
                        c.getValorCompra() + "",
                        c.getCodigoProduto() + "",
                        c.getDataCompra(),
                        c.getQuantidadeC() + ""});
                }
            }
            jTableCompra.setModel(modelo);

        } else {
            jNomeCLiente.setText("");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultClienteActionPerformed

    private void jConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultarActionPerformed
        
        int codigo = Integer.parseInt(jCodigoConsultar.getText());
        Produto exibeProdutoValido = ControladorProduto.validarEstoque(codigo);
        if (exibeProdutoValido != null) {
            jNomeComprar.setEnabled(true);
            jValorComprar.setEnabled(true);
            jComprar.setEnabled(true);
            jQuantCompra.setEnabled(true);
            jNomeComprar.setText(exibeProdutoValido.getNome());
            jValorComprar.setText("" + exibeProdutoValido.getValorP());
            jCodigoConsultar.setEditable(false);
        } 

        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultarActionPerformed

    private void jComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComprarActionPerformed

        String nomeCompra = "";
        double valorCompra;
        int codigoProduto;
        String nomeCliente = "";
        String dataCompra = "";
        String CPFCompra = "";
        double convertValor;
        int quant;
        String cpf = jCPFDono.getText();
        int codigoPro = Integer.parseInt(jCodigoConsultar.getText());
        quant = (Integer) jQuantCompra.getValue();
        String testValidarCompra = ControladorProduto.validarCompra(codigoPro, quant);
        if (testValidarCompra.equals("1")) {
            nomeCompra = jNomeComprar.getText();
            nomeCliente = jNomeCLiente.getText();
            convertValor = quant * Double.parseDouble(jValorComprar.getText());
            codigoProduto = Integer.parseInt(jCodigoConsultar.getText());
            dataCompra = ControladorSuporte.dateTime();
            CPFCompra = jCPFDono.getText();
            String quantidade = Integer.toString(quant);
            Compra x = new Compra(nomeCompra, nomeCliente, convertValor, codigoProduto, 0, dataCompra, CPFCompra, quant);

            String testCompra = AllControlador.ControladorCompra.comprarProduto(x);
            if (testCompra.equals("1")) {
                String testCreditarCliente = ControladorCliente.creditarCliente(CPFCompra, convertValor);
                if (testCreditarCliente.equals("1")) {
                    String testRemoverQuantCompra = ControladorEstoque.removeQuantCompra(codigoPro, quant);
                    if (testRemoverQuantCompra.equals("1")) {
                        jCodigoConsultar.setText("");
                        jNomeComprar.setText("");
                        jValorComprar.setText("");
                        jQuantCompra.setValue(1);
                        jNomeComprar.setEnabled(false);
                        jValorComprar.setEnabled(false);
                        jComprar.setEnabled(false);
                        jQuantCompra.setEnabled(false);
                        jCodigoConsultar.setEditable(true);

                    } else {
                        JOptionPane.showMessageDialog(null, testRemoverQuantCompra);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, testCreditarCliente);
                }
            } else {
                JOptionPane.showMessageDialog(null, testCompra);
            }
        } else {
            JOptionPane.showMessageDialog(null, testValidarCompra);
        }

        Object[] colunas = {"ID Compra", "Nome", "Valor", "ID Produto", "Data&Hora", "Quantidade"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableCompra.setModel(modelo);
        for (int i = 0; i < BancoListCompra.size(); i++) {
            Compra c = BancoListCompra.get(i);
            if (c.getCPFCompra().equals(cpf)) {
                modelo.addRow(new String[]{c.getCodigoCompra() + "",
                    c.getNomeCompra(),
                    c.getValorCompra() + "",
                    c.getCodigoProduto() + "",
                    c.getDataCompra(),
                    c.getQuantidadeC() + ""});
            }
        }
        jTableCompra.setModel(modelo);

        // TODO add your handling code here:
    }//GEN-LAST:event_jComprarActionPerformed

    private void jCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jCancelarActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed

        ControladorSuporte.mudarTelaStatus(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jCPFDono;
    private javax.swing.JButton jCancelar;
    private javax.swing.JTextField jCodigoConsultar;
    private javax.swing.JButton jComprar;
    private javax.swing.JButton jConsultCliente;
    private javax.swing.JButton jConsultar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNomeCLiente;
    private javax.swing.JTextField jNomeComprar;
    private javax.swing.JSpinner jQuantCompra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCompra;
    private javax.swing.JTextField jValorComprar;
    // End of variables declaration//GEN-END:variables
}
