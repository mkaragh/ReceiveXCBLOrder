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
 * <p>Java class for IndicatorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndicatorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="About"/>
 *     &lt;enumeration value="Adjustment"/>
 *     &lt;enumeration value="Allowance"/>
 *     &lt;enumeration value="AllowanceLineItems"/>
 *     &lt;enumeration value="AllowanceMessage"/>
 *     &lt;enumeration value="AllowancePerCallOf"/>
 *     &lt;enumeration value="AllowanceRequest"/>
 *     &lt;enumeration value="Charge"/>
 *     &lt;enumeration value="ChargeLineItems"/>
 *     &lt;enumeration value="ChargeMessage"/>
 *     &lt;enumeration value="ChargePerCallOf"/>
 *     &lt;enumeration value="ChargeRequest"/>
 *     &lt;enumeration value="Exact"/>
 *     &lt;enumeration value="LineItemAllowance"/>
 *     &lt;enumeration value="LineItemCharge"/>
 *     &lt;enumeration value="Maximum"/>
 *     &lt;enumeration value="Minus-Amount"/>
 *     &lt;enumeration value="Minus-Percentage"/>
 *     &lt;enumeration value="NoAllowance"/>
 *     &lt;enumeration value="NoAllowanceOrCharge"/>
 *     &lt;enumeration value="NoCharge"/>
 *     &lt;enumeration value="Plus-Amount"/>
 *     &lt;enumeration value="Plus-Percentage"/>
 *     &lt;enumeration value="PlusOrMinusOrAmount"/>
 *     &lt;enumeration value="PlusOrMinus-Percentage"/>
 *     &lt;enumeration value="Promotion"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="TotalOther"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndicatorCode")
@XmlEnum
public enum IndicatorCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("About")
    ABOUT("About"),
    @XmlEnumValue("Adjustment")
    ADJUSTMENT("Adjustment"),
    @XmlEnumValue("Allowance")
    ALLOWANCE("Allowance"),
    @XmlEnumValue("AllowanceLineItems")
    ALLOWANCE_LINE_ITEMS("AllowanceLineItems"),
    @XmlEnumValue("AllowanceMessage")
    ALLOWANCE_MESSAGE("AllowanceMessage"),
    @XmlEnumValue("AllowancePerCallOf")
    ALLOWANCE_PER_CALL_OF("AllowancePerCallOf"),
    @XmlEnumValue("AllowanceRequest")
    ALLOWANCE_REQUEST("AllowanceRequest"),
    @XmlEnumValue("Charge")
    CHARGE("Charge"),
    @XmlEnumValue("ChargeLineItems")
    CHARGE_LINE_ITEMS("ChargeLineItems"),
    @XmlEnumValue("ChargeMessage")
    CHARGE_MESSAGE("ChargeMessage"),
    @XmlEnumValue("ChargePerCallOf")
    CHARGE_PER_CALL_OF("ChargePerCallOf"),
    @XmlEnumValue("ChargeRequest")
    CHARGE_REQUEST("ChargeRequest"),
    @XmlEnumValue("Exact")
    EXACT("Exact"),
    @XmlEnumValue("LineItemAllowance")
    LINE_ITEM_ALLOWANCE("LineItemAllowance"),
    @XmlEnumValue("LineItemCharge")
    LINE_ITEM_CHARGE("LineItemCharge"),
    @XmlEnumValue("Maximum")
    MAXIMUM("Maximum"),
    @XmlEnumValue("Minus-Amount")
    MINUS_AMOUNT("Minus-Amount"),
    @XmlEnumValue("Minus-Percentage")
    MINUS_PERCENTAGE("Minus-Percentage"),
    @XmlEnumValue("NoAllowance")
    NO_ALLOWANCE("NoAllowance"),
    @XmlEnumValue("NoAllowanceOrCharge")
    NO_ALLOWANCE_OR_CHARGE("NoAllowanceOrCharge"),
    @XmlEnumValue("NoCharge")
    NO_CHARGE("NoCharge"),
    @XmlEnumValue("Plus-Amount")
    PLUS_AMOUNT("Plus-Amount"),
    @XmlEnumValue("Plus-Percentage")
    PLUS_PERCENTAGE("Plus-Percentage"),
    @XmlEnumValue("PlusOrMinusOrAmount")
    PLUS_OR_MINUS_OR_AMOUNT("PlusOrMinusOrAmount"),
    @XmlEnumValue("PlusOrMinus-Percentage")
    PLUS_OR_MINUS_PERCENTAGE("PlusOrMinus-Percentage"),
    @XmlEnumValue("Promotion")
    PROMOTION("Promotion"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("TotalOther")
    TOTAL_OTHER("TotalOther");
    private final String value;

    IndicatorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndicatorCode fromValue(String v) {
        for (IndicatorCode c: IndicatorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
