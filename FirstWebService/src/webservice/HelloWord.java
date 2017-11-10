package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="s1")
public class HelloWord {
    public void constructor()
    {
    	
    }   
    @WebMethod(action="sample",operationName="op1")
	public String printHellWord(String s)
	{
		return s;
	}
	
	
}
