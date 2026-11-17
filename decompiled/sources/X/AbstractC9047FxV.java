package X;

import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.AggregationType;
import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.ExerciseSessionRecord;
import android.health.connect.datatypes.FloorsClimbedRecord;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.SkinTemperatureRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Power;
import android.health.connect.datatypes.units.Pressure;
import android.health.connect.datatypes.units.Velocity;
import android.health.connect.datatypes.units.Volume;
import android.os.ext.SdkExtensions;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.FxV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9047FxV {
    public static final Map<C8993FwW<Double>, AggregationType<Double>> A00;
    public static final Map<C8993FwW<Duration>, AggregationType<Long>> A01;
    public static final Map<C8993FwW<C9076Fy3>, AggregationType<Energy>> A02;
    public static final Map<C8993FwW<C9072Fxy>, AggregationType<Mass>> A03;
    public static final Map<C8993FwW<C9072Fxy>, AggregationType<Mass>> A04;
    public static final Map<C8993FwW<Fy1>, AggregationType<Length>> A05;
    public static final Map<C8993FwW<Long>, AggregationType<Long>> A06;
    public static final Map<C8993FwW<C9077Fy4>, AggregationType<Power>> A07;
    public static final Map<C8993FwW<C9095FyM>, AggregationType<Pressure>> A08;
    public static final Map<C8993FwW<C9082Fy9>, AggregationType<?>> A09;
    public static final Map<C8993FwW<C9078Fy5>, AggregationType<Velocity>> A0A;
    public static final Map<C8993FwW<C9079Fy6>, AggregationType<Volume>> A0B;
    public static final HxE<C8993FwW<Double>, AggregationType<Double>>[] A0C;

    static {
        Map<C8993FwW<C9095FyM>, AggregationType<Pressure>> mapA15;
        Map<C8993FwW<C9082Fy9>, AggregationType<?>> mapA152;
        Map<C8993FwW<C9078Fy5>, AggregationType<Velocity>> mapA153;
        HxE<C8993FwW<Double>, AggregationType<Double>>[] hxEArr = SdkExtensions.getExtensionVersion(34) >= 10 ? new HxE[]{C3cG.A0r(C9007Fwk.A06, CyclingPedalingCadenceRecord.RPM_AVG), C3cG.A0r(C9007Fwk.A07, CyclingPedalingCadenceRecord.RPM_MAX), C3cG.A0r(C9007Fwk.A08, CyclingPedalingCadenceRecord.RPM_MIN), C3cG.A0r(C9006Fwj.A06, StepsCadenceRecord.STEPS_CADENCE_RATE_AVG), C3cG.A0r(C9006Fwj.A07, StepsCadenceRecord.STEPS_CADENCE_RATE_MAX), C3cG.A0r(C9006Fwj.A08, StepsCadenceRecord.STEPS_CADENCE_RATE_MIN)} : new HxE[0];
        A0C = hxEArr;
        ArrayList arrayListA11 = C60O.A11(2);
        AnonymousClass002.A1J(C9001Fwe.A06, FloorsClimbedRecord.FLOORS_CLIMBED_TOTAL, arrayListA11);
        C1f2.A00(hxEArr, arrayListA11);
        A00 = AGH.A0D((HxE[]) arrayListA11.toArray(new HxE[arrayListA11.size()]));
        A01 = AnonymousClass007.A0d(C9003Fwg.A08, SleepSessionRecord.SLEEP_DURATION_TOTAL, C3cG.A0r(C9048FxW.A0C, ExerciseSessionRecord.EXERCISE_DURATION_TOTAL));
        A02 = AbstractC7608F5v.A16(C3cG.A0r(C9064Fxm.A06, ActiveCaloriesBurnedRecord.ACTIVE_CALORIES_TOTAL), C3cG.A0r(C9069Fxr.A04, BasalMetabolicRateRecord.BASAL_CALORIES_TOTAL), C3cG.A0r(C9046FxU.A0w, NutritionRecord.ENERGY_TOTAL), C3cG.A0r(C9046FxU.A0v, NutritionRecord.ENERGY_FROM_FAT_TOTAL), C3cG.A0r(C9057Fxf.A06, TotalCaloriesBurnedRecord.ENERGY_TOTAL));
        A05 = AbstractC7608F5v.A16(C3cG.A0r(C9061Fxj.A06, DistanceRecord.DISTANCE_TOTAL), C3cG.A0r(C9066Fxo.A06, ElevationGainedRecord.ELEVATION_GAINED_TOTAL), C3cG.A0r(C9063Fxl.A04, HeightRecord.HEIGHT_AVG), C3cG.A0r(C9063Fxl.A06, HeightRecord.HEIGHT_MIN), C3cG.A0r(C9063Fxl.A05, HeightRecord.HEIGHT_MAX));
        A06 = AGH.A0D(C3cG.A0r(C9005Fwi.A06, HeartRateRecord.BPM_AVG), C3cG.A0r(C9005Fwi.A08, HeartRateRecord.BPM_MIN), C3cG.A0r(C9005Fwi.A07, HeartRateRecord.BPM_MAX), C3cG.A0r(C9005Fwi.A09, HeartRateRecord.HEART_MEASUREMENTS_COUNT), C3cG.A0r(C8880Frt.A04, RestingHeartRateRecord.BPM_AVG), C3cG.A0r(C8880Frt.A06, RestingHeartRateRecord.BPM_MIN), C3cG.A0r(C8880Frt.A05, RestingHeartRateRecord.BPM_MAX), C3cG.A0r(C8999Fwc.A06, StepsRecord.STEPS_COUNT_TOTAL), C3cG.A0r(C8998Fwb.A06, WheelchairPushesRecord.WHEEL_CHAIR_PUSHES_COUNT_TOTAL));
        ArrayList arrayListA112 = C60O.A11(40);
        AnonymousClass002.A1J(C9046FxU.A0n, NutritionRecord.BIOTIN_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A0o, NutritionRecord.CAFFEINE_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A0p, NutritionRecord.CALCIUM_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A0q, NutritionRecord.CHLORIDE_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A0r, NutritionRecord.CHOLESTEROL_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A0s, NutritionRecord.CHROMIUM_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A0t, NutritionRecord.COPPER_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A0u, NutritionRecord.DIETARY_FIBER_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A0x, NutritionRecord.FOLATE_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A0y, NutritionRecord.FOLIC_ACID_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A0z, NutritionRecord.IODINE_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A10, NutritionRecord.IRON_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A11, NutritionRecord.MAGNESIUM_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A12, NutritionRecord.MANGANESE_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A13, NutritionRecord.MOLYBDENUM_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A14, NutritionRecord.MONOUNSATURATED_FAT_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A15, NutritionRecord.NIACIN_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A16, NutritionRecord.PANTOTHENIC_ACID_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A17, NutritionRecord.PHOSPHORUS_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A18, NutritionRecord.POLYUNSATURATED_FAT_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A19, NutritionRecord.POTASSIUM_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1A, NutritionRecord.PROTEIN_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1B, NutritionRecord.RIBOFLAVIN_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1C, NutritionRecord.SATURATED_FAT_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1D, NutritionRecord.SELENIUM_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1E, NutritionRecord.SODIUM_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1F, NutritionRecord.SUGAR_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1G, NutritionRecord.THIAMIN_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1H, NutritionRecord.TOTAL_CARBOHYDRATE_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1I, NutritionRecord.TOTAL_FAT_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1K, NutritionRecord.UNSATURATED_FAT_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1L, NutritionRecord.VITAMIN_A_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1M, NutritionRecord.VITAMIN_B12_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1N, NutritionRecord.VITAMIN_B6_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1O, NutritionRecord.VITAMIN_C_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1P, NutritionRecord.VITAMIN_D_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1Q, NutritionRecord.VITAMIN_E_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1R, NutritionRecord.VITAMIN_K_TOTAL, arrayListA112);
        AnonymousClass002.A1J(C9046FxU.A1S, NutritionRecord.ZINC_TOTAL, arrayListA112);
        C1f2.A00(SdkExtensions.getExtensionVersion(34) >= 10 ? new HxE[]{C3cG.A0r(C9046FxU.A1J, NutritionRecord.TRANS_FAT_TOTAL)} : new HxE[0], arrayListA112);
        A03 = AGH.A0D((HxE[]) arrayListA112.toArray(new HxE[arrayListA112.size()]));
        A04 = C3cH.A0m(C9067Fxp.A05, WeightRecord.WEIGHT_MAX, C3cG.A0r(C9067Fxp.A04, WeightRecord.WEIGHT_AVG), C3cG.A0r(C9067Fxp.A06, WeightRecord.WEIGHT_MIN));
        A07 = C3cH.A0m(C9062Fxk.A08, PowerRecord.POWER_MIN, C3cG.A0r(C9062Fxk.A06, PowerRecord.POWER_AVG), C3cG.A0r(C9062Fxk.A07, PowerRecord.POWER_MAX));
        HxE[] hxEArr2 = SdkExtensions.getExtensionVersion(34) >= 10 ? new HxE[]{C3cG.A0r(C9056Fxe.A07, BloodPressureRecord.DIASTOLIC_AVG), C3cG.A0r(C9056Fxe.A08, BloodPressureRecord.DIASTOLIC_MAX), C3cG.A0r(C9056Fxe.A09, BloodPressureRecord.DIASTOLIC_MIN), C3cG.A0r(C9056Fxe.A0A, BloodPressureRecord.SYSTOLIC_AVG), C3cG.A0r(C9056Fxe.A0B, BloodPressureRecord.SYSTOLIC_MAX), C3cG.A0r(C9056Fxe.A0C, BloodPressureRecord.SYSTOLIC_MIN)} : new HxE[0];
        int length = hxEArr2.length;
        if (length != 0) {
            mapA15 = C60O.A15(AIW.A0H(length));
            AGH.A0G(mapA15, hxEArr2);
        } else {
            mapA15 = C9jH.A00;
        }
        A08 = mapA15;
        HxE[] hxEArrA01 = SdkExtensions.getExtensionVersion(34) >= 13 ? HxE.A01(C9052Fxa.A0A, SkinTemperatureRecord.SKIN_TEMPERATURE_DELTA_MIN, C3cG.A0r(C9052Fxa.A08, SkinTemperatureRecord.SKIN_TEMPERATURE_DELTA_AVG), C3cG.A0r(C9052Fxa.A09, SkinTemperatureRecord.SKIN_TEMPERATURE_DELTA_MAX)) : new HxE[0];
        int length2 = hxEArrA01.length;
        if (length2 != 0) {
            mapA152 = C60O.A15(AIW.A0H(length2));
            AGH.A0G(mapA152, hxEArrA01);
        } else {
            mapA152 = C9jH.A00;
        }
        A09 = mapA152;
        HxE[] hxEArrA012 = SdkExtensions.getExtensionVersion(34) >= 10 ? HxE.A01(C9060Fxi.A08, SpeedRecord.SPEED_MIN, C3cG.A0r(C9060Fxi.A06, SpeedRecord.SPEED_AVG), C3cG.A0r(C9060Fxi.A07, SpeedRecord.SPEED_MAX)) : new HxE[0];
        int length3 = hxEArrA012.length;
        if (length3 != 0) {
            mapA153 = C60O.A15(AIW.A0H(length3));
            AGH.A0G(mapA153, hxEArrA012);
        } else {
            mapA153 = C9jH.A00;
        }
        A0A = mapA153;
        A0B = AnonymousClass006.A10(C9059Fxh.A06, HydrationRecord.VOLUME_TOTAL);
    }
}
