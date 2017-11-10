package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public class StockData {
    @WebMethod
	@WebResult(name="resulatOutput") 
	public int constructure(@WebParam(name="ar0Input")String ar0){return 0;}
}
