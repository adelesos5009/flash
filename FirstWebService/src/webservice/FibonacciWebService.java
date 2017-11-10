package webservice;

import javax.jws.WebService;

@WebService
public class FibonacciWebService {
	
	 public void constructor()
	    {
	    	
	    }   
	
	public long findfibonacciNumber(int number)
	{
	   return	Fib.fib_2(number);
	}
}
