package aircel;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Chennai {
	@WebMethod
	public int dosum(int x,int y){
		return x+y;
	}
	

}
