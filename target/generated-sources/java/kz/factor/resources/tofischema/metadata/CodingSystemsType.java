//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.05 at 04:56:54 PM ALMT 
//


package kz.factor.resources.tofischema.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import kz.factor.resources.tofischema.complextype.CodingSystemType;


/**
 * Сиcтемы кодирования.
 * 
 * <p>Java class for CodingSystemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodingSystemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodingSystem" type="{http://www.factor.kz/resources/TOFISchema/complextype}CodingSystemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodingSystemsType", propOrder = {
    "codingSystem"
})
public class CodingSystemsType {

    @XmlElement(name = "CodingSystem", required = true)
    protected CodingSystemType codingSystem;

    /**
     * Gets the value of the codingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link CodingSystemType }
     *     
     */
    public CodingSystemType getCodingSystem() {
        return codingSystem;
    }

    /**
     * Sets the value of the codingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodingSystemType }
     *     
     */
    public void setCodingSystem(CodingSystemType value) {
        this.codingSystem = value;
    }

}
