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
 * <p>Java class for LatestVersionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LatestVersionType">
 *   &lt;restriction base="{http://www.factor.kz/resources/TOFISchema/simpletype}CodeType">
 *     &lt;enumeration value="Not_latest_version"/>
 *     &lt;enumeration value="Latest_version"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LatestVersionType")
@XmlEnum
public enum LatestVersionType {

    @XmlEnumValue("Not_latest_version")
    NOT_LATEST_VERSION("Not_latest_version"),
    @XmlEnumValue("Latest_version")
    LATEST_VERSION("Latest_version");
    private final String value;

    LatestVersionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LatestVersionType fromValue(String v) {
        for (LatestVersionType c: LatestVersionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
