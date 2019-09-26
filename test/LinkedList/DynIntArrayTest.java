/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import LinkedList.DynIntArray;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DynIntArrayTest {
    
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
     * Test of at method, of class DynIntArray.
     */
    @Test
    public void testAt_int01() {
        System.out.println("at method read");
        int i = 0;
        DynIntArray instance = new DynIntArray(3,4,7);
          System.out.println("Content "+instance.str());
          int result = instance.at(i);
        assertEquals(3, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("at method read success");
    }

    /**
     * Test of at method, of class DynIntArray.
     */
    @Test
    public void testAt_int_int() {
        System.out.println("at method write");
        int i = 1;
        DynIntArray instance = new DynIntArray(5,8,11,-3);
        System.out.println("Content "+instance.str());
        instance.at(i, instance.at(i)*2);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(16, instance.at(i));
        System.out.println("at method write success");
    }

    /**
     * Test of size method, of class DynIntArray.
     */
    @Test
    public void testSize() {
        System.out.println("size method");
        DynIntArray instance = new DynIntArray(11,2,7,6,12);
        System.out.println("Content "+instance.str());
        assertEquals(5, instance.size());
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("size method success");
    }

    /**
     * Test of isEmpty method, of class DynIntArray.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty test");
        DynIntArray instance = new DynIntArray();
        assertTrue(instance.isEmpty());
        instance = new DynIntArray(4,5,7);
        assertFalse(instance.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("isEmpty test success");
    }

    /**
     * Test of resize method, of class DynIntArray.
     */
    @Test
    public void testResize() {
        System.out.println("resize method test");
        DynIntArray instance = new DynIntArray(-1, 5, 4, 6, 7, 15);
        System.out.println("Content "+instance.str());
        instance.resize(3);
        assertTrue(instance.size()==3);
        assertEquals(5, instance.at(1));
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("resize method test success");
    }
    
}
