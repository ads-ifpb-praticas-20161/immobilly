/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.repository;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Placa;
import br.edu.ifpb.ads.praticas.immobilly.shared.exception.InvalidoPlacaException;
import br.edu.ifpb.ads.praticas.immobilly.shared.infraestrutura.db.DBUnitHelper;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jederson
 */
public class RepositoryPlacaIT {
    
    private RepositoryPlaca repository;
    
    public RepositoryPlacaIT() {
    }
    
       
    @Before
    public void setUp() {
        new DBUnitHelper().cleanInsert("/tabelas/Placa.xml");   
        repository = new RepositoryPlaca();
    }
    
    @After
    public void tearDown() {
        new DBUnitHelper().delete("/tabelas/Placa.xml");  
        
    }

    /**
     * Test of salvar method, of class RepositoryPlaca.
     */
    @Test
    public void testSalvar() throws InvalidoPlacaException {
        System.out.println("salvar");
        Placa placa = new Placa(667, "EEE-1234", "Cajazeiras", "PB");
        repository.salvar(placa);
        
        Placa q = repository.localizar(667l);
        assertNotNull(q);
        assertFalse("EAE-1112".equals(q.getNumeracao()));
        assertTrue("EEE-1234".equals(q.getNumeracao()));
        
    }

    /**
     * Test of remover method, of class RepositoryPlaca.
     */
    @Test
    public void testRemover_Placa() {
        System.out.println("remover");
        Placa p = repository.localizar(13l);
        assertNotNull(p);
        assertTrue("DDD-1478".equals(p.getNumeracao()));
                    
        repository.remover(p);
        
        assertNull(p=repository.localizar(13l));
    }

    /**
     * Test of remover method, of class RepositoryPlaca.
     */
    @Test
    public void testRemover_Integer() {
       
        System.out.println("remover");
        Placa p = repository.localizar(13l);
        assertNotNull(p);
        assertTrue("DDD-1478".equals(p.getNumeracao()));
                    
        repository.remover(13l);
        
        assertNull(p=repository.localizar(13l));
    }

    /**
     * Test of localizar method, of class RepositoryPlaca.
     */
    @Test
    public void testLocalizar() {
        System.out.println("localizar");
        Placa p = repository.localizar(13l);
        assertNotNull(p);
        assertTrue("DDD-1478".equals(p.getNumeracao()));
    }

    /**
     * Test of todos method, of class RepositoryPlaca.
     */
    @Test
    public void testTodos() {
        System.out.println("todos");
        assertNotNull(repository.todos().isEmpty());
    }
    
}
