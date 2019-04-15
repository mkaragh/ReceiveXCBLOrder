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
 * <p>Java class for StandardCategoryID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardCategoryID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StandardCategoryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClassificationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TechnicalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardCategoryID", propOrder = {
    "standardCategoryType",
    "classificationID",
    "technicalID"
})
public class StandardCategoryID {

    @XmlElement(name = "StandardCategoryType", required = true)
    protected String standardCategoryType;
    @XmlElement(name = "ClassificationID", required = true)
    protected String classificationID;
    @XmlElement(name = "TechnicalID")
    protected String technicalID;

    /**
     * Gets the value of the standardCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardCategoryType() {
        return standardCategoryType;
    }

    /**
     * Sets the value of the standardCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardCategoryType(String value) {
        this.standardCategoryType = value;
    }

    /**
     * Gets the value of the classificationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationID() {
        return classificationID;
    }

    /**
     * Sets the value of the classificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationID(String value) {
        this.classificationID = value;
    }

    /**
     * Gets the value of the technicalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalID() {
        return technicalID;
    }

    /**
     * Sets the value of the technicalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalID(String value) {
        this.technicalID = value;
    }

}
