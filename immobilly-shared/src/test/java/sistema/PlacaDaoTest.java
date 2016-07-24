/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Placa;
import br.edu.ifpb.ads.praticas.immobilly.shared.dao.PlacaDao;
import br.edu.ifpb.ads.praticas.immobilly.shared.dao.PlacaDaoIf;
import br.edu.ifpb.ads.praticas.immobilly.shared.exception.InvalidoPlacaException;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Aluísio
 */
public class PlacaDaoTest extends BataBaseJPATest {

    private PlacaDaoIf pDao;

    @Before
    public void setUp() {
        this.pDao = new PlacaDao();
    }

    @Test
    public void testSalvar() throws Exception, InvalidoPlacaException {
        Placa p1 = new Placa();
        p1.setNumeracao("EEE-1234");
        p1.setCidade("Cajazeiras");
        p1.setUf("Paraiba");
        entityManager.getTransaction().begin();
        entityManager.persist(p1);
        long id1 = p1.getId();
        entityManager.getTransaction().commit();
        Placa placa1 = entityManager.find(Placa.class, id1);
        Assert.assertNotNull(placa1);
        Assert.assertEquals("EEE-5678", placa1.getNumeracao());
        //  pDao.salvar(p1);

        Placa p2 = new Placa();
        p2.setNumeracao("EEE-5678");
        p2.setCidade("Sousa");
        p2.setUf("Paraiba");
        entityManager.getTransaction().begin();
        entityManager.persist(p2);
        long id2 = p2.getId();
        entityManager.getTransaction().commit();
        Placa placa2 = entityManager.find(Placa.class, id2);
        Assert.assertNotNull(placa2);
        Assert.assertEquals("EEE-5678", placa2.getNumeracao());
    }

    /**
     * Test of atualizar method, of class PlacaDao.
     */
    @Test
    public void testAtualizar() throws Exception, InvalidoPlacaException {
        Placa p1 = new Placa("BBB-4321", "Juazeiro", "Ceará");
        entityManager.getTransaction().begin();
        entityManager.persist(p1);
        long id1 = p1.getId();
        entityManager.getTransaction().commit();
        p1.setNumeracao("CCC-9876");
        p1.setCidade("Pombal");
        p1.setUf("Paraíba");
        entityManager.getTransaction().begin();
        entityManager.merge(p1);
        long id2 = p1.getId();
        entityManager.getTransaction().commit();
        Placa placa1 = entityManager.find(Placa.class, id1);
        Placa placa2 = entityManager.find(Placa.class, id2);
        Assert.assertNotNull(placa2);
        Assert.assertEquals(placa1.getId(), placa2.getId());
        Assert.assertNotEquals(placa1.getNumeracao(), placa2.getNumeracao());
        Assert.assertNotEquals(placa1.getCidade(), placa2.getCidade());
        Assert.assertNotEquals(placa1.getUf(), placa2.getUf());

    }

    /**
     * Test of buscar method, of class PlacaDao.
     */
    @Test
    public void testBuscar() throws Exception {
        Placa placa = entityManager.find(Placa.class, 1L);
        Assert.assertNotNull(placa);
        Assert.assertEquals("EEE-5678", placa.getNumeracao());
    }

    /**
     * Test of buscarTodasPlacas method, of class PlacaDao.
     */
    @Test
    public void testBuscarTodasPlacas() throws Exception {
        List<Placa> placas = entityManager.createQuery("FROM Placa").getResultList();
        Assert.assertEquals(2, placas.size());
    }

    /**
     * Test of excluir method, of class PlacaDao.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testExcluir() throws Exception {
        Placa placa = entityManager.find(Placa.class, 1L);
        entityManager.remove(placa);
        Assert.assertNull(placa);
    }

}
