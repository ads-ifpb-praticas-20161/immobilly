/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.mbean;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Locacao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ajp
 */
@Stateless
public class LocacaoFacade extends AbstractFacade<Locacao> implements br.edu.ifpb.ads.praticas.immobilly.mbean.LocacaoFacadeRemote {

    @PersistenceContext(unitName = "persistenciaMelhor")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LocacaoFacade() {
        super(Locacao.class);
    }
    
}
