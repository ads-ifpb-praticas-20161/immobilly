/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade;

import br.edu.ifpb.ads.praticas.immobilly.exception.InvalidoEmailException;
import br.edu.ifpb.ads.praticas.immobilly.validadores.ValidadorEmail;
import br.edu.ifpb.ads.praticas.immobilly.validadores.ValidadorEmailImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluísio
 */
public class ValidadorEmailTest {

    private ValidadorEmail validador;

    @Before
    public void setUpTests() {
        validador = new ValidadorEmailImpl();
    }

    @After
    public void afterTests() {
        System.out.println("Os testes foram concluídos");
    }

    /**
     *
     * @throws InvalidoEmailException
     */
    @Test
    public void validarFormato() throws InvalidoEmailException {
        Assert.assertEquals(false, validador.ehValido("asd@.g.com"));
        Assert.assertEquals(false, validador.ehValido(""));
        Assert.assertEquals(false, validador.ehValido("asd@g..com"));
        Assert.assertEquals(false, validador.ehValido("@@asd@gmail.com"));
        Assert.assertEquals(true, validador.ehValido("nome@dominio.com"));
    }

    /*    @Test
    public void validarTamanho() throws InvalidoEmailException {
    }
     */
    @Test(expected = InvalidoEmailException.class)
    public void testarObjeto() throws InvalidoEmailException {
        validador.ehValido(null);
    }

    @Test(timeout = 100L)
    public void testarPerformance() throws InvalidoEmailException {
        assertEquals(true, validador.ehValido("nome@dominio.com"));
    }

}
