/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.dao;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Placa;
import br.edu.ifpb.ads.praticas.immobilly.shared.exception.InvalidoPlacaException;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Aluísio
 */
public class Principal {

    public static void main(String[] args) throws InvalidoPlacaException {
        Placa placa = new Placa("ass-1234", "monte horebe", "estado");

        EntityManager entityManager = Persistence.createEntityManagerFactory("persistence").createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(placa);
        entityManager.getTransaction().commit();

        entityManager.close();

    }

}
