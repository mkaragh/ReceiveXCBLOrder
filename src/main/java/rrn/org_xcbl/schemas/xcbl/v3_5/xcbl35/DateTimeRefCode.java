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
 * <p>Java class for DateTimeRefCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateTimeRefCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="AnticipatedDeliveryDate"/>
 *     &lt;enumeration value="ApprovalOfGageDate"/>
 *     &lt;enumeration value="ApprovalOfSampleDate"/>
 *     &lt;enumeration value="CompletionAndAcceptanceDate"/>
 *     &lt;enumeration value="CustomsClearanceDateExport"/>
 *     &lt;enumeration value="CustomsClearanceDateImport"/>
 *     &lt;enumeration value="DateCreditNoteReceived"/>
 *     &lt;enumeration value="DateExWorks"/>
 *     &lt;enumeration value="DateGoodsHandedOverForShipmentBySellerOrAgent"/>
 *     &lt;enumeration value="DateGoodsReceivedByBuyer"/>
 *     &lt;enumeration value="DateGoodsReceivedByBuyersAgent"/>
 *     &lt;enumeration value="DateGoodsReceivedByCarrier"/>
 *     &lt;enumeration value="DateInvoiceReceived"/>
 *     &lt;enumeration value="DateOfAcceptanceOfFirstSamplesProducedUnderProductionConditions"/>
 *     &lt;enumeration value="DateOfAcceptanceOfNegotiableInstrument"/>
 *     &lt;enumeration value="DateOfAcceptanceOfTooling"/>
 *     &lt;enumeration value="DateOfArrivalOfTransport"/>
 *     &lt;enumeration value="DateOfBillOfLadingConsignmentNoteOrOtherTransportDocument"/>
 *     &lt;enumeration value="DateOfCertificateOfFinalAcceptance"/>
 *     &lt;enumeration value="DateOfCertificateOfPreliminaryAcceptance"/>
 *     &lt;enumeration value="DateOfConfirmation"/>
 *     &lt;enumeration value="DateOfConfirmationOfOrderReceived"/>
 *     &lt;enumeration value="DateOfContract"/>
 *     &lt;enumeration value="DateOfCreditNote"/>
 *     &lt;enumeration value="DeliveryDate"/>
 *     &lt;enumeration value="DateOfDeliveryOfGoodsToEstablishmentsDomicileSite"/>
 *     &lt;enumeration value="DateOfDeliveryToBuyerOfDocumentsRepresentingGoods"/>
 *     &lt;enumeration value="DateOfDeliveryToBuyersAgentOfDocumentsRepresentingGoods"/>
 *     &lt;enumeration value="DateOfDeliveryToCarrierOfDocumentsRepresentingGoods"/>
 *     &lt;enumeration value="DateOfDeliveryToIntermediaryBankOfDocumentsRepresentingGood"/>
 *     &lt;enumeration value="DateOfEndOfWork"/>
 *     &lt;enumeration value="DateOfFinalAcceptanceOfWork"/>
 *     &lt;enumeration value="DateOfInvoice"/>
 *     &lt;enumeration value="DateOfInwardFrontierCrossing"/>
 *     &lt;enumeration value="DateOfIssueOfTransportDocument"/>
 *     &lt;enumeration value="DateOfNegotiableInstrumentDraftPromissoryNoteBank"/>
 *     &lt;enumeration value="DateOfOrder"/>
 *     &lt;enumeration value="DateOfOutwardFrontierCrossing"/>
 *     &lt;enumeration value="DateOfPresentationOfDocuments"/>
 *     &lt;enumeration value="DateOfPresentationOfNegotiableInstrument"/>
 *     &lt;enumeration value="DateOfPresentDocument"/>
 *     &lt;enumeration value="DateOfProvisionalReceptionOfWork"/>
 *     &lt;enumeration value="DateOfReceiptForLoadingMatesReceipt"/>
 *     &lt;enumeration value="DateOfReceiptOfToolDependentInitialSamplesPlusUnlimitedAbsoluteBankGuaranteePlusValueAddedTax"/>
 *     &lt;enumeration value="DateOfReceiptOfTooling"/>
 *     &lt;enumeration value="DateOfResaleByBuyer"/>
 *     &lt;enumeration value="DateOfSalaryPayment"/>
 *     &lt;enumeration value="ShipDate"/>
 *     &lt;enumeration value="DateOfShipmentAsEvidencedByTheTransportDocument"/>
 *     &lt;enumeration value="DateOfSignatureOfContract"/>
 *     &lt;enumeration value="DateOfStartOfWork"/>
 *     &lt;enumeration value="DatePresentDocumentReceived"/>
 *     &lt;enumeration value="DateProceedsOfResaleCollectedByBuyer"/>
 *     &lt;enumeration value="DraftAtDaysAfterDateOfIssuanceOfTransportDocument"/>
 *     &lt;enumeration value="DraftAtDaysAfterDateOfPresentationOfDocuments"/>
 *     &lt;enumeration value="DraftAtDaysDate"/>
 *     &lt;enumeration value="DraftAtDaysSight"/>
 *     &lt;enumeration value="DueDateOfNegotiableInstrument"/>
 *     &lt;enumeration value="EffectiveDate"/>
 *     &lt;enumeration value="InvoiceDate"/>
 *     &lt;enumeration value="InvoiceReceiptDate"/>
 *     &lt;enumeration value="InvoiceTransmissionDate"/>
 *     &lt;enumeration value="InvoiceVerificationDate"/>
 *     &lt;enumeration value="OtherReferenceDateAgreedUponBetweenTheParties"/>
 *     &lt;enumeration value="PaymentDate"/>
 *     &lt;enumeration value="PaymentDueDate"/>
 *     &lt;enumeration value="PurchaseOrderDate"/>
 *     &lt;enumeration value="QualityApprovalDate"/>
 *     &lt;enumeration value="QuarterStartDate"/>
 *     &lt;enumeration value="ReceiptOfGoods"/>
 *     &lt;enumeration value="RequestedDateOfDelivery"/>
 *     &lt;enumeration value="SpecifiedDate"/>
 *     &lt;enumeration value="SpecifiedDraftDate"/>
 *     &lt;enumeration value="StipulatedDateForAcceptanceOfDocumentaryCredit"/>
 *     &lt;enumeration value="StipulatedDateForNegotiationOfDocumentaryCredit"/>
 *     &lt;enumeration value="StipulatedDateForPaymentOfDocumentaryCredit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DateTimeRefCode")
@XmlEnum
public enum DateTimeRefCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("AnticipatedDeliveryDate")
    ANTICIPATED_DELIVERY_DATE("AnticipatedDeliveryDate"),
    @XmlEnumValue("ApprovalOfGageDate")
    APPROVAL_OF_GAGE_DATE("ApprovalOfGageDate"),
    @XmlEnumValue("ApprovalOfSampleDate")
    APPROVAL_OF_SAMPLE_DATE("ApprovalOfSampleDate"),
    @XmlEnumValue("CompletionAndAcceptanceDate")
    COMPLETION_AND_ACCEPTANCE_DATE("CompletionAndAcceptanceDate"),
    @XmlEnumValue("CustomsClearanceDateExport")
    CUSTOMS_CLEARANCE_DATE_EXPORT("CustomsClearanceDateExport"),
    @XmlEnumValue("CustomsClearanceDateImport")
    CUSTOMS_CLEARANCE_DATE_IMPORT("CustomsClearanceDateImport"),
    @XmlEnumValue("DateCreditNoteReceived")
    DATE_CREDIT_NOTE_RECEIVED("DateCreditNoteReceived"),
    @XmlEnumValue("DateExWorks")
    DATE_EX_WORKS("DateExWorks"),
    @XmlEnumValue("DateGoodsHandedOverForShipmentBySellerOrAgent")
    DATE_GOODS_HANDED_OVER_FOR_SHIPMENT_BY_SELLER_OR_AGENT("DateGoodsHandedOverForShipmentBySellerOrAgent"),
    @XmlEnumValue("DateGoodsReceivedByBuyer")
    DATE_GOODS_RECEIVED_BY_BUYER("DateGoodsReceivedByBuyer"),
    @XmlEnumValue("DateGoodsReceivedByBuyersAgent")
    DATE_GOODS_RECEIVED_BY_BUYERS_AGENT("DateGoodsReceivedByBuyersAgent"),
    @XmlEnumValue("DateGoodsReceivedByCarrier")
    DATE_GOODS_RECEIVED_BY_CARRIER("DateGoodsReceivedByCarrier"),
    @XmlEnumValue("DateInvoiceReceived")
    DATE_INVOICE_RECEIVED("DateInvoiceReceived"),
    @XmlEnumValue("DateOfAcceptanceOfFirstSamplesProducedUnderProductionConditions")
    DATE_OF_ACCEPTANCE_OF_FIRST_SAMPLES_PRODUCED_UNDER_PRODUCTION_CONDITIONS("DateOfAcceptanceOfFirstSamplesProducedUnderProductionConditions"),
    @XmlEnumValue("DateOfAcceptanceOfNegotiableInstrument")
    DATE_OF_ACCEPTANCE_OF_NEGOTIABLE_INSTRUMENT("DateOfAcceptanceOfNegotiableInstrument"),
    @XmlEnumValue("DateOfAcceptanceOfTooling")
    DATE_OF_ACCEPTANCE_OF_TOOLING("DateOfAcceptanceOfTooling"),
    @XmlEnumValue("DateOfArrivalOfTransport")
    DATE_OF_ARRIVAL_OF_TRANSPORT("DateOfArrivalOfTransport"),
    @XmlEnumValue("DateOfBillOfLadingConsignmentNoteOrOtherTransportDocument")
    DATE_OF_BILL_OF_LADING_CONSIGNMENT_NOTE_OR_OTHER_TRANSPORT_DOCUMENT("DateOfBillOfLadingConsignmentNoteOrOtherTransportDocument"),
    @XmlEnumValue("DateOfCertificateOfFinalAcceptance")
    DATE_OF_CERTIFICATE_OF_FINAL_ACCEPTANCE("DateOfCertificateOfFinalAcceptance"),
    @XmlEnumValue("DateOfCertificateOfPreliminaryAcceptance")
    DATE_OF_CERTIFICATE_OF_PRELIMINARY_ACCEPTANCE("DateOfCertificateOfPreliminaryAcceptance"),
    @XmlEnumValue("DateOfConfirmation")
    DATE_OF_CONFIRMATION("DateOfConfirmation"),
    @XmlEnumValue("DateOfConfirmationOfOrderReceived")
    DATE_OF_CONFIRMATION_OF_ORDER_RECEIVED("DateOfConfirmationOfOrderReceived"),
    @XmlEnumValue("DateOfContract")
    DATE_OF_CONTRACT("DateOfContract"),
    @XmlEnumValue("DateOfCreditNote")
    DATE_OF_CREDIT_NOTE("DateOfCreditNote"),
    @XmlEnumValue("DeliveryDate")
    DELIVERY_DATE("DeliveryDate"),
    @XmlEnumValue("DateOfDeliveryOfGoodsToEstablishmentsDomicileSite")
    DATE_OF_DELIVERY_OF_GOODS_TO_ESTABLISHMENTS_DOMICILE_SITE("DateOfDeliveryOfGoodsToEstablishmentsDomicileSite"),
    @XmlEnumValue("DateOfDeliveryToBuyerOfDocumentsRepresentingGoods")
    DATE_OF_DELIVERY_TO_BUYER_OF_DOCUMENTS_REPRESENTING_GOODS("DateOfDeliveryToBuyerOfDocumentsRepresentingGoods"),
    @XmlEnumValue("DateOfDeliveryToBuyersAgentOfDocumentsRepresentingGoods")
    DATE_OF_DELIVERY_TO_BUYERS_AGENT_OF_DOCUMENTS_REPRESENTING_GOODS("DateOfDeliveryToBuyersAgentOfDocumentsRepresentingGoods"),
    @XmlEnumValue("DateOfDeliveryToCarrierOfDocumentsRepresentingGoods")
    DATE_OF_DELIVERY_TO_CARRIER_OF_DOCUMENTS_REPRESENTING_GOODS("DateOfDeliveryToCarrierOfDocumentsRepresentingGoods"),
    @XmlEnumValue("DateOfDeliveryToIntermediaryBankOfDocumentsRepresentingGood")
    DATE_OF_DELIVERY_TO_INTERMEDIARY_BANK_OF_DOCUMENTS_REPRESENTING_GOOD("DateOfDeliveryToIntermediaryBankOfDocumentsRepresentingGood"),
    @XmlEnumValue("DateOfEndOfWork")
    DATE_OF_END_OF_WORK("DateOfEndOfWork"),
    @XmlEnumValue("DateOfFinalAcceptanceOfWork")
    DATE_OF_FINAL_ACCEPTANCE_OF_WORK("DateOfFinalAcceptanceOfWork"),
    @XmlEnumValue("DateOfInvoice")
    DATE_OF_INVOICE("DateOfInvoice"),
    @XmlEnumValue("DateOfInwardFrontierCrossing")
    DATE_OF_INWARD_FRONTIER_CROSSING("DateOfInwardFrontierCrossing"),
    @XmlEnumValue("DateOfIssueOfTransportDocument")
    DATE_OF_ISSUE_OF_TRANSPORT_DOCUMENT("DateOfIssueOfTransportDocument"),
    @XmlEnumValue("DateOfNegotiableInstrumentDraftPromissoryNoteBank")
    DATE_OF_NEGOTIABLE_INSTRUMENT_DRAFT_PROMISSORY_NOTE_BANK("DateOfNegotiableInstrumentDraftPromissoryNoteBank"),
    @XmlEnumValue("DateOfOrder")
    DATE_OF_ORDER("DateOfOrder"),
    @XmlEnumValue("DateOfOutwardFrontierCrossing")
    DATE_OF_OUTWARD_FRONTIER_CROSSING("DateOfOutwardFrontierCrossing"),
    @XmlEnumValue("DateOfPresentationOfDocuments")
    DATE_OF_PRESENTATION_OF_DOCUMENTS("DateOfPresentationOfDocuments"),
    @XmlEnumValue("DateOfPresentationOfNegotiableInstrument")
    DATE_OF_PRESENTATION_OF_NEGOTIABLE_INSTRUMENT("DateOfPresentationOfNegotiableInstrument"),
    @XmlEnumValue("DateOfPresentDocument")
    DATE_OF_PRESENT_DOCUMENT("DateOfPresentDocument"),
    @XmlEnumValue("DateOfProvisionalReceptionOfWork")
    DATE_OF_PROVISIONAL_RECEPTION_OF_WORK("DateOfProvisionalReceptionOfWork"),
    @XmlEnumValue("DateOfReceiptForLoadingMatesReceipt")
    DATE_OF_RECEIPT_FOR_LOADING_MATES_RECEIPT("DateOfReceiptForLoadingMatesReceipt"),
    @XmlEnumValue("DateOfReceiptOfToolDependentInitialSamplesPlusUnlimitedAbsoluteBankGuaranteePlusValueAddedTax")
    DATE_OF_RECEIPT_OF_TOOL_DEPENDENT_INITIAL_SAMPLES_PLUS_UNLIMITED_ABSOLUTE_BANK_GUARANTEE_PLUS_VALUE_ADDED_TAX("DateOfReceiptOfToolDependentInitialSamplesPlusUnlimitedAbsoluteBankGuaranteePlusValueAddedTax"),
    @XmlEnumValue("DateOfReceiptOfTooling")
    DATE_OF_RECEIPT_OF_TOOLING("DateOfReceiptOfTooling"),
    @XmlEnumValue("DateOfResaleByBuyer")
    DATE_OF_RESALE_BY_BUYER("DateOfResaleByBuyer"),
    @XmlEnumValue("DateOfSalaryPayment")
    DATE_OF_SALARY_PAYMENT("DateOfSalaryPayment"),
    @XmlEnumValue("ShipDate")
    SHIP_DATE("ShipDate"),
    @XmlEnumValue("DateOfShipmentAsEvidencedByTheTransportDocument")
    DATE_OF_SHIPMENT_AS_EVIDENCED_BY_THE_TRANSPORT_DOCUMENT("DateOfShipmentAsEvidencedByTheTransportDocument"),
    @XmlEnumValue("DateOfSignatureOfContract")
    DATE_OF_SIGNATURE_OF_CONTRACT("DateOfSignatureOfContract"),
    @XmlEnumValue("DateOfStartOfWork")
    DATE_OF_START_OF_WORK("DateOfStartOfWork"),
    @XmlEnumValue("DatePresentDocumentReceived")
    DATE_PRESENT_DOCUMENT_RECEIVED("DatePresentDocumentReceived"),
    @XmlEnumValue("DateProceedsOfResaleCollectedByBuyer")
    DATE_PROCEEDS_OF_RESALE_COLLECTED_BY_BUYER("DateProceedsOfResaleCollectedByBuyer"),
    @XmlEnumValue("DraftAtDaysAfterDateOfIssuanceOfTransportDocument")
    DRAFT_AT_DAYS_AFTER_DATE_OF_ISSUANCE_OF_TRANSPORT_DOCUMENT("DraftAtDaysAfterDateOfIssuanceOfTransportDocument"),
    @XmlEnumValue("DraftAtDaysAfterDateOfPresentationOfDocuments")
    DRAFT_AT_DAYS_AFTER_DATE_OF_PRESENTATION_OF_DOCUMENTS("DraftAtDaysAfterDateOfPresentationOfDocuments"),
    @XmlEnumValue("DraftAtDaysDate")
    DRAFT_AT_DAYS_DATE("DraftAtDaysDate"),
    @XmlEnumValue("DraftAtDaysSight")
    DRAFT_AT_DAYS_SIGHT("DraftAtDaysSight"),
    @XmlEnumValue("DueDateOfNegotiableInstrument")
    DUE_DATE_OF_NEGOTIABLE_INSTRUMENT("DueDateOfNegotiableInstrument"),
    @XmlEnumValue("EffectiveDate")
    EFFECTIVE_DATE("EffectiveDate"),
    @XmlEnumValue("InvoiceDate")
    INVOICE_DATE("InvoiceDate"),
    @XmlEnumValue("InvoiceReceiptDate")
    INVOICE_RECEIPT_DATE("InvoiceReceiptDate"),
    @XmlEnumValue("InvoiceTransmissionDate")
    INVOICE_TRANSMISSION_DATE("InvoiceTransmissionDate"),
    @XmlEnumValue("InvoiceVerificationDate")
    INVOICE_VERIFICATION_DATE("InvoiceVerificationDate"),
    @XmlEnumValue("OtherReferenceDateAgreedUponBetweenTheParties")
    OTHER_REFERENCE_DATE_AGREED_UPON_BETWEEN_THE_PARTIES("OtherReferenceDateAgreedUponBetweenTheParties"),
    @XmlEnumValue("PaymentDate")
    PAYMENT_DATE("PaymentDate"),
    @XmlEnumValue("PaymentDueDate")
    PAYMENT_DUE_DATE("PaymentDueDate"),
    @XmlEnumValue("PurchaseOrderDate")
    PURCHASE_ORDER_DATE("PurchaseOrderDate"),
    @XmlEnumValue("QualityApprovalDate")
    QUALITY_APPROVAL_DATE("QualityApprovalDate"),
    @XmlEnumValue("QuarterStartDate")
    QUARTER_START_DATE("QuarterStartDate"),
    @XmlEnumValue("ReceiptOfGoods")
    RECEIPT_OF_GOODS("ReceiptOfGoods"),
    @XmlEnumValue("RequestedDateOfDelivery")
    REQUESTED_DATE_OF_DELIVERY("RequestedDateOfDelivery"),
    @XmlEnumValue("SpecifiedDate")
    SPECIFIED_DATE("SpecifiedDate"),
    @XmlEnumValue("SpecifiedDraftDate")
    SPECIFIED_DRAFT_DATE("SpecifiedDraftDate"),
    @XmlEnumValue("StipulatedDateForAcceptanceOfDocumentaryCredit")
    STIPULATED_DATE_FOR_ACCEPTANCE_OF_DOCUMENTARY_CREDIT("StipulatedDateForAcceptanceOfDocumentaryCredit"),
    @XmlEnumValue("StipulatedDateForNegotiationOfDocumentaryCredit")
    STIPULATED_DATE_FOR_NEGOTIATION_OF_DOCUMENTARY_CREDIT("StipulatedDateForNegotiationOfDocumentaryCredit"),
    @XmlEnumValue("StipulatedDateForPaymentOfDocumentaryCredit")
    STIPULATED_DATE_FOR_PAYMENT_OF_DOCUMENTARY_CREDIT("StipulatedDateForPaymentOfDocumentaryCredit");
    private final String value;

    DateTimeRefCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateTimeRefCode fromValue(String v) {
        for (DateTimeRefCode c: DateTimeRefCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
