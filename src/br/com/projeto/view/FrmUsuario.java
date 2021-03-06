/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import br.com.projeto.dao.CargosDAO;
import br.com.projeto.dao.PerfisDAO;
import br.com.projeto.dao.UsuariosDAO;
import br.com.projeto.model.Util;
import br.com.projeto.model.modelCargos;
import br.com.projeto.model.modelPerfis;
import br.com.projeto.model.modelUsuarios;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Renan
 */
public class FrmUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FrmCargo
     */
    public FrmUsuario() {
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
        jLabel7 = new javax.swing.JLabel();
        painelgeral1 = new javax.swing.JTabbedPane();
        painelcadusu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtidusu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnomeusu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcpfusu = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdatanusu = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        cbcargo = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        cbperfil = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        cbsexo = new javax.swing.JComboBox();
        painelconsultausu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelausuarios = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtpesqusu = new javax.swing.JTextField();
        btnpesquisar1 = new javax.swing.JButton();
        btnlimpar = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnnovoexcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuários");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Usuário");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/zetta_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(30, 30, 30))
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
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelgeral1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        txtidusu.setEditable(false);
        txtidusu.setBackground(new java.awt.Color(204, 204, 204));
        txtidusu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nome Usuário:");

        txtnomeusu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CPF:");

        try {
            txtcpfusu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcpfusu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nascimento:");

        try {
            txtdatanusu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdatanusu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Cargo:");

        cbcargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbcargo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbcargoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Perfil:");

        cbperfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbperfil.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbperfilAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Sexo:");

        cbsexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));

        javax.swing.GroupLayout painelcadusuLayout = new javax.swing.GroupLayout(painelcadusu);
        painelcadusu.setLayout(painelcadusuLayout);
        painelcadusuLayout.setHorizontalGroup(
            painelcadusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelcadusuLayout.createSequentialGroup()
                .addGroup(painelcadusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelcadusuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelcadusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelcadusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelcadusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelcadusuLayout.createSequentialGroup()
                                .addComponent(txtidusu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtnomeusu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelcadusuLayout.createSequentialGroup()
                                .addGroup(painelcadusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtdatanusu)
                                    .addComponent(txtcpfusu, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelcadusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelcadusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbperfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbcargo, 0, 290, Short.MAX_VALUE)))))
                    .addGroup(painelcadusuLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelcadusuLayout.setVerticalGroup(
            painelcadusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelcadusuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelcadusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelcadusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnomeusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelcadusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcpfusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cbcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelcadusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelcadusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdatanusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cbperfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelgeral1.addTab("Cadastro", painelcadusu);

        tabelausuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME", "CPF", "NASCIMENTO", "SEXO", "CARGO", "PERFIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelausuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelausuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelausuarios);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nome:");

        txtpesqusu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpesqusu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesqusuKeyPressed(evt);
            }
        });

        btnpesquisar1.setText("PESQUISAR");
        btnpesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelconsultausuLayout = new javax.swing.GroupLayout(painelconsultausu);
        painelconsultausu.setLayout(painelconsultausuLayout);
        painelconsultausuLayout.setHorizontalGroup(
            painelconsultausuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(painelconsultausuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(txtpesqusu, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnpesquisar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelconsultausuLayout.setVerticalGroup(
            painelconsultausuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelconsultausuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelconsultausuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelconsultausuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtpesqusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnpesquisar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
        );

        painelgeral1.addTab("Consulta Usuários", painelconsultausu);

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
                .addComponent(painelgeral1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpar)
                    .addComponent(btnsalvar)
                    .addComponent(btneditar)
                    .addComponent(btnnovoexcluir))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        // Limpar tela quando tudo estiver preenchido
        new Util().LimparTela(painelcadusu);
    }//GEN-LAST:event_btnlimparActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        //BOTÃO SALVAR USUARIO

        if (txtnomeusu.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Nome é Obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtcpfusu.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(null, "Campo CPF é Obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (cbcargo.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo CARGO é Obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            modelUsuarios obj = new modelUsuarios();

            obj.setNome(txtnomeusu.getText());
            obj.setCpf(txtcpfusu.getText());
            obj.setData_nasc(txtdatanusu.getText());
            obj.setSexo((String) cbsexo.getSelectedItem());

            //CRIAR OBJETO DE CARGO
            modelCargos c = new modelCargos();
            c = (modelCargos) cbcargo.getSelectedItem();
            obj.setCargo(c);

            //CRIAR OBJETO DE PERFIL
            modelPerfis p = new modelPerfis();
            p = (modelPerfis) cbperfil.getSelectedItem();
            obj.setPerfil(p);

            UsuariosDAO dao = new UsuariosDAO();
            dao.cadastrarUsuario(obj);

            //limpar tela quando o novo cliente for salvo:
            new Util().LimparTela(painelcadusu);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        //BOTÃO EDITAR USUARIO
        
        if (txtnomeusu.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Nome é Obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtcpfusu.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(null, "Campo CPF é Obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (cbcargo.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo CARGO é Obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            modelUsuarios obj = new modelUsuarios();

            obj.setNome(txtnomeusu.getText());
            obj.setCpf(txtcpfusu.getText());
            obj.setData_nasc(txtdatanusu.getText());
            obj.setSexo((String) cbsexo.getSelectedItem());

            //CRIAR OBJETO DE CARGO
            modelCargos c = new modelCargos();
            c = (modelCargos) cbcargo.getSelectedItem();
            obj.setCargo(c);

            //CRIAR OBJETO DE PERFIL
            modelPerfis p = new modelPerfis();
            p = (modelPerfis) cbperfil.getSelectedItem();
            obj.setPerfil(p);

            UsuariosDAO dao = new UsuariosDAO();
            dao.alterarUsuario(obj);

            //limpar tela quando o novo cliente for salvo:
            new Util().LimparTela(painelcadusu);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnnovoexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoexcluirActionPerformed
        //BOTÃO EXCLUIR PERFIL
        try {
            modelPerfis obj = new modelPerfis();

            obj.setId(Integer.parseInt(txtidusu.getText()));

            PerfisDAO dao = new PerfisDAO();
            dao.excluirPerfil(obj);

            //limpar tela quando tudo for excluido:
            new Util().LimparTela(painelcadusu);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnnovoexcluirActionPerformed

    private void txtpesqusuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesqusuKeyPressed
        // CHAMAR PERFIL INSTANTANEAMENTE NA TELA DE CONSULTAR USUARIO:
        String nome = "%" + txtpesqusu.getText() + "%";

        UsuariosDAO dao = new UsuariosDAO();
        List<modelUsuarios> lista = dao.listarUsuariosPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelausuarios.getModel();
        dados.setNumRows(0);

        for (modelUsuarios u : lista) {

            dados.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getCpf(),
                u.getData_nasc(),
                u.getSexo(),
                u.getCargo().getNome(),
                u.getPerfil().getNome()
            });

        }
    }//GEN-LAST:event_txtpesqusuKeyPressed

    private void btnpesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisar1ActionPerformed
        // BOTAO PESQUISAR ABA CONSULTA USUARIOS

        String nome = "%" + txtpesqusu.getText() + "%";

        UsuariosDAO dao = new UsuariosDAO();
        List<modelUsuarios> lista = dao.listarUsuariosPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelausuarios.getModel();
        dados.setNumRows(0);

        for (modelUsuarios u : lista) {

            dados.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getCpf(),
                u.getData_nasc(),
                u.getSexo(),
                u.getCargo().getNome(),
                u.getPerfil().getNome()
            });

        }
    }//GEN-LAST:event_btnpesquisar1ActionPerformed

    private void tabelausuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelausuariosMouseClicked
        // CLICAR E IR PARA OUTRA ABA DO PAINEL
        painelgeral1.setSelectedIndex(0);

        txtidusu.setText(tabelausuarios.getValueAt(tabelausuarios.getSelectedRow(), 0).toString());
        txtnomeusu.setText(tabelausuarios.getValueAt(tabelausuarios.getSelectedRow(), 1).toString());
        txtcpfusu.setText(tabelausuarios.getValueAt(tabelausuarios.getSelectedRow(), 2).toString());
        txtdatanusu.setText(tabelausuarios.getValueAt(tabelausuarios.getSelectedRow(), 3).toString());

        cbsexo.setSelectedItem(tabelausuarios.getValueAt(tabelausuarios.getSelectedRow(), 4).toString());

        modelCargos c = new modelCargos();
        CargosDAO dao = new CargosDAO();
        c = (modelCargos) dao.buscaCargoPorNome(tabelausuarios.getValueAt(tabelausuarios.getSelectedRow(), 5).toString());
        cbcargo.removeAllItems();
        cbcargo.getModel().setSelectedItem(c);

        modelPerfis p = new modelPerfis();
        PerfisDAO daop = new PerfisDAO();
        p = (modelPerfis) daop.buscaPerfilPorNome(tabelausuarios.getValueAt(tabelausuarios.getSelectedRow(), 6).toString());
        cbperfil.removeAllItems();
        cbperfil.getModel().setSelectedItem(c);
    }//GEN-LAST:event_tabelausuariosMouseClicked

    private void cbcargoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbcargoAncestorAdded
        // CARREGAR COMBOBOX DE CARGO EM USUARIOS
        CargosDAO dao = new CargosDAO();
        List<modelCargos> listadecargos = dao.listarcargos();
        cbcargo.removeAll();

        for (modelCargos c : listadecargos) {
            cbcargo.addItem(c);
        }
    }//GEN-LAST:event_cbcargoAncestorAdded

    private void cbperfilAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbperfilAncestorAdded
        // CARREGAR COMBOBOX DE PERFIL EM USUARIOS
        PerfisDAO dao = new PerfisDAO();
        List<modelPerfis> listadeperfis = dao.listarperfil();
        cbperfil.removeAll();

        for (modelPerfis c : listadeperfis) {
            cbperfil.addItem(c);
        }
    }//GEN-LAST:event_cbperfilAncestorAdded

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
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton btnnovoexcluir;
    private javax.swing.JButton btnpesquisar1;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox cbcargo;
    private javax.swing.JComboBox cbperfil;
    private javax.swing.JComboBox cbsexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelcadusu;
    private javax.swing.JPanel painelconsultausu;
    private javax.swing.JTabbedPane painelgeral1;
    private javax.swing.JTable tabelausuarios;
    private javax.swing.JFormattedTextField txtcpfusu;
    private javax.swing.JFormattedTextField txtdatanusu;
    private javax.swing.JTextField txtidusu;
    private javax.swing.JTextField txtnomeusu;
    private javax.swing.JTextField txtpesqusu;
    // End of variables declaration//GEN-END:variables
}
