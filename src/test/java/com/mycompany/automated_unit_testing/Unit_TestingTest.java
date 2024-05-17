/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automated_unit_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author scebe
 */
public class Unit_TestingTest {
    
    public Unit_TestingTest() {
    }

    @Test
    public void testAddition() {
        //Create instance of the class
        Unit_Testing ut = new Unit_Testing();
        int expected = 8;
        int actual = ut.addition(4,4);
        assertEquals(expected,actual);
    }

    @Test
    public void testSubstraction() {
        Unit_Testing ut = new Unit_Testing();
        int expected = 8;
        int actual = ut.substraction(10, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMessage() {
        Unit_Testing ut = new Unit_Testing();
        
        String expected = "Hello World!";
        String actual = ut.message();
        assertEquals(expected, actual);
    }
    
}
