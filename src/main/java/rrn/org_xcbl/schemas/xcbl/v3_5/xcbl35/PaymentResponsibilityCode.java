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
 * <p>Java class for PaymentResponsibilityCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentResponsibilityCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PaidByCustomer"/>
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="PaidBySupplier"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentResponsibilityCode")
@XmlEnum
public enum PaymentResponsibilityCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PaidByCustomer")
    PAID_BY_CUSTOMER("PaidByCustomer"),
    @XmlEnumValue("Free")
    FREE("Free"),
    @XmlEnumValue("PaidBySupplier")
    PAID_BY_SUPPLIER("PaidBySupplier");
    private final String value;

    PaymentResponsibilityCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentResponsibilityCode fromValue(String v) {
        for (PaymentResponsibilityCode c: PaymentResponsibilityCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
