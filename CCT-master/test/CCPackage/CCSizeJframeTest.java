/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCPackage;

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
public class CCSizeJframeTest {
    
    public CCSizeJframeTest() {
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
     * Test of lineCounter method, of class Home.
     */
    @Test
    public void testLineCounter() throws Exception {
        System.out.println("lineCounter");
        String path = "";
        int expResult = 0;
        int result = Home.lineCounter(path);
        assertEquals(expResult, result);
        
    }

  
    
}
