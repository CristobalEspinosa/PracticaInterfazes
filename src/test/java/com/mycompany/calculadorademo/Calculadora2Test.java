/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadorademo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author CristobalEspinosa 1889639@alu.murciaeduca.es
 */
public class Calculadora2Test {
    private static Calculadora instance = null;
    public Calculadora2Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        instance = new Calculadora(10,0);
    }
    
    @AfterAll
    public static void tearDownClass() {
        instance = null;
        System.out.println("Fin de todas las pruebas");
    }
    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
//        Calculadora instance = null;
        int expResult = 10;
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
//        Calculadora instance = null;
        int expResult = 0;
        int result = instance.multiplica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of divide method, of class Calculadora.
     */
//    @Test
//    public void testDivide() {
//        System.out.println("divide");
//        Calculadora instance = null;
//        int expResult = 0;
//        int result = instance.divide();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//
//    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
//        Calculadora instance = null;
        int expResult = 10;
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
//        Calculadora instance = null;
        boolean expResult = true;
        boolean result = instance.resta2();
        assertTrue( result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of divide2 method, of class Calculadora.
     */
    @Test
    public void testDivide2() {
        System.out.println("divide2");
//        Calculadora instance = null;
        Integer expResult = null;
        Integer result = instance.divide2();
        assertNull(result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of divide0 method, of class Calculadora.
     */
    @Test
    public void testDivide0() {
        System.out.println("divide0");
//        Calculadora instance = null;
         assertThrows(ArithmeticException.class, 
                 new Executable(){
            @Override
             public void execute() throws Throwable{
                instance.divide0();
            }
        });
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
