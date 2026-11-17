package X;

import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.ActivityIntensityRecord;
import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.BodyFatRecord;
import android.health.connect.datatypes.BodyTemperatureRecord;
import android.health.connect.datatypes.BodyWaterMassRecord;
import android.health.connect.datatypes.BoneMassRecord;
import android.health.connect.datatypes.CervicalMucusRecord;
import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.ExerciseSessionRecord;
import android.health.connect.datatypes.FloorsClimbedRecord;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.MindfulnessSessionRecord;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.PlannedExerciseSessionRecord;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.Record;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.SkinTemperatureRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;
import java.util.Map;

/* renamed from: X.FxX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9049FxX {
    public static final Map<C9uG<? extends InterfaceC9011Fwo>, Class<? extends Record>> A00;
    public static final Map<C9uG<? extends InterfaceC9011Fwo>, Class<? extends Record>> A01;
    public static final Map<C9uG<? extends InterfaceC9011Fwo>, Class<? extends Record>> A02;
    public static final Map<C9uG<? extends InterfaceC9011Fwo>, Class<? extends Record>> A03;

    static {
        A01 = AbstractC8873Frm.A04() ? AnonymousClass007.A0d(C3cG.A0x(C9052Fxa.class), SkinTemperatureRecord.class, C3cG.A0r(C3cG.A0x(C9070Fxs.class), PlannedExerciseSessionRecord.class)) : C9jH.A00;
        A02 = AbstractC8873Frm.A05() ? AnonymousClass006.A10(C3cG.A0x(C9002Fwf.class), MindfulnessSessionRecord.class) : C9jH.A00;
        A03 = AbstractC8873Frm.A06() ? AnonymousClass006.A10(C3cG.A0x(C8997Fwa.class), ActivityIntensityRecord.class) : C9jH.A00;
        HxE[] hxEArr = new HxE[38];
        System.arraycopy(new HxE[]{C3cG.A0r(C3cG.A0x(C8876Frp.class), RespiratoryRateRecord.class), C3cG.A0r(C3cG.A0x(C8880Frt.class), RestingHeartRateRecord.class), C3cG.A0r(C3cG.A0x(C8870Frj.class), SexualActivityRecord.class), C3cG.A0r(C3cG.A0x(C9003Fwg.class), SleepSessionRecord.class), C3cG.A0r(C3cG.A0x(C9060Fxi.class), SpeedRecord.class), C3cG.A0r(C3cG.A0x(C9006Fwj.class), StepsCadenceRecord.class), C3cG.A0r(C3cG.A0x(C8999Fwc.class), StepsRecord.class), C3cG.A0r(C3cG.A0x(C9057Fxf.class), TotalCaloriesBurnedRecord.class), C3cG.A0r(C3cG.A0x(C8878Frr.class), Vo2MaxRecord.class), C3cG.A0r(C3cG.A0x(C9067Fxp.class), WeightRecord.class), C3cG.A0r(C3cG.A0x(C8998Fwb.class), WheelchairPushesRecord.class)}, BV5.A1U(new HxE[]{C3cG.A0r(C3cG.A0x(C9064Fxm.class), ActiveCaloriesBurnedRecord.class), C3cG.A0r(C3cG.A0x(C9075Fy2.class), BasalBodyTemperatureRecord.class), C3cG.A0r(C3cG.A0x(C9069Fxr.class), BasalMetabolicRateRecord.class), C3cG.A0r(C3cG.A0x(C9065Fxn.class), BloodGlucoseRecord.class), C3cG.A0r(C3cG.A0x(C9056Fxe.class), BloodPressureRecord.class), C3cG.A0r(C3cG.A0x(C8952FuR.class), BodyFatRecord.class), C3cG.A0r(C3cG.A0x(C9084FyB.class), BodyTemperatureRecord.class), C3cG.A0r(C3cG.A0x(C9073Fxz.class), BodyWaterMassRecord.class), C3cG.A0r(C3cG.A0x(C9074Fy0.class), BoneMassRecord.class), C3cG.A0r(C3cG.A0x(C8867Frg.class), CervicalMucusRecord.class), C3cG.A0r(C3cG.A0x(C9007Fwk.class), CyclingPedalingCadenceRecord.class), C3cG.A0r(C3cG.A0x(C9061Fxj.class), DistanceRecord.class), C3cG.A0r(C3cG.A0x(C9066Fxo.class), ElevationGainedRecord.class), C3cG.A0r(C3cG.A0x(C9048FxW.class), ExerciseSessionRecord.class), C3cG.A0r(C3cG.A0x(C9001Fwe.class), FloorsClimbedRecord.class), C3cG.A0r(C3cG.A0x(C9005Fwi.class), HeartRateRecord.class), C3cG.A0r(C3cG.A0x(C8877Frq.class), HeartRateVariabilityRmssdRecord.class), C3cG.A0r(C3cG.A0x(C9063Fxl.class), HeightRecord.class), C3cG.A0r(C3cG.A0x(C9059Fxh.class), HydrationRecord.class), C3cG.A0r(C3cG.A0x(C8872Frl.class), IntermenstrualBleedingRecord.class), C3cG.A0r(C3cG.A0x(C9071Fxx.class), LeanBodyMassRecord.class), C3cG.A0r(C3cG.A0x(C8866Frf.class), MenstruationFlowRecord.class), C3cG.A0r(C3cG.A0x(C9000Fwd.class), MenstruationPeriodRecord.class), C3cG.A0r(C3cG.A0x(C9046FxU.class), NutritionRecord.class), C3cG.A0r(C3cG.A0x(C8869Fri.class), OvulationTestRecord.class), C3cG.A0r(C3cG.A0x(C8951FuQ.class), OxygenSaturationRecord.class), C3cG.A0r(C3cG.A0x(C9062Fxk.class), PowerRecord.class)}, hxEArr) ? 1 : 0, hxEArr, 27, 11);
        A00 = AGH.A0D(hxEArr);
    }
}
