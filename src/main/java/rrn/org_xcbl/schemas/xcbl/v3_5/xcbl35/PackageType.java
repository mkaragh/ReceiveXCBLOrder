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
 * <p>Java class for PackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackageTypeCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PackageTypeCode"/>
 *         &lt;element name="PackageTypeCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageTypeDescription" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfDescription"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType", propOrder = {
    "packageTypeCoded",
    "packageTypeCodedOther",
    "packageTypeDescription"
})
public class PackageType {

    @XmlElement(name = "PackageTypeCoded", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String packageTypeCoded;
    @XmlElement(name = "PackageTypeCodedOther")
    protected String packageTypeCodedOther;
    @XmlElement(name = "PackageTypeDescription")
    protected PackageType.PackageTypeDescription packageTypeDescription;

    /**
     * Gets the value of the packageTypeCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTypeCoded() {
        return packageTypeCoded;
    }

    /**
     * Sets the value of the packageTypeCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTypeCoded(String value) {
        this.packageTypeCoded = value;
    }

    /**
     * Gets the value of the packageTypeCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTypeCodedOther() {
        return packageTypeCodedOther;
    }

    /**
     * Sets the value of the packageTypeCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTypeCodedOther(String value) {
        this.packageTypeCodedOther = value;
    }

    /**
     * Gets the value of the packageTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PackageType.PackageTypeDescription }
     *     
     */
    public PackageType.PackageTypeDescription getPackageTypeDescription() {
        return packageTypeDescription;
    }

    /**
     * Sets the value of the packageTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType.PackageTypeDescription }
     *     
     */
    public void setPackageTypeDescription(PackageType.PackageTypeDescription value) {
        this.packageTypeDescription = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfDescription"/>
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
        "listOfDescription"
    })
    public static class PackageTypeDescription {

        @XmlElement(name = "ListOfDescription", required = true)
        protected ListOfDescription listOfDescription;

        /**
         * Gets the value of the listOfDescription property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfDescription }
         *     
         */
        public ListOfDescription getListOfDescription() {
            return listOfDescription;
        }

        /**
         * Sets the value of the listOfDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfDescription }
         *     
         */
        public void setListOfDescription(ListOfDescription value) {
            this.listOfDescription = value;
        }

    }

}
