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
 * <p>Java class for Measurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Measurement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}MeasurementValue"/>
 *           &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}MeasurementRange"/>
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
@XmlType(name = "Measurement", propOrder = {
    "measurementValue",
    "measurementRange",
    "unitOfMeasurement"
})
public class Measurement {

    @XmlElement(name = "MeasurementValue")
    protected MeasurementValue measurementValue;
    @XmlElement(name = "MeasurementRange")
    protected MeasurementRange measurementRange;
    @XmlElement(name = "UnitOfMeasurement", required = true)
    protected UnitOfMeasurement unitOfMeasurement;

    /**
     * Gets the value of the measurementValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementValue }
     *     
     */
    public MeasurementValue getMeasurementValue() {
        return measurementValue;
    }

    /**
     * Sets the value of the measurementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementValue }
     *     
     */
    public void setMeasurementValue(MeasurementValue value) {
        this.measurementValue = value;
    }

    /**
     * Gets the value of the measurementRange property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementRange }
     *     
     */
    public MeasurementRange getMeasurementRange() {
        return measurementRange;
    }

    /**
     * Sets the value of the measurementRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementRange }
     *     
     */
    public void setMeasurementRange(MeasurementRange value) {
        this.measurementRange = value;
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
