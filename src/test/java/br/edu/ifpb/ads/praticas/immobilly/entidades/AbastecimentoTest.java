///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.edu.ifpb.ads.praticas.immobilly.entidades;
//
//import java.math.BigDecimal;
//import java.util.Date;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Aluísio
// */
//public class AbastecimentoTest {
//    
//    public AbastecimentoTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getAbastecimentoId method, of class Abastecimento.
//     */
//    @Test
//    public void testGetAbastecimentoId() {
//        System.out.println("getAbastecimentoId");
//        Abastecimento instance = new Abastecimento();
//        long expResult = 0L;
//        long result = instance.getAbastecimentoId();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAbastecimentoId method, of class Abastecimento.
//     */
//    @Test
//    public void testSetAbastecimentoId() {
//        System.out.println("setAbastecimentoId");
//        long abastecimentoId = 0L;
//        Abastecimento instance = new Abastecimento();
//        instance.setAbastecimentoId(abastecimentoId);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFornecedor method, of class Abastecimento.
//     */
//    @Test
//    public void testGetFornecedor() {
//        System.out.println("getFornecedor");
//        Abastecimento instance = new Abastecimento();
//        Colaborador expResult = null;
//        Colaborador result = instance.getFornecedor();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setFornecedor method, of class Abastecimento.
//     */
//    @Test
//    public void testSetFornecedor() {
//        System.out.println("setFornecedor");
//        Colaborador fornecedor = null;
//        Abastecimento instance = new Abastecimento();
//        instance.setFornecedor(fornecedor);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getVeiculo method, of class Abastecimento.
//     */
//    @Test
//    public void testGetVeiculo() {
//        System.out.println("getVeiculo");
//        Abastecimento instance = new Abastecimento();
//        Veiculo expResult = null;
//        Veiculo result = instance.getVeiculo();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setVeiculo method, of class Abastecimento.
//     */
//    @Test
//    public void testSetVeiculo() {
//        System.out.println("setVeiculo");
//        Veiculo veiculo = null;
//        Abastecimento instance = new Abastecimento();
//        instance.setVeiculo(veiculo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getHorario method, of class Abastecimento.
//     */
//    @Test
//    public void testGetHorario() {
//        System.out.println("getHorario");
//        Abastecimento instance = new Abastecimento();
//        Date expResult = null;
//        Date result = instance.getHorario();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setHorario method, of class Abastecimento.
//     */
//    @Test
//    public void testSetHorario() {
//        System.out.println("setHorario");
//        Date horario = null;
//        Abastecimento instance = new Abastecimento();
//        instance.setHorario(horario);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getKm method, of class Abastecimento.
//     */
//    @Test
//    public void testGetKm() {
//        System.out.println("getKm");
//        Abastecimento instance = new Abastecimento();
//        Integer expResult = null;
//        Integer result = instance.getKm();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setKm method, of class Abastecimento.
//     */
//    @Test
//    public void testSetKm() {
//        System.out.println("setKm");
//        Integer km = null;
//        Abastecimento instance = new Abastecimento();
//        instance.setKm(km);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getValorPorLitro method, of class Abastecimento.
//     */
//    @Test
//    public void testGetValorPorLitro() {
//        System.out.println("getValorPorLitro");
//        Abastecimento instance = new Abastecimento();
//        BigDecimal expResult = null;
//        BigDecimal result = instance.getValorPorLitro();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setValorPorLitro method, of class Abastecimento.
//     */
//    @Test
//    public void testSetValorPorLitro() {
//        System.out.println("setValorPorLitro");
//        BigDecimal valorPorLitro = null;
//        Abastecimento instance = new Abastecimento();
//        instance.setValorPorLitro(valorPorLitro);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getValorAbastecimento method, of class Abastecimento.
//     */
//    @Test
//    public void testGetValorAbastecimento() {
//        System.out.println("getValorAbastecimento");
//        Abastecimento instance = new Abastecimento();
//        BigDecimal expResult = null;
//        BigDecimal result = instance.getValorAbastecimento();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setValorAbastecimento method, of class Abastecimento.
//     */
//    @Test
//    public void testSetValorAbastecimento() {
//        System.out.println("setValorAbastecimento");
//        BigDecimal valorAbastecimento = null;
//        Abastecimento instance = new Abastecimento();
//        instance.setValorAbastecimento(valorAbastecimento);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getQuantidade method, of class Abastecimento.
//     */
//    @Test
//    public void testGetQuantidade() {
//        System.out.println("getQuantidade");
//        Abastecimento instance = new Abastecimento();
//        int expResult = 0;
//        int result = instance.getQuantidade();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setQuantidade method, of class Abastecimento.
//     */
//    @Test
//    public void testSetQuantidade() {
//        System.out.println("setQuantidade");
//        int quantidade = 0;
//        Abastecimento instance = new Abastecimento();
//        instance.setQuantidade(quantidade);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of hashCode method, of class Abastecimento.
//     */
//    @Test
//    public void testHashCode() {
//        System.out.println("hashCode");
//        Abastecimento instance = new Abastecimento();
//        int expResult = 0;
//        int result = instance.hashCode();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of equals method, of class Abastecimento.
//     */
//    @Test
//    public void testEquals() {
//        System.out.println("equals");
//        Object obj = null;
//        Abastecimento instance = new Abastecimento();
//        boolean expResult = false;
//        boolean result = instance.equals(obj);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}
