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
public class Cid {
    
    private int codigo;
    private String descricao;

    public Cid() {
    }

    public Cid(int cid, String descricao) {
        this.codigo = cid;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
