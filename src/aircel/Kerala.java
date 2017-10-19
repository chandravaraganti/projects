package aircel;

import javax.xml.ws.Endpoint;

public class Kerala {

	public static void main(String[] args) {

String addr="http://localhost:7888/sample/rest";
    Chennai ch=new Chennai();
    Endpoint.publish(addr, ch);
    System.out.println("success");

	}

}
