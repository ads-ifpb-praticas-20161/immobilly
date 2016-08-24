/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.projeto.dac.web.controller;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Veiculo;
import br.edu.ifpb.ads.praticas.immobilly.shared.services.ServiceVeiculo;
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
public class ControladorVeiculo implements Serializable {

    private Veiculo veiculo;

    @EJB
    private ServiceVeiculo serviceVeiculo;

    public ControladorVeiculo() {
        this.veiculo = new Veiculo();
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public ServiceVeiculo getServiceVeiculo() {
        return serviceVeiculo;
    }

    public void setServiceVeiculo(ServiceVeiculo serviceVeiculo) {
        this.serviceVeiculo = serviceVeiculo;
    }

    public String salvarVeiculo() {
        try {
            serviceVeiculo.salvar(this.veiculo);
            return "sucesso.xhtml";
        } catch (Exception e) {

        }

        return null;

    }

    public String excluirVeiculo() {
        serviceVeiculo.excluir(this.veiculo);
        return "";
    }

    public String atualizarVeiculo() {
        serviceVeiculo.atualizar(this.veiculo);
        return "";
    }

    public String listarVeiculo() {
        serviceVeiculo.listarVeiculo();
        return "";
    }

}
