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
 * <p>Java class for MessageID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}IDAssignedBy"/>
 *         &lt;element name="IDAssignedDate" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}xcblDatetime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageID", propOrder = {
    "idNumber",
    "idAssignedBy",
    "idAssignedDate"
})
public class MessageID {

    @XmlElement(name = "IDNumber", required = true)
    protected String idNumber;
    @XmlElement(name = "IDAssignedBy", required = true)
    protected IDAssignedBy idAssignedBy;
    @XmlElement(name = "IDAssignedDate")
    protected String idAssignedDate;

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the idAssignedBy property.
     * 
     * @return
     *     possible object is
     *     {@link IDAssignedBy }
     *     
     */
    public IDAssignedBy getIDAssignedBy() {
        return idAssignedBy;
    }

    /**
     * Sets the value of the idAssignedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDAssignedBy }
     *     
     */
    public void setIDAssignedBy(IDAssignedBy value) {
        this.idAssignedBy = value;
    }

    /**
     * Gets the value of the idAssignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDAssignedDate() {
        return idAssignedDate;
    }

    /**
     * Sets the value of the idAssignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDAssignedDate(String value) {
        this.idAssignedDate = value;
    }

}
