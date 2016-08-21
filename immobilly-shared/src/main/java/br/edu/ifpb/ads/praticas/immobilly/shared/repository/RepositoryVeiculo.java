package br.edu.ifpb.ads.praticas.immobilly.shared.repository;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by jederson on 21/08/16.
 */
public class RepositoryVeiculo implements Repositorio<Veiculo>{

    private EntityManager em;

    public RepositoryVeiculo() {
        this(Persistence.createEntityManagerFactory("persistence"));
    }

    public RepositoryVeiculo(EntityManagerFactory em) {
        this(em.createEntityManager());
    }

    public RepositoryVeiculo(EntityManager em) {
        this.em = em;
    }

    @Override
    public boolean salvar(Veiculo veiculo) {
        em.getTransaction().begin();
        em.persist(veiculo);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean remover(Veiculo veiculo) {
        em.getTransaction().begin();
        em.remove(veiculo);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Veiculo localizar(long id) {
        return em.find(Veiculo.class, id);
    }

    @Override
    public List<Veiculo> todos() {
        return em.createQuery("SELECT v FROM Veiculo v", Veiculo.class).getResultList();
    }
}
