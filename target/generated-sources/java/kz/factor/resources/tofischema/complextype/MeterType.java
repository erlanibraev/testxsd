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
import kz.factor.resources.tofischema.simpletype.PropertyStructureType;
import kz.factor.resources.tofischema.simpletype.UpdateType;


/**
 * Тип описывающий измеритель.
 * 
 * <p>Java class for MeterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeterType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.factor.kz/resources/TOFISchema/complextype}NameableType">
 *       &lt;sequence>
 *         &lt;element name="Factor" type="{http://www.factor.kz/resources/TOFISchema/complextype}FactorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MeterRate" type="{http://www.factor.kz/resources/TOFISchema/complextype}MeterRateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MeasureBase" type="{http://www.factor.kz/resources/TOFISchema/complextype}MeasureBaseType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MeterStructure" type="{http://www.factor.kz/resources/TOFISchema/simpletype}PropertyStructureType" />
 *       &lt;attribute name="Update" type="{http://www.factor.kz/resources/TOFISchema/simpletype}UpdateType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterType", propOrder = {
    "factor",
    "meterRate",
    "measureBase"
})
public class MeterType
    extends NameableType
{

    @XmlElement(name = "Factor")
    protected List<FactorType> factor;
    @XmlElement(name = "MeterRate")
    protected List<MeterRateType> meterRate;
    @XmlElement(name = "MeasureBase")
    protected MeasureBaseType measureBase;
    @XmlAttribute(name = "MeterStructure")
    protected PropertyStructureType meterStructure;
    @XmlAttribute(name = "Update")
    protected UpdateType update;

    /**
     * Gets the value of the factor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FactorType }
     * 
     * 
     */
    public List<FactorType> getFactor() {
        if (factor == null) {
            factor = new ArrayList<FactorType>();
        }
        return this.factor;
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
     * Gets the value of the measureBase property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureBaseType }
     *     
     */
    public MeasureBaseType getMeasureBase() {
        return measureBase;
    }

    /**
     * Sets the value of the measureBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureBaseType }
     *     
     */
    public void setMeasureBase(MeasureBaseType value) {
        this.measureBase = value;
    }

    /**
     * Gets the value of the meterStructure property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyStructureType }
     *     
     */
    public PropertyStructureType getMeterStructure() {
        return meterStructure;
    }

    /**
     * Sets the value of the meterStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyStructureType }
     *     
     */
    public void setMeterStructure(PropertyStructureType value) {
        this.meterStructure = value;
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
