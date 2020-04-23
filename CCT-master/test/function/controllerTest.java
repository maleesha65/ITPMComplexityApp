/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pamuditha
 */
public class controllerTest {
    FileReader reader;
    
    public controllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getArithmatic method, of class controller.
     */
    @Test
    public void testGetArithmatic() {
        System.out.println("getArithmatic");
        controller instance = new controller();
        String[] expResult = {"+", "-", ".", "/"};
        String[] result = instance.getArithmatic();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of getLogical method, of class controller.
     */
    @Test
    public void testGetLogical() {
        System.out.println("getLogical");
        controller instance = new controller();
        String[] expResult = null;
        String[] result = instance.getLogical();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of getRelation method, of class controller.
     */
    @Test
    public void testGetRelation() {
        System.out.println("getRelation");
        controller instance = new controller();
        String[] expResult = null;
        String[] result = instance.getRelation();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of getBitwise method, of class controller.
     */
    @Test
    public void testGetBitwise() {
        System.out.println("getBitwise");
        controller instance = new controller();
        String[] expResult = null;
        String[] result = instance.getBitwise();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of getMiscellaneous method, of class controller.
     */
    @Test
    public void testGetMiscellaneous() {
        System.out.println("getMiscellaneous");
        controller instance = new controller();
        String[] expResult = null;
        String[] result = instance.getMiscellaneous();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of getAssignment method, of class controller.
     */
    @Test
    public void testGetAssignment() {
        System.out.println("getAssignment");
        controller instance = new controller();
        String[] expResult = null;
        String[] result = instance.getAssignment();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of getKeywords method, of class controller.
     */
    @Test
    public void testGetKeywords() {
        System.out.println("getKeywords");
        controller instance = new controller();
        String[] expResult = null;
        String[] result = instance.getKeywords();
        assertArrayEquals(expResult, result);
       
    }

    /**
     * Test of getManipulators method, of class controller.
     */
    @Test
    public void testGetManipulators() {
        System.out.println("getManipulators");
        controller instance = new controller();
        String[] expResult = null;
        String[] result = instance.getManipulators();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of getText method, of class controller.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        controller instance = new controller();
        String[] expResult = null;
        String[] result = instance.getText();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of analyzer method, of class controller.
     */
    @Test
    public void testAnalyzer() {
        System.out.println("analyzer");
        
        try {
            reader = new FileReader("/home/pamuditha/Desktop/codeComplexity/sample.java");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(controllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        controller instance = new controller();
        int expResult = 14;
        int result = instance.analyzer(reader);
        assertEquals(expResult, result);
        
    }
    
}
