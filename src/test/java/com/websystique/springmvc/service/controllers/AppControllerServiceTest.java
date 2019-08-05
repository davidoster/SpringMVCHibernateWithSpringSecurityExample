/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.springmvc.service.controllers;

import com.websystique.springmvc.model.User;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.ModelMap;

/**
 *
 * @author George.Pasparakis
 */
public class AppControllerServiceTest {
    
    public AppControllerServiceTest() {
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
     * Test of findAllUsers method, of class AppControllerService.
     */
    @Test
    public void testFindAllUsers() {
        System.out.println("findAllUsers");
        AppControllerService instance = new AppControllerService();
        List<User> expResult = instance.findAllUsers();
        List<User> result = instance.findAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modelAddAttribute method, of class AppControllerService.
     */
    @Test
    public void testModelAddAttribute_Users() {
        System.out.println("modelAddAttribute");
        ModelMap model = new ModelMap();
        String name = "";
        Object o = instance.findAllUsers();
        AppControllerService instance = new AppControllerService();
        ModelMap expResult = instance.modelAddAttribute(model, name, o);
        ModelMap result = instance.modelAddAttribute(model, name, o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testModelAddAttribute_Principal() {
        System.out.println("modelAddAttribute");
        ModelMap model = new ModelMap();
        String name = "";
        Object o = this.testGetPrincipal();
        AppControllerService instance = new AppControllerService();
        ModelMap expResult = instance.modelAddAttribute(model, name, o);
        ModelMap result = instance.modelAddAttribute(model, name, o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrincipal method, of class AppControllerService.
     */
    @Test
    public void testGetPrincipal() {
        System.out.println("getPrincipal");
        AppControllerService instance = new AppControllerService();
        String expResult = "";
        String result = instance.getPrincipal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
