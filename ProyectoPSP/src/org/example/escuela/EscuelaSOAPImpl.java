
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.example.escuela;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-02-25T19:10:23.608+01:00
 * Generated source version: 3.3.5
 *
 */

@javax.jws.WebService(
                      serviceName = "escuela",
                      portName = "escuelaSOAP",
                      targetNamespace = "http://www.example.org/escuela/",
                      wsdlLocation = "file:/C:/Users/gemel/eclipse-workspace/ProyectoPSP/WebContent/WSDL-APP/WSDLFile.wsdl",
                      endpointInterface = "org.example.escuela.Escuela")

public class EscuelaSOAPImpl implements Escuela {

    private static final Logger LOG = Logger.getLogger(EscuelaSOAPImpl.class.getName());

    /* (non-Javadoc)
     * @see org.example.escuela.Escuela#escuelaalumno(org.example.escuela.AlumnoRequest parameters)*
     */
    public org.example.escuela.AlumnoResponse escuelaalumno(AlumnoRequest parameters) {
        LOG.info("Executing operation escuelaalumno");
        System.out.println(parameters);
        try {
            org.example.escuela.AlumnoResponse _return = new org.example.escuela.AlumnoResponse();
            _return.setGreet("Greet-1679932805");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.example.escuela.Escuela#escuelaasignatura(org.example.escuela.AsignaturaRequest parameters)*
     */
    public org.example.escuela.AsignaturaResponse escuelaasignatura(AsignaturaRequest parameters) {
        LOG.info("Executing operation escuelaasignatura");
        System.out.println(parameters);
        try {
            org.example.escuela.AsignaturaResponse _return = new org.example.escuela.AsignaturaResponse();
            _return.setGreet("Greet-1731107057");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}