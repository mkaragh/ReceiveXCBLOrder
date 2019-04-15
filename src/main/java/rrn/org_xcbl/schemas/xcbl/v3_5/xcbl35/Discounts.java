//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.15 at 10:49:09 AM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Discounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Discounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiscountPercent" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Decimal10_4" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}MonetaryValue"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DiscountDaysDue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DiscountDueDate" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}xcblDatetime" minOccurs="0"/>
 *         &lt;element name="DiscountDayOfMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DiscountDateTimeRefCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}DateTimeRefCode" minOccurs="0"/>
 *         &lt;element name="DiscountDateTimeRefCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetDaysDue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NetDueDate" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}xcblDatetime" minOccurs="0"/>
 *         &lt;element name="NetDateTimeRefCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}DateTimeRefCode" minOccurs="0"/>
 *         &lt;element name="NetDateTimeRefCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Discounts", propOrder = {
    "discountPercent",
    "discountAmount",
    "discountDaysDue",
    "discountDueDate",
    "discountDayOfMonth",
    "discountDateTimeRefCoded",
    "discountDateTimeRefCodedOther",
    "netDaysDue",
    "netDueDate",
    "netDateTimeRefCoded",
    "netDateTimeRefCodedOther"
})
public class Discounts {

    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "DiscountAmount")
    protected Discounts.DiscountAmount discountAmount;
    @XmlElement(name = "DiscountDaysDue")
    protected Integer discountDaysDue;
    @XmlElement(name = "DiscountDueDate")
    protected String discountDueDate;
    @XmlElement(name = "DiscountDayOfMonth")
    protected Integer discountDayOfMonth;
    @XmlElement(name = "DiscountDateTimeRefCoded")
    protected DateTimeRefCode discountDateTimeRefCoded;
    @XmlElement(name = "DiscountDateTimeRefCodedOther")
    protected String discountDateTimeRefCodedOther;
    @XmlElement(name = "NetDaysDue")
    protected Integer netDaysDue;
    @XmlElement(name = "NetDueDate")
    protected String netDueDate;
    @XmlElement(name = "NetDateTimeRefCoded")
    protected DateTimeRefCode netDateTimeRefCoded;
    @XmlElement(name = "NetDateTimeRefCodedOther")
    protected String netDateTimeRefCodedOther;

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Discounts.DiscountAmount }
     *     
     */
    public Discounts.DiscountAmount getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Discounts.DiscountAmount }
     *     
     */
    public void setDiscountAmount(Discounts.DiscountAmount value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountDaysDue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscountDaysDue() {
        return discountDaysDue;
    }

    /**
     * Sets the value of the discountDaysDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscountDaysDue(Integer value) {
        this.discountDaysDue = value;
    }

    /**
     * Gets the value of the discountDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountDueDate() {
        return discountDueDate;
    }

    /**
     * Sets the value of the discountDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountDueDate(String value) {
        this.discountDueDate = value;
    }

    /**
     * Gets the value of the discountDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscountDayOfMonth() {
        return discountDayOfMonth;
    }

    /**
     * Sets the value of the discountDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscountDayOfMonth(Integer value) {
        this.discountDayOfMonth = value;
    }

    /**
     * Gets the value of the discountDateTimeRefCoded property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRefCode }
     *     
     */
    public DateTimeRefCode getDiscountDateTimeRefCoded() {
        return discountDateTimeRefCoded;
    }

    /**
     * Sets the value of the discountDateTimeRefCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRefCode }
     *     
     */
    public void setDiscountDateTimeRefCoded(DateTimeRefCode value) {
        this.discountDateTimeRefCoded = value;
    }

    /**
     * Gets the value of the discountDateTimeRefCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountDateTimeRefCodedOther() {
        return discountDateTimeRefCodedOther;
    }

    /**
     * Sets the value of the discountDateTimeRefCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountDateTimeRefCodedOther(String value) {
        this.discountDateTimeRefCodedOther = value;
    }

    /**
     * Gets the value of the netDaysDue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetDaysDue() {
        return netDaysDue;
    }

    /**
     * Sets the value of the netDaysDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetDaysDue(Integer value) {
        this.netDaysDue = value;
    }

    /**
     * Gets the value of the netDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetDueDate() {
        return netDueDate;
    }

    /**
     * Sets the value of the netDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetDueDate(String value) {
        this.netDueDate = value;
    }

    /**
     * Gets the value of the netDateTimeRefCoded property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRefCode }
     *     
     */
    public DateTimeRefCode getNetDateTimeRefCoded() {
        return netDateTimeRefCoded;
    }

    /**
     * Sets the value of the netDateTimeRefCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRefCode }
     *     
     */
    public void setNetDateTimeRefCoded(DateTimeRefCode value) {
        this.netDateTimeRefCoded = value;
    }

    /**
     * Gets the value of the netDateTimeRefCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetDateTimeRefCodedOther() {
        return netDateTimeRefCodedOther;
    }

    /**
     * Sets the value of the netDateTimeRefCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetDateTimeRefCodedOther(String value) {
        this.netDateTimeRefCodedOther = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}MonetaryValue"/>
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
        "monetaryValue"
    })
    public static class DiscountAmount {

        @XmlElement(name = "MonetaryValue", required = true)
        protected MonetaryValue monetaryValue;

        /**
         * Gets the value of the monetaryValue property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryValue }
         *     
         */
        public MonetaryValue getMonetaryValue() {
            return monetaryValue;
        }

        /**
         * Sets the value of the monetaryValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryValue }
         *     
         */
        public void setMonetaryValue(MonetaryValue value) {
            this.monetaryValue = value;
        }

    }

}
