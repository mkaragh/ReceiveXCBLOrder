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
 * <p>Java class for SpecialHandling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialHandling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialHandlingCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}SpecialHandlingCode"/>
 *         &lt;element name="SpecialHandlingCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialHandlingNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialHandling", propOrder = {
    "specialHandlingCoded",
    "specialHandlingCodedOther",
    "specialHandlingNote"
})
public class SpecialHandling {

    @XmlElement(name = "SpecialHandlingCoded", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String specialHandlingCoded;
    @XmlElement(name = "SpecialHandlingCodedOther")
    protected String specialHandlingCodedOther;
    @XmlElement(name = "SpecialHandlingNote")
    protected String specialHandlingNote;

    /**
     * Gets the value of the specialHandlingCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialHandlingCoded() {
        return specialHandlingCoded;
    }

    /**
     * Sets the value of the specialHandlingCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialHandlingCoded(String value) {
        this.specialHandlingCoded = value;
    }

    /**
     * Gets the value of the specialHandlingCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialHandlingCodedOther() {
        return specialHandlingCodedOther;
    }

    /**
     * Sets the value of the specialHandlingCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialHandlingCodedOther(String value) {
        this.specialHandlingCodedOther = value;
    }

    /**
     * Gets the value of the specialHandlingNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialHandlingNote() {
        return specialHandlingNote;
    }

    /**
     * Sets the value of the specialHandlingNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialHandlingNote(String value) {
        this.specialHandlingNote = value;
    }

}
