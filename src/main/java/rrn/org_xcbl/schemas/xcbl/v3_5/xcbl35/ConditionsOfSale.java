//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.26 at 12:42:50 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionsOfSale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionsOfSale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}SalesRequirement" maxOccurs="unbounded"/>
 *         &lt;element name="SalesActionCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}SalesActionCode" minOccurs="0"/>
 *         &lt;element name="SalesActionCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesActionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionsOfSale", propOrder = {
    "salesRequirement",
    "salesActionCoded",
    "salesActionCodedOther",
    "salesActionValue"
})
public class ConditionsOfSale {

    @XmlElement(name = "SalesRequirement", required = true)
    protected List<SalesRequirement> salesRequirement;
    @XmlElement(name = "SalesActionCoded")
    protected SalesActionCode salesActionCoded;
    @XmlElement(name = "SalesActionCodedOther")
    protected String salesActionCodedOther;
    @XmlElement(name = "SalesActionValue")
    protected String salesActionValue;

    /**
     * Gets the value of the salesRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesRequirement }
     * 
     * 
     */
    public List<SalesRequirement> getSalesRequirement() {
        if (salesRequirement == null) {
            salesRequirement = new ArrayList<SalesRequirement>();
        }
        return this.salesRequirement;
    }

    /**
     * Gets the value of the salesActionCoded property.
     * 
     * @return
     *     possible object is
     *     {@link SalesActionCode }
     *     
     */
    public SalesActionCode getSalesActionCoded() {
        return salesActionCoded;
    }

    /**
     * Sets the value of the salesActionCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesActionCode }
     *     
     */
    public void setSalesActionCoded(SalesActionCode value) {
        this.salesActionCoded = value;
    }

    /**
     * Gets the value of the salesActionCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesActionCodedOther() {
        return salesActionCodedOther;
    }

    /**
     * Sets the value of the salesActionCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesActionCodedOther(String value) {
        this.salesActionCodedOther = value;
    }

    /**
     * Gets the value of the salesActionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesActionValue() {
        return salesActionValue;
    }

    /**
     * Sets the value of the salesActionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesActionValue(String value) {
        this.salesActionValue = value;
    }

}
