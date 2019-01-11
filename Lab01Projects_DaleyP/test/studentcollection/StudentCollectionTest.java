/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcollection;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import studentspec.StudentSpec;

/**
 *
 * @author patrickdaley1
 */
public class StudentCollectionTest {
    
    public StudentCollectionTest() {
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
     * Test of getCapacity method, of class StudentCollection.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        StudentCollection instance = new StudentCollection();
        int expResult = 0;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class StudentCollection.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        StudentCollection instance = new StudentCollection();
        instance.reset();
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class StudentCollection.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        StudentCollection instance = new StudentCollection();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class StudentCollection.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        StudentCollection instance = new StudentCollection();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentCount method, of class StudentCollection.
     */
    @Test
    public void testGetStudentCount() {
        System.out.println("getStudentCount");
        StudentCollection instance = new StudentCollection();
        int expResult = 0;
        int result = instance.getStudentCount();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpacesRemaining method, of class StudentCollection.
     */
    @Test
    public void testGetSpacesRemaining() {
        System.out.println("getSpacesRemaining");
        StudentCollection instance = new StudentCollection();
        int expResult = 0;
        int result = instance.getSpacesRemaining();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStudent method, of class StudentCollection.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        StudentSpec aStudent = null;
        StudentCollection instance = new StudentCollection();
        instance.addStudent(aStudent);
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveStudentBySID method, of class StudentCollection.
     */
    @Test
    public void testRetrieveStudentBySID() {
        System.out.println("retrieveStudentBySID");
        String sidKey = "";
        StudentCollection instance = new StudentCollection();
        StudentSpec expResult = null;
        StudentSpec result = instance.retrieveStudentBySID(sidKey);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeStudentBySID method, of class StudentCollection.
     */
    @Test
    public void testRemoveStudentBySID() {
        System.out.println("removeStudentBySID");
        String sidKey = "";
        StudentCollection instance = new StudentCollection();
        StudentSpec expResult = null;
        StudentSpec result = instance.removeStudentBySID(sidKey);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of createIterator method, of class StudentCollection.
     */
    @Test
    public void testCreateIterator() {
        System.out.println("createIterator");
        StudentCollection instance = new StudentCollection();
        Iterator<StudentSpec> expResult = null;
        Iterator<StudentSpec> result = instance.createIterator();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
