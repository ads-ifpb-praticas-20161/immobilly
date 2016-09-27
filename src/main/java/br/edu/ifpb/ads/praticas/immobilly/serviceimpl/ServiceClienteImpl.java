/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.serviceimpl;

import br.edu.ifpb.ads.praticas.immobilly.dao.ClienteDao;
import br.edu.ifpb.ads.praticas.immobilly.entidades.Cliente;
import br.edu.ifpb.ads.praticas.immobilly.service.ServiceCliente;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author kaiqu
 */
@Stateless
public class ServiceClienteImpl implements ServiceCliente {

    @EJB
    private ClienteDao dao;

    @Override
    public boolean salvar(Cliente cliente) {
        return dao.salvar(cliente);
    }

    @Override
    public boolean atualizar(Cliente cliente) {
        return dao.atualizar(cliente);
    }

    @Override
    public boolean excluir(Cliente cliente) {
        return dao.excluir(cliente);
    }

    @Override
    public Cliente pesquisar(Class<Cliente> entidade, Object key) {
        return dao.pesquisar(entidade, key);
    }

    @Override
    public List<Cliente> listar() {
        return dao.listar();
    }

    @Override
    public Cliente login(String login, String senha) {
        System.out.println("ServiceImplCliente");
        return dao.login(login, senha);
    }

}
