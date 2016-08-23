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
public class AppDao {

    @PersistenceContext(unitName = "jdbc/praticas-projeto-immobilly")
    private EntityManager em;

    public AppDao() {
    }

    public Colaborador login(String email, String senha) {

        Query query = em.createQuery("SELECT a FROM Colaborador a WHERE a.email = :email AND a.senha = :senha ");
        query.setParameter("email", email);
        query.setParameter("senha", senha);
        List<Colaborador> colaborador = query.getResultList();

        if (colaborador.size() > 0) {
            return colaborador.get(0);
        }
        return null;
    }

    public List<Colaborador> listarColaborador() {

        Query query = em.createQuery("SELECT p FROM Colaborador p ORDER BY p.nome");
        List<Colaborador> colaborador = query.getResultList();
        if (colaborador.size() > 0) {
            return colaborador;
        }

        return null;
    }
}
