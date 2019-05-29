/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javafx.scene.layout.Pane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author madzia
 */
public class MainControllerTest {
    
    public MainControllerTest() {
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
     * Test of initialize method, of class MainController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        MainController instance = new MainController();
        instance.initialize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScreen method, of class MainController.
     */
    @Test
    public void testSetScreen() {
        System.out.println("setScreen");
        Pane pane = null;
        MainController instance = new MainController();
        instance.setScreen(pane);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
