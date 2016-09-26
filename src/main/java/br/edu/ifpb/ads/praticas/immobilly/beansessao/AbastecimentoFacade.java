/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.beansessao;

import br.edu.ifpb.ads.praticas.immobilly.entidadeDoBanco.Abastecimento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Aluísio
 */
@Stateless
public class AbastecimentoFacade extends AbstractFacade<Abastecimento> {

    @PersistenceContext(unitName = "manager1")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AbastecimentoFacade() {
        super(Abastecimento.class);
    }
    
}
