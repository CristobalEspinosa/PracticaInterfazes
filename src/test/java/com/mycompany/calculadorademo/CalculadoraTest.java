/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadorademo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author CristobalEspinosa 1889639@alu.murciaeduca.es
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

//    @BeforeEach
//    public void setUp() throws Exception {
//    }
//
//    @AfterEach
//    public void tearDown() throws Exception {
//    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora (8,4);
        int expResult = 12;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        Calculadora instance = new Calculadora (10,2);
        int expResult = 20;
        int result = instance.multiplica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Calculadora instance = new Calculadora (50,2);
        int expResult = 25;
        int result = instance.divide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora instance = new Calculadora (5,2);
        int expResult = 3;
        int result = instance.resta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of resta2 method, of class Calculadora.
     */
    @Test
    public void testResta2() {
        System.out.println("resta2");
        Calculadora instance = new Calculadora (10,5);
        boolean expResult = true;
        boolean result = instance.resta2();
        assertEquals(expResult, result);
        //assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of divide2 method, of class Calculadora.
     */
    @Test
    public void testDivide2() {
        System.out.println("divide2");
        Calculadora instance = new Calculadora (10,0);
        Integer expResult = null;
        Integer result = instance.divide2();
        //assertEquals(expResult, result);
        assertNull(result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of divide0 method, of class Calculadora.
     */
    @Test
    public void testDivide0() {
        System.out.println("divide0");
        Calculadora instance = new Calculadora (10,0);
        assertThrows(ArithmeticException.class, new Executable(){
            public void execute() throws Throwable{
                instance.divide0();
            }
        });
        // TODO review the generated test code and remove the default call to fail.
        
            }
    
}
