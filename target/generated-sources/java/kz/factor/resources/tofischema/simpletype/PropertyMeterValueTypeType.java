//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.05 at 04:56:54 PM ALMT 
//


package kz.factor.resources.tofischema.simpletype;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyMeterValueTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyMeterValueTypeType">
 *   &lt;restriction base="{http://www.factor.kz/resources/TOFISchema/simpletype}CodeType">
 *     &lt;enumeration value="_Integer"/>
 *     &lt;enumeration value="_Long"/>
 *     &lt;enumeration value="_Double"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropertyMeterValueTypeType")
@XmlEnum
public enum PropertyMeterValueTypeType {

    @XmlEnumValue("_Integer")
    INTEGER("_Integer"),
    @XmlEnumValue("_Long")
    LONG("_Long"),
    @XmlEnumValue("_Double")
    DOUBLE("_Double");
    private final String value;

    PropertyMeterValueTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyMeterValueTypeType fromValue(String v) {
        for (PropertyMeterValueTypeType c: PropertyMeterValueTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
