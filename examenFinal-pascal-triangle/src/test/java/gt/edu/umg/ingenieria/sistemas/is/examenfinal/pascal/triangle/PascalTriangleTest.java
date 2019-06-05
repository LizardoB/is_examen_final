/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

import java.util.Arrays;
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
public class PascalTriangleTest {
    
    public PascalTriangleTest() {
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

    
    @Test
    public void EntradaNula() {
        System.out.println("TEST #1 - ENTRADA NUMERO MENOR A 0");
        PascalTriangle instance = new PascalTriangle();
        
        //given
        int levels = -1;
        
        String resultadoEsperado = Arrays.toString(new long[0]);
        
        //when
        String resultadoObtenido = instance.build(levels);
        
        //then
        assertEquals("TEST #1 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void EntradaMenorOCero() {
        System.out.println("TEST #2 - ENTRADA NUMERO IGUAL A 0");
        PascalTriangle instance = new PascalTriangle();
        
        //given
        int levels = 0;
        
        String resultadoEsperado = Arrays.toString(new long[0]);
        
        //when
        String resultadoObtenido = instance.build(levels);
        
        //then
        assertEquals("TEST #2 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
}
