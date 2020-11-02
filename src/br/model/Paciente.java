/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
http://professorfabriciomendonca.com.br/gallery/modelagem_aula11_implementando%20diagrama%20de%20classes.pdf
 */
package br.model;

import java.util.Date;

/**
 *
 * @author roger
 */
public class Paciente {
    
    private int numProntuario;
    private String nome;
    private String sexo;
    private Date dataNascimento;

    public Paciente() {
    }

    public Paciente(int numProntuario, String nome, String sexo, Date dataNascimento) {
        this.numProntuario = numProntuario;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public int getNumProntuario() {
        return numProntuario;
    }

    public void setNumProntuario(int numProntuario) {
        this.numProntuario = numProntuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
}
