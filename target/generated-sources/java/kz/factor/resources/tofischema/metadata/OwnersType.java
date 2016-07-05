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
import kz.factor.resources.tofischema.complextype.OwnerType;


/**
 * Тип описывающий владельцев данных
 * 
 * <p>Java class for OwnersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OwnersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Owner" type="{http://www.factor.kz/resources/TOFISchema/complextype}OwnerType" maxOccurs="unbounded"/>
 *         &lt;element name="OwnerRel" type="{http://www.factor.kz/resources/TOFISchema/complextype}OwnerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnersType", propOrder = {
    "owner",
    "ownerRel"
})
public class OwnersType {

    @XmlElement(name = "Owner", required = true)
    protected List<OwnerType> owner;
    @XmlElement(name = "OwnerRel")
    protected List<OwnerType> ownerRel;

    /**
     * Gets the value of the owner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the owner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OwnerType }
     * 
     * 
     */
    public List<OwnerType> getOwner() {
        if (owner == null) {
            owner = new ArrayList<OwnerType>();
        }
        return this.owner;
    }

    /**
     * Gets the value of the ownerRel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownerRel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnerRel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OwnerType }
     * 
     * 
     */
    public List<OwnerType> getOwnerRel() {
        if (ownerRel == null) {
            ownerRel = new ArrayList<OwnerType>();
        }
        return this.ownerRel;
    }

}
