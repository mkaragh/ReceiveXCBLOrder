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
 * <p>Java class for PackageMark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageMark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackageMarkCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PackageMarkCode"/>
 *         &lt;element name="PackageMarkCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageMarkValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageMark", propOrder = {
    "packageMarkCoded",
    "packageMarkCodedOther",
    "packageMarkValue"
})
public class PackageMark {

    @XmlElement(name = "PackageMarkCoded", required = true)
    protected PackageMarkCode packageMarkCoded;
    @XmlElement(name = "PackageMarkCodedOther")
    protected String packageMarkCodedOther;
    @XmlElement(name = "PackageMarkValue")
    protected String packageMarkValue;

    /**
     * Gets the value of the packageMarkCoded property.
     * 
     * @return
     *     possible object is
     *     {@link PackageMarkCode }
     *     
     */
    public PackageMarkCode getPackageMarkCoded() {
        return packageMarkCoded;
    }

    /**
     * Sets the value of the packageMarkCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageMarkCode }
     *     
     */
    public void setPackageMarkCoded(PackageMarkCode value) {
        this.packageMarkCoded = value;
    }

    /**
     * Gets the value of the packageMarkCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageMarkCodedOther() {
        return packageMarkCodedOther;
    }

    /**
     * Sets the value of the packageMarkCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageMarkCodedOther(String value) {
        this.packageMarkCodedOther = value;
    }

    /**
     * Gets the value of the packageMarkValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageMarkValue() {
        return packageMarkValue;
    }

    /**
     * Sets the value of the packageMarkValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageMarkValue(String value) {
        this.packageMarkValue = value;
    }

}
