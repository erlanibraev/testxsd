//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.05 at 04:56:54 PM ALMT 
//


package kz.factor.resources.tofischema.complextype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип описывающий владельца данных типов объектов.
 * 
 * <p>Java class for OwnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OwnerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.factor.kz/resources/TOFISchema/complextype}OwnerBaseType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="OwnerContainer" type="{http://www.factor.kz/resources/TOFISchema/complextype}OwnerContainerType"/>
 *           &lt;element name="OwnerContainerFactor" type="{http://www.factor.kz/resources/TOFISchema/complextype}OwnerContainerType"/>
 *         &lt;/choice>
 *         &lt;element name="Parent" type="{http://www.factor.kz/resources/TOFISchema/complextype}OwnerType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerType")
public class OwnerType
    extends OwnerBaseType
{


}
