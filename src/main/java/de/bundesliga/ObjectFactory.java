//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.10.25 um 12:57:47 PM CEST 
//


package de.bundesliga;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.bundesliga package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.bundesliga
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSpielRequest }
     * 
     */
    public GetSpielRequest createGetSpielRequest() {
        return new GetSpielRequest();
    }

    /**
     * Create an instance of {@link GetSpielResponse }
     * 
     */
    public GetSpielResponse createGetSpielResponse() {
        return new GetSpielResponse();
    }

    /**
     * Create an instance of {@link Spiel }
     * 
     */
    public Spiel createSpiel() {
        return new Spiel();
    }

}
