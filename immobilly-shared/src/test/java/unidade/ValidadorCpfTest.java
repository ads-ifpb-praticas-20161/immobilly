package unidade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.ifpb.ads.praticas.immobilly.shared.exception.InvalidoCpfException;
import br.edu.ifpb.ads.praticas.immobilly.shared.validador.ValidadorCpf;
import br.edu.ifpb.ads.praticas.immobilly.shared.validador.ValidadorCpfImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluísio
 */
public class ValidadorCpfTest {

    private ValidadorCpf validador;

    @Before
    public void setUpTests() {
        validador = new ValidadorCpfImpl();
    }

    @After
    public void afterTests() {
        System.out.println("Os testes foram concluídos");
    }

    @Test
    public void validarTamanho() throws InvalidoCpfException {
        Assert.assertEquals(false, validador.ehValido("123456789012"));
        Assert.assertEquals(false, validador.ehValido(""));
        Assert.assertEquals(false, validador.ehValido("9999999"));
        Assert.assertEquals(true, validador.ehValido("185302491-00"));
        Assert.assertEquals(true, validador.ehValido("185.302.491-00"));
    }

    @Test
    public void validarFormato() throws InvalidoCpfException {
        Assert.assertEquals(false, validador.ehValido("AAAAAAAA"));
        Assert.assertEquals(false, validador.ehValido("11287199"));
        Assert.assertEquals(false, validador.ehValido("161554-8"));
        Assert.assertEquals(false, validador.ehValido("#%%!$@-8"));
        Assert.assertEquals(false, validador.ehValido("$!@!$%!$$"));
        Assert.assertEquals(true, validador.ehValido("185.302.491-00"));
    }

    @Test(expected = InvalidoCpfException.class)
    public void testarObjeto() throws InvalidoCpfException {
        validador.ehValido(null);
    }

    @Test(timeout = 100L)
    public void testarPerformance() throws InvalidoCpfException {
        assertEquals(true, validador.ehValido("185.302.491-00"));
    }

}
