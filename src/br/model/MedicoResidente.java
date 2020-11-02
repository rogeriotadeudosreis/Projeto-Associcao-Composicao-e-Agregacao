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
public class MedicoResidente extends Medico {
    
    private int periodoResidencia;

    public MedicoResidente() {
        super();
    }

    public MedicoResidente(int periodoResidencia) {
        this.periodoResidencia = periodoResidencia;
    }

    public int getPeriodoResidencia() {
        return periodoResidencia;
    }

    public void setPeriodoResidencia(int periodoResidencia) {
        this.periodoResidencia = periodoResidencia;
    }

    
    
}
