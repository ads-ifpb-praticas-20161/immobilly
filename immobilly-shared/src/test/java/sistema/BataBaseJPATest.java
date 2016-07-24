/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.io.InputStream;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.ext.hsqldb.HsqldbDataTypeFactory;
import org.dbunit.operation.DatabaseOperation;
import org.hibernate.HibernateException;
import org.hibernate.impl.SessionImpl;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Aluísio
 */
public abstract class BataBaseJPATest {

    private static EntityManagerFactory entityManagerFactory;
    private static IDatabaseConnection connection;
    private static IDataSet dataset;
    protected static EntityManager entityManager;

    /**
     * Will load test-dataset.xml before each test case
     *
     * @throws DatabaseUnitException
     */
    @BeforeClass
    public static void iniciartEntityManager() throws HibernateException, DatabaseUnitException {
        entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
        entityManager = entityManagerFactory.createEntityManager();
        connection = new DatabaseConnection(((SessionImpl) (entityManager.getDelegate())).connection());
        connection.getConfig().setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new HsqldbDataTypeFactory());
        FlatXmlDataSetBuilder flatXmlDataSetBuilder = new FlatXmlDataSetBuilder();
        flatXmlDataSetBuilder.setColumnSensing(true);
        InputStream dataSet = Thread.currentThread().getContextClassLoader().getResourceAsStream("src/test/java/placa.xml");
        dataset = flatXmlDataSetBuilder.build(dataSet);
    }

    /**
     *
     */
    @AfterClass
    public static void closeEntityManager() throws HibernateException, NullPointerException {
        entityManagerFactory.close();
        entityManager.close();
    }

    /**
     * Will clean the dataBase before each test
     *
     * @throws SQLException
     * @throws DatabaseUnitException
     */
    @Before
    public void cleanDB() throws DatabaseUnitException, SQLException {
        DatabaseOperation.CLEAN_INSERT.execute(connection, dataset);
    }

}
