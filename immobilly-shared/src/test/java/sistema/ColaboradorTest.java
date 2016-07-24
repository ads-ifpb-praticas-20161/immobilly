/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.CNH;
import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Colaborador;
import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Endereço;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluísio
 */
public class ColaboradorTest {
    
    public ColaboradorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCod method, of class Colaborador.
     */
    @Test
    public void testGetCod() {
        System.out.println("getCod");
        Colaborador instance = new Colaborador();
        long expResult = 0L;
        long result = instance.getCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCod method, of class Colaborador.
     */
    @Test
    public void testSetCod() {
        System.out.println("setCod");
        long cod = 0L;
        Colaborador instance = new Colaborador();
        instance.setCod(cod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Colaborador.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Colaborador instance = new Colaborador();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Colaborador.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Colaborador instance = new Colaborador();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Colaborador.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Colaborador instance = new Colaborador();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Colaborador.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Colaborador instance = new Colaborador();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Colaborador.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Colaborador instance = new Colaborador();
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class Colaborador.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        Colaborador instance = new Colaborador();
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCelular method, of class Colaborador.
     */
    @Test
    public void testGetCelular() {
        System.out.println("getCelular");
        Colaborador instance = new Colaborador();
        String expResult = "";
        String result = instance.getCelular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCelular method, of class Colaborador.
     */
    @Test
    public void testSetCelular() {
        System.out.println("setCelular");
        String celular = "";
        Colaborador instance = new Colaborador();
        instance.setCelular(celular);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataNascimento method, of class Colaborador.
     */
    @Test
    public void testGetDataNascimento() {
        System.out.println("getDataNascimento");
        Colaborador instance = new Colaborador();
        Date expResult = null;
        Date result = instance.getDataNascimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataNascimento method, of class Colaborador.
     */
    @Test
    public void testSetDataNascimento() {
        System.out.println("setDataNascimento");
        Date dataNascimento = null;
        Colaborador instance = new Colaborador();
        instance.setDataNascimento(dataNascimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexo method, of class Colaborador.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Colaborador instance = new Colaborador();
        String expResult = "";
        String result = instance.getSexo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSexo method, of class Colaborador.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        Colaborador instance = new Colaborador();
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCPF method, of class Colaborador.
     */
    @Test
    public void testGetCPF() {
        System.out.println("getCPF");
        Colaborador instance = new Colaborador();
        String expResult = "";
        String result = instance.getCPF();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCPF method, of class Colaborador.
     */
    @Test
    public void testSetCPF() {
        System.out.println("setCPF");
        String CPF = "";
        Colaborador instance = new Colaborador();
        instance.setCPF(CPF);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargo method, of class Colaborador.
     */
    @Test
    public void testGetCargo() {
        System.out.println("getCargo");
        Colaborador instance = new Colaborador();
        String expResult = "";
        String result = instance.getCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCargo method, of class Colaborador.
     */
    @Test
    public void testSetCargo() {
        System.out.println("setCargo");
        String cargo = "";
        Colaborador instance = new Colaborador();
        instance.setCargo(cargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Colaborador.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Colaborador instance = new Colaborador();
        Endereço expResult = null;
        Endereço result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Colaborador.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        Endereço endereco = null;
        Colaborador instance = new Colaborador();
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCnh method, of class Colaborador.
     */
    @Test
    public void testGetCnh() {
        System.out.println("getCnh");
        Colaborador instance = new Colaborador();
        CNH expResult = null;
        CNH result = instance.getCnh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCnh method, of class Colaborador.
     */
    @Test
    public void testSetCnh() {
        System.out.println("setCnh");
        CNH cnh = null;
        Colaborador instance = new Colaborador();
        instance.setCnh(cnh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Colaborador.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Colaborador instance = new Colaborador();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Colaborador.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Colaborador instance = new Colaborador();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
