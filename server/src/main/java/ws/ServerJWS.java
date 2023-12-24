package ws;

import javax.xml.ws.Endpoint;

public class ServerJWS {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7878/", new BanqueService());
        System.out.println("Web service deployé");
    }
}
