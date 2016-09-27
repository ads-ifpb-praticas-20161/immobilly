/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.controller;

import br.edu.ifpb.ads.praticas.immobilly.entidades.Cliente;
import br.edu.ifpb.ads.praticas.immobilly.entidades.Login;
import br.edu.ifpb.ads.praticas.immobilly.service.ServiceCliente;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author aluisio
 */
@ManagedBean
@SessionScoped
public class ControllerCliente implements Serializable {

    @EJB
    private ServiceCliente serviceCliente;

    private Cliente cliente;
    private Login login;

    private String emailLogin;
    private String senhaLogin;

    public ControllerCliente() {
        this.cliente = new Cliente();
        this.login = new Login();
        this.emailLogin = new String();
        this.senhaLogin = new String();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getEmailLogin() {
        return emailLogin;
    }

    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    public String getSenhaLogin() {
        return senhaLogin;
    }

    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }

    public String addCliente() {
        cliente.setLogin(login);
        serviceCliente.salvar(cliente);
        cliente = new Cliente();
        return "index.xhtml";
    }

    public List<Cliente> listar() {
        return serviceCliente.listar();
    }

    public String atualizar(Cliente c) {
        serviceCliente.atualizar(c);
        cliente = new Cliente();
        return "cadastroCliente.xhtml";
    }

    public String remover(Cliente c) {
        System.err.println("controle" + c.getNome());
        serviceCliente.excluir(c);
        return null;
    }
}
