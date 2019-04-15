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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quantity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}QuantityValue"/>
 *           &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}QuantityRange"/>
 *         &lt;/choice>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}UnitOfMeasurement"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity", propOrder = {
    "quantityValue",
    "quantityRange",
    "unitOfMeasurement"
})
@XmlSeeAlso({
    QuantityCoded.class
})
public class Quantity {

    @XmlElement(name = "QuantityValue")
    protected QuantityValue quantityValue;
    @XmlElement(name = "QuantityRange")
    protected QuantityRange quantityRange;
    @XmlElement(name = "UnitOfMeasurement", required = true)
    protected UnitOfMeasurement unitOfMeasurement;

    /**
     * Gets the value of the quantityValue property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityValue }
     *     
     */
    public QuantityValue getQuantityValue() {
        return quantityValue;
    }

    /**
     * Sets the value of the quantityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityValue }
     *     
     */
    public void setQuantityValue(QuantityValue value) {
        this.quantityValue = value;
    }

    /**
     * Gets the value of the quantityRange property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityRange }
     *     
     */
    public QuantityRange getQuantityRange() {
        return quantityRange;
    }

    /**
     * Sets the value of the quantityRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityRange }
     *     
     */
    public void setQuantityRange(QuantityRange value) {
        this.quantityRange = value;
    }

    /**
     * Gets the value of the unitOfMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public UnitOfMeasurement getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     * Sets the value of the unitOfMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public void setUnitOfMeasurement(UnitOfMeasurement value) {
        this.unitOfMeasurement = value;
    }

}
