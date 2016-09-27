/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.service;

import br.edu.ifpb.ads.praticas.immobilly.entidades.Cliente;
import java.util.List;

/**
 *
 * @author kaiqu
 */
public interface ServiceCliente {

    public boolean salvar(Cliente cliente);

    public boolean atualizar(Cliente cliente);

    public boolean excluir(Cliente cliente);

    public Cliente pesquisar(Class<Cliente> entidade, Object key);

    public List<Cliente> listar();
    
    public Cliente login(String login, String senha);
}
