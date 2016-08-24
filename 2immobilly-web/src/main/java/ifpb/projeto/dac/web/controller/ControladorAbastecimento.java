/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.projeto.dac.web.controller;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Abastecimento;
import br.edu.ifpb.ads.praticas.immobilly.shared.services.ServiceAbastecimento;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Aluísio
 */
@Named
@SessionScoped
public class ControladorAbastecimento implements Serializable {

    private Abastecimento abastecimento;

    @EJB
    private ServiceAbastecimento serviceAbastecimento;

    public ControladorAbastecimento() {
        this.abastecimento = new Abastecimento();
    }

    public Abastecimento getAbastecimento() {
        return abastecimento;
    }

    public void setAbastecimento(Abastecimento evento) {
        this.abastecimento = evento;
    }

    public String salvarAbastecimento() {
        serviceAbastecimento.salvar(this.abastecimento);
        return "";

    }

    public String excluirAbastecimento() {
        serviceAbastecimento.excluir(this.abastecimento);
        return "";
    }

    public String atualizarAbastecimento() {
        serviceAbastecimento.atualizar(this.abastecimento);
        return "";
    }

}
