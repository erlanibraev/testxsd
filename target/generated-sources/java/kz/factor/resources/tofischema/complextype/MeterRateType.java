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
 * Тип описывающий показатель, дочерние элементы измерителя.
 * 
 * <p>Java class for MeterRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeterRateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.factor.kz/resources/TOFISchema/complextype}NameableType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="FactorVal" type="{http://www.factor.kz/resources/TOFISchema/complextype}FactorValType" maxOccurs="unbounded"/>
 *         &lt;element name="MeterRate" type="{http://www.factor.kz/resources/TOFISchema/complextype}MeterRateType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MeterRateType", propOrder = {
    "factorVal",
    "meterRate"
})
public class MeterRateType
    extends NameableType
{

    @XmlElement(name = "FactorVal")
    protected List<FactorValType> factorVal;
    @XmlElement(name = "MeterRate")
    protected List<MeterRateType> meterRate;
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
     * Gets the value of the meterRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterRateType }
     * 
     * 
     */
    public List<MeterRateType> getMeterRate() {
        if (meterRate == null) {
            meterRate = new ArrayList<MeterRateType>();
        }
        return this.meterRate;
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
