/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.dao;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Placa;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Aluísio
 */
@Stateless
public class PlacaDao implements PlacaDaoIf {

    
    
    @PersistenceContext(unitName = "placa")
    EntityManager em;

    /**
     *
     * @param p
     */
    @Override
    public void salvar(Placa p) {
        em.persist(p);
    }

    /**
     *
     * @param p
     */
    @Override
    public void atualizar(Placa p) {
        em.merge(p);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Placa buscar(int id) {
        return em.find(Placa.class, id);
    }

    /**
     *
     * @return
     */
    @Override
    public List<Placa> listarTodos() {
        return em.createQuery("SELECT p FROM Placa p ORDER BY p.id", Placa.class).getResultList();
    }

    /**
     *
     * @param id
     */
    @Override
    public void excluir(int id) {
        em.remove(id);
    }

}
