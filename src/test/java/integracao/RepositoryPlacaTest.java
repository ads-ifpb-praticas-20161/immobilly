///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package integracao;
//
//import br.edu.ifpb.ads.praticas.immobilly.beansessao.AbastecimentoFacade;
//import br.edu.ifpb.ads.praticas.immobilly.entidades.Abastecimento;
//import br.edu.ifpb.ads.praticas.immobilly.exception.InvalidoPlacaException;
//import java.math.BigDecimal;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author aluisio
// */
//public class RepositoryPlacaTest {
//
//    private AbastecimentoFacade repository;
//
//    public RepositoryPlacaTest() {
//    }
//
//    @Before
//    public void setUp() {
//        repository = new AbastecimentoFacade();
//    }
//
//    @After
//    public void tearDown() {
//
//    }
//
//    /**
//     * Test of salvar method, of class RepositoryPlaca.
//     * @throws br.edu.ifpb.ads.praticas.immobilly.exception.InvalidoPlacaException
//     */
//    @Test
//    public void testSalvar() throws InvalidoPlacaException {
//        System.out.println("salvar");
//        Abastecimento placa = new Abastecimento(100, null, null, null, 1000, BigDecimal.ZERO, BigDecimal.TEN, 0);
//        repository.create(placa);
//        Abastecimento q = repository.find(100);
//        assertNotNull(q);
//        assertFalse("222".equals(q.getAbastecimentoId()));
//        assertTrue("100".equals(q.getAbastecimentoId()));
//
//    }
//
//    /**
//     * Test of remover method, of class RepositoryPlaca.
//     */
//    @Test
//    public void testRemover() {
//        System.out.println("remover");
//        Abastecimento placa = new Abastecimento(101, null, null, null, 100, BigDecimal.ZERO, BigDecimal.TEN, 0);
//        repository.create(placa);
//        Abastecimento p = repository.find(101);
//        assertNotNull(p);
//        assertTrue("101".equals(p.getAbastecimentoId()));
//
//        repository.remove(p);
//
//        assertNull(p = repository.find(101));
//    }
//
//    /**
//     * Test of localizar method, of class RepositoryPlaca.
//     */
//    @Test
//    public void testLocalizar() {
//        System.out.println("localizar");
//        Abastecimento placa = new Abastecimento(102, null, null, null, 100, BigDecimal.ZERO, BigDecimal.TEN, 0);
//        repository.create(placa);
//        Abastecimento p = repository.find(102);
//        assertNotNull(p);
//        assertTrue("102".equals(p.getAbastecimentoId()));
//    }
//
//    /**
//     * Test of todos method, of class RepositoryPlaca.
//     */
//    @Test
//    public void testTodos() {
//        System.out.println("todos");
//        assertNotNull(repository.findAll().isEmpty());
//    }
//
//}
