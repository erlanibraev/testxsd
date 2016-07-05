//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.05 at 04:56:54 PM ALMT 
//


package kz.factor.resources.tofischema.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import kz.factor.resources.tofischema.complextype.PropertyContainerType;


/**
 * Тип описывающий контейнеры свойств.
 * 
 * <p>Java class for PropertiesContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertiesContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PropertyContainer" type="{http://www.factor.kz/resources/TOFISchema/complextype}PropertyContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertiesContainerType", propOrder = {
    "propertyContainer"
})
public class PropertiesContainerType {

    @XmlElement(name = "PropertyContainer")
    protected List<PropertyContainerType> propertyContainer;

    /**
     * Gets the value of the propertyContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyContainerType }
     * 
     * 
     */
    public List<PropertyContainerType> getPropertyContainer() {
        if (propertyContainer == null) {
            propertyContainer = new ArrayList<PropertyContainerType>();
        }
        return this.propertyContainer;
    }

}