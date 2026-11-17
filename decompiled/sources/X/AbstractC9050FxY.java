package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.FxY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9050FxY {
    public static final Map<C9uG<? extends InterfaceC9011Fwo>, String> A00;
    public static final Map<String, C9uG<? extends InterfaceC9011Fwo>> A01;

    static {
        HxE[] hxEArr = new HxE[41];
        System.arraycopy(new HxE[]{C3cG.A0r("PowerSeries", C3cG.A0x(C9062Fxk.class)), C3cG.A0r("RespiratoryRate", C3cG.A0x(C8876Frp.class)), C3cG.A0r("RestingHeartRate", C3cG.A0x(C8880Frt.class)), C3cG.A0r("SexualActivity", C3cG.A0x(C8870Frj.class)), C3cG.A0r("SkinTemperature", C3cG.A0x(C9052Fxa.class)), C3cG.A0r("SleepSession", C3cG.A0x(C9003Fwg.class)), C3cG.A0r("SpeedSeries", C3cG.A0x(C9060Fxi.class)), C3cG.A0r("IntermenstrualBleeding", C3cG.A0x(C8872Frl.class)), C3cG.A0r("Steps", C3cG.A0x(C8999Fwc.class)), C3cG.A0r("StepsCadenceSeries", C3cG.A0x(C9006Fwj.class)), C3cG.A0r("TotalCaloriesBurned", C3cG.A0x(C9057Fxf.class)), C3cG.A0r("Vo2Max", C3cG.A0x(C8878Frr.class)), C3cG.A0r("WheelchairPushes", C3cG.A0x(C8998Fwb.class)), C3cG.A0r("Weight", C3cG.A0x(C9067Fxp.class))}, BV5.A1U(new HxE[]{C3cG.A0r("ActiveCaloriesBurned", C3cG.A0x(C9064Fxm.class)), C3cG.A0r("ActivityIntensity", C3cG.A0x(C8997Fwa.class)), C3cG.A0r("ActivitySession", C3cG.A0x(C9048FxW.class)), C3cG.A0r("BasalBodyTemperature", C3cG.A0x(C9075Fy2.class)), C3cG.A0r("BasalMetabolicRate", C3cG.A0x(C9069Fxr.class)), C3cG.A0r("BloodGlucose", C3cG.A0x(C9065Fxn.class)), C3cG.A0r("BloodPressure", C3cG.A0x(C9056Fxe.class)), C3cG.A0r("BodyFat", C3cG.A0x(C8952FuR.class)), C3cG.A0r("BodyTemperature", C3cG.A0x(C9084FyB.class)), C3cG.A0r("BodyWaterMass", C3cG.A0x(C9073Fxz.class)), C3cG.A0r("BoneMass", C3cG.A0x(C9074Fy0.class)), C3cG.A0r("CervicalMucus", C3cG.A0x(C8867Frg.class)), C3cG.A0r("CyclingPedalingCadenceSeries", C3cG.A0x(C9007Fwk.class)), C3cG.A0r("Distance", C3cG.A0x(C9061Fxj.class)), C3cG.A0r("ElevationGained", C3cG.A0x(C9066Fxo.class)), C3cG.A0r("FloorsClimbed", C3cG.A0x(C9001Fwe.class)), C3cG.A0r("HeartRateSeries", C3cG.A0x(C9005Fwi.class)), C3cG.A0r("HeartRateVariabilityRmssd", C3cG.A0x(C8877Frq.class)), C3cG.A0r("Height", C3cG.A0x(C9063Fxl.class)), C3cG.A0r("Hydration", C3cG.A0x(C9059Fxh.class)), C3cG.A0r("LeanBodyMass", C3cG.A0x(C9071Fxx.class)), C3cG.A0r("Menstruation", C3cG.A0x(C8866Frf.class)), C3cG.A0r("MenstruationPeriod", C3cG.A0x(C9000Fwd.class)), C3cG.A0r("MindfulnessSession", C3cG.A0x(C9002Fwf.class)), C3cG.A0r("Nutrition", C3cG.A0x(C9046FxU.class)), C3cG.A0r("OvulationTest", C3cG.A0x(C8869Fri.class)), C3cG.A0r("OxygenSaturation", C3cG.A0x(C8951FuQ.class))}, hxEArr) ? 1 : 0, hxEArr, 27, 14);
        Map<String, C9uG<? extends InterfaceC9011Fwo>> mapA0D = AGH.A0D(hxEArr);
        A01 = mapA0D;
        Set<Map.Entry<String, C9uG<? extends InterfaceC9011Fwo>>> setEntrySet = mapA0D.entrySet();
        LinkedHashMap linkedHashMapA15 = C60O.A15(Hr7.A1C(setEntrySet));
        Iterator<Map.Entry<String, C9uG<? extends InterfaceC9011Fwo>>> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            linkedHashMapA15.put(entryA0l.getValue(), entryA0l.getKey());
        }
        A00 = linkedHashMapA15;
    }
}
