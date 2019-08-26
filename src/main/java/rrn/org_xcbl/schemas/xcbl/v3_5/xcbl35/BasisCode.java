//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.26 at 12:42:50 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasisCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BasisCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Quantity"/>
 *     &lt;enumeration value="Percent"/>
 *     &lt;enumeration value="MonetaryAmount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BasisCode")
@XmlEnum
public enum BasisCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Quantity")
    QUANTITY("Quantity"),
    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("MonetaryAmount")
    MONETARY_AMOUNT("MonetaryAmount");
    private final String value;

    BasisCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BasisCode fromValue(String v) {
        for (BasisCode c: BasisCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
