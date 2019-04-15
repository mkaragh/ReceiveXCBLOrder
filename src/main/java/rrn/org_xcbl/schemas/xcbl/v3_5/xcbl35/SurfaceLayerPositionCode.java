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
 * <p>Java class for SurfaceLayerPositionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SurfaceLayerPositionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="BackOfCab"/>
 *     &lt;enumeration value="Bilateral"/>
 *     &lt;enumeration value="Block"/>
 *     &lt;enumeration value="Bolster"/>
 *     &lt;enumeration value="BothSides"/>
 *     &lt;enumeration value="Bottom"/>
 *     &lt;enumeration value="Brick"/>
 *     &lt;enumeration value="CasingHeadFlange"/>
 *     &lt;enumeration value="Center"/>
 *     &lt;enumeration value="CornerDiagonals"/>
 *     &lt;enumeration value="DoubleEndOverhang"/>
 *     &lt;enumeration value="DownstreamTap"/>
 *     &lt;enumeration value="DualFuelTankPositions"/>
 *     &lt;enumeration value="Exterior"/>
 *     &lt;enumeration value="Front"/>
 *     &lt;enumeration value="FrontSpare"/>
 *     &lt;enumeration value="Inside"/>
 *     &lt;enumeration value="InsideLeftRear"/>
 *     &lt;enumeration value="InsideRightRear"/>
 *     &lt;enumeration value="Interior"/>
 *     &lt;enumeration value="KellyBushing"/>
 *     &lt;enumeration value="Left"/>
 *     &lt;enumeration value="LeftFront"/>
 *     &lt;enumeration value="LeftRear"/>
 *     &lt;enumeration value="LessCriticalSurface"/>
 *     &lt;enumeration value="Lower"/>
 *     &lt;enumeration value="Middle"/>
 *     &lt;enumeration value="MoreCriticalSurface"/>
 *     &lt;enumeration value="Multiple"/>
 *     &lt;enumeration value="NextRelativePosition"/>
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="OffSurface"/>
 *     &lt;enumeration value="OneSide"/>
 *     &lt;enumeration value="OnSurface"/>
 *     &lt;enumeration value="OppositeCorners"/>
 *     &lt;enumeration value="Outside"/>
 *     &lt;enumeration value="OutsideLeftRear"/>
 *     &lt;enumeration value="OutsideRightRear"/>
 *     &lt;enumeration value="Overall"/>
 *     &lt;enumeration value="Port"/>
 *     &lt;enumeration value="Rear"/>
 *     &lt;enumeration value="RearSpare"/>
 *     &lt;enumeration value="RelativePosition1"/>
 *     &lt;enumeration value="RelativePosition10"/>
 *     &lt;enumeration value="RelativePosition11"/>
 *     &lt;enumeration value="RelativePosition12"/>
 *     &lt;enumeration value="RelativePosition13"/>
 *     &lt;enumeration value="RelativePosition14"/>
 *     &lt;enumeration value="RelativePosition15"/>
 *     &lt;enumeration value="RelativePosition16"/>
 *     &lt;enumeration value="RelativePosition17"/>
 *     &lt;enumeration value="RelativePosition18"/>
 *     &lt;enumeration value="RelativePosition19"/>
 *     &lt;enumeration value="RelativePosition2"/>
 *     &lt;enumeration value="RelativePosition20"/>
 *     &lt;enumeration value="RelativePosition21"/>
 *     &lt;enumeration value="RelativePosition22"/>
 *     &lt;enumeration value="RelativePosition23"/>
 *     &lt;enumeration value="RelativePosition24"/>
 *     &lt;enumeration value="RelativePosition25"/>
 *     &lt;enumeration value="RelativePosition26"/>
 *     &lt;enumeration value="RelativePosition27"/>
 *     &lt;enumeration value="RelativePosition28"/>
 *     &lt;enumeration value="RelativePosition29"/>
 *     &lt;enumeration value="RelativePosition3"/>
 *     &lt;enumeration value="RelativePosition30"/>
 *     &lt;enumeration value="RelativePosition31"/>
 *     &lt;enumeration value="RelativePosition32"/>
 *     &lt;enumeration value="RelativePosition33"/>
 *     &lt;enumeration value="RelativePosition34"/>
 *     &lt;enumeration value="RelativePosition35"/>
 *     &lt;enumeration value="RelativePosition36"/>
 *     &lt;enumeration value="RelativePosition37"/>
 *     &lt;enumeration value="RelativePosition38"/>
 *     &lt;enumeration value="RelativePosition39"/>
 *     &lt;enumeration value="RelativePosition4"/>
 *     &lt;enumeration value="RelativePosition40"/>
 *     &lt;enumeration value="RelativePosition41"/>
 *     &lt;enumeration value="RelativePosition42"/>
 *     &lt;enumeration value="RelativePosition43"/>
 *     &lt;enumeration value="RelativePosition44"/>
 *     &lt;enumeration value="RelativePosition45"/>
 *     &lt;enumeration value="RelativePosition46"/>
 *     &lt;enumeration value="RelativePosition47"/>
 *     &lt;enumeration value="RelativePosition48"/>
 *     &lt;enumeration value="RelativePosition49"/>
 *     &lt;enumeration value="RelativePosition5"/>
 *     &lt;enumeration value="RelativePosition50"/>
 *     &lt;enumeration value="RelativePosition6"/>
 *     &lt;enumeration value="RelativePosition7"/>
 *     &lt;enumeration value="RelativePosition8"/>
 *     &lt;enumeration value="RelativePosition9"/>
 *     &lt;enumeration value="RigFloor"/>
 *     &lt;enumeration value="Right"/>
 *     &lt;enumeration value="RightFront"/>
 *     &lt;enumeration value="RightRear"/>
 *     &lt;enumeration value="SideOne"/>
 *     &lt;enumeration value="SideTwo"/>
 *     &lt;enumeration value="Siding"/>
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="SingleEndOverhang"/>
 *     &lt;enumeration value="Soluble"/>
 *     &lt;enumeration value="SpareTirePosition"/>
 *     &lt;enumeration value="Starboard"/>
 *     &lt;enumeration value="Stone"/>
 *     &lt;enumeration value="Stucco"/>
 *     &lt;enumeration value="Sub-Sea"/>
 *     &lt;enumeration value="TankBottom"/>
 *     &lt;enumeration value="ToothBuccalSurface"/>
 *     &lt;enumeration value="ToothDistalSurface"/>
 *     &lt;enumeration value="ToothFacialSurface"/>
 *     &lt;enumeration value="ToothIncisalSurface"/>
 *     &lt;enumeration value="ToothLingualSurface"/>
 *     &lt;enumeration value="ToothMesialSurface"/>
 *     &lt;enumeration value="ToothOcclusalSurface"/>
 *     &lt;enumeration value="Top"/>
 *     &lt;enumeration value="TwoSides"/>
 *     &lt;enumeration value="UnderCab"/>
 *     &lt;enumeration value="Unilateral"/>
 *     &lt;enumeration value="Upper"/>
 *     &lt;enumeration value="UpstreamTap"/>
 *     &lt;enumeration value="Wood"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SurfaceLayerPositionCode")
@XmlEnum
public enum SurfaceLayerPositionCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("BackOfCab")
    BACK_OF_CAB("BackOfCab"),
    @XmlEnumValue("Bilateral")
    BILATERAL("Bilateral"),
    @XmlEnumValue("Block")
    BLOCK("Block"),
    @XmlEnumValue("Bolster")
    BOLSTER("Bolster"),
    @XmlEnumValue("BothSides")
    BOTH_SIDES("BothSides"),
    @XmlEnumValue("Bottom")
    BOTTOM("Bottom"),
    @XmlEnumValue("Brick")
    BRICK("Brick"),
    @XmlEnumValue("CasingHeadFlange")
    CASING_HEAD_FLANGE("CasingHeadFlange"),
    @XmlEnumValue("Center")
    CENTER("Center"),
    @XmlEnumValue("CornerDiagonals")
    CORNER_DIAGONALS("CornerDiagonals"),
    @XmlEnumValue("DoubleEndOverhang")
    DOUBLE_END_OVERHANG("DoubleEndOverhang"),
    @XmlEnumValue("DownstreamTap")
    DOWNSTREAM_TAP("DownstreamTap"),
    @XmlEnumValue("DualFuelTankPositions")
    DUAL_FUEL_TANK_POSITIONS("DualFuelTankPositions"),
    @XmlEnumValue("Exterior")
    EXTERIOR("Exterior"),
    @XmlEnumValue("Front")
    FRONT("Front"),
    @XmlEnumValue("FrontSpare")
    FRONT_SPARE("FrontSpare"),
    @XmlEnumValue("Inside")
    INSIDE("Inside"),
    @XmlEnumValue("InsideLeftRear")
    INSIDE_LEFT_REAR("InsideLeftRear"),
    @XmlEnumValue("InsideRightRear")
    INSIDE_RIGHT_REAR("InsideRightRear"),
    @XmlEnumValue("Interior")
    INTERIOR("Interior"),
    @XmlEnumValue("KellyBushing")
    KELLY_BUSHING("KellyBushing"),
    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("LeftFront")
    LEFT_FRONT("LeftFront"),
    @XmlEnumValue("LeftRear")
    LEFT_REAR("LeftRear"),
    @XmlEnumValue("LessCriticalSurface")
    LESS_CRITICAL_SURFACE("LessCriticalSurface"),
    @XmlEnumValue("Lower")
    LOWER("Lower"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle"),
    @XmlEnumValue("MoreCriticalSurface")
    MORE_CRITICAL_SURFACE("MoreCriticalSurface"),
    @XmlEnumValue("Multiple")
    MULTIPLE("Multiple"),
    @XmlEnumValue("NextRelativePosition")
    NEXT_RELATIVE_POSITION("NextRelativePosition"),
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("OffSurface")
    OFF_SURFACE("OffSurface"),
    @XmlEnumValue("OneSide")
    ONE_SIDE("OneSide"),
    @XmlEnumValue("OnSurface")
    ON_SURFACE("OnSurface"),
    @XmlEnumValue("OppositeCorners")
    OPPOSITE_CORNERS("OppositeCorners"),
    @XmlEnumValue("Outside")
    OUTSIDE("Outside"),
    @XmlEnumValue("OutsideLeftRear")
    OUTSIDE_LEFT_REAR("OutsideLeftRear"),
    @XmlEnumValue("OutsideRightRear")
    OUTSIDE_RIGHT_REAR("OutsideRightRear"),
    @XmlEnumValue("Overall")
    OVERALL("Overall"),
    @XmlEnumValue("Port")
    PORT("Port"),
    @XmlEnumValue("Rear")
    REAR("Rear"),
    @XmlEnumValue("RearSpare")
    REAR_SPARE("RearSpare"),
    @XmlEnumValue("RelativePosition1")
    RELATIVE_POSITION_1("RelativePosition1"),
    @XmlEnumValue("RelativePosition10")
    RELATIVE_POSITION_10("RelativePosition10"),
    @XmlEnumValue("RelativePosition11")
    RELATIVE_POSITION_11("RelativePosition11"),
    @XmlEnumValue("RelativePosition12")
    RELATIVE_POSITION_12("RelativePosition12"),
    @XmlEnumValue("RelativePosition13")
    RELATIVE_POSITION_13("RelativePosition13"),
    @XmlEnumValue("RelativePosition14")
    RELATIVE_POSITION_14("RelativePosition14"),
    @XmlEnumValue("RelativePosition15")
    RELATIVE_POSITION_15("RelativePosition15"),
    @XmlEnumValue("RelativePosition16")
    RELATIVE_POSITION_16("RelativePosition16"),
    @XmlEnumValue("RelativePosition17")
    RELATIVE_POSITION_17("RelativePosition17"),
    @XmlEnumValue("RelativePosition18")
    RELATIVE_POSITION_18("RelativePosition18"),
    @XmlEnumValue("RelativePosition19")
    RELATIVE_POSITION_19("RelativePosition19"),
    @XmlEnumValue("RelativePosition2")
    RELATIVE_POSITION_2("RelativePosition2"),
    @XmlEnumValue("RelativePosition20")
    RELATIVE_POSITION_20("RelativePosition20"),
    @XmlEnumValue("RelativePosition21")
    RELATIVE_POSITION_21("RelativePosition21"),
    @XmlEnumValue("RelativePosition22")
    RELATIVE_POSITION_22("RelativePosition22"),
    @XmlEnumValue("RelativePosition23")
    RELATIVE_POSITION_23("RelativePosition23"),
    @XmlEnumValue("RelativePosition24")
    RELATIVE_POSITION_24("RelativePosition24"),
    @XmlEnumValue("RelativePosition25")
    RELATIVE_POSITION_25("RelativePosition25"),
    @XmlEnumValue("RelativePosition26")
    RELATIVE_POSITION_26("RelativePosition26"),
    @XmlEnumValue("RelativePosition27")
    RELATIVE_POSITION_27("RelativePosition27"),
    @XmlEnumValue("RelativePosition28")
    RELATIVE_POSITION_28("RelativePosition28"),
    @XmlEnumValue("RelativePosition29")
    RELATIVE_POSITION_29("RelativePosition29"),
    @XmlEnumValue("RelativePosition3")
    RELATIVE_POSITION_3("RelativePosition3"),
    @XmlEnumValue("RelativePosition30")
    RELATIVE_POSITION_30("RelativePosition30"),
    @XmlEnumValue("RelativePosition31")
    RELATIVE_POSITION_31("RelativePosition31"),
    @XmlEnumValue("RelativePosition32")
    RELATIVE_POSITION_32("RelativePosition32"),
    @XmlEnumValue("RelativePosition33")
    RELATIVE_POSITION_33("RelativePosition33"),
    @XmlEnumValue("RelativePosition34")
    RELATIVE_POSITION_34("RelativePosition34"),
    @XmlEnumValue("RelativePosition35")
    RELATIVE_POSITION_35("RelativePosition35"),
    @XmlEnumValue("RelativePosition36")
    RELATIVE_POSITION_36("RelativePosition36"),
    @XmlEnumValue("RelativePosition37")
    RELATIVE_POSITION_37("RelativePosition37"),
    @XmlEnumValue("RelativePosition38")
    RELATIVE_POSITION_38("RelativePosition38"),
    @XmlEnumValue("RelativePosition39")
    RELATIVE_POSITION_39("RelativePosition39"),
    @XmlEnumValue("RelativePosition4")
    RELATIVE_POSITION_4("RelativePosition4"),
    @XmlEnumValue("RelativePosition40")
    RELATIVE_POSITION_40("RelativePosition40"),
    @XmlEnumValue("RelativePosition41")
    RELATIVE_POSITION_41("RelativePosition41"),
    @XmlEnumValue("RelativePosition42")
    RELATIVE_POSITION_42("RelativePosition42"),
    @XmlEnumValue("RelativePosition43")
    RELATIVE_POSITION_43("RelativePosition43"),
    @XmlEnumValue("RelativePosition44")
    RELATIVE_POSITION_44("RelativePosition44"),
    @XmlEnumValue("RelativePosition45")
    RELATIVE_POSITION_45("RelativePosition45"),
    @XmlEnumValue("RelativePosition46")
    RELATIVE_POSITION_46("RelativePosition46"),
    @XmlEnumValue("RelativePosition47")
    RELATIVE_POSITION_47("RelativePosition47"),
    @XmlEnumValue("RelativePosition48")
    RELATIVE_POSITION_48("RelativePosition48"),
    @XmlEnumValue("RelativePosition49")
    RELATIVE_POSITION_49("RelativePosition49"),
    @XmlEnumValue("RelativePosition5")
    RELATIVE_POSITION_5("RelativePosition5"),
    @XmlEnumValue("RelativePosition50")
    RELATIVE_POSITION_50("RelativePosition50"),
    @XmlEnumValue("RelativePosition6")
    RELATIVE_POSITION_6("RelativePosition6"),
    @XmlEnumValue("RelativePosition7")
    RELATIVE_POSITION_7("RelativePosition7"),
    @XmlEnumValue("RelativePosition8")
    RELATIVE_POSITION_8("RelativePosition8"),
    @XmlEnumValue("RelativePosition9")
    RELATIVE_POSITION_9("RelativePosition9"),
    @XmlEnumValue("RigFloor")
    RIG_FLOOR("RigFloor"),
    @XmlEnumValue("Right")
    RIGHT("Right"),
    @XmlEnumValue("RightFront")
    RIGHT_FRONT("RightFront"),
    @XmlEnumValue("RightRear")
    RIGHT_REAR("RightRear"),
    @XmlEnumValue("SideOne")
    SIDE_ONE("SideOne"),
    @XmlEnumValue("SideTwo")
    SIDE_TWO("SideTwo"),
    @XmlEnumValue("Siding")
    SIDING("Siding"),
    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("SingleEndOverhang")
    SINGLE_END_OVERHANG("SingleEndOverhang"),
    @XmlEnumValue("Soluble")
    SOLUBLE("Soluble"),
    @XmlEnumValue("SpareTirePosition")
    SPARE_TIRE_POSITION("SpareTirePosition"),
    @XmlEnumValue("Starboard")
    STARBOARD("Starboard"),
    @XmlEnumValue("Stone")
    STONE("Stone"),
    @XmlEnumValue("Stucco")
    STUCCO("Stucco"),
    @XmlEnumValue("Sub-Sea")
    SUB_SEA("Sub-Sea"),
    @XmlEnumValue("TankBottom")
    TANK_BOTTOM("TankBottom"),
    @XmlEnumValue("ToothBuccalSurface")
    TOOTH_BUCCAL_SURFACE("ToothBuccalSurface"),
    @XmlEnumValue("ToothDistalSurface")
    TOOTH_DISTAL_SURFACE("ToothDistalSurface"),
    @XmlEnumValue("ToothFacialSurface")
    TOOTH_FACIAL_SURFACE("ToothFacialSurface"),
    @XmlEnumValue("ToothIncisalSurface")
    TOOTH_INCISAL_SURFACE("ToothIncisalSurface"),
    @XmlEnumValue("ToothLingualSurface")
    TOOTH_LINGUAL_SURFACE("ToothLingualSurface"),
    @XmlEnumValue("ToothMesialSurface")
    TOOTH_MESIAL_SURFACE("ToothMesialSurface"),
    @XmlEnumValue("ToothOcclusalSurface")
    TOOTH_OCCLUSAL_SURFACE("ToothOcclusalSurface"),
    @XmlEnumValue("Top")
    TOP("Top"),
    @XmlEnumValue("TwoSides")
    TWO_SIDES("TwoSides"),
    @XmlEnumValue("UnderCab")
    UNDER_CAB("UnderCab"),
    @XmlEnumValue("Unilateral")
    UNILATERAL("Unilateral"),
    @XmlEnumValue("Upper")
    UPPER("Upper"),
    @XmlEnumValue("UpstreamTap")
    UPSTREAM_TAP("UpstreamTap"),
    @XmlEnumValue("Wood")
    WOOD("Wood");
    private final String value;

    SurfaceLayerPositionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurfaceLayerPositionCode fromValue(String v) {
        for (SurfaceLayerPositionCode c: SurfaceLayerPositionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
