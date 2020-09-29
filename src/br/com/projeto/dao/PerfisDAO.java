/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.modelCargos;
import br.com.projeto.model.modelPerfis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class PerfisDAO {
    
    private Connection con;

    
    //CONECTAR BANCO 
    public PerfisDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    //CADASTRAR PERFIL
    public void cadastrarPerfil(modelPerfis obj) {
        try {
            String sql = "INSERT INTO tb_perfil (nome)"
                    + "VALUES (?)";

            //CONECTA NO BANCO
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            
            //executar o comando sql
            pst.execute();
            pst.close();
            
            JOptionPane.showMessageDialog(null, "Perfil cadastrado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    
    //ALTERAR DADOS PERFIL
    public void alterarPerfil(modelPerfis obj) {
        try {
            String sql = "UPDATE tb_perfil SET nome=? WHERE id=?";

            //conectar banco
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setInt(2, obj.getId());

            //executar o comando sql
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Perfil alterado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }

    //EXCLUIR PERFIL
    public void excluirPerfil(modelPerfis obj) {
        try {
            String sql = "DELETE FROM tb_perfil where id =?";

            //conectar banco
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, obj.getId());

            //executar o comando sql
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Perfil excluído com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    //LISTAR PERFIL
    public List<modelPerfis> listarperfil() {
        try {
            //criar lista
            List<modelPerfis> lista = new ArrayList<>();

            // criar comando sql, organizar e executar
            String sql = "SELECT * FROM tb_perfil";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                modelPerfis obj = new modelPerfis();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));

                lista.add(obj);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }

    }
    
    //MÉTODO PARA BUSCAR PERFIL POR NOME - retorna lista
    public List<modelPerfis> buscaPerfilPorNome(String nome) {
        try {
            //criar lista
            List<modelPerfis> lista = new ArrayList<>();

            // criar comando sql, organizar e executar
            String sql = "SELECT * FROM tb_perfil WHERE nome LIKE ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                modelPerfis obj = new modelPerfis();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));

                lista.add(obj);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }
    
    
}
