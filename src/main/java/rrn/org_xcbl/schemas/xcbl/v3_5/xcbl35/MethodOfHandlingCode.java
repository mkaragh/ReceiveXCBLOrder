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
 * <p>Java class for MethodOfHandlingCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MethodOfHandlingCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="BillBack"/>
 *     &lt;enumeration value="OffInvoice"/>
 *     &lt;enumeration value="VendorCheckToCustomer"/>
 *     &lt;enumeration value="CreditCustomerAccount"/>
 *     &lt;enumeration value="ChargeToBePaidByVendor"/>
 *     &lt;enumeration value="ChargeToBePaidByCustomer"/>
 *     &lt;enumeration value="Optional"/>
 *     &lt;enumeration value="OffGrossQuantityInvoiced"/>
 *     &lt;enumeration value="AllowanceToBeIssuedByVendor"/>
 *     &lt;enumeration value="AllowanceToBeIssuedByReseller"/>
 *     &lt;enumeration value="ChargeDeniedByVendor"/>
 *     &lt;enumeration value="CancelAllowance"/>
 *     &lt;enumeration value="ProvideAmount"/>
 *     &lt;enumeration value="InformationOnly"/>
 *     &lt;enumeration value="Non-PayableTax"/>
 *     &lt;enumeration value="AccrualFund"/>
 *     &lt;enumeration value="FlatFund"/>
 *     &lt;enumeration value="CashInAdvance"/>
 *     &lt;enumeration value="CalculateAndAddtoInvoice"/>
 *     &lt;enumeration value="Collect"/>
 *     &lt;enumeration value="Prepaid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MethodOfHandlingCode")
@XmlEnum
public enum MethodOfHandlingCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("BillBack")
    BILL_BACK("BillBack"),
    @XmlEnumValue("OffInvoice")
    OFF_INVOICE("OffInvoice"),
    @XmlEnumValue("VendorCheckToCustomer")
    VENDOR_CHECK_TO_CUSTOMER("VendorCheckToCustomer"),
    @XmlEnumValue("CreditCustomerAccount")
    CREDIT_CUSTOMER_ACCOUNT("CreditCustomerAccount"),
    @XmlEnumValue("ChargeToBePaidByVendor")
    CHARGE_TO_BE_PAID_BY_VENDOR("ChargeToBePaidByVendor"),
    @XmlEnumValue("ChargeToBePaidByCustomer")
    CHARGE_TO_BE_PAID_BY_CUSTOMER("ChargeToBePaidByCustomer"),
    @XmlEnumValue("Optional")
    OPTIONAL("Optional"),
    @XmlEnumValue("OffGrossQuantityInvoiced")
    OFF_GROSS_QUANTITY_INVOICED("OffGrossQuantityInvoiced"),
    @XmlEnumValue("AllowanceToBeIssuedByVendor")
    ALLOWANCE_TO_BE_ISSUED_BY_VENDOR("AllowanceToBeIssuedByVendor"),
    @XmlEnumValue("AllowanceToBeIssuedByReseller")
    ALLOWANCE_TO_BE_ISSUED_BY_RESELLER("AllowanceToBeIssuedByReseller"),
    @XmlEnumValue("ChargeDeniedByVendor")
    CHARGE_DENIED_BY_VENDOR("ChargeDeniedByVendor"),
    @XmlEnumValue("CancelAllowance")
    CANCEL_ALLOWANCE("CancelAllowance"),
    @XmlEnumValue("ProvideAmount")
    PROVIDE_AMOUNT("ProvideAmount"),
    @XmlEnumValue("InformationOnly")
    INFORMATION_ONLY("InformationOnly"),
    @XmlEnumValue("Non-PayableTax")
    NON_PAYABLE_TAX("Non-PayableTax"),
    @XmlEnumValue("AccrualFund")
    ACCRUAL_FUND("AccrualFund"),
    @XmlEnumValue("FlatFund")
    FLAT_FUND("FlatFund"),
    @XmlEnumValue("CashInAdvance")
    CASH_IN_ADVANCE("CashInAdvance"),
    @XmlEnumValue("CalculateAndAddtoInvoice")
    CALCULATE_AND_ADDTO_INVOICE("CalculateAndAddtoInvoice"),
    @XmlEnumValue("Collect")
    COLLECT("Collect"),
    @XmlEnumValue("Prepaid")
    PREPAID("Prepaid");
    private final String value;

    MethodOfHandlingCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MethodOfHandlingCode fromValue(String v) {
        for (MethodOfHandlingCode c: MethodOfHandlingCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
