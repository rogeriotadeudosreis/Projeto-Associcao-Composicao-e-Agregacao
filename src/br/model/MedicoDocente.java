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
public class MedicoDocente extends Medico {
    
    private int crm;
    private String titulacao;

    public MedicoDocente() {
    }

    public MedicoDocente(int crm, String titulacao) {
        this.crm = crm;
        this.titulacao = titulacao;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
}
