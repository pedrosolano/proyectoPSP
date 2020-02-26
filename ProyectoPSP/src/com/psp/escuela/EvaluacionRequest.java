
package com.psp.escuela;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="namealumno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asignatura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "namealumno",
    "asignatura",
    "nota"
})
@XmlRootElement(name = "evaluacionRequest")
public class EvaluacionRequest {

    @XmlElement(required = true)
    protected String namealumno;
    @XmlElement(required = true)
    protected String asignatura;
    @XmlElement(required = true)
    protected String nota;

    /**
     * Obtiene el valor de la propiedad namealumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamealumno() {
        return namealumno;
    }

    /**
     * Define el valor de la propiedad namealumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamealumno(String value) {
        this.namealumno = value;
    }

    /**
     * Obtiene el valor de la propiedad asignatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsignatura() {
        return asignatura;
    }

    /**
     * Define el valor de la propiedad asignatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsignatura(String value) {
        this.asignatura = value;
    }

    /**
     * Obtiene el valor de la propiedad nota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota() {
        return nota;
    }

    /**
     * Define el valor de la propiedad nota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota(String value) {
        this.nota = value;
    }

}
