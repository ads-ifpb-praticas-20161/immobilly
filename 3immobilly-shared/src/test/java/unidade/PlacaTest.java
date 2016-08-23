/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Placa;
import br.edu.ifpb.ads.praticas.immobilly.shared.exception.InvalidoPlacaException;
import br.edu.ifpb.ads.praticas.immobilly.shared.validador.Validador;
import br.edu.ifpb.ads.praticas.immobilly.shared.validador.ValidadorPlaca;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import br.edu.ifpb.ads.praticas.immobilly.shared.validador.ValidadorPlaca;

/**
 *
 * @author Aluísio
 */
public class PlacaTest {

    private Validador<Placa> validador;

    @Before
    public void setUpTests() {
        validador = new ValidadorPlaca();
    }

    @After
    public void afterTests() {
        System.out.println("Os testes foram concluídos");
    }

    /**
     * Test of validarPlaca method, of class Placa.
     *
     * @throws java.lang.Exception
     * @throws
     * br.edu.ifpb.ads.praticas.immobilly.shared.exception.InvalidoPlacaException
     */
    @Test
    public void testValidarPlaca() throws Exception, InvalidoPlacaException {
        System.out.println("validarPlaca");
        Placa placa = new Placa("EEE-1234", "Cajazeiras", "PB");
        assertEquals(true, validador.validar(placa));
    }

    /**
     * Test of getNumeracao method, of class Placa.
     */
    @Test
    public void testGetNumeracao() throws InvalidoPlacaException {
        System.out.println("validarNumeracao");
        Placa placa = new Placa("EEE-1234", "Cajazeiras", "PB");
        assertEquals("EEE-1234", placa.getNumeracao());
    }

    /**
     * Test of setNumeracao method, of class Placa.
     */
    @Test
    public void testSetNumeracao() throws InvalidoPlacaException {
        System.out.println("setNumeracao");
        Placa carro = new Placa("EEE-1234", "Cajazeiras", "PB");
        carro.setNumeracao("EEE-5678");
        assertEquals("EEE-5678", carro.getNumeracao());
    }

    /**
     * Test of getCidade method, of class Placa.
     */
    @Test
    public void testGetCidade() throws InvalidoPlacaException {
        System.out.println("getCidade");
        Placa placa = new Placa("EEE-1234", "Cajazeiras", "PB");
        assertEquals("Cajazeiras", placa.getCidade());
    }

    /**
     * Test of setCidade method, of class Placa.
     */
    @Test
    public void testSetCidade() throws InvalidoPlacaException {
        System.out.println("setCidade");
        Placa placa = new Placa("EEE-1234", "Cajazeiras", "PB");
        placa.setCidade("Sousa");
        assertEquals("Sousa", placa.getCidade());
    }

    /**
     * Test of getUf method, of class Placa.
     */
    @Test
    public void testGetUf() throws InvalidoPlacaException {
        System.out.println("getUf");
        Placa placa = new Placa("EEE-1234", "Cajazeiras", "PB");
        assertEquals("PB", placa.getUf());
    }

    /**
     * Test of setUf method, of class Placa.
     */
    @Test
    public void testSetUf() throws InvalidoPlacaException {
        System.out.println("setUf");
        System.out.println("setCidade");
        Placa placa = new Placa("EEE-1234", "Cajazeiras", "PB");
        placa.setUf("Ceará");
        assertEquals("Ceará", placa.getUf());
    }

}
