//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.10.25 um 12:57:47 PM CEST 
//


package de.bundesliga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spiel" type="{http://bundesliga.de}spiel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "spiel"
})
@XmlRootElement(name = "getSpielResponse")
public class GetSpielResponse {

    @XmlElement(required = true)
    protected Spiel spiel;

    /**
     * Ruft den Wert der spiel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Spiel }
     *     
     */
    public Spiel getSpiel() {
        return spiel;
    }

    /**
     * Legt den Wert der spiel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Spiel }
     *     
     */
    public void setSpiel(Spiel value) {
        this.spiel = value;
    }

}
