//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.05 at 04:56:54 PM ALMT 
//


package kz.factor.resources.tofischema.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import kz.factor.resources.tofischema.simpletype.PeriodTypeType;


/**
 * <p>Java class for DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeOwner" type="{http://www.factor.kz/resources/TOFISchema/data}EntityRef"/>
 *         &lt;element name="CodeProperty" type="{http://www.factor.kz/resources/TOFISchema/data}EntityRef"/>
 *         &lt;element name="CodeStatus" type="{http://www.factor.kz/resources/TOFISchema/data}EntityRef" minOccurs="0"/>
 *         &lt;element name="CodeProvider" type="{http://www.factor.kz/resources/TOFISchema/data}EntityRef" minOccurs="0"/>
 *         &lt;element name="PeriodType" type="{http://www.factor.kz/resources/TOFISchema/simpletype}PeriodTypeType" minOccurs="0"/>
 *         &lt;element name="DateBegin" type="{http://www.factor.kz/resources/TOFISchema/simpletype}ValidateDate" minOccurs="0"/>
 *         &lt;element name="CodeMeasure" type="{http://www.factor.kz/resources/TOFISchema/data}EntityRef" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="ValueId" type="{http://www.factor.kz/resources/TOFISchema/data}EntityRef" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="ValueNum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *           &lt;element name="ValueDate" type="{http://www.factor.kz/resources/TOFISchema/simpletype}ValidateDate" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="ValueDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="ValueFile" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="ValueString" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="ValueBoolean" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="ValueURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataType", propOrder = {
    "codeOwner",
    "codeProperty",
    "codeStatus",
    "codeProvider",
    "periodType",
    "dateBegin",
    "codeMeasure",
    "valueId",
    "valueNum",
    "valueDate",
    "valueDateTime",
    "valueFile",
    "valueString",
    "valueBoolean",
    "valueURI"
})
public class DataType {

    @XmlElement(name = "CodeOwner", required = true)
    protected EntityRef codeOwner;
    @XmlElement(name = "CodeProperty", required = true)
    protected EntityRef codeProperty;
    @XmlElement(name = "CodeStatus")
    protected EntityRef codeStatus;
    @XmlElement(name = "CodeProvider")
    protected EntityRef codeProvider;
    @XmlElement(name = "PeriodType")
    protected PeriodTypeType periodType;
    @XmlElement(name = "DateBegin")
    protected String dateBegin;
    @XmlElement(name = "CodeMeasure")
    protected EntityRef codeMeasure;
    @XmlElement(name = "ValueId")
    protected List<EntityRef> valueId;
    @XmlElement(name = "ValueNum")
    protected Double valueNum;
    @XmlElement(name = "ValueDate")
    protected List<String> valueDate;
    @XmlElement(name = "ValueDateTime")
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> valueDateTime;
    @XmlElement(name = "ValueFile")
    protected List<String> valueFile;
    @XmlElement(name = "ValueString")
    protected List<String> valueString;
    @XmlElement(name = "ValueBoolean", type = Boolean.class)
    protected List<Boolean> valueBoolean;
    @XmlElement(name = "ValueURI")
    @XmlSchemaType(name = "anyURI")
    protected List<String> valueURI;

    /**
     * Gets the value of the codeOwner property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRef }
     *     
     */
    public EntityRef getCodeOwner() {
        return codeOwner;
    }

    /**
     * Sets the value of the codeOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRef }
     *     
     */
    public void setCodeOwner(EntityRef value) {
        this.codeOwner = value;
    }

    /**
     * Gets the value of the codeProperty property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRef }
     *     
     */
    public EntityRef getCodeProperty() {
        return codeProperty;
    }

    /**
     * Sets the value of the codeProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRef }
     *     
     */
    public void setCodeProperty(EntityRef value) {
        this.codeProperty = value;
    }

    /**
     * Gets the value of the codeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRef }
     *     
     */
    public EntityRef getCodeStatus() {
        return codeStatus;
    }

    /**
     * Sets the value of the codeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRef }
     *     
     */
    public void setCodeStatus(EntityRef value) {
        this.codeStatus = value;
    }

    /**
     * Gets the value of the codeProvider property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRef }
     *     
     */
    public EntityRef getCodeProvider() {
        return codeProvider;
    }

    /**
     * Sets the value of the codeProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRef }
     *     
     */
    public void setCodeProvider(EntityRef value) {
        this.codeProvider = value;
    }

    /**
     * Gets the value of the periodType property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodTypeType }
     *     
     */
    public PeriodTypeType getPeriodType() {
        return periodType;
    }

    /**
     * Sets the value of the periodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodTypeType }
     *     
     */
    public void setPeriodType(PeriodTypeType value) {
        this.periodType = value;
    }

    /**
     * Gets the value of the dateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateBegin() {
        return dateBegin;
    }

    /**
     * Sets the value of the dateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateBegin(String value) {
        this.dateBegin = value;
    }

    /**
     * Gets the value of the codeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRef }
     *     
     */
    public EntityRef getCodeMeasure() {
        return codeMeasure;
    }

    /**
     * Sets the value of the codeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRef }
     *     
     */
    public void setCodeMeasure(EntityRef value) {
        this.codeMeasure = value;
    }

    /**
     * Gets the value of the valueId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityRef }
     * 
     * 
     */
    public List<EntityRef> getValueId() {
        if (valueId == null) {
            valueId = new ArrayList<EntityRef>();
        }
        return this.valueId;
    }

    /**
     * Gets the value of the valueNum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValueNum() {
        return valueNum;
    }

    /**
     * Sets the value of the valueNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValueNum(Double value) {
        this.valueNum = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValueDate() {
        if (valueDate == null) {
            valueDate = new ArrayList<String>();
        }
        return this.valueDate;
    }

    /**
     * Gets the value of the valueDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getValueDateTime() {
        if (valueDateTime == null) {
            valueDateTime = new ArrayList<XMLGregorianCalendar>();
        }
        return this.valueDateTime;
    }

    /**
     * Gets the value of the valueFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValueFile() {
        if (valueFile == null) {
            valueFile = new ArrayList<String>();
        }
        return this.valueFile;
    }

    /**
     * Gets the value of the valueString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValueString() {
        if (valueString == null) {
            valueString = new ArrayList<String>();
        }
        return this.valueString;
    }

    /**
     * Gets the value of the valueBoolean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueBoolean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueBoolean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getValueBoolean() {
        if (valueBoolean == null) {
            valueBoolean = new ArrayList<Boolean>();
        }
        return this.valueBoolean;
    }

    /**
     * Gets the value of the valueURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValueURI() {
        if (valueURI == null) {
            valueURI = new ArrayList<String>();
        }
        return this.valueURI;
    }

}