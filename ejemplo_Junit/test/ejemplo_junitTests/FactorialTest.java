package ejemplo_junitTests;

import ejemplo_junit.Test1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    
    public FactorialTest() {
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
    public void testFactorial() {
        System.out.println("factorial");
        int numero = 3;
        Test1 instance = new Test1();
        int expResult = 6;
        int result = instance.factorial(numero);
        assertEquals(expResult, result);
        
    }
    //Actividad Evaluable Diego Gomez
}
