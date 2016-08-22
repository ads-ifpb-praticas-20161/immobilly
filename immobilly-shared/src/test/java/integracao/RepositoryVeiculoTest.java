package integracao;

import br.edu.ifpb.ads.praticas.immobilly.shared.infraestrutura.db.DBUnitHelper;
import br.edu.ifpb.ads.praticas.immobilly.shared.repository.RepositoryVeiculo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jederson on 21/08/16.
 */
public class RepositoryVeiculoTest {

    private RepositoryVeiculo repositoryVeiculo;

    public RepositoryVeiculoTest(){

    }

    @Before
    public void setUp(){
        new DBUnitHelper().cleanInsert("/tabelas/Placa.xml");
        new DBUnitHelper().cleanInsert("/tabelas/Veiculo.xml");
        repositoryVeiculo = new RepositoryVeiculo();
    }

    @After
    public void tearDown()
    {
        new DBUnitHelper().delete("/tabelas/Veiculo.xml");
        new DBUnitHelper().delete("/tabelas/Placa.xml");

    }

    @Test
    public void salvar() throws Exception {

    }

    @Test
    public void remover() throws Exception {

    }

    @Test
    public void localizar() throws Exception {

    }

    @Test
    public void todos() throws Exception {

    }

}