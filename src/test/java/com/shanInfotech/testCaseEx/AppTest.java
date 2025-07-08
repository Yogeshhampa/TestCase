package com.shanInfotech.testCaseEx;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
        Calculate c=new Calculate();
        assertEquals(9, c.add(4, 5));
        assertEquals(9, c.add(3, 6));
        
    }
    @Test
    public void testArea() {
    	Calculate c=new Calculate();
    	assertEquals(12, c.areaOfCircle(2));
    	assertEquals(9, c.areaOfCircle(3));
    }
    
}
