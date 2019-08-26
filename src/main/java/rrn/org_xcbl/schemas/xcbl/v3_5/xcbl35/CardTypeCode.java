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
 * <p>Java class for CardTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="AMEX"/>
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="JCB"/>
 *     &lt;enumeration value="Diners"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardTypeCode")
@XmlEnum
public enum CardTypeCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    AMEX("AMEX"),
    VISA("VISA"),
    MC("MC"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    JCB("JCB"),
    @XmlEnumValue("Diners")
    DINERS("Diners");
    private final String value;

    CardTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardTypeCode fromValue(String v) {
        for (CardTypeCode c: CardTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
