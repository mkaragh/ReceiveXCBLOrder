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


/**
 * <p>Java class for OrderDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestedShipByDate" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}xcblDatetime" minOccurs="0"/>
 *         &lt;element name="RequestedDeliverByDate" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}xcblDatetime" minOccurs="0"/>
 *         &lt;element name="PromiseDate" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}xcblDatetime" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ValidityDates" minOccurs="0"/>
 *         &lt;element name="CancelByDate" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}xcblDatetime" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfDateCoded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDates", propOrder = {
    "requestedShipByDate",
    "requestedDeliverByDate",
    "promiseDate",
    "validityDates",
    "cancelByDate",
    "listOfDateCoded"
})
public class OrderDates {

    @XmlElement(name = "RequestedShipByDate")
    protected String requestedShipByDate;
    @XmlElement(name = "RequestedDeliverByDate")
    protected String requestedDeliverByDate;
    @XmlElement(name = "PromiseDate")
    protected String promiseDate;
    @XmlElement(name = "ValidityDates")
    protected ValidityDates validityDates;
    @XmlElement(name = "CancelByDate")
    protected String cancelByDate;
    @XmlElement(name = "ListOfDateCoded")
    protected ListOfDateCoded listOfDateCoded;

    /**
     * Gets the value of the requestedShipByDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedShipByDate() {
        return requestedShipByDate;
    }

    /**
     * Sets the value of the requestedShipByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedShipByDate(String value) {
        this.requestedShipByDate = value;
    }

    /**
     * Gets the value of the requestedDeliverByDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedDeliverByDate() {
        return requestedDeliverByDate;
    }

    /**
     * Sets the value of the requestedDeliverByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedDeliverByDate(String value) {
        this.requestedDeliverByDate = value;
    }

    /**
     * Gets the value of the promiseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromiseDate() {
        return promiseDate;
    }

    /**
     * Sets the value of the promiseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromiseDate(String value) {
        this.promiseDate = value;
    }

    /**
     * Gets the value of the validityDates property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityDates }
     *     
     */
    public ValidityDates getValidityDates() {
        return validityDates;
    }

    /**
     * Sets the value of the validityDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityDates }
     *     
     */
    public void setValidityDates(ValidityDates value) {
        this.validityDates = value;
    }

    /**
     * Gets the value of the cancelByDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelByDate() {
        return cancelByDate;
    }

    /**
     * Sets the value of the cancelByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelByDate(String value) {
        this.cancelByDate = value;
    }

    /**
     * Gets the value of the listOfDateCoded property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDateCoded }
     *     
     */
    public ListOfDateCoded getListOfDateCoded() {
        return listOfDateCoded;
    }

    /**
     * Sets the value of the listOfDateCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDateCoded }
     *     
     */
    public void setListOfDateCoded(ListOfDateCoded value) {
        this.listOfDateCoded = value;
    }

}
