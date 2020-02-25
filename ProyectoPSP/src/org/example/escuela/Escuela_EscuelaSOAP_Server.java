
package org.example.escuela;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-02-25T19:10:23.667+01:00
 * Generated source version: 3.3.5
 *
 */

public class Escuela_EscuelaSOAP_Server{

    protected Escuela_EscuelaSOAP_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new EscuelaSOAPImpl();
        String address = "http://localhost:8081/ProyectoPSP/services/escuelaSOAP";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws java.lang.Exception {
        new Escuela_EscuelaSOAP_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}