/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

/**
 *
 * @author Renan
 */
public class modelUsuarios {
    
    private int id;
    private String nome;
    private String cpf;
    private String data_nasc;
    private String sexo;
    
    private modelCargos cargo;
    private modelPerfis perfil;
    
    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public modelCargos getCargo() {
        return cargo;
    }

    public void setCargo(modelCargos cargo) {
        this.cargo = cargo;
    }

    public modelPerfis getPerfil() {
        return perfil;
    }

    public void setPerfil(modelPerfis perfil) {
        this.perfil = perfil;
    }

    
    
    
    
}
