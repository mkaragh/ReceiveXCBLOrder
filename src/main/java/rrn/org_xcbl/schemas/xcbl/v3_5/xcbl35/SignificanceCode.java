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
 * <p>Java class for SignificanceCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SignificanceCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Approximately"/>
 *     &lt;enumeration value="EqualTo"/>
 *     &lt;enumeration value="GreaterThanOrEqualTo"/>
 *     &lt;enumeration value="GreaterThan"/>
 *     &lt;enumeration value="LessThan"/>
 *     &lt;enumeration value="LessThanOrEqualTo"/>
 *     &lt;enumeration value="NotEqualTo"/>
 *     &lt;enumeration value="Trace"/>
 *     &lt;enumeration value="TrueValue"/>
 *     &lt;enumeration value="ObservedValue"/>
 *     &lt;enumeration value="OutOfRange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignificanceCode")
@XmlEnum
public enum SignificanceCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Approximately")
    APPROXIMATELY("Approximately"),
    @XmlEnumValue("EqualTo")
    EQUAL_TO("EqualTo"),
    @XmlEnumValue("GreaterThanOrEqualTo")
    GREATER_THAN_OR_EQUAL_TO("GreaterThanOrEqualTo"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("LessThanOrEqualTo")
    LESS_THAN_OR_EQUAL_TO("LessThanOrEqualTo"),
    @XmlEnumValue("NotEqualTo")
    NOT_EQUAL_TO("NotEqualTo"),
    @XmlEnumValue("Trace")
    TRACE("Trace"),
    @XmlEnumValue("TrueValue")
    TRUE_VALUE("TrueValue"),
    @XmlEnumValue("ObservedValue")
    OBSERVED_VALUE("ObservedValue"),
    @XmlEnumValue("OutOfRange")
    OUT_OF_RANGE("OutOfRange");
    private final String value;

    SignificanceCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignificanceCode fromValue(String v) {
        for (SignificanceCode c: SignificanceCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
