
package LinkedList;

import LinkedList.Cube;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CubeTest {
    
    public CubeTest() {
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


    /**
     * Test of sumSquare method, of class Cube.
     */
    @Test
    public void testSumSquare() {
        System.out.println("sumSquare test");
        Cube instance = new Cube(5);
        double expResult = 150;
        double result = instance.sumSquare();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test of sum square is correct.");
    }

    /**
     * Test of volume method, of class Cube.
     */
    @Test
    public void testVolume() {
        System.out.println("volume test");
        Cube instance = new Cube(5);
        double expResult = 125;
        double result = instance.volume();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test of volume is correct.");
    }

    /**
     * Test of diagonal method, of class Cube.
     */
    @Test
    public void testDiagonal() {
        System.out.println("diagonal test");
        Cube instance = new Cube(5);
        double expResult = 9;
        double result = instance.diagonal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test of diagonal is correct.");
    }
    
}
