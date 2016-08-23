/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.projeto.dac.web.controller;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Colaborador;
import br.edu.ifpb.ads.praticas.immobilly.shared.services.ServiceApp;
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
public class ControladorApp implements Serializable {

    private String email;
    private String senha;
    private Colaborador user;

    @EJB
    private ServiceApp serviceApp;

    public Colaborador getUser() {
        return user;
    }

    public void setUser(Colaborador user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String logar() {
        Colaborador colaborador = serviceApp.login(email, senha);
        if (colaborador != null) {
            user = colaborador;
            return "sistema/usuario/index.xhtml?faces-redirect=true";
        }
        return "";
    }

    public String perfil() {
        return "meuPerfil.xhtml?faces-redirect=true";
    }

    public String paginaInicial() {
        return "index.xhtml?faces-redirect=true";
    }

}
