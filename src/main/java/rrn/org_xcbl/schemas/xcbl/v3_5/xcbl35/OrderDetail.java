//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.04 at 03:22:36 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfItemDetail"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfPackageDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDetail", propOrder = {
    "listOfItemDetail",
    "listOfPackageDetail"
})
public class OrderDetail {

    @XmlElement(name = "ListOfItemDetail", required = true)
    protected ListOfItemDetail listOfItemDetail;
    @XmlElement(name = "ListOfPackageDetail")
    protected ListOfPackageDetail listOfPackageDetail;

    /**
     * Gets the value of the listOfItemDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfItemDetail }
     *     
     */
    public ListOfItemDetail getListOfItemDetail() {
        return listOfItemDetail;
    }

    /**
     * Sets the value of the listOfItemDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfItemDetail }
     *     
     */
    public void setListOfItemDetail(ListOfItemDetail value) {
        this.listOfItemDetail = value;
    }

    /**
     * Gets the value of the listOfPackageDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPackageDetail }
     *     
     */
    public ListOfPackageDetail getListOfPackageDetail() {
        return listOfPackageDetail;
    }

    /**
     * Sets the value of the listOfPackageDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPackageDetail }
     *     
     */
    public void setListOfPackageDetail(ListOfPackageDetail value) {
        this.listOfPackageDetail = value;
    }

}
