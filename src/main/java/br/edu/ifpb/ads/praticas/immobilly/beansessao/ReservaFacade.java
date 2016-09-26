/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.beansessao;

import br.edu.ifpb.ads.praticas.immobilly.entidadeDoBanco.Reserva;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Aluísio
 */
@Stateless
public class ReservaFacade extends AbstractFacade<Reserva> {

    @PersistenceContext(unitName = "manager1")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReservaFacade() {
        super(Reserva.class);
    }
    
}
