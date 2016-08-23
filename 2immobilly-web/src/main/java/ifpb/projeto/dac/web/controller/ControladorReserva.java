/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.projeto.dac.web.controller;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Reserva;
import br.edu.ifpb.ads.praticas.immobilly.shared.services.ServiceReserva;
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
public class ControladorReserva implements Serializable {

    private Reserva reserva;

    @EJB
    private ServiceReserva serviceReserva;

    public ControladorReserva() {
        this.reserva = new Reserva();
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva veiculo) {
        this.reserva = veiculo;
    }

    public ServiceReserva getServiceReserva() {
        return serviceReserva;
    }

    public void setServiceReserva(ServiceReserva serviceReserva) {
        this.serviceReserva = serviceReserva;
    }

    public String salvarReserva() {
        try {
            serviceReserva.salvarReserva(this.reserva);
            return "sucesso.xhtml";
        } catch (Exception e) {

        }

        return null;

    }

    public String excluirReserva() {
        serviceReserva.excluirReserva(this.reserva);
        return "";
    }

    public String atualizarReserva() {
        serviceReserva.atualizarReserva(this.reserva);
        return "";
    }

    public String listarReserva() {
        serviceReserva.listarReserva();
        return "";
    }

}
