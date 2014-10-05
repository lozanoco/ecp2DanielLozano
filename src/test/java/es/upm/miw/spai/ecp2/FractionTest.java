package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction f,f2,f3,f4;
    

    @Before 
    public void before() { 
        f = new Fraction(2, 3); 
        f2 = new Fraction(4, 6);
        f3 = new Fraction(10, 2);
        f4 = new Fraction(1, 2);
    } 

    @Test 
    public void testFractionIntInt() { 
        assertEquals(2, f.getNumerator()); 
        assertEquals(3, f.getDenominator()); 
    } 

    @Test
    public void testDecimal() {
        assertEquals(0.66, f.decimal(), 0.01);
    }
    
    
    @Test
    public void isPropia() {
    	assertEquals(true, f.isPropia());
    }
    
    @Test
    public void testIsEquivalente() {
        assertEquals(true, f.isEquivalente(f,f2));
    }
    
    @Test
    public void testIsMayor() {
        assertEquals(true, f3.isMayor(f2));
    }
    
    @Test
    public void testSumar() {
        assertEquals(1, f.suma(f4, f4), 0.1);
    }

}
