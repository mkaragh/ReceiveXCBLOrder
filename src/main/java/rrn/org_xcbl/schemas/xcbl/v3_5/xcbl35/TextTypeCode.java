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
 * <p>Java class for TextTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TextTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Deadlines"/>
 *     &lt;enumeration value="Warranties"/>
 *     &lt;enumeration value="PenaltyForBreachOfContract"/>
 *     &lt;enumeration value="Guarantees"/>
 *     &lt;enumeration value="ContractRiders"/>
 *     &lt;enumeration value="Asset"/>
 *     &lt;enumeration value="OtherContractualStipulations"/>
 *     &lt;enumeration value="InfoRecordPOText"/>
 *     &lt;enumeration value="MaterialPOText"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TextTypeCode")
@XmlEnum
public enum TextTypeCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Deadlines")
    DEADLINES("Deadlines"),
    @XmlEnumValue("Warranties")
    WARRANTIES("Warranties"),
    @XmlEnumValue("PenaltyForBreachOfContract")
    PENALTY_FOR_BREACH_OF_CONTRACT("PenaltyForBreachOfContract"),
    @XmlEnumValue("Guarantees")
    GUARANTEES("Guarantees"),
    @XmlEnumValue("ContractRiders")
    CONTRACT_RIDERS("ContractRiders"),
    @XmlEnumValue("Asset")
    ASSET("Asset"),
    @XmlEnumValue("OtherContractualStipulations")
    OTHER_CONTRACTUAL_STIPULATIONS("OtherContractualStipulations"),
    @XmlEnumValue("InfoRecordPOText")
    INFO_RECORD_PO_TEXT("InfoRecordPOText"),
    @XmlEnumValue("MaterialPOText")
    MATERIAL_PO_TEXT("MaterialPOText");
    private final String value;

    TextTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextTypeCode fromValue(String v) {
        for (TextTypeCode c: TextTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
