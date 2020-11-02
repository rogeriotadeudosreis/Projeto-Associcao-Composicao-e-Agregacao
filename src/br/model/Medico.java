/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
http://professorfabriciomendonca.com.br/gallery/modelagem_aula11_implementando%20diagrama%20de%20classes.pdf
 */
package br.model;

/**
 *
 * @author roger
 */
public class Medico {
    
    private String nome;
    private String especialidade;

    public Medico() {
    }

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    

   
    
}
