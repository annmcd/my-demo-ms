package ie.aib.msf.core;

/**Ann McDonald April 2017
 * Test Project for CI/CD Process **/

public class Calculator {
	
	long x=0;
	long y=0;
		
	
	public Calculator(long a, long b) {
		
		x=a;
		y=b;
	}
	

		
	public long add(){
		System.out.println(" x = " + x );
		System.out.println(" y = " + y );
		
		return x+y;
	}
	
	
	public long subtract(){
		
		return x-y;
		
	}
	
		
	public long multiply(){
		
		return x*y;
		
	}
	
	
	public long divide(){
		 
		return x/y;
	}
	
}
