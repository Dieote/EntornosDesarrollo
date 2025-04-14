package ejemplo_junitTests;


import ejemplo_junit.Test4ConversorMoneda;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test4Test4ConversorMoneda {
    
    public Test4Test4ConversorMoneda() {
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

    @Test
    public void testDolarAEuro() {
        double resultado1 = Test4ConversorMoneda.dolarAEuro(10.5);
            assertEquals(12.35, resultado1, 0.01);      
    }
    
    @Test
    public void testEuroADolar() {
        double resultado3 = Test4ConversorMoneda.euroADolar(20.3);
            assertEquals(17.26, resultado3, 0.01);
       
    }
}

//Tabajo Actividad Diego Gomez