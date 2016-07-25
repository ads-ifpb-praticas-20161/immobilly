/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.repository;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Placa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jederson
 */
public class RepositoryPlaca implements Repositorio<Long, Placa>{

     private EntityManager em;
    
    public RepositoryPlaca() {
        this(Persistence.createEntityManagerFactory("persistence"));
    }

    public RepositoryPlaca(EntityManagerFactory em) {
        this(em.createEntityManager());
    }

    public RepositoryPlaca(EntityManager em) {
        this.em = em;
    }
    @Override
    public boolean salvar(Placa placa) {
        em.getTransaction().begin();
        em.persist(placa);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean remover(Placa placa) {
        em.getTransaction().begin();
        em.remove(placa);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean remover(Long id) {
        em.getTransaction().begin();
        em.remove(id);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Placa localizar(Long id) {
        return em.find(Placa.class, id);
    }

    @Override
    public List<Placa> todos() {
        return em.createQuery("Select p From Placa p", Placa.class).getResultList();
    }
    
}
