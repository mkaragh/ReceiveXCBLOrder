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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TransportMeans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportMeans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransportMeansCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}TransportMeansCode"/>
 *         &lt;element name="TransportMeansCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMeans", propOrder = {
    "transportMeansCoded",
    "transportMeansCodedOther"
})
public class TransportMeans {

    @XmlElement(name = "TransportMeansCoded", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transportMeansCoded;
    @XmlElement(name = "TransportMeansCodedOther")
    protected String transportMeansCodedOther;

    /**
     * Gets the value of the transportMeansCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportMeansCoded() {
        return transportMeansCoded;
    }

    /**
     * Sets the value of the transportMeansCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportMeansCoded(String value) {
        this.transportMeansCoded = value;
    }

    /**
     * Gets the value of the transportMeansCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportMeansCodedOther() {
        return transportMeansCodedOther;
    }

    /**
     * Sets the value of the transportMeansCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportMeansCodedOther(String value) {
        this.transportMeansCodedOther = value;
    }

}
