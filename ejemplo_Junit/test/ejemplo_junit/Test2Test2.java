package ejemplo_junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class Test2Test2 {
    
    public Test2Test2() {
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
    public void testMultiplica() {
        System.out.println("multiplica");
        int a = 0;
        int b = 0;
        Test1 instance = new Test1();
        int expResult = 0;
        int result = instance.multiplica(a, b);
        assertEquals(expResult, result);

    }

    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int numero = 0;
        Test1 instance = new Test1();
        int expResult = 0;
        int result = instance.factorial(numero);
        assertEquals(expResult, result);
        
    }
    
}
