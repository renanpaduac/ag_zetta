/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.modelCargos;
import br.com.projeto.model.modelPerfis;
import br.com.projeto.model.modelUsuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class UsuariosDAO {
    
        private Connection con;

    //CONECTAR BANCO 
    public UsuariosDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    //CADASTRAR USUARIO
    public void cadastrarUsuario(modelUsuarios obj) throws ParseException {
        try {
            String sql = "INSERT INTO tb_usuarios (nome,cpf,data_nasc,sexo,cargo_id,perfil_id)"
                    + "VALUES (?,?,?,?,?,?)";

            //CONECTA NO BANCO
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getCpf());
            //pst.setString(3, obj.getData_nasc());
            pst.setString(4, obj.getSexo());
            pst.setInt(5, obj.getCargo().getId());
            pst.setInt(6, obj.getPerfil().getId());
            
            //MUDANDO RECEBEDOR DE DATA PARA FORMATO CERTO EM BANCO ("yyyy-mm-dd")
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
            java.sql.Date data = new java.sql.Date(format.parse(obj.getData_nasc()).getTime());
            pst.setDate(3, data);

            //executar o comando sql
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    
    //MÉTODO ALTERAR USUÁRIO
    public void alterarUsuario(modelUsuarios obj) throws ParseException {
        try {
            String sql = "UPDATE tb_usuarios set nome=?,cpf=?,data_nasc=?,sexo=?,cargo_id=?,perfil_id=? WHERE id=?";

            //CONECTA NO BANCO
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getCpf());
            //pst.setString(3, obj.getData_nasc());
            pst.setString(4, obj.getSexo());
            pst.setInt(5, obj.getCargo().getId());
            pst.setInt(6, obj.getPerfil().getId());
            pst.setInt(7, obj.getId());
            
            //MUDANDO RECEBEDOR DE DATA PARA FORMATO CERTO EM BANCO ("yyyy-mm-dd")
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
            java.sql.Date data = new java.sql.Date(format.parse(obj.getData_nasc()).getTime());
            pst.setDate(3, data);

            //executar o comando sql
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Usuário Alterado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    //MÉTODO EXCLUIR USUÁRIO
    public void excluirUsuario(modelUsuarios obj) {
        try {
            String sql = "DELETE FROM tb_usuarios WHERE id=?";

            //CONECTA NO BANCO
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, obj.getId());

            //executar o comando sql
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Usuário Excluído com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    //MÉTODO LISTAR USUÁRIOS
    public List<modelUsuarios> listarUsuarios() {
        try {
            //criando lista
            List<modelUsuarios> lista = new ArrayList<>();

            //criar o comando SQL, organizar e executar
            String sql = "SELECT u.id, u.nome, u.cpf, u.data_nasc,u.sexo, c.nome, p.nome FROM tb_usuarios as p "
                    + "INNER JOIN tb_cargos as c on (u.cargo_id = c.id)"
                    + "INNER JOIN tb_perfil as p on (u.perfil_id = p.id)";

            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                modelUsuarios obj = new modelUsuarios();
                modelCargos c = new modelCargos();
                modelPerfis p = new modelPerfis();

                obj.setId(rs.getInt("u.id"));
                obj.setNome(rs.getString("u.nome"));
                obj.setCpf(rs.getString("u.cpf"));
                obj.setData_nasc(rs.getString("u.data_nasc"));
                obj.setSexo(rs.getString("u.sexo"));

                c.setNome(rs.getString(("c.nome")));
                p.setNome(rs.getString(("p.nome")));

                obj.setCargo(c);
                obj.setPerfil(p);

                lista.add(obj);
            }

            return lista;

        } catch (Exception e) {
        }
        return null;
    }
    
        //MÉTODO LISTAR USUÁRIOS POR NOME
    public List<modelUsuarios> listarUsuariosPorNome(String nome) {
        try {
            //criando lista
            List<modelUsuarios> lista = new ArrayList<>();

            //criar o comando SQL, organizar e executar
            String sql = "SELECT u.id, u.nome, u.cpf, u.data_nasc,u.sexo, c.nome, p.nome FROM tb_usuarios as u "
                    + "INNER JOIN tb_cargos as c on (u.cargo_id = c.id)"
                    + "INNER JOIN tb_perfil as p on (u.perfil_id = p.id) WHERE u.nome like ?";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                modelUsuarios obj = new modelUsuarios();
                modelCargos c = new modelCargos();
                modelPerfis p = new modelPerfis();

                obj.setId(rs.getInt("u.id"));
                obj.setNome(rs.getString("u.nome"));
                obj.setCpf(rs.getString("u.cpf"));
                obj.setData_nasc(rs.getString("u.data_nasc"));
                obj.setSexo(rs.getString("u.sexo"));

                c.setNome(rs.getString(("c.nome")));
                p.setNome(rs.getString(("p.nome")));

                obj.setCargo(c);
                obj.setPerfil(p);

                lista.add(obj);
            }

            return lista;

        } catch (Exception e) {
        }
        return null;
    }
    
    
    

}
