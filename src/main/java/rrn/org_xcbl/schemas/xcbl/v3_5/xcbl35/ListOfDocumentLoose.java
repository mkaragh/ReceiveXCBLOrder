//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.15 at 10:49:09 AM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfDocumentLoose complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfDocumentLoose">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentLoose" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PackageDoc"/>
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
@XmlType(name = "ListOfDocumentLoose", propOrder = {
    "documentLoose"
})
public class ListOfDocumentLoose {

    @XmlElement(name = "DocumentLoose", required = true)
    protected List<ListOfDocumentLoose.DocumentLoose> documentLoose;

    /**
     * Gets the value of the documentLoose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentLoose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentLoose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfDocumentLoose.DocumentLoose }
     * 
     * 
     */
    public List<ListOfDocumentLoose.DocumentLoose> getDocumentLoose() {
        if (documentLoose == null) {
            documentLoose = new ArrayList<ListOfDocumentLoose.DocumentLoose>();
        }
        return this.documentLoose;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PackageDoc"/>
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
        "packageDoc"
    })
    public static class DocumentLoose {

        @XmlElement(name = "PackageDoc", required = true)
        protected PackageDoc packageDoc;

        /**
         * Gets the value of the packageDoc property.
         * 
         * @return
         *     possible object is
         *     {@link PackageDoc }
         *     
         */
        public PackageDoc getPackageDoc() {
            return packageDoc;
        }

        /**
         * Sets the value of the packageDoc property.
         * 
         * @param value
         *     allowed object is
         *     {@link PackageDoc }
         *     
         */
        public void setPackageDoc(PackageDoc value) {
            this.packageDoc = value;
        }

    }

}
