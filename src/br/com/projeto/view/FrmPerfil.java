/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import br.com.projeto.dao.CargosDAO;
import br.com.projeto.dao.PerfisDAO;
import br.com.projeto.model.Util;
import br.com.projeto.model.modelCargos;
import br.com.projeto.model.modelPerfis;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Renan
 */
public class FrmPerfil extends javax.swing.JFrame {

    /**
     * Creates new form FrmCargo
     */
    public FrmPerfil() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        painelgeral1 = new javax.swing.JTabbedPane();
        painelcadper = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtidperfil = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnomeperfil = new javax.swing.JTextField();
        painelconsultaper = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaperfis = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtpesqper = new javax.swing.JTextField();
        btnpesquisar1 = new javax.swing.JButton();
        btnlimpar = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnnovoexcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Perfis");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Perfil");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/zetta_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelgeral1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        txtidperfil.setEditable(false);
        txtidperfil.setBackground(new java.awt.Color(204, 204, 204));
        txtidperfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nome Perfil:");

        txtnomeperfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout painelcadperLayout = new javax.swing.GroupLayout(painelcadper);
        painelcadper.setLayout(painelcadperLayout);
        painelcadperLayout.setHorizontalGroup(
            painelcadperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelcadperLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(painelcadperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelcadperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtidperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnomeperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        painelcadperLayout.setVerticalGroup(
            painelcadperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelcadperLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelcadperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidperfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(painelcadperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnomeperfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        painelgeral1.addTab("Cadastro", painelcadper);

        tabelaperfis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "PERFIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaperfis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaperfisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaperfis);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Perfil:");

        txtpesqper.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpesqper.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesqperKeyPressed(evt);
            }
        });

        btnpesquisar1.setText("PESQUISAR");
        btnpesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelconsultaperLayout = new javax.swing.GroupLayout(painelconsultaper);
        painelconsultaper.setLayout(painelconsultaperLayout);
        painelconsultaperLayout.setHorizontalGroup(
            painelconsultaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
            .addGroup(painelconsultaperLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpesqper, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnpesquisar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelconsultaperLayout.setVerticalGroup(
            painelconsultaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelconsultaperLayout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(painelconsultaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnpesquisar1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelconsultaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtpesqper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelgeral1.addTab("Consulta Perfis", painelconsultaper);

        btnlimpar.setText("LIMPAR TELA");
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        btnsalvar.setText("SALVAR");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btneditar.setText("EDITAR");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnnovoexcluir.setText("EXCLUIR");
        btnnovoexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoexcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelgeral1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnlimpar)
                .addGap(81, 81, 81)
                .addComponent(btnsalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btneditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnnovoexcluir)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelgeral1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpar)
                    .addComponent(btnsalvar)
                    .addComponent(btneditar)
                    .addComponent(btnnovoexcluir))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        // Limpar tela quando tudo estiver preenchido
        new Util().LimparTela(painelcadper);
    }//GEN-LAST:event_btnlimparActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        //BOTÃO SALVAR PERFIL
        if (txtnomeperfil.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo NOME PERFIL é Obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            modelPerfis obj = new modelPerfis();

            obj.setNome(txtnomeperfil.getText());

            PerfisDAO dao = new PerfisDAO();
            dao.cadastrarPerfil(obj);

            //limpar tela quando o novo cliente for salvo:
            new Util().LimparTela(painelcadper);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        //BOTÃO EDITAR PERFIL
        if (txtnomeperfil.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo NOME PERFIL é Obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            modelPerfis obj = new modelPerfis();

            obj.setId(Integer.parseInt(txtidperfil.getText()));
            obj.setNome(txtnomeperfil.getText());

            PerfisDAO dao = new PerfisDAO();
            dao.alterarPerfil(obj);

            //limpar telaquando tudo for alterado:
            new Util().LimparTela(painelcadper);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnnovoexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoexcluirActionPerformed
        //BOTÃO EXCLUIR PERFIL
        try {
            modelPerfis obj = new modelPerfis();

            obj.setId(Integer.parseInt(txtidperfil.getText()));

            PerfisDAO dao = new PerfisDAO();
            dao.excluirPerfil(obj);

            //limpar tela quando tudo for excluido:
            new Util().LimparTela(painelcadper);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnnovoexcluirActionPerformed

    private void txtpesqperKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesqperKeyPressed
        // CHAMAR PERFIL INSTANTANEAMENTE NA TELA DE CONSULTAR PERFIL:
        String nome = "%" + txtpesqper.getText() + "%";

        PerfisDAO dao = new PerfisDAO();
        List<modelPerfis> lista = dao.buscaPerfilPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaperfis.getModel();
        dados.setNumRows(0);

        for (modelPerfis c : lista) {

            dados.addRow(new Object[]{
                c.getId(),
                c.getNome()
            });

        }
    }//GEN-LAST:event_txtpesqperKeyPressed

    private void btnpesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisar1ActionPerformed
        // BOTAO PESQUISAR ABA CONSULTA PERFIS

        String nome = "%" + txtpesqper.getText() + "%";

        PerfisDAO dao = new PerfisDAO();
        List<modelPerfis> lista = dao.buscaPerfilPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaperfis.getModel();
        dados.setNumRows(0);

        for (modelPerfis c : lista) {

            dados.addRow(new Object[]{
                c.getId(),
                c.getNome()
            });

        }
    }//GEN-LAST:event_btnpesquisar1ActionPerformed

    private void tabelaperfisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaperfisMouseClicked
        // CLICAR E IR PARA OUTRA ABA DO PAINEL
        painelgeral1.setSelectedIndex(0);
        txtidperfil.setText(tabelaperfis.getValueAt(tabelaperfis.getSelectedRow(), 0).toString());
        txtnomeperfil.setText(tabelaperfis.getValueAt(tabelaperfis.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_tabelaperfisMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton btnnovoexcluir;
    private javax.swing.JButton btnpesquisar1;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelcadper;
    private javax.swing.JPanel painelconsultaper;
    private javax.swing.JTabbedPane painelgeral1;
    private javax.swing.JTable tabelaperfis;
    private javax.swing.JTextField txtidperfil;
    private javax.swing.JTextField txtnomeperfil;
    private javax.swing.JTextField txtpesqper;
    // End of variables declaration//GEN-END:variables
}
