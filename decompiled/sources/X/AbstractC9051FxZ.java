package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.FxZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9051FxZ {
    public static final List<String> A00;
    public static final List<String> A01;
    public static final Map<C9uG<? extends InterfaceC9011Fwo>, String> A02;

    public static final String A00(C9uG<? extends InterfaceC9011Fwo> c9uG) {
        C7384Etj.A0Y(c9uG, 0);
        Map<C9uG<? extends InterfaceC9011Fwo>, String> map = A02;
        if (map.get(c9uG) != null) {
            return FGI.A0M("android.permission.health.READ_", C60O.A0p(c9uG, map));
        }
        throw C8j3.A0w(".simpleName", C3cG.A0f(c9uG, "Given recordType is not valid : "));
    }

    static {
        HxE[] hxEArr = new HxE[42];
        System.arraycopy(new HxE[]{A01(C3cG.A0x(C9070Fxs.class), "android.permission.health.READ_PLANNED_EXERCISE"), A01(C3cG.A0x(C9062Fxk.class), "android.permission.health.READ_POWER"), A01(C3cG.A0x(C8876Frp.class), "android.permission.health.READ_RESPIRATORY_RATE"), A01(C3cG.A0x(C8880Frt.class), "android.permission.health.READ_RESTING_HEART_RATE"), A01(C3cG.A0x(C8870Frj.class), "android.permission.health.READ_SEXUAL_ACTIVITY"), A01(C3cG.A0x(C9003Fwg.class), "android.permission.health.READ_SLEEP"), A01(C3cG.A0x(C9060Fxi.class), "android.permission.health.READ_SPEED"), A01(C3cG.A0x(C9052Fxa.class), "android.permission.health.READ_SKIN_TEMPERATURE"), A01(C3cG.A0x(C9006Fwj.class), "android.permission.health.READ_STEPS"), A01(C3cG.A0x(C8999Fwc.class), "android.permission.health.READ_STEPS"), A01(C3cG.A0x(C9057Fxf.class), "android.permission.health.READ_TOTAL_CALORIES_BURNED"), A01(C3cG.A0x(C8878Frr.class), "android.permission.health.READ_VO2_MAX"), A01(C3cG.A0x(C9067Fxp.class), "android.permission.health.READ_WEIGHT"), A01(C3cG.A0x(C8998Fwb.class), "android.permission.health.READ_WHEELCHAIR_PUSHES"), A01(C3cG.A0x(C8997Fwa.class), "android.permission.health.READ_ACTIVITY_INTENSITY")}, BV5.A1U(new HxE[]{A01(C3cG.A0x(C9064Fxm.class), "android.permission.health.READ_ACTIVE_CALORIES_BURNED"), A01(C3cG.A0x(C9075Fy2.class), "android.permission.health.READ_BASAL_BODY_TEMPERATURE"), A01(C3cG.A0x(C9069Fxr.class), "android.permission.health.READ_BASAL_METABOLIC_RATE"), A01(C3cG.A0x(C9065Fxn.class), "android.permission.health.READ_BLOOD_GLUCOSE"), A01(C3cG.A0x(C9056Fxe.class), "android.permission.health.READ_BLOOD_PRESSURE"), A01(C3cG.A0x(C8952FuR.class), "android.permission.health.READ_BODY_FAT"), A01(C3cG.A0x(C9084FyB.class), "android.permission.health.READ_BODY_TEMPERATURE"), A01(C3cG.A0x(C9073Fxz.class), "android.permission.health.READ_BODY_WATER_MASS"), A01(C3cG.A0x(C9074Fy0.class), "android.permission.health.READ_BONE_MASS"), A01(C3cG.A0x(C8867Frg.class), "android.permission.health.READ_CERVICAL_MUCUS"), A01(C3cG.A0x(C9007Fwk.class), "android.permission.health.READ_EXERCISE"), A01(C3cG.A0x(C9061Fxj.class), "android.permission.health.READ_DISTANCE"), A01(C3cG.A0x(C9066Fxo.class), "android.permission.health.READ_ELEVATION_GAINED"), A01(C3cG.A0x(C9048FxW.class), "android.permission.health.READ_EXERCISE"), A01(C3cG.A0x(C9001Fwe.class), "android.permission.health.READ_FLOORS_CLIMBED"), A01(C3cG.A0x(C9005Fwi.class), "android.permission.health.READ_HEART_RATE"), A01(C3cG.A0x(C8877Frq.class), "android.permission.health.READ_HEART_RATE_VARIABILITY"), A01(C3cG.A0x(C9063Fxl.class), "android.permission.health.READ_HEIGHT"), A01(C3cG.A0x(C9059Fxh.class), "android.permission.health.READ_HYDRATION"), A01(C3cG.A0x(C8872Frl.class), "android.permission.health.READ_INTERMENSTRUAL_BLEEDING"), A01(C3cG.A0x(C9071Fxx.class), "android.permission.health.READ_LEAN_BODY_MASS"), A01(C3cG.A0x(C8866Frf.class), "android.permission.health.READ_MENSTRUATION"), A01(C3cG.A0x(C9000Fwd.class), "android.permission.health.READ_MENSTRUATION"), A01(C3cG.A0x(C9002Fwf.class), "android.permission.health.READ_MINDFULNESS"), A01(C3cG.A0x(C9046FxU.class), "android.permission.health.READ_NUTRITION"), A01(C3cG.A0x(C8869Fri.class), "android.permission.health.READ_OVULATION_TEST"), A01(C3cG.A0x(C8951FuQ.class), "android.permission.health.READ_OXYGEN_SATURATION")}, hxEArr) ? 1 : 0, hxEArr, 27, 15);
        Map<C9uG<? extends InterfaceC9011Fwo>, String> mapA0D = AGH.A0D(hxEArr);
        A02 = mapA0D;
        AII aiiA17 = AIM.A17();
        aiiA17.add("android.permission.health.WRITE_MEDICAL_DATA");
        aiiA17.add("android.permission.health.READ_MEDICAL_DATA_ALLERGIES_INTOLERANCES");
        aiiA17.add("android.permission.health.READ_MEDICAL_DATA_CONDITIONS");
        aiiA17.add("android.permission.health.READ_MEDICAL_DATA_LABORATORY_RESULTS");
        aiiA17.add("android.permission.health.READ_MEDICAL_DATA_MEDICATIONS");
        aiiA17.add("android.permission.health.READ_MEDICAL_DATA_PERSONAL_DETAILS");
        aiiA17.add("android.permission.health.READ_MEDICAL_DATA_PRACTITIONER_DETAILS");
        aiiA17.add("android.permission.health.READ_MEDICAL_DATA_PREGNANCY");
        aiiA17.add("android.permission.health.READ_MEDICAL_DATA_PROCEDURES");
        aiiA17.add("android.permission.health.READ_MEDICAL_DATA_SOCIAL_HISTORY");
        aiiA17.add("android.permission.health.READ_MEDICAL_DATA_VACCINES");
        aiiA17.add("android.permission.health.READ_MEDICAL_DATA_VISITS");
        aiiA17.add("android.permission.health.READ_MEDICAL_DATA_VITAL_SIGNS");
        A01 = AIM.A18(aiiA17);
        AII aiiA172 = AIM.A17();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(mapA0D);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            AbstractC0882AGj.A0r(Arrays.asList(FGI.A0M("android.permission.health.WRITE_", (String) entryA0l.getValue()), FGI.A0M("android.permission.health.READ_", (String) entryA0l.getValue())), arrayListA0h);
        }
        aiiA172.addAll(arrayListA0h);
        aiiA172.addAll(A01);
        aiiA172.add("android.permission.health.WRITE_EXERCISE_ROUTE");
        aiiA172.add("android.permission.health.READ_HEALTH_DATA_IN_BACKGROUND");
        aiiA172.add("android.permission.health.READ_HEALTH_DATA_HISTORY");
        aiiA172.add("android.permission.health.READ_EXERCISE_ROUTES");
        A00 = AIM.A18(aiiA172);
    }

    public static HxE A01(Object obj, String str) {
        return new HxE(obj, C7BY.A0U(str, "android.permission.health.READ_", str));
    }
}
