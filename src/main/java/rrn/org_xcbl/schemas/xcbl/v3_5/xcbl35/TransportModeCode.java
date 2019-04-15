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
 * <p>Java class for TransportModeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransportModeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Air"/>
 *     &lt;enumeration value="AirCharter"/>
 *     &lt;enumeration value="AirExpress"/>
 *     &lt;enumeration value="AirFreight"/>
 *     &lt;enumeration value="AirFrieghtForwarder"/>
 *     &lt;enumeration value="AirTaxi"/>
 *     &lt;enumeration value="AirTransport"/>
 *     &lt;enumeration value="ArmedForcesCourierService"/>
 *     &lt;enumeration value="Backhaul"/>
 *     &lt;enumeration value="Barge"/>
 *     &lt;enumeration value="BestWay-ShippersOption"/>
 *     &lt;enumeration value="BookPostal"/>
 *     &lt;enumeration value="Bus"/>
 *     &lt;enumeration value="CabOrTaxi"/>
 *     &lt;enumeration value="CommonIrregularCarrier"/>
 *     &lt;enumeration value="Consolidation"/>
 *     &lt;enumeration value="ContainerizedOcean"/>
 *     &lt;enumeration value="ContractCarrier"/>
 *     &lt;enumeration value="ConventionalOcean"/>
 *     &lt;enumeration value="CustomerPickup"/>
 *     &lt;enumeration value="CustomerPickupOrCustomersExpense"/>
 *     &lt;enumeration value="Driveaway"/>
 *     &lt;enumeration value="DriveawayService"/>
 *     &lt;enumeration value="EuropeanOrPacificDistributionSystem"/>
 *     &lt;enumeration value="ExpeditedTruck"/>
 *     &lt;enumeration value="FixedTransportInstallation"/>
 *     &lt;enumeration value="Flyaway"/>
 *     &lt;enumeration value="GeographicReceiving"/>
 *     &lt;enumeration value="GeographicReceivingOrShipping"/>
 *     &lt;enumeration value="GeographicShipping"/>
 *     &lt;enumeration value="InlandWaterTransport"/>
 *     &lt;enumeration value="InlandWaterway"/>
 *     &lt;enumeration value="Intermodal-Piggyback"/>
 *     &lt;enumeration value="LessThanTrailerLoad"/>
 *     &lt;enumeration value="Logair"/>
 *     &lt;enumeration value="Mail"/>
 *     &lt;enumeration value="MaritimeTransport"/>
 *     &lt;enumeration value="MilitaryIntratheaterAirliftService"/>
 *     &lt;enumeration value="MilitaryOfficialMail"/>
 *     &lt;enumeration value="ModeUnknown"/>
 *     &lt;enumeration value="Motor"/>
 *     &lt;enumeration value="Motor-BulkCarrier"/>
 *     &lt;enumeration value="Motor-CommonCarrier"/>
 *     &lt;enumeration value="Motor-Flatbed"/>
 *     &lt;enumeration value="Motor-PackageCarrier"/>
 *     &lt;enumeration value="Motor-Van"/>
 *     &lt;enumeration value="MutimodalTransport"/>
 *     &lt;enumeration value="Ocean"/>
 *     &lt;enumeration value="OceanConferenceCarrier"/>
 *     &lt;enumeration value="OceanNon-ConferenceCarrier"/>
 *     &lt;enumeration value="ParcelPost"/>
 *     &lt;enumeration value="Pipeline"/>
 *     &lt;enumeration value="PooledAir"/>
 *     &lt;enumeration value="PooledPiggyback"/>
 *     &lt;enumeration value="PooledRail"/>
 *     &lt;enumeration value="PooledTruck"/>
 *     &lt;enumeration value="PoolToPool"/>
 *     &lt;enumeration value="PrivateCarrier"/>
 *     &lt;enumeration value="PrivateParcelService"/>
 *     &lt;enumeration value="PrivateVessel"/>
 *     &lt;enumeration value="Quicktrans"/>
 *     &lt;enumeration value="Rail"/>
 *     &lt;enumeration value="RailTransport"/>
 *     &lt;enumeration value="Roadrailer"/>
 *     &lt;enumeration value="RoadTransport"/>
 *     &lt;enumeration value="SeaOrAir"/>
 *     &lt;enumeration value="ShipperAgent"/>
 *     &lt;enumeration value="ShipperAgent-Truck"/>
 *     &lt;enumeration value="ShipperAssociation"/>
 *     &lt;enumeration value="StackTrain"/>
 *     &lt;enumeration value="Steamship"/>
 *     &lt;enumeration value="SupplierTruck"/>
 *     &lt;enumeration value="TowawayService"/>
 *     &lt;enumeration value="Vessel"/>
 *     &lt;enumeration value="WaterOrPipelineIntermodalMovement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransportModeCode")
@XmlEnum
public enum TransportModeCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Air")
    AIR("Air"),
    @XmlEnumValue("AirCharter")
    AIR_CHARTER("AirCharter"),
    @XmlEnumValue("AirExpress")
    AIR_EXPRESS("AirExpress"),
    @XmlEnumValue("AirFreight")
    AIR_FREIGHT("AirFreight"),
    @XmlEnumValue("AirFrieghtForwarder")
    AIR_FRIEGHT_FORWARDER("AirFrieghtForwarder"),
    @XmlEnumValue("AirTaxi")
    AIR_TAXI("AirTaxi"),
    @XmlEnumValue("AirTransport")
    AIR_TRANSPORT("AirTransport"),
    @XmlEnumValue("ArmedForcesCourierService")
    ARMED_FORCES_COURIER_SERVICE("ArmedForcesCourierService"),
    @XmlEnumValue("Backhaul")
    BACKHAUL("Backhaul"),
    @XmlEnumValue("Barge")
    BARGE("Barge"),
    @XmlEnumValue("BestWay-ShippersOption")
    BEST_WAY_SHIPPERS_OPTION("BestWay-ShippersOption"),
    @XmlEnumValue("BookPostal")
    BOOK_POSTAL("BookPostal"),
    @XmlEnumValue("Bus")
    BUS("Bus"),
    @XmlEnumValue("CabOrTaxi")
    CAB_OR_TAXI("CabOrTaxi"),
    @XmlEnumValue("CommonIrregularCarrier")
    COMMON_IRREGULAR_CARRIER("CommonIrregularCarrier"),
    @XmlEnumValue("Consolidation")
    CONSOLIDATION("Consolidation"),
    @XmlEnumValue("ContainerizedOcean")
    CONTAINERIZED_OCEAN("ContainerizedOcean"),
    @XmlEnumValue("ContractCarrier")
    CONTRACT_CARRIER("ContractCarrier"),
    @XmlEnumValue("ConventionalOcean")
    CONVENTIONAL_OCEAN("ConventionalOcean"),
    @XmlEnumValue("CustomerPickup")
    CUSTOMER_PICKUP("CustomerPickup"),
    @XmlEnumValue("CustomerPickupOrCustomersExpense")
    CUSTOMER_PICKUP_OR_CUSTOMERS_EXPENSE("CustomerPickupOrCustomersExpense"),
    @XmlEnumValue("Driveaway")
    DRIVEAWAY("Driveaway"),
    @XmlEnumValue("DriveawayService")
    DRIVEAWAY_SERVICE("DriveawayService"),
    @XmlEnumValue("EuropeanOrPacificDistributionSystem")
    EUROPEAN_OR_PACIFIC_DISTRIBUTION_SYSTEM("EuropeanOrPacificDistributionSystem"),
    @XmlEnumValue("ExpeditedTruck")
    EXPEDITED_TRUCK("ExpeditedTruck"),
    @XmlEnumValue("FixedTransportInstallation")
    FIXED_TRANSPORT_INSTALLATION("FixedTransportInstallation"),
    @XmlEnumValue("Flyaway")
    FLYAWAY("Flyaway"),
    @XmlEnumValue("GeographicReceiving")
    GEOGRAPHIC_RECEIVING("GeographicReceiving"),
    @XmlEnumValue("GeographicReceivingOrShipping")
    GEOGRAPHIC_RECEIVING_OR_SHIPPING("GeographicReceivingOrShipping"),
    @XmlEnumValue("GeographicShipping")
    GEOGRAPHIC_SHIPPING("GeographicShipping"),
    @XmlEnumValue("InlandWaterTransport")
    INLAND_WATER_TRANSPORT("InlandWaterTransport"),
    @XmlEnumValue("InlandWaterway")
    INLAND_WATERWAY("InlandWaterway"),
    @XmlEnumValue("Intermodal-Piggyback")
    INTERMODAL_PIGGYBACK("Intermodal-Piggyback"),
    @XmlEnumValue("LessThanTrailerLoad")
    LESS_THAN_TRAILER_LOAD("LessThanTrailerLoad"),
    @XmlEnumValue("Logair")
    LOGAIR("Logair"),
    @XmlEnumValue("Mail")
    MAIL("Mail"),
    @XmlEnumValue("MaritimeTransport")
    MARITIME_TRANSPORT("MaritimeTransport"),
    @XmlEnumValue("MilitaryIntratheaterAirliftService")
    MILITARY_INTRATHEATER_AIRLIFT_SERVICE("MilitaryIntratheaterAirliftService"),
    @XmlEnumValue("MilitaryOfficialMail")
    MILITARY_OFFICIAL_MAIL("MilitaryOfficialMail"),
    @XmlEnumValue("ModeUnknown")
    MODE_UNKNOWN("ModeUnknown"),
    @XmlEnumValue("Motor")
    MOTOR("Motor"),
    @XmlEnumValue("Motor-BulkCarrier")
    MOTOR_BULK_CARRIER("Motor-BulkCarrier"),
    @XmlEnumValue("Motor-CommonCarrier")
    MOTOR_COMMON_CARRIER("Motor-CommonCarrier"),
    @XmlEnumValue("Motor-Flatbed")
    MOTOR_FLATBED("Motor-Flatbed"),
    @XmlEnumValue("Motor-PackageCarrier")
    MOTOR_PACKAGE_CARRIER("Motor-PackageCarrier"),
    @XmlEnumValue("Motor-Van")
    MOTOR_VAN("Motor-Van"),
    @XmlEnumValue("MutimodalTransport")
    MUTIMODAL_TRANSPORT("MutimodalTransport"),
    @XmlEnumValue("Ocean")
    OCEAN("Ocean"),
    @XmlEnumValue("OceanConferenceCarrier")
    OCEAN_CONFERENCE_CARRIER("OceanConferenceCarrier"),
    @XmlEnumValue("OceanNon-ConferenceCarrier")
    OCEAN_NON_CONFERENCE_CARRIER("OceanNon-ConferenceCarrier"),
    @XmlEnumValue("ParcelPost")
    PARCEL_POST("ParcelPost"),
    @XmlEnumValue("Pipeline")
    PIPELINE("Pipeline"),
    @XmlEnumValue("PooledAir")
    POOLED_AIR("PooledAir"),
    @XmlEnumValue("PooledPiggyback")
    POOLED_PIGGYBACK("PooledPiggyback"),
    @XmlEnumValue("PooledRail")
    POOLED_RAIL("PooledRail"),
    @XmlEnumValue("PooledTruck")
    POOLED_TRUCK("PooledTruck"),
    @XmlEnumValue("PoolToPool")
    POOL_TO_POOL("PoolToPool"),
    @XmlEnumValue("PrivateCarrier")
    PRIVATE_CARRIER("PrivateCarrier"),
    @XmlEnumValue("PrivateParcelService")
    PRIVATE_PARCEL_SERVICE("PrivateParcelService"),
    @XmlEnumValue("PrivateVessel")
    PRIVATE_VESSEL("PrivateVessel"),
    @XmlEnumValue("Quicktrans")
    QUICKTRANS("Quicktrans"),
    @XmlEnumValue("Rail")
    RAIL("Rail"),
    @XmlEnumValue("RailTransport")
    RAIL_TRANSPORT("RailTransport"),
    @XmlEnumValue("Roadrailer")
    ROADRAILER("Roadrailer"),
    @XmlEnumValue("RoadTransport")
    ROAD_TRANSPORT("RoadTransport"),
    @XmlEnumValue("SeaOrAir")
    SEA_OR_AIR("SeaOrAir"),
    @XmlEnumValue("ShipperAgent")
    SHIPPER_AGENT("ShipperAgent"),
    @XmlEnumValue("ShipperAgent-Truck")
    SHIPPER_AGENT_TRUCK("ShipperAgent-Truck"),
    @XmlEnumValue("ShipperAssociation")
    SHIPPER_ASSOCIATION("ShipperAssociation"),
    @XmlEnumValue("StackTrain")
    STACK_TRAIN("StackTrain"),
    @XmlEnumValue("Steamship")
    STEAMSHIP("Steamship"),
    @XmlEnumValue("SupplierTruck")
    SUPPLIER_TRUCK("SupplierTruck"),
    @XmlEnumValue("TowawayService")
    TOWAWAY_SERVICE("TowawayService"),
    @XmlEnumValue("Vessel")
    VESSEL("Vessel"),
    @XmlEnumValue("WaterOrPipelineIntermodalMovement")
    WATER_OR_PIPELINE_INTERMODAL_MOVEMENT("WaterOrPipelineIntermodalMovement");
    private final String value;

    TransportModeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransportModeCode fromValue(String v) {
        for (TransportModeCode c: TransportModeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
