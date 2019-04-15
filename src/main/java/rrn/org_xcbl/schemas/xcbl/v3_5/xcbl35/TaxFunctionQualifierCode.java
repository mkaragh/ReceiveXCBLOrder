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
 * <p>Java class for TaxFunctionQualifierCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxFunctionQualifierCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="IndividualDutyTaxOrFeeCustomsItem"/>
 *     &lt;enumeration value="TotalOfAllDutiesTaxesAndFeesCustomsItem"/>
 *     &lt;enumeration value="TotalOfEachDutyTaxOrFeeTypeCustomsDeclaration"/>
 *     &lt;enumeration value="TotalOfAllDutiesTaxesAndFeeTypesCustomsDeclaration"/>
 *     &lt;enumeration value="CustomsDuty"/>
 *     &lt;enumeration value="Fee"/>
 *     &lt;enumeration value="Tax"/>
 *     &lt;enumeration value="TaxRelatedInformation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxFunctionQualifierCode")
@XmlEnum
public enum TaxFunctionQualifierCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("IndividualDutyTaxOrFeeCustomsItem")
    INDIVIDUAL_DUTY_TAX_OR_FEE_CUSTOMS_ITEM("IndividualDutyTaxOrFeeCustomsItem"),
    @XmlEnumValue("TotalOfAllDutiesTaxesAndFeesCustomsItem")
    TOTAL_OF_ALL_DUTIES_TAXES_AND_FEES_CUSTOMS_ITEM("TotalOfAllDutiesTaxesAndFeesCustomsItem"),
    @XmlEnumValue("TotalOfEachDutyTaxOrFeeTypeCustomsDeclaration")
    TOTAL_OF_EACH_DUTY_TAX_OR_FEE_TYPE_CUSTOMS_DECLARATION("TotalOfEachDutyTaxOrFeeTypeCustomsDeclaration"),
    @XmlEnumValue("TotalOfAllDutiesTaxesAndFeeTypesCustomsDeclaration")
    TOTAL_OF_ALL_DUTIES_TAXES_AND_FEE_TYPES_CUSTOMS_DECLARATION("TotalOfAllDutiesTaxesAndFeeTypesCustomsDeclaration"),
    @XmlEnumValue("CustomsDuty")
    CUSTOMS_DUTY("CustomsDuty"),
    @XmlEnumValue("Fee")
    FEE("Fee"),
    @XmlEnumValue("Tax")
    TAX("Tax"),
    @XmlEnumValue("TaxRelatedInformation")
    TAX_RELATED_INFORMATION("TaxRelatedInformation");
    private final String value;

    TaxFunctionQualifierCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxFunctionQualifierCode fromValue(String v) {
        for (TaxFunctionQualifierCode c: TaxFunctionQualifierCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
