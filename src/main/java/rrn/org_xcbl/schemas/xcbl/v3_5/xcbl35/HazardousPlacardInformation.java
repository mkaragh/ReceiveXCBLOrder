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
 * <p>Java class for HazardousPlacardInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousPlacardInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HazardousPlacardIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HazardousPlacardText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousPlacardInformation", propOrder = {
    "hazardousPlacardIdentification",
    "hazardousPlacardText"
})
public class HazardousPlacardInformation {

    @XmlElement(name = "HazardousPlacardIdentification")
    protected String hazardousPlacardIdentification;
    @XmlElement(name = "HazardousPlacardText")
    protected String hazardousPlacardText;

    /**
     * Gets the value of the hazardousPlacardIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousPlacardIdentification() {
        return hazardousPlacardIdentification;
    }

    /**
     * Sets the value of the hazardousPlacardIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousPlacardIdentification(String value) {
        this.hazardousPlacardIdentification = value;
    }

    /**
     * Gets the value of the hazardousPlacardText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousPlacardText() {
        return hazardousPlacardText;
    }

    /**
     * Sets the value of the hazardousPlacardText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousPlacardText(String value) {
        this.hazardousPlacardText = value;
    }

}
