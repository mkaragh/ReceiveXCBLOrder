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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CatalogURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="CatalogID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CatalogItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogReference", propOrder = {
    "catalogURL",
    "catalogID",
    "catalogItemID"
})
public class CatalogReference {

    @XmlElement(name = "CatalogURL", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String catalogURL;
    @XmlElement(name = "CatalogID")
    protected String catalogID;
    @XmlElement(name = "CatalogItemID")
    protected String catalogItemID;

    /**
     * Gets the value of the catalogURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogURL() {
        return catalogURL;
    }

    /**
     * Sets the value of the catalogURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogURL(String value) {
        this.catalogURL = value;
    }

    /**
     * Gets the value of the catalogID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogID() {
        return catalogID;
    }

    /**
     * Sets the value of the catalogID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogID(String value) {
        this.catalogID = value;
    }

    /**
     * Gets the value of the catalogItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogItemID() {
        return catalogItemID;
    }

    /**
     * Sets the value of the catalogItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogItemID(String value) {
        this.catalogItemID = value;
    }

}
