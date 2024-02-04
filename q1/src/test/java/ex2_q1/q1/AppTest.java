package ex2_q1.q1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void B_partitionCheckMin() {
    	String expected = "B";
    	String result = App.GradeTest(80);
    	assertEquals(expected, result);
    	
    }
    @Test
    public void B_partitionCheckMinPlusOne() {
    	String expected = "B";
    	String result = App.GradeTest(81);
    	assertEquals(expected, result);
    
    }
    @Test
    public void B_partitionCheckNuminal() {
    	String expected = "B";
    	String result = App.GradeTest(85);
    	assertEquals(expected, result);
    
    }
    @Test
    public void B_partitionCheckMaxMinusOne() {
    	String expected = "B";
    	String result = App.GradeTest(88);
    	assertEquals(expected, result);
    
    }
    @Test
    public void B_partitionCheckMax() {
    	String expected = "B";
    	String result = App.GradeTest(89);
    	assertEquals(expected, result);
    
    }
}
