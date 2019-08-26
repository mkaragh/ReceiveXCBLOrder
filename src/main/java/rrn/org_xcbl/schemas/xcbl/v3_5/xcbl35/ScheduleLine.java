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
 * <p>Java class for ScheduleLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScheduleLineID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShipmentStatusEventCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ShipmentStatusEventCode" minOccurs="0"/>
 *         &lt;element name="ShipmentStatusEventCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentStatusReasons" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfStatusReason"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Quantity"/>
 *         &lt;element name="RequestedDeliveryDate" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}xcblDatetime" minOccurs="0"/>
 *         &lt;element name="ListOfOtherDeliveryDate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfDateCoded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ScheduleLineNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Transport"/>
 *           &lt;element name="TransportReference" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;/choice>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfShipToSubInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleLine", propOrder = {
    "scheduleLineID",
    "shipmentStatusEventCoded",
    "shipmentStatusEventCodedOther",
    "shipmentStatusReasons",
    "quantity",
    "requestedDeliveryDate",
    "listOfOtherDeliveryDate",
    "scheduleLineNote",
    "transport",
    "transportReference",
    "listOfShipToSubInformation"
})
public class ScheduleLine {

    @XmlElement(name = "ScheduleLineID")
    protected Integer scheduleLineID;
    @XmlElement(name = "ShipmentStatusEventCoded")
    protected ShipmentStatusEventCode shipmentStatusEventCoded;
    @XmlElement(name = "ShipmentStatusEventCodedOther")
    protected String shipmentStatusEventCodedOther;
    @XmlElement(name = "ShipmentStatusReasons")
    protected ScheduleLine.ShipmentStatusReasons shipmentStatusReasons;
    @XmlElement(name = "Quantity", required = true)
    protected Quantity quantity;
    @XmlElement(name = "RequestedDeliveryDate")
    protected String requestedDeliveryDate;
    @XmlElement(name = "ListOfOtherDeliveryDate")
    protected ScheduleLine.ListOfOtherDeliveryDate listOfOtherDeliveryDate;
    @XmlElement(name = "ScheduleLineNote")
    protected String scheduleLineNote;
    @XmlElement(name = "Transport")
    protected Transport transport;
    @XmlElement(name = "TransportReference")
    protected Integer transportReference;
    @XmlElement(name = "ListOfShipToSubInformation")
    protected ListOfShipToSubInformation listOfShipToSubInformation;

    /**
     * Gets the value of the scheduleLineID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduleLineID() {
        return scheduleLineID;
    }

    /**
     * Sets the value of the scheduleLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduleLineID(Integer value) {
        this.scheduleLineID = value;
    }

    /**
     * Gets the value of the shipmentStatusEventCoded property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentStatusEventCode }
     *     
     */
    public ShipmentStatusEventCode getShipmentStatusEventCoded() {
        return shipmentStatusEventCoded;
    }

    /**
     * Sets the value of the shipmentStatusEventCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentStatusEventCode }
     *     
     */
    public void setShipmentStatusEventCoded(ShipmentStatusEventCode value) {
        this.shipmentStatusEventCoded = value;
    }

    /**
     * Gets the value of the shipmentStatusEventCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentStatusEventCodedOther() {
        return shipmentStatusEventCodedOther;
    }

    /**
     * Sets the value of the shipmentStatusEventCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentStatusEventCodedOther(String value) {
        this.shipmentStatusEventCodedOther = value;
    }

    /**
     * Gets the value of the shipmentStatusReasons property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleLine.ShipmentStatusReasons }
     *     
     */
    public ScheduleLine.ShipmentStatusReasons getShipmentStatusReasons() {
        return shipmentStatusReasons;
    }

    /**
     * Sets the value of the shipmentStatusReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleLine.ShipmentStatusReasons }
     *     
     */
    public void setShipmentStatusReasons(ScheduleLine.ShipmentStatusReasons value) {
        this.shipmentStatusReasons = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the requestedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    /**
     * Sets the value of the requestedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedDeliveryDate(String value) {
        this.requestedDeliveryDate = value;
    }

    /**
     * Gets the value of the listOfOtherDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleLine.ListOfOtherDeliveryDate }
     *     
     */
    public ScheduleLine.ListOfOtherDeliveryDate getListOfOtherDeliveryDate() {
        return listOfOtherDeliveryDate;
    }

    /**
     * Sets the value of the listOfOtherDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleLine.ListOfOtherDeliveryDate }
     *     
     */
    public void setListOfOtherDeliveryDate(ScheduleLine.ListOfOtherDeliveryDate value) {
        this.listOfOtherDeliveryDate = value;
    }

    /**
     * Gets the value of the scheduleLineNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleLineNote() {
        return scheduleLineNote;
    }

    /**
     * Sets the value of the scheduleLineNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleLineNote(String value) {
        this.scheduleLineNote = value;
    }

    /**
     * Gets the value of the transport property.
     * 
     * @return
     *     possible object is
     *     {@link Transport }
     *     
     */
    public Transport getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transport }
     *     
     */
    public void setTransport(Transport value) {
        this.transport = value;
    }

    /**
     * Gets the value of the transportReference property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransportReference() {
        return transportReference;
    }

    /**
     * Sets the value of the transportReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransportReference(Integer value) {
        this.transportReference = value;
    }

    /**
     * Gets the value of the listOfShipToSubInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfShipToSubInformation }
     *     
     */
    public ListOfShipToSubInformation getListOfShipToSubInformation() {
        return listOfShipToSubInformation;
    }

    /**
     * Sets the value of the listOfShipToSubInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfShipToSubInformation }
     *     
     */
    public void setListOfShipToSubInformation(ListOfShipToSubInformation value) {
        this.listOfShipToSubInformation = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfDateCoded"/>
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
        "listOfDateCoded"
    })
    public static class ListOfOtherDeliveryDate {

        @XmlElement(name = "ListOfDateCoded", required = true)
        protected ListOfDateCoded listOfDateCoded;

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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfStatusReason"/>
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
        "listOfStatusReason"
    })
    public static class ShipmentStatusReasons {

        @XmlElement(name = "ListOfStatusReason", required = true)
        protected ListOfStatusReason listOfStatusReason;

        /**
         * Gets the value of the listOfStatusReason property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfStatusReason }
         *     
         */
        public ListOfStatusReason getListOfStatusReason() {
            return listOfStatusReason;
        }

        /**
         * Sets the value of the listOfStatusReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfStatusReason }
         *     
         */
        public void setListOfStatusReason(ListOfStatusReason value) {
            this.listOfStatusReason = value;
        }

    }

}
