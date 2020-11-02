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
public class Exame {
    
    private int cod;
    private String nome;

    public Exame() {
    }

    public Exame(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
