//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.15 at 10:49:09 AM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for QuantityCoded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityCoded">
 *   &lt;complexContent>
 *     &lt;extension base="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Quantity">
 *       &lt;sequence>
 *         &lt;element name="QuantityQualifierCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}QuantityQualifierCode"/>
 *         &lt;element name="QuantityQualifierCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityCoded", propOrder = {
    "quantityQualifierCoded",
    "quantityQualifierCodedOther"
})
public class QuantityCoded
    extends Quantity
{

    @XmlElement(name = "QuantityQualifierCoded", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String quantityQualifierCoded;
    @XmlElement(name = "QuantityQualifierCodedOther")
    protected String quantityQualifierCodedOther;

    /**
     * Gets the value of the quantityQualifierCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityQualifierCoded() {
        return quantityQualifierCoded;
    }

    /**
     * Sets the value of the quantityQualifierCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityQualifierCoded(String value) {
        this.quantityQualifierCoded = value;
    }

    /**
     * Gets the value of the quantityQualifierCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityQualifierCodedOther() {
        return quantityQualifierCodedOther;
    }

    /**
     * Sets the value of the quantityQualifierCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityQualifierCodedOther(String value) {
        this.quantityQualifierCodedOther = value;
    }

}
