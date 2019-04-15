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
 * <p>Java class for Agency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Agency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}AgencyCode"/>
 *         &lt;element name="AgencyCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeListIdentifierCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}CodeListIdentifierCode" minOccurs="0"/>
 *         &lt;element name="CodeListIdentifierCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agency", propOrder = {
    "agencyCoded",
    "agencyCodedOther",
    "agencyDescription",
    "codeListIdentifierCoded",
    "codeListIdentifierCodedOther"
})
public class Agency {

    @XmlElement(name = "AgencyCoded", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String agencyCoded;
    @XmlElement(name = "AgencyCodedOther")
    protected String agencyCodedOther;
    @XmlElement(name = "AgencyDescription")
    protected String agencyDescription;
    @XmlElement(name = "CodeListIdentifierCoded")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String codeListIdentifierCoded;
    @XmlElement(name = "CodeListIdentifierCodedOther")
    protected String codeListIdentifierCodedOther;

    /**
     * Gets the value of the agencyCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCoded() {
        return agencyCoded;
    }

    /**
     * Sets the value of the agencyCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCoded(String value) {
        this.agencyCoded = value;
    }

    /**
     * Gets the value of the agencyCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCodedOther() {
        return agencyCodedOther;
    }

    /**
     * Sets the value of the agencyCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCodedOther(String value) {
        this.agencyCodedOther = value;
    }

    /**
     * Gets the value of the agencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyDescription() {
        return agencyDescription;
    }

    /**
     * Sets the value of the agencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyDescription(String value) {
        this.agencyDescription = value;
    }

    /**
     * Gets the value of the codeListIdentifierCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListIdentifierCoded() {
        return codeListIdentifierCoded;
    }

    /**
     * Sets the value of the codeListIdentifierCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListIdentifierCoded(String value) {
        this.codeListIdentifierCoded = value;
    }

    /**
     * Gets the value of the codeListIdentifierCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListIdentifierCodedOther() {
        return codeListIdentifierCodedOther;
    }

    /**
     * Sets the value of the codeListIdentifierCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListIdentifierCodedOther(String value) {
        this.codeListIdentifierCodedOther = value;
    }

}
