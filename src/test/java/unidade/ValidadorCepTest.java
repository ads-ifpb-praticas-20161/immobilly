/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade;

import br.edu.ifpb.ads.praticas.immobilly.exception.InvalidoCepException;
import br.edu.ifpb.ads.praticas.immobilly.validadores.ValidadorCep;
import br.edu.ifpb.ads.praticas.immobilly.validadores.ValidadorCepImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluísio
 */
public class ValidadorCepTest {

    private ValidadorCep validador;

    @Before
    public void setUpTests() {
        validador = new ValidadorCepImpl();
    }

    @After
    public void afterTests() {
        System.out.println("Os testes foram concluídos");
    }

    @Test
    public void validarTamanho() throws InvalidoCepException {
        Assert.assertEquals(false, validador.ehValido("1234567890"));
        Assert.assertEquals(false, validador.ehValido(""));
        Assert.assertEquals(true, validador.ehValido("12345678"));
        Assert.assertEquals(true, validador.ehValido("58950-000"));

    }

    @Test
    public void validarFormato() throws InvalidoCepException {
        Assert.assertEquals(false, validador.ehValido("asfee-000"));
        Assert.assertEquals(false, validador.ehValido("58950-asd"));
        Assert.assertEquals(false, validador.ehValido("a8950-000"));
        Assert.assertEquals(false, validador.ehValido("#%%@&-123"));
        Assert.assertEquals(false, validador.ehValido("aaa-$%!$"));
        Assert.assertEquals(true, validador.ehValido("12345-123"));
        Assert.assertEquals(true, validador.ehValido("58950-000"));
    }

    @Test(expected = InvalidoCepException.class)
    public void testarObjeto() throws InvalidoCepException {
        validador.ehValido(null);
    }

    @Test(timeout = 100L)
    public void testarPerformance() throws InvalidoCepException {
        assertEquals(true, validador.ehValido("58950-000"));
    }

}
