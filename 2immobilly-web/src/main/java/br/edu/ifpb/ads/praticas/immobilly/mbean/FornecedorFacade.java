/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.mbean;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Fornecedor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ajp
 */
@Stateless
public class FornecedorFacade extends AbstractFacade<Fornecedor> implements br.edu.ifpb.ads.praticas.immobilly.mbean.FornecedorFacadeRemote {

    @PersistenceContext(unitName = "persistenciaMelhor")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FornecedorFacade() {
        super(Fornecedor.class);
    }
    
}
