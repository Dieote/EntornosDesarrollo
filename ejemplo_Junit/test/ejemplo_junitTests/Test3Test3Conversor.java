package ejemplo_junitTests;


import ejemplo_junit.Test1;
import ejemplo_junit.Test3Conversor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test3Test3Conversor {
    
    public Test3Test3Conversor() {
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
    public void testFahrenheitToCelsius() {
        double resultado1 = Test3Conversor.fahrenheitToCelsius(-40);
            assertEquals(-40, resultado1, 0.01);

        double resultado2 = Test3Conversor.fahrenheitToCelsius(32);
            assertEquals(0, resultado2, 0.01);
    }
    
    @Test
    public void testCelsiusToFahrenheit() {
        double resultado3 = Test3Conversor.celsiusToFahrenheit(-5);
            assertEquals(23, resultado3, 0.01);

        double resultado4 = Test3Conversor.celsiusToFahrenheit(15);
            assertEquals(59, resultado4, 0.01);
    
    }
}

//Tabajo Actividad Diego Gomez