package ejemplo_junitTests;

import ejemplo_junit.Test1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test1Test {
    
    public Test1Test() {
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
        int a = 2;
        int b = 2;
        Test1 instance = new Test1();
        int expResult =4 ;
        int result = instance.multiplica(a, b);
        assertEquals(expResult, result);

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
    
}
