//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.04 at 03:22:36 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentSystemCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentSystemCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="OrdinaryPost"/>
 *     &lt;enumeration value="AirMail"/>
 *     &lt;enumeration value="BillPayment"/>
 *     &lt;enumeration value="ConsumerEmployeeCheck"/>
 *     &lt;enumeration value="CashConcentrationDisbursement"/>
 *     &lt;enumeration value="CashConcentrationDisbursementPlusAddenda"/>
 *     &lt;enumeration value="CustomerInitiatedEntry"/>
 *     &lt;enumeration value="CustomerInitiatedEntryPlusAddenda"/>
 *     &lt;enumeration value="CorporateTradeExchange"/>
 *     &lt;enumeration value="CorporateCheck"/>
 *     &lt;enumeration value="Telegraph"/>
 *     &lt;enumeration value="Telex"/>
 *     &lt;enumeration value="SWIFT"/>
 *     &lt;enumeration value="OtherTransmissionNetworks"/>
 *     &lt;enumeration value="NetworksNotDefined"/>
 *     &lt;enumeration value="Fedwire"/>
 *     &lt;enumeration value="Personal-Face-To-Face"/>
 *     &lt;enumeration value="PrearrangedPaymentAndDeposit"/>
 *     &lt;enumeration value="PrearrangedPaymentAndDepositPlusAddenda"/>
 *     &lt;enumeration value="PreauthorizedDraft"/>
 *     &lt;enumeration value="RegisteredAirMail"/>
 *     &lt;enumeration value="RegisteredMail"/>
 *     &lt;enumeration value="Courier"/>
 *     &lt;enumeration value="Messenger"/>
 *     &lt;enumeration value="NationalACH"/>
 *     &lt;enumeration value="OtherACH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentSystemCode")
@XmlEnum
public enum PaymentSystemCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("OrdinaryPost")
    ORDINARY_POST("OrdinaryPost"),
    @XmlEnumValue("AirMail")
    AIR_MAIL("AirMail"),
    @XmlEnumValue("BillPayment")
    BILL_PAYMENT("BillPayment"),
    @XmlEnumValue("ConsumerEmployeeCheck")
    CONSUMER_EMPLOYEE_CHECK("ConsumerEmployeeCheck"),
    @XmlEnumValue("CashConcentrationDisbursement")
    CASH_CONCENTRATION_DISBURSEMENT("CashConcentrationDisbursement"),
    @XmlEnumValue("CashConcentrationDisbursementPlusAddenda")
    CASH_CONCENTRATION_DISBURSEMENT_PLUS_ADDENDA("CashConcentrationDisbursementPlusAddenda"),
    @XmlEnumValue("CustomerInitiatedEntry")
    CUSTOMER_INITIATED_ENTRY("CustomerInitiatedEntry"),
    @XmlEnumValue("CustomerInitiatedEntryPlusAddenda")
    CUSTOMER_INITIATED_ENTRY_PLUS_ADDENDA("CustomerInitiatedEntryPlusAddenda"),
    @XmlEnumValue("CorporateTradeExchange")
    CORPORATE_TRADE_EXCHANGE("CorporateTradeExchange"),
    @XmlEnumValue("CorporateCheck")
    CORPORATE_CHECK("CorporateCheck"),
    @XmlEnumValue("Telegraph")
    TELEGRAPH("Telegraph"),
    @XmlEnumValue("Telex")
    TELEX("Telex"),
    SWIFT("SWIFT"),
    @XmlEnumValue("OtherTransmissionNetworks")
    OTHER_TRANSMISSION_NETWORKS("OtherTransmissionNetworks"),
    @XmlEnumValue("NetworksNotDefined")
    NETWORKS_NOT_DEFINED("NetworksNotDefined"),
    @XmlEnumValue("Fedwire")
    FEDWIRE("Fedwire"),
    @XmlEnumValue("Personal-Face-To-Face")
    PERSONAL_FACE_TO_FACE("Personal-Face-To-Face"),
    @XmlEnumValue("PrearrangedPaymentAndDeposit")
    PREARRANGED_PAYMENT_AND_DEPOSIT("PrearrangedPaymentAndDeposit"),
    @XmlEnumValue("PrearrangedPaymentAndDepositPlusAddenda")
    PREARRANGED_PAYMENT_AND_DEPOSIT_PLUS_ADDENDA("PrearrangedPaymentAndDepositPlusAddenda"),
    @XmlEnumValue("PreauthorizedDraft")
    PREAUTHORIZED_DRAFT("PreauthorizedDraft"),
    @XmlEnumValue("RegisteredAirMail")
    REGISTERED_AIR_MAIL("RegisteredAirMail"),
    @XmlEnumValue("RegisteredMail")
    REGISTERED_MAIL("RegisteredMail"),
    @XmlEnumValue("Courier")
    COURIER("Courier"),
    @XmlEnumValue("Messenger")
    MESSENGER("Messenger"),
    @XmlEnumValue("NationalACH")
    NATIONAL_ACH("NationalACH"),
    @XmlEnumValue("OtherACH")
    OTHER_ACH("OtherACH");
    private final String value;

    PaymentSystemCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentSystemCode fromValue(String v) {
        for (PaymentSystemCode c: PaymentSystemCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
