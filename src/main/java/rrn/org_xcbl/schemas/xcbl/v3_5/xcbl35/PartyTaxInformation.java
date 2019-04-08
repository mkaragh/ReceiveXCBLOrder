//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.04 at 03:22:36 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyTaxInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyTaxInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxIdentifier" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Identifier"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RegisteredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegisteredOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}TaxLocation" minOccurs="0"/>
 *         &lt;element name="CompanyRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyTaxInformation", propOrder = {
    "taxIdentifier",
    "registeredName",
    "registeredOffice",
    "taxLocation",
    "companyRegistrationNumber"
})
public class PartyTaxInformation {

    @XmlElement(name = "TaxIdentifier")
    protected PartyTaxInformation.TaxIdentifier taxIdentifier;
    @XmlElement(name = "RegisteredName")
    protected String registeredName;
    @XmlElement(name = "RegisteredOffice")
    protected String registeredOffice;
    @XmlElement(name = "TaxLocation")
    protected TaxLocation taxLocation;
    @XmlElement(name = "CompanyRegistrationNumber")
    protected String companyRegistrationNumber;

    /**
     * Gets the value of the taxIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTaxInformation.TaxIdentifier }
     *     
     */
    public PartyTaxInformation.TaxIdentifier getTaxIdentifier() {
        return taxIdentifier;
    }

    /**
     * Sets the value of the taxIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTaxInformation.TaxIdentifier }
     *     
     */
    public void setTaxIdentifier(PartyTaxInformation.TaxIdentifier value) {
        this.taxIdentifier = value;
    }

    /**
     * Gets the value of the registeredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredName() {
        return registeredName;
    }

    /**
     * Sets the value of the registeredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredName(String value) {
        this.registeredName = value;
    }

    /**
     * Gets the value of the registeredOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredOffice() {
        return registeredOffice;
    }

    /**
     * Sets the value of the registeredOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredOffice(String value) {
        this.registeredOffice = value;
    }

    /**
     * Gets the value of the taxLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TaxLocation }
     *     
     */
    public TaxLocation getTaxLocation() {
        return taxLocation;
    }

    /**
     * Sets the value of the taxLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxLocation }
     *     
     */
    public void setTaxLocation(TaxLocation value) {
        this.taxLocation = value;
    }

    /**
     * Gets the value of the companyRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    /**
     * Sets the value of the companyRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegistrationNumber(String value) {
        this.companyRegistrationNumber = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Identifier"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "identifier"
    })
    public static class TaxIdentifier {

        @XmlElement(name = "Identifier", required = true)
        protected Identifier identifier;

        /**
         * Gets the value of the identifier property.
         * 
         * @return
         *     possible object is
         *     {@link Identifier }
         *     
         */
        public Identifier getIdentifier() {
            return identifier;
        }

        /**
         * Sets the value of the identifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Identifier }
         *     
         */
        public void setIdentifier(Identifier value) {
            this.identifier = value;
        }

    }

}
