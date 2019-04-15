//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.15 at 10:49:09 AM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurposeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurposeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Cancellation"/>
 *     &lt;enumeration value="Replace"/>
 *     &lt;enumeration value="Confirmation"/>
 *     &lt;enumeration value="Duplicate"/>
 *     &lt;enumeration value="Original"/>
 *     &lt;enumeration value="Change"/>
 *     &lt;enumeration value="InformationOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurposeCode")
@XmlEnum
public enum PurposeCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),
    @XmlEnumValue("Replace")
    REPLACE("Replace"),
    @XmlEnumValue("Confirmation")
    CONFIRMATION("Confirmation"),
    @XmlEnumValue("Duplicate")
    DUPLICATE("Duplicate"),
    @XmlEnumValue("Original")
    ORIGINAL("Original"),
    @XmlEnumValue("Change")
    CHANGE("Change"),
    @XmlEnumValue("InformationOnly")
    INFORMATION_ONLY("InformationOnly");
    private final String value;

    PurposeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurposeCode fromValue(String v) {
        for (PurposeCode c: PurposeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
