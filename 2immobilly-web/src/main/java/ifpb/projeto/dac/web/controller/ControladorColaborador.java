package ifpb.projeto.dac.web.controller;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Colaborador;
import br.edu.ifpb.ads.praticas.immobilly.shared.services.ServiceColaborador;
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
public class ControladorColaborador implements Serializable {

    private Colaborador colaborador;

    @EJB
    private ServiceColaborador serviceColaborador;

    public ControladorColaborador() {
        this.colaborador = new Colaborador();
    }

    public Colaborador getAdministrador() {
        return colaborador;
    }

    public void setColaborador(Colaborador administrador) {
        this.colaborador = administrador;
    }

    public String salvarColaborador() {
        serviceColaborador.salvarColaborador(this.colaborador);
        return "";
    }

    public String excluirColaborador() {
        serviceColaborador.excluirColaborador(this.colaborador);
        return "";
    }

    public String atualizarColaborador() {
        serviceColaborador.atualizarColaborador(this.colaborador);
        return "";
    }

    public String persquisarColaborador(Class<Colaborador> entidade, Object chave) {
        serviceColaborador.pesquisarColaborador(entidade, chave);
        return "";
    }

    public String listarColaborador() {
        serviceColaborador.listarColaborador();
        return "";
    }

    public String loginColaborador(String email, String senha) {
        serviceColaborador.loginColaborador(email, senha);
        return "";
    }

}
