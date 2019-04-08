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
 * <p>Java class for OperationalTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationalTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Documents"/>
 *     &lt;enumeration value="LowValueNon-DutiableConsignments"/>
 *     &lt;enumeration value="LowValueDutiableConsignments"/>
 *     &lt;enumeration value="HighValueConsignments"/>
 *     &lt;enumeration value="OtherNon-Containerized"/>
 *     &lt;enumeration value="Vehicles"/>
 *     &lt;enumeration value="Roll-OnRoll-Off"/>
 *     &lt;enumeration value="Palletized"/>
 *     &lt;enumeration value="Containerized"/>
 *     &lt;enumeration value="Breakbulk"/>
 *     &lt;enumeration value="HazardousCargo"/>
 *     &lt;enumeration value="GeneralCargo"/>
 *     &lt;enumeration value="LiquidCargo"/>
 *     &lt;enumeration value="TemperatureControlledCargo"/>
 *     &lt;enumeration value="EnvironmentalPollutantCargo"/>
 *     &lt;enumeration value="Not-HazardousCargo"/>
 *     &lt;enumeration value="Diplomatic"/>
 *     &lt;enumeration value="Military"/>
 *     &lt;enumeration value="Obnoxious"/>
 *     &lt;enumeration value="OutOfGauge"/>
 *     &lt;enumeration value="HouseholdGoodsAndPersonalEffects"/>
 *     &lt;enumeration value="FrozenCargo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationalTypeCode")
@XmlEnum
public enum OperationalTypeCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Documents")
    DOCUMENTS("Documents"),
    @XmlEnumValue("LowValueNon-DutiableConsignments")
    LOW_VALUE_NON_DUTIABLE_CONSIGNMENTS("LowValueNon-DutiableConsignments"),
    @XmlEnumValue("LowValueDutiableConsignments")
    LOW_VALUE_DUTIABLE_CONSIGNMENTS("LowValueDutiableConsignments"),
    @XmlEnumValue("HighValueConsignments")
    HIGH_VALUE_CONSIGNMENTS("HighValueConsignments"),
    @XmlEnumValue("OtherNon-Containerized")
    OTHER_NON_CONTAINERIZED("OtherNon-Containerized"),
    @XmlEnumValue("Vehicles")
    VEHICLES("Vehicles"),
    @XmlEnumValue("Roll-OnRoll-Off")
    ROLL_ON_ROLL_OFF("Roll-OnRoll-Off"),
    @XmlEnumValue("Palletized")
    PALLETIZED("Palletized"),
    @XmlEnumValue("Containerized")
    CONTAINERIZED("Containerized"),
    @XmlEnumValue("Breakbulk")
    BREAKBULK("Breakbulk"),
    @XmlEnumValue("HazardousCargo")
    HAZARDOUS_CARGO("HazardousCargo"),
    @XmlEnumValue("GeneralCargo")
    GENERAL_CARGO("GeneralCargo"),
    @XmlEnumValue("LiquidCargo")
    LIQUID_CARGO("LiquidCargo"),
    @XmlEnumValue("TemperatureControlledCargo")
    TEMPERATURE_CONTROLLED_CARGO("TemperatureControlledCargo"),
    @XmlEnumValue("EnvironmentalPollutantCargo")
    ENVIRONMENTAL_POLLUTANT_CARGO("EnvironmentalPollutantCargo"),
    @XmlEnumValue("Not-HazardousCargo")
    NOT_HAZARDOUS_CARGO("Not-HazardousCargo"),
    @XmlEnumValue("Diplomatic")
    DIPLOMATIC("Diplomatic"),
    @XmlEnumValue("Military")
    MILITARY("Military"),
    @XmlEnumValue("Obnoxious")
    OBNOXIOUS("Obnoxious"),
    @XmlEnumValue("OutOfGauge")
    OUT_OF_GAUGE("OutOfGauge"),
    @XmlEnumValue("HouseholdGoodsAndPersonalEffects")
    HOUSEHOLD_GOODS_AND_PERSONAL_EFFECTS("HouseholdGoodsAndPersonalEffects"),
    @XmlEnumValue("FrozenCargo")
    FROZEN_CARGO("FrozenCargo");
    private final String value;

    OperationalTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationalTypeCode fromValue(String v) {
        for (OperationalTypeCode c: OperationalTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
