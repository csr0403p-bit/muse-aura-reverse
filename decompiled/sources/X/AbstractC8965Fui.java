package X;

import com.facebook.aura.commands.calendar.CalendarEventsCreateHandlerKt;
import com.facebook.aura.feed.repo.FeedRepositoryKt;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.Fui, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8965Fui {
    /* JADX WARN: Multi-variable type inference failed */
    public static final JsonObject A01(C8967Fun c8967Fun) {
        JsonElement jsonElementA07;
        C7384Etj.A0Y(c8967Fun, 0);
        C2nw c2nw = new C2nw();
        C7pd c7pd = new C7pd();
        C2nw c2nw2 = new C2nw();
        C7qW.A06("provider_id", c8967Fun.A00, c2nw2);
        Instant instant = c8967Fun.A03;
        C7qW.A05(AbstractC7608F5v.A0g(instant), "start_epoch_sec", c2nw2);
        Instant instant2 = c8967Fun.A02;
        C7qW.A05(AbstractC7608F5v.A0g(instant2), "end_epoch_sec", c2nw2);
        C7pd c7pd2 = new C7pd();
        List<C8966Fuk> list = c8967Fun.A04;
        for (C8966Fuk c8966Fuk : list) {
            C7384Etj.A0Y(c8966Fuk, 0);
            C2nw c2nw3 = new C2nw();
            C7qW.A05(Long.valueOf(c8966Fuk.A01), "start_epoch_sec", c2nw3);
            C7qW.A05(Long.valueOf(c8966Fuk.A00), "end_epoch_sec", c2nw3);
            C7qW.A06(FeedRepositoryKt.TIMEZONE_PARAM, c8966Fuk.A0J, c2nw3);
            Integer num = c8966Fuk.A0I;
            if (num != null) {
                C7qW.A05(num, "step_count", c2nw3);
            }
            Double d = c8966Fuk.A02;
            if (d != null) {
                C7qW.A05(d, "active_energy_burned_kcal", c2nw3);
            }
            Double d2 = c8966Fuk.A03;
            if (d2 != null) {
                C7qW.A05(d2, "basal_energy_burned_kcal", c2nw3);
            }
            Double d3 = c8966Fuk.A08;
            if (d3 != null) {
                C7qW.A05(d3, "distance_walking_running_meters", c2nw3);
            }
            Integer num2 = c8966Fuk.A0H;
            if (num2 != null) {
                C7qW.A05(num2, "flights_climbed", c2nw3);
            }
            Double d4 = c8966Fuk.A0B;
            if (d4 != null) {
                C7qW.A05(d4, "hr_average_bpm", c2nw3);
            }
            Double d5 = c8966Fuk.A0C;
            if (d5 != null) {
                C7qW.A05(d5, "hr_max_bpm", c2nw3);
            }
            Double d6 = c8966Fuk.A0E;
            if (d6 != null) {
                C7qW.A05(d6, "resting_hr_average_bpm", c2nw3);
            }
            Double d7 = c8966Fuk.A0A;
            if (d7 != null) {
                C7qW.A05(d7, "heart_rate_variability_ms", c2nw3);
            }
            Double d8 = c8966Fuk.A0G;
            if (d8 != null) {
                C7qW.A05(d8, "vo2_max", c2nw3);
            }
            Double d9 = c8966Fuk.A04;
            if (d9 != null) {
                C7qW.A05(d9, "body_fat_percentage", c2nw3);
            }
            Double d10 = c8966Fuk.A05;
            if (d10 != null) {
                C7qW.A05(d10, "body_mass_kg", c2nw3);
            }
            Double d11 = c8966Fuk.A09;
            if (d11 != null) {
                C7qW.A05(d11, "elevation_gained_m", c2nw3);
            }
            Double d12 = c8966Fuk.A0F;
            if (d12 != null) {
                C7qW.A05(d12, "total_energy_burned_kcal", c2nw3);
            }
            Double d13 = c8966Fuk.A06;
            if (d13 != null) {
                C7qW.A05(d13, "body_water_mass_kg", c2nw3);
            }
            Double d14 = c8966Fuk.A07;
            if (d14 != null) {
                C7qW.A05(d14, "bone_mass_kg", c2nw3);
            }
            Double d15 = c8966Fuk.A0D;
            if (d15 != null) {
                C7qW.A05(d15, "lean_body_mass_kg", c2nw3);
            }
            Map<String, Double> map = c8966Fuk.A0K;
            if (map != null) {
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    String strA0t = C60O.A0t(entryA0l);
                    Double dValueOf = Double.valueOf(BV6.A00(entryA0l.getValue()));
                    if (dValueOf instanceof Boolean) {
                        C9iZ c9iZ = C9oY.A00;
                        jsonElementA07 = new JsonLiteral(dValueOf, null, false);
                    } else if (dValueOf instanceof Number) {
                        jsonElementA07 = C9oY.A06(dValueOf);
                    } else {
                        jsonElementA07 = C9oY.A07(dValueOf instanceof String ? (String) dValueOf : dValueOf.toString());
                    }
                    c2nw3.A01(strA0t, jsonElementA07);
                }
            }
            c7pd2.A06(c2nw3.A00());
        }
        c2nw2.A01("aggregates", c7pd2.A05());
        C7pd c7pd3 = new C7pd();
        List<C8962Fuf> list2 = c8967Fun.A07;
        for (C8962Fuf c8962Fuf : list2) {
            C7384Etj.A0Y(c8962Fuf, 0);
            C2nw c2nw4 = new C2nw();
            C7qW.A06("id", c8962Fuf.A05, c2nw4);
            C7qW.A06("workout_type", c8962Fuf.A09, c2nw4);
            C7qW.A05(AbstractC7608F5v.A0g(c8962Fuf.A0B), "start_epoch_sec", c2nw4);
            C7qW.A05(AbstractC7608F5v.A0g(c8962Fuf.A0A), "end_epoch_sec", c2nw4);
            C7qW.A05(Double.valueOf(c8962Fuf.A00), "active_duration_secs", c2nw4);
            Double d16 = c8962Fuf.A02;
            if (d16 != null) {
                C7qW.A05(d16, "energy_burned_kcal", c2nw4);
            }
            Double d17 = c8962Fuf.A01;
            if (d17 != null) {
                C7qW.A05(d17, "distance_meters", c2nw4);
            }
            Double d18 = c8962Fuf.A03;
            if (d18 != null) {
                C7qW.A05(d18, "hr_average_bpm", c2nw4);
            }
            Double d19 = c8962Fuf.A04;
            if (d19 != null) {
                C7qW.A05(d19, "hr_max_bpm", c2nw4);
            }
            C7qW.A06(FeedRepositoryKt.TIMEZONE_PARAM, c8962Fuf.A08, c2nw4);
            C7qW.A06("bundle_id", c8962Fuf.A07, c2nw4);
            c7pd3.A06(c2nw4.A00());
        }
        c2nw2.A01("workouts", c7pd3.A05());
        C7pd c7pd4 = new C7pd();
        List<C8963Fug> list3 = c8967Fun.A06;
        for (C8963Fug c8963Fug : list3) {
            C7384Etj.A0Y(c8963Fug, 0);
            C2nw c2nw5 = new C2nw();
            C7qW.A06("id", c8963Fug.A06, c2nw5);
            C7qW.A05(AbstractC7608F5v.A0g(c8963Fug.A0B), "start_epoch_sec", c2nw5);
            C7qW.A05(AbstractC7608F5v.A0g(c8963Fug.A0A), "end_epoch_sec", c2nw5);
            C7qW.A06(FeedRepositoryKt.TIMEZONE_PARAM, c8963Fug.A09, c2nw5);
            C7qW.A06("bundle_id", c8963Fug.A08, c2nw5);
            Double d20 = c8963Fug.A00;
            if (d20 != null) {
                C7qW.A05(d20, "sleep_awake_duration_sec", c2nw5);
            }
            Double d21 = c8963Fug.A01;
            if (d21 != null) {
                C7qW.A05(d21, "sleep_core_duration_sec", c2nw5);
            }
            Double d22 = c8963Fug.A02;
            if (d22 != null) {
                C7qW.A05(d22, "sleep_deep_duration_sec", c2nw5);
            }
            Double d23 = c8963Fug.A04;
            if (d23 != null) {
                C7qW.A05(d23, "sleep_rem_duration_sec", c2nw5);
            }
            Double d24 = c8963Fug.A05;
            if (d24 != null) {
                C7qW.A05(d24, "sleep_asleep_unspecified_duration_sec", c2nw5);
            }
            Double d25 = c8963Fug.A03;
            if (d25 != null) {
                C7qW.A05(d25, "sleep_in_bed_duration_sec", c2nw5);
            }
            c7pd4.A06(c2nw5.A00());
        }
        c2nw2.A01("sleep", c7pd4.A05());
        C7pd c7pd5 = new C7pd();
        List list4 = c8967Fun.A05;
        Iterator it = list4.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("getId");
        }
        c2nw2.A01(CalendarEventsCreateHandlerKt.PARAM_EVENTS, c7pd5.A05());
        long epochSecond = instant.getEpochSecond();
        long epochSecond2 = instant2.getEpochSecond();
        C0924AIa c0924AIa = new C0924AIa();
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<C8966Fuk> it2 = list.iterator();
        while (it2.hasNext()) {
            BV6.A1R(arrayListA0m, it2.next().A01);
        }
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
        Iterator<C8966Fuk> it3 = list.iterator();
        while (it3.hasNext()) {
            BV6.A1R(arrayListA0m2, it3.next().A00);
        }
        HxE hxEA00 = A00(arrayListA0m, arrayListA0m2, epochSecond, epochSecond2);
        if (hxEA00 != null) {
            c0924AIa.put("aggregates", hxEA00);
        }
        ArrayList arrayListA0m3 = AnonymousClass002.A0m(list3);
        Iterator<C8963Fug> it4 = list3.iterator();
        while (it4.hasNext()) {
            BV6.A1R(arrayListA0m3, it4.next().A0B.getEpochSecond());
        }
        ArrayList arrayListA0m4 = AnonymousClass002.A0m(list3);
        Iterator<C8963Fug> it5 = list3.iterator();
        while (it5.hasNext()) {
            BV6.A1R(arrayListA0m4, it5.next().A0A.getEpochSecond());
        }
        HxE hxEA002 = A00(arrayListA0m3, arrayListA0m4, epochSecond, epochSecond2);
        if (hxEA002 != null) {
            c0924AIa.put("sleep", hxEA002);
        }
        ArrayList arrayListA0m5 = AnonymousClass002.A0m(list2);
        Iterator<C8962Fuf> it6 = list2.iterator();
        while (it6.hasNext()) {
            BV6.A1R(arrayListA0m5, it6.next().A0B.getEpochSecond());
        }
        ArrayList arrayListA0m6 = AnonymousClass002.A0m(list2);
        Iterator<C8962Fuf> it7 = list2.iterator();
        while (it7.hasNext()) {
            BV6.A1R(arrayListA0m6, it7.next().A0A.getEpochSecond());
        }
        HxE hxEA003 = A00(arrayListA0m5, arrayListA0m6, epochSecond, epochSecond2);
        if (hxEA003 != null) {
            c0924AIa.put("workouts", hxEA003);
        }
        ArrayList arrayListA0m7 = AnonymousClass002.A0m(list4);
        Iterator it8 = list4.iterator();
        if (it8.hasNext()) {
            it8.next();
            throw BV4.A0a("getStartDate");
        }
        ArrayList arrayListA0m8 = AnonymousClass002.A0m(list4);
        Iterator it9 = list4.iterator();
        if (it9.hasNext()) {
            it9.next();
            throw BV4.A0a("getEndDate");
        }
        HxE hxEA004 = A00(arrayListA0m7, arrayListA0m8, epochSecond, epochSecond2);
        if (hxEA004 != null) {
            c0924AIa.put(CalendarEventsCreateHandlerKt.PARAM_EVENTS, hxEA004);
        }
        C0924AIa c0924AIaA0K = AIW.A0K(c0924AIa);
        if (!c0924AIaA0K.isEmpty()) {
            C2nw c2nw6 = new C2nw();
            Iterator it10 = c0924AIaA0K.entrySet().iterator();
            while (it10.hasNext()) {
                Map.Entry entryA0l2 = C3cH.A0l(it10);
                String strA0t2 = C60O.A0t(entryA0l2);
                HxE hxE = (HxE) entryA0l2.getValue();
                C2nw c2nw7 = new C2nw();
                C7qW.A05((Number) hxE.first, "start_epoch_sec", c2nw7);
                C7qW.A05((Number) hxE.second, "end_epoch_sec", c2nw7);
                c2nw6.A01(strA0t2, c2nw7.A00());
            }
            c2nw2.A01("type_bounds", c2nw6.A00());
        }
        c7pd.A06(c2nw2.A00());
        return C60O.A1I("providers", c7pd.A05(), c2nw);
    }

    /* JADX WARN: Incorrect types in method signature: (JJLjava/util/List<Ljava/lang/Long;>;Ljava/util/List<Ljava/lang/Long;>;)LX/HxE<Ljava/lang/Long;Ljava/lang/Long;>; */
    public static final HxE A00(List list, List list2, long j, long j2) {
        Number number = (Number) AbstractC0878AGe.A09(list);
        if (number != null) {
            long jLongValue = number.longValue();
            Number number2 = (Number) AbstractC0878AGe.A07(list2);
            if (number2 != null) {
                long jLongValue2 = number2.longValue();
                if (jLongValue < j || jLongValue2 > j2) {
                    return C3cG.A0r(Long.valueOf(Math.min(jLongValue, j)), Long.valueOf(Math.max(jLongValue2, j2)));
                }
            }
        }
        return null;
    }
}
