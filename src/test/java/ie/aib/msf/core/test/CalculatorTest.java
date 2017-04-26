package ie.aib.msf.core.test;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
import junit.framework.TestCase;
import ie.aib.msf.core.Calculator;

public class CalculatorTest extends TestCase {



	Calculator calc;
	
	   @Before
	    public void setUp() throws Exception {
		   long a = 10;
		   long b = 7;
	
	       calc = new Calculator(a, b);
	    }
	   
	   
	    @Test
	    public void testAdd() {
	        Assert.assertEquals(17, calc.add());
	    }
		    
	    
	    @Test
	    public void testSubtract() {
	        Assert.assertEquals(3, calc.subtract());
	    }
	    
	    @Test
	    public void testMultiply() {
	        Assert.assertEquals(70, calc.multiply());
	    }
	
	   @Test
	    public void testDivide() {
	        Assert.assertEquals(1, calc.divide());
	    }
	

}
