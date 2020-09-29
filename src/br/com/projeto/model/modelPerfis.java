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
public class modelPerfis {
    
    private int id;
    private String nome;
    
    //getters e setters

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
    
    //MOSTRAR NOME EM COMBOBOX PERFIS EM USUARIO
    @Override
    public String toString(){
        return this.getNome();
    }
    
}
