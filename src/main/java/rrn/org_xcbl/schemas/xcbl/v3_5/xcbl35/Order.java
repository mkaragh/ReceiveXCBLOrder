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
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}OrderHeader"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}OrderDetail" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}OrderSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
    "orderHeader",
    "orderDetail",
    "orderSummary"
})
public class Order {

    @XmlElement(name = "OrderHeader", required = true)
    protected OrderHeader orderHeader;
    @XmlElement(name = "OrderDetail")
    protected OrderDetail orderDetail;
    @XmlElement(name = "OrderSummary")
    protected OrderSummary orderSummary;

    /**
     * Gets the value of the orderHeader property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHeader }
     *     
     */
    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    /**
     * Sets the value of the orderHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHeader }
     *     
     */
    public void setOrderHeader(OrderHeader value) {
        this.orderHeader = value;
    }

    /**
     * Gets the value of the orderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDetail }
     *     
     */
    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    /**
     * Sets the value of the orderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDetail }
     *     
     */
    public void setOrderDetail(OrderDetail value) {
        this.orderDetail = value;
    }

    /**
     * Gets the value of the orderSummary property.
     * 
     * @return
     *     possible object is
     *     {@link OrderSummary }
     *     
     */
    public OrderSummary getOrderSummary() {
        return orderSummary;
    }

    /**
     * Sets the value of the orderSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderSummary }
     *     
     */
    public void setOrderSummary(OrderSummary value) {
        this.orderSummary = value;
    }

}
