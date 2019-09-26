/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import LinkedList.OneLinkedList;
import LinkedList.OneLinkedNote;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class OneLinkedListTest {
    
    public OneLinkedListTest() {
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
     * Test of addFirst method, of class OneLinkedList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("test addFirst");
        OneLinkedList instance = new OneLinkedList();
        instance.addFirst(90);
        assertEquals(instance.getRoot().getData(),90);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test of addFirst is successful");
    }

    /**
     * Test of addLast method, of class OneLinkedList.
     */
    @Test
    public void testAddLast() {
        System.out.println("test addLast");
        int data = 90,datalast = 100;
        OneLinkedList instance = new OneLinkedList();
        instance.addFirst(data);
        instance.addLast(datalast);
        datalast = 110;
        instance.addLast(datalast);
        OneLinkedNote node = instance.getRoot();
        while(node.next()!=null)
            node = node.next();
        assertEquals(node.getData(),datalast);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test of addLast is successful");
    }

    /**
     * Test of removeFirst method, of class OneLinkedList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst test");
        OneLinkedList instance = new OneLinkedList();
        instance.addFirst(70);
        instance.addLast(80);
        instance.addLast(90);
        instance.addLast(100);
        instance.removeFirst();
        assertEquals(instance.getRoot().getData(),80);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test of removeFirst is successful");
    }

    /**
     * Test of removeLast method, of class OneLinkedList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        OneLinkedList instance = new OneLinkedList();
        instance.addFirst(70);
        instance.addLast(80);
        instance.addLast(90);
        instance.addLast(100);
        instance.removeLast();
        OneLinkedNote node = instance.getRoot();
        while(node.next()!=null)
            node = node.next();
        assertEquals(node.getData(),90);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test of removeLast is successful");
    }

    /**
     * Test of find method, of class OneLinkedList.
     */
    @Test
    public void testFind() {
        System.out.println("find test");
        OneLinkedList instance = new OneLinkedList();
        instance.addFirst(70);
        instance.addLast(80);
        instance.addLast(90);
        instance.addLast(100);
        OneLinkedNote res = instance.find(90);
        assertEquals(res.getData(),90);
        
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test of find is successful");
    }

    /**
     * Test of count method, of class OneLinkedList.
     */
    @Test
    public void testCount() {
        System.out.println("count test");
        OneLinkedList instance = new OneLinkedList();
        instance.addFirst(70);
        instance.addLast(80);
        instance.addLast(90);
        instance.addLast(100);
        instance.removeFirst();
        instance.removeLast();
        instance.addFirst(70);
        instance.addLast(80);
        instance.addLast(90);
        instance.addLast(100);
        assertEquals(instance.count(),6);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test of count is successful");
    }

    /**
     * Test of reverse method, of class OneLinkedList.
     */
    @Test
    public void testReverse() {
        System.out.println("reverse test");
        OneLinkedList instance = new OneLinkedList();
        instance.addFirst(1);
        instance.addLast(2);
        instance.addLast(3);
        instance.addLast(4);
        instance.addLast(5);
        instance.reverse();
        boolean res = true;
        OneLinkedNote node = instance.getRoot();
        for(int i = 5; i>0; i--)
        {
            if(node.getData()==i)
                node = node.next();
            else
            {
                res = false;
                break;
            }
        }
        assertTrue(res);
        
        System.out.println("The test of reverse is successful");
    }

    /**
     * Test of sort method, of class OneLinkedList.
     */
    @Test
    public void testSort() {
        System.out.println("sort test");
        OneLinkedList instance = new OneLinkedList();
        instance.addFirst(1);
        instance.addLast(3);
        instance.addLast(5);
        instance.addLast(4);
        instance.addLast(2);
        instance.sort();
        boolean res = true;
        OneLinkedNote node = instance.getRoot();
        for(int i = 1; i<6; i++)
        {
            if(node.getData()==i)
                node = node.next();
            else
            {
                res = false;
                break;
            }
        }
        assertTrue(res);
        
        System.out.println("The test of sort is successful");
    }
    
}
