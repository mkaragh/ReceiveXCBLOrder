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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PartyCoded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyCoded">
 *   &lt;complexContent>
 *     &lt;extension base="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Party">
 *       &lt;sequence>
 *         &lt;element name="PartyRoleCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PartyRoleCode"/>
 *         &lt;element name="PartyRoleCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyCoded", propOrder = {
    "partyRoleCoded",
    "partyRoleCodedOther"
})
public class PartyCoded
    extends Party
{

    @XmlElement(name = "PartyRoleCoded", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String partyRoleCoded;
    @XmlElement(name = "PartyRoleCodedOther")
    protected String partyRoleCodedOther;

    /**
     * Gets the value of the partyRoleCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleCoded() {
        return partyRoleCoded;
    }

    /**
     * Sets the value of the partyRoleCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleCoded(String value) {
        this.partyRoleCoded = value;
    }

    /**
     * Gets the value of the partyRoleCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleCodedOther() {
        return partyRoleCodedOther;
    }

    /**
     * Sets the value of the partyRoleCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleCodedOther(String value) {
        this.partyRoleCodedOther = value;
    }

}
