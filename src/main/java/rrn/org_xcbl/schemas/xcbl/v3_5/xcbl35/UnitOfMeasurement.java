//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.26 at 12:42:50 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for UnitOfMeasurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitOfMeasurement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UOMCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}UOMCode"/>
 *         &lt;element name="UOMCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitOfMeasurement", propOrder = {
    "uomCoded",
    "uomCodedOther"
})
public class UnitOfMeasurement {

    @XmlElement(name = "UOMCoded", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String uomCoded;
    @XmlElement(name = "UOMCodedOther")
    protected String uomCodedOther;

    /**
     * Gets the value of the uomCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOMCoded() {
        return uomCoded;
    }

    /**
     * Sets the value of the uomCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOMCoded(String value) {
        this.uomCoded = value;
    }

    /**
     * Gets the value of the uomCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOMCodedOther() {
        return uomCodedOther;
    }

    /**
     * Sets the value of the uomCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOMCodedOther(String value) {
        this.uomCodedOther = value;
    }

}
