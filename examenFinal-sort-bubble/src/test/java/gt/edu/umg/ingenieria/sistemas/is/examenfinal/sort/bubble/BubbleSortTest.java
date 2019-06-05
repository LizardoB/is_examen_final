/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lizardo
 */
public class BubbleSortTest {
    
    public BubbleSortTest() {
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
     * Test of sortBasic method, of class BubbleSort.
     */
    @Test
    public void EntradaNula() {
        System.out.println("TEST #1 - ENTRADA NULA");
        
        //given
        int[] numeros = null;
        
        int[] resultadoEsperado = null;
        
        //when
        int[] resultadoObtenido = BubbleSort.sortBasic(numeros);
        
        //then
        assertArrayEquals("TEST #1 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void EntradaUnica() {
        System.out.println("TEST #2 - ENTRADA UNICA");
        
        //given
        int[] numeros = {1};
        
        int[] resultadoEsperado = {1};
        
        //when
        int[] resultadoObtenido = BubbleSort.sortBasic(numeros);
        
        //then
        assertArrayEquals("TEST #2 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void EntradaVacia() {
        System.out.println("TEST #3 - ENTRADA NULA");
        
        //given
        int[] numeros = {};
        
        int[] resultadoEsperado = {};
        
        //when
        int[] resultadoObtenido = BubbleSort.sortBasic(numeros);
        
        //then
        assertArrayEquals("TEST #3 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void EntradaNumerosExtensos() {
        System.out.println("TEST #4 - ENTRADA NUMEROS EXTENSOS");
        
        //given
        int[] numeros = {25000,15000,12000,30000,60000,10000};
        
        int[] resultadoEsperado = {10000,12000,15000,25000,30000,60000};
        
        //when
        int[] resultadoObtenido = BubbleSort.sortBasic(numeros);
        
        //then
        assertArrayEquals("TEST #4 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void EntradaNumerosCortos() {
        System.out.println("TEST #5 - ENTRADA NUMEROS CORTOS");
        
        //given
        int[] numeros = {25,15,12,30,60,10};
        
        int[] resultadoEsperado = {10,12,15,25,30,60};
        
        //when
        int[] resultadoObtenido = BubbleSort.sortBasic(numeros);
        
        //then
        assertArrayEquals("TEST #5 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
}
