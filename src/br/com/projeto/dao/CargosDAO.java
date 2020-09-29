/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.modelCargos;
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
public class CargosDAO {
    
    private Connection con;

    
    //CONECTAR BANCO 
    public CargosDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    //CADASTRAR CARGO
    public void cadastrarCargo(modelCargos obj) {
        try {
            String sql = "INSERT INTO tb_cargos (nome)"
                    + "VALUES (?)";

            //CONECTA NO BANCO
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            
            //executar o comando sql
            pst.execute();
            pst.close();
            
            JOptionPane.showMessageDialog(null, "Cargo cadastrado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    
    //ALTERAR DADOS CARGO
    public void alterarCargo(modelCargos obj) {
        try {
            String sql = "UPDATE tb_cargos SET nome=? WHERE id=?";

            //conectar banco
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setInt(2, obj.getId());

            //executar o comando sql
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Cargo alterado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }

    //EXCLUIR CARGO
    public void excluirCargo(modelCargos obj) {
        try {
            String sql = "DELETE FROM tb_cargos where id =?";

            //conectar banco
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, obj.getId());

            //executar o comando sql
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Cargo excluído com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    //LISTAR CARGOS
    public List<modelCargos> listarcargos() {
        try {
            //criar lista
            List<modelCargos> lista = new ArrayList<>();

            // criar comando sql, organizar e executar
            String sql = "SELECT * FROM tb_cargos";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                modelCargos obj = new modelCargos();
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
    
    //MÉTODO PARA BUSCAR CARGOS POR NOME - retorna lista
    public List<modelCargos> buscaCargoPorNome(String nome) {
        try {
            //criar lista
            List<modelCargos> lista = new ArrayList<>();

            // criar comando sql, organizar e executar
            String sql = "SELECT * FROM tb_cargos WHERE nome LIKE ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                modelCargos obj = new modelCargos();
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
