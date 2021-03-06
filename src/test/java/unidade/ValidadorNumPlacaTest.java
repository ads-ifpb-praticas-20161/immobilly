/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade;

import br.edu.ifpb.ads.praticas.immobilly.exception.InvalidoCpfException;
import br.edu.ifpb.ads.praticas.immobilly.exception.InvalidoPlacaException;
import br.edu.ifpb.ads.praticas.immobilly.validadores.ValidadorNumPlaca;
import br.edu.ifpb.ads.praticas.immobilly.validadores.ValidadorPlaca;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import br.edu.ifpb.ads.praticas.immobilly.validadores.ValidadorPlaca;

/**
 *
 * @author Aluísio
 */
public class ValidadorNumPlacaTest {

    private ValidadorNumPlaca validador;

    @Before
    public void setUpTests() {
        validador = new ValidadorNumPlaca();
    }

    @After
    public void afterTests() {
        System.out.println("Os testes foram concluídos");
    }

    @Test
    public void validarTamanho() throws InvalidoPlacaException {
        Assert.assertEquals(false, validador.ehValido("1234567890"));
        Assert.assertEquals(false, validador.ehValido(""));
        Assert.assertEquals(false, validador.ehValido("12345678"));
        Assert.assertEquals(true, validador.ehValido("ETE-1234"));
    }

    @Test
    public void validarFormato() throws InvalidoPlacaException {
        Assert.assertEquals(false, validador.ehValido("AA-1234A"));
        Assert.assertEquals(false, validador.ehValido("1aa-1234"));
        Assert.assertEquals(false, validador.ehValido("AAA-A123"));
        Assert.assertEquals(false, validador.ehValido("#%%-1234"));
        Assert.assertEquals(false, validador.ehValido("aaa-$%!$"));
        Assert.assertEquals(true, validador.ehValido("ETE-1234"));
    }

    @Test(expected = InvalidoPlacaException.class)
    public void testarObjeto() throws InvalidoPlacaException {
        validador.ehValido(null);
    }

    @Test(timeout = 100L)
    public void testarPerformance() throws InvalidoPlacaException {
        assertEquals(true, validador.ehValido("ETE-1234"));
    }

}
