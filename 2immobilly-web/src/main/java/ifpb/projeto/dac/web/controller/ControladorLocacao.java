/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.projeto.dac.web.controller;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Locacao;
import br.edu.ifpb.ads.praticas.immobilly.shared.services.ServiceLocacao;
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
public class ControladorLocacao implements Serializable {

    private Locacao locacao;

    @EJB
    private ServiceLocacao daoLocacao;

    public ControladorLocacao() {
        this.locacao = new Locacao();
    }

    public Locacao getLocacao() {
        return this.locacao;
    }

    public void setLocacao(Locacao locacao) {
        locacao = this.locacao;
    }

    public String salvarLocacao() {

        try {
            daoLocacao.salvar(this.locacao);
            return "sucesso.xhtml";
        } catch (Exception e) {

        }

        return null;

    }

    public String excluirLocacao() {
        daoLocacao.excluir(this.locacao);
        return "";
    }

    public String atualizarLocacao() {
        daoLocacao.atualizar(this.locacao);
        return "sucesso.xhtml";
    }

}
