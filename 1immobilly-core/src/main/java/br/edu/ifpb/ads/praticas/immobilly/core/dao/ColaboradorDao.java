/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.core.dao;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Colaborador;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Aluísio
 */
@Stateless

public class ColaboradorDao {

    @PersistenceContext(unitName = "jdbc/praticas-projeto-immobilly")
    private EntityManager em;

    public ColaboradorDao() {

    }

    public boolean salvarColaborador(Colaborador administrador) {
        em.persist(administrador);
        return true;
    }

    public boolean excluirColaborador(Colaborador administrador) {
        em.remove(administrador);
        return true;
    }

    public boolean atualizarColaborador(Colaborador administrador) {
        em.merge(administrador);
        return true;
    }

    public Colaborador pesquisarColaborador(Class<Colaborador> entidade, Object chave) {
        return em.find(entidade, chave);
    }

    public List<Colaborador> listarColaborador() {
        Query query = em.createQuery("SELECT a FROM Administrador a ORDER BY a.nome");
        List<Colaborador> a = query.getResultList();
        if (a.size() > 0) {
            return a;
        }
        return null;

    }

    public Colaborador loginColaborador(String email, String senha) {
        Query query = em.createQuery("SELECT a FROM Colaborador a WHERE a.email = :email AND a.senha = :senha");
        query.setParameter("email", email);
        query.setParameter("senha", senha);

        List<Colaborador> administrador = query.getResultList();

        if (administrador.size() > 0) {
            return administrador.get(0);
        }

        return null;
    }

}
