//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.04 at 03:22:36 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipToLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Location"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ShipFromLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Location"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfScheduleLine" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ItemPackagingReference" minOccurs="0"/>
 *         &lt;element name="SimplePackageNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}TermsOfDelivery" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}CargoClassification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryDetail", propOrder = {
    "shipToLocation",
    "shipFromLocation",
    "listOfScheduleLine",
    "itemPackagingReference",
    "simplePackageNote",
    "termsOfDelivery",
    "cargoClassification"
})
public class DeliveryDetail {

    @XmlElement(name = "ShipToLocation")
    protected DeliveryDetail.ShipToLocation shipToLocation;
    @XmlElement(name = "ShipFromLocation")
    protected DeliveryDetail.ShipFromLocation shipFromLocation;
    @XmlElement(name = "ListOfScheduleLine")
    protected ListOfScheduleLine listOfScheduleLine;
    @XmlElement(name = "ItemPackagingReference")
    protected ItemPackagingReference itemPackagingReference;
    @XmlElement(name = "SimplePackageNote")
    protected String simplePackageNote;
    @XmlElement(name = "TermsOfDelivery")
    protected List<TermsOfDelivery> termsOfDelivery;
    @XmlElement(name = "CargoClassification")
    protected CargoClassification cargoClassification;

    /**
     * Gets the value of the shipToLocation property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDetail.ShipToLocation }
     *     
     */
    public DeliveryDetail.ShipToLocation getShipToLocation() {
        return shipToLocation;
    }

    /**
     * Sets the value of the shipToLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDetail.ShipToLocation }
     *     
     */
    public void setShipToLocation(DeliveryDetail.ShipToLocation value) {
        this.shipToLocation = value;
    }

    /**
     * Gets the value of the shipFromLocation property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDetail.ShipFromLocation }
     *     
     */
    public DeliveryDetail.ShipFromLocation getShipFromLocation() {
        return shipFromLocation;
    }

    /**
     * Sets the value of the shipFromLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDetail.ShipFromLocation }
     *     
     */
    public void setShipFromLocation(DeliveryDetail.ShipFromLocation value) {
        this.shipFromLocation = value;
    }

    /**
     * Gets the value of the listOfScheduleLine property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfScheduleLine }
     *     
     */
    public ListOfScheduleLine getListOfScheduleLine() {
        return listOfScheduleLine;
    }

    /**
     * Sets the value of the listOfScheduleLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfScheduleLine }
     *     
     */
    public void setListOfScheduleLine(ListOfScheduleLine value) {
        this.listOfScheduleLine = value;
    }

    /**
     * Gets the value of the itemPackagingReference property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPackagingReference }
     *     
     */
    public ItemPackagingReference getItemPackagingReference() {
        return itemPackagingReference;
    }

    /**
     * Sets the value of the itemPackagingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPackagingReference }
     *     
     */
    public void setItemPackagingReference(ItemPackagingReference value) {
        this.itemPackagingReference = value;
    }

    /**
     * Gets the value of the simplePackageNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimplePackageNote() {
        return simplePackageNote;
    }

    /**
     * Sets the value of the simplePackageNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimplePackageNote(String value) {
        this.simplePackageNote = value;
    }

    /**
     * Gets the value of the termsOfDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the termsOfDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermsOfDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermsOfDelivery }
     * 
     * 
     */
    public List<TermsOfDelivery> getTermsOfDelivery() {
        if (termsOfDelivery == null) {
            termsOfDelivery = new ArrayList<TermsOfDelivery>();
        }
        return this.termsOfDelivery;
    }

    /**
     * Gets the value of the cargoClassification property.
     * 
     * @return
     *     possible object is
     *     {@link CargoClassification }
     *     
     */
    public CargoClassification getCargoClassification() {
        return cargoClassification;
    }

    /**
     * Sets the value of the cargoClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CargoClassification }
     *     
     */
    public void setCargoClassification(CargoClassification value) {
        this.cargoClassification = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Location"/>
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
        "location"
    })
    public static class ShipFromLocation {

        @XmlElement(name = "Location", required = true)
        protected Location location;

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link Location }
         *     
         */
        public Location getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link Location }
         *     
         */
        public void setLocation(Location value) {
            this.location = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Location"/>
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
        "location"
    })
    public static class ShipToLocation {

        @XmlElement(name = "Location", required = true)
        protected Location location;

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link Location }
         *     
         */
        public Location getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link Location }
         *     
         */
        public void setLocation(Location value) {
            this.location = value;
        }

    }

}
