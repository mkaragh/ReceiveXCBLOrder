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
 * <p>Java class for NameValueSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameValueSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SetID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfNameValuePair"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameValueSet", propOrder = {
    "setName",
    "setID",
    "listOfNameValuePair"
})
public class NameValueSet {

    @XmlElement(name = "SetName", required = true)
    protected String setName;
    @XmlElement(name = "SetID")
    protected String setID;
    @XmlElement(name = "ListOfNameValuePair", required = true)
    protected ListOfNameValuePair listOfNameValuePair;

    /**
     * Gets the value of the setName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetName() {
        return setName;
    }

    /**
     * Sets the value of the setName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetName(String value) {
        this.setName = value;
    }

    /**
     * Gets the value of the setID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetID() {
        return setID;
    }

    /**
     * Sets the value of the setID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetID(String value) {
        this.setID = value;
    }

    /**
     * Gets the value of the listOfNameValuePair property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfNameValuePair }
     *     
     */
    public ListOfNameValuePair getListOfNameValuePair() {
        return listOfNameValuePair;
    }

    /**
     * Sets the value of the listOfNameValuePair property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfNameValuePair }
     *     
     */
    public void setListOfNameValuePair(ListOfNameValuePair value) {
        this.listOfNameValuePair = value;
    }

}
