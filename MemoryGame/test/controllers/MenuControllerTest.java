/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

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
public class MenuControllerTest {
    
    public MenuControllerTest() {
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
     * Test of start method, of class MenuController.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        MenuController instance = new MenuController();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tworcy method, of class MenuController.
     */
    @Test
    public void testTworcy() {
        System.out.println("tworcy");
        MenuController instance = new MenuController();
        instance.tworcy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wyjscie method, of class MenuController.
     */
    @Test
    public void testWyjscie() {
        System.out.println("wyjscie");
        MenuController instance = new MenuController();
        instance.wyjscie();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMainController method, of class MenuController.
     */
    @Test
    public void testGetMainController() {
        System.out.println("getMainController");
        MenuController instance = new MenuController();
        MainController expResult = null;
        MainController result = instance.getMainController();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMainController method, of class MenuController.
     */
    @Test
    public void testSetMainController() {
        System.out.println("setMainController");
        MainController mainController = null;
        MenuController instance = new MenuController();
        instance.setMainController(mainController);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
