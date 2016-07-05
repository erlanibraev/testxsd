//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.05 at 04:56:54 PM ALMT 
//


package kz.factor.resources.tofischema.complextype;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import kz.factor.resources.tofischema.simpletype.UpdateType;


/**
 * Тип описывающий конкретного фактора
 * 
 * <p>Java class for FactorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FactorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.factor.kz/resources/TOFISchema/complextype}NameableType">
 *       &lt;sequence>
 *         &lt;element name="FactorVal" type="{http://www.factor.kz/resources/TOFISchema/complextype}FactorValType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Update" type="{http://www.factor.kz/resources/TOFISchema/simpletype}UpdateType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FactorType", propOrder = {
    "factorVal"
})
public class FactorType
    extends NameableType
{

    @XmlElement(name = "FactorVal", required = true)
    protected List<FactorValType> factorVal;
    @XmlAttribute(name = "Update")
    protected UpdateType update;

    /**
     * Gets the value of the factorVal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factorVal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactorVal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FactorValType }
     * 
     * 
     */
    public List<FactorValType> getFactorVal() {
        if (factorVal == null) {
            factorVal = new ArrayList<FactorValType>();
        }
        return this.factorVal;
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType }
     *     
     */
    public UpdateType getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType }
     *     
     */
    public void setUpdate(UpdateType value) {
        this.update = value;
    }

}
