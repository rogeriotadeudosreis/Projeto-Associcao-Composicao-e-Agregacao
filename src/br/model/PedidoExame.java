/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * http://professorfabriciomendonca.com.br/gallery/modelagem_aula11_implementando%20diagrama%20de%20classes.pdf
 */
package br.model;

import br.interfaces.frmPedidoExame;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author roger
 */
public class PedidoExame implements frmPedidoExame {

    private int numeroPedido;
    private boolean urgente;
    Paciente paciente;
    MedicoDocente medico;
    Cid cid;
    List<Exame> exames;

    public PedidoExame(int numeroPedido, boolean urgente, Paciente paciente,
            MedicoDocente medico, Cid cid) {
        this.numeroPedido = numeroPedido;
        this.urgente = urgente;
        this.paciente = paciente;
        this.medico = medico;
        this.cid = cid;
        this.exames = new LinkedList<Exame>();
    }

    public Cid getCid() {
        return cid;
    }

    public void setCid(Cid cid) {
        this.cid = cid;
    }

    @Override
    public void adicionarExame(Exame exame) {
        this.exames.add(exame);
    }

    @Override
    public void emitirExame() {
        System.out.println("Dados do Pedido: ");
        System.out.println("Número: " + this.numeroPedido);
        System.out.println("Paciente: " + paciente.getNumProntuario() + " - "
                + paciente.getNome());
        System.out.println("Pedido urgente: " + this.urgente);
        System.out.println("Médico Solicitante: " + medico.getNome());
        System.out.println("CID: " + cid.getCodigo() + " - " + cid.getDescricao());
        System.out.println("Lista de exames solicitados: ");
        for (int i = 0; i < this.exames.size(); i++) {
            System.out.println("Exame : " + this.exames.get(i).getNome());
        }
    }

}
