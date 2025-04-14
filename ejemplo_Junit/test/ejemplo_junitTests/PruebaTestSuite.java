package ejemplo_junitTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
       // {FactorialTest.class, MultiplicaTest.class}
        {Test3Test3Conversor.class, Test4Test4ConversorMoneda.class}
)
public class PruebaTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
        //Actividad Evaluable Diego Gomez

}
