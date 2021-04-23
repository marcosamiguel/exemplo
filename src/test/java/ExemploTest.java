/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.Main;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miguel
 */
public class ExemploTest {
    
    public ExemploTest() {
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
    public void validar() {
        assertEquals(true, Main.validar());
    }
    
    @Test
    public void testar() {
        assertEquals(true, Main.testar());
    }


    @Test
    public void testar2() {
        assertEquals(true, Main.testar());
    }

    @Test
    public void testar3() {
        assertEquals(true, Main.testar());
    }

    @Test
    public void main() {
        assertEquals(true, Main.testarCriacoes());
        
        //teste
    }
    
}
