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


/**
 * <p>Java class for PercentQualifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercentQualifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PercentQualifierCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PercentQualifierCode"/>
 *         &lt;element name="PercentQualifierCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentQualifier", propOrder = {
    "percentQualifierCoded",
    "percentQualifierCodedOther"
})
public class PercentQualifier {

    @XmlElement(name = "PercentQualifierCoded", required = true)
    protected PercentQualifierCode percentQualifierCoded;
    @XmlElement(name = "PercentQualifierCodedOther")
    protected String percentQualifierCodedOther;

    /**
     * Gets the value of the percentQualifierCoded property.
     * 
     * @return
     *     possible object is
     *     {@link PercentQualifierCode }
     *     
     */
    public PercentQualifierCode getPercentQualifierCoded() {
        return percentQualifierCoded;
    }

    /**
     * Sets the value of the percentQualifierCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentQualifierCode }
     *     
     */
    public void setPercentQualifierCoded(PercentQualifierCode value) {
        this.percentQualifierCoded = value;
    }

    /**
     * Gets the value of the percentQualifierCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentQualifierCodedOther() {
        return percentQualifierCodedOther;
    }

    /**
     * Sets the value of the percentQualifierCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentQualifierCodedOther(String value) {
        this.percentQualifierCodedOther = value;
    }

}
