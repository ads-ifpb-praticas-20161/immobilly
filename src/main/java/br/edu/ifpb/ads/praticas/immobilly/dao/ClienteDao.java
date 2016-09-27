/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.dao;

import br.edu.ifpb.ads.praticas.immobilly.entidades.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author aluisio
 */
@Stateless
public class ClienteDao {

    @PersistenceContext
    EntityManager em;

    public boolean salvar(Cliente cliente) {
        em.persist(cliente);
        return true;
    }

    public boolean atualizar(Cliente cliente) {
        em.merge(cliente);
        return true;
    }

    public boolean excluir(Cliente cliente) {
        em.remove(em.merge(cliente));
        return true;
    }

    public Cliente pesquisar(Class<Cliente> entidade, Object key) {
        return em.find(entidade, key);
    }

    public List<Cliente> listar() {
        TypedQuery<Cliente> createQuery = em.createQuery("SELECT c FROM Cliente c ORDER BY c.nome", Cliente.class);
        List<Cliente> clientes = createQuery.getResultList();
        if (clientes.size() > 0) {
            return clientes;
        }
        return null;
    }

    public Cliente login(String login, String senha) {
        System.out.println("ClienteDao");
        Query query = em.createQuery("SELECT c FROM Cliente c WHERE c.login.login = :login AND c.login.senha = :senha");

        query.setParameter("login", login);
        query.setParameter("senha", senha);

        List<Cliente> clientes = query.getResultList();

        if (clientes.size() > 0) {
            return clientes.get(0);
        }
        return null;
    }
}
