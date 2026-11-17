package X;

import com.facebook.aura.model.BrowserTaskPresentation;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.FxW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9048FxW implements InterfaceC9020Fwx {
    public static final C8993FwW<Duration> A0C = new C8993FwW<>(C8989FwR.A00, C79.A0P, "ActiveTime", "time");
    public static final Map<Integer, String> A0D;
    public static final Map<String, Integer> A0E;
    public final int A00;
    public final AbstractC9043FxP A01;
    public final C9086FyD A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Instant A06;
    public final Instant A07;
    public final ZoneOffset A08;
    public final ZoneOffset A09;
    public final List<C9088FyF> A0A;
    public final List<C9068Fxq> A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9048FxW) {
                C9048FxW c9048FxW = (C9048FxW) obj;
                if (this.A00 != c9048FxW.A00 || !C7384Etj.areEqual(this.A05, c9048FxW.A05) || !C7384Etj.areEqual(this.A03, c9048FxW.A03) || !this.A07.equals(c9048FxW.A07) || !C7384Etj.areEqual(this.A09, c9048FxW.A09) || !this.A06.equals(c9048FxW.A06) || !C7384Etj.areEqual(this.A08, c9048FxW.A08) || !this.A02.equals(c9048FxW.A02) || !this.A0B.equals(c9048FxW.A0B) || !this.A0A.equals(c9048FxW.A0A) || !this.A01.equals(c9048FxW.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        HxE[] hxEArr = new HxE[83];
        System.arraycopy(new HxE[]{C3cG.A0r("back_extension", 13), C3cG.A0r("badminton", BV4.A0X()), C3cG.A0r("barbell_shoulder_press", 70), C3cG.A0r("baseball", BV4.A0Z()), C3cG.A0r("basketball", 5), C3cG.A0r("bench_press", 70), C3cG.A0r("bench_sit_up", 13), C3cG.A0r("biking", 8), C3cG.A0r("biking_stationary", 9), C3cG.A0r("boot_camp", 10), C3cG.A0r("boxing", 11), C3cG.A0r("burpee", 13), C3cG.A0r("cricket", 14), C3cG.A0r("crunch", 13), C3cG.A0r("dancing", 16), C3cG.A0r("deadlift", 70), C3cG.A0r("dumbbell_curl_left_arm", 70), C3cG.A0r("dumbbell_curl_right_arm", 70), C3cG.A0r("dumbbell_front_raise", 70), C3cG.A0r("dumbbell_lateral_raise", 70), C3cG.A0r("dumbbell_triceps_extension_left_arm", 70), C3cG.A0r("dumbbell_triceps_extension_right_arm", 70), C3cG.A0r("dumbbell_triceps_extension_two_arm", 70), C3cG.A0r("elliptical", 25), C3cG.A0r("exercise_class", 26), C3cG.A0r("fencing", 27), C3cG.A0r("football_american", 28)}, 0, hxEArr, 0, 27);
        System.arraycopy(new HxE[]{C3cG.A0r("football_australian", 29), C3cG.A0r("forward_twist", 13), C3cG.A0r("frisbee_disc", 31), C3cG.A0r("golf", 32), C3cG.A0r("guided_breathing", 33), C3cG.A0r("gymnastics", 34), C3cG.A0r("handball", 35), C3cG.A0r("hiking", 37), C3cG.A0r("ice_hockey", 38), C3cG.A0r("ice_skating", 39), C3cG.A0r("jumping_jack", 36), C3cG.A0r("jump_rope", 36), C3cG.A0r("lat_pull_down", 70), C3cG.A0r("lunge", 13), C3cG.A0r("martial_arts", 44), C3cG.A0r("paddling", 46), C3cG.A0r("para_gliding", 47), C3cG.A0r("pilates", 48), C3cG.A0r("plank", 13), C3cG.A0r("racquetball", 50), C3cG.A0r("rock_climbing", 51), C3cG.A0r("roller_hockey", 52), C3cG.A0r("rowing", 53), C3cG.A0r("rowing_machine", 54), C3cG.A0r("rugby", 55), C3cG.A0r(BrowserTaskPresentation.STATUS_RUNNING, 56), C3cG.A0r("running_treadmill", 57)}, 0, hxEArr, 27, 27);
        System.arraycopy(new HxE[]{C3cG.A0r("sailing", 58), C3cG.A0r("scuba_diving", 59), C3cG.A0r("skating", 60), C3cG.A0r("skiing", 61), C3cG.A0r("snowboarding", 62), C3cG.A0r("snowshoeing", 63), C3cG.A0r("soccer", 64), C3cG.A0r("softball", 65), C3cG.A0r("squash", 66), C3cG.A0r("squat", 13), C3cG.A0r("stair_climbing", 68), C3cG.A0r("stair_climbing_machine", 69), C3cG.A0r("stretching", 71), C3cG.A0r("surfing", 72), C3cG.A0r("swimming_open_water", 73), C3cG.A0r("swimming_pool", 74), C3cG.A0r("table_tennis", 75), C3cG.A0r("tennis", 76), C3cG.A0r("upper_twist", 13), C3cG.A0r("volleyball", 78), C3cG.A0r("walking", 79), C3cG.A0r("water_polo", 80), C3cG.A0r("weightlifting", 81), C3cG.A0r("wheelchair", 82), AnonymousClass002.A0p("workout", 0), AnonymousClass002.A0p("yoga", 83), C3cG.A0r("calisthenics", 13)}, 0, hxEArr, 54, 27);
        System.arraycopy(new HxE[]{C3cG.A0r("high_intensity_interval_training", 36), C3cG.A0r("strength_training", 70)}, 0, hxEArr, 81, 2);
        Map<String, Integer> mapA0D = AGH.A0D(hxEArr);
        A0E = mapA0D;
        Set<Map.Entry<String, Integer>> setEntrySet = mapA0D.entrySet();
        LinkedHashMap linkedHashMapA15 = C60O.A15(Hr7.A1C(setEntrySet));
        Iterator<Map.Entry<String, Integer>> it = setEntrySet.iterator();
        while (it.hasNext()) {
            AbstractC7611F5y.A17(linkedHashMapA15, it);
        }
        A0D = linkedHashMapA15;
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AFC() {
        return this.A06;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AFE() {
        return this.A08;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A02;
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AKy() {
        return this.A07;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AKz() {
        return this.A09;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0F(this.A02, (AnonymousClass005.A0F(this.A06, ((((((this.A00 * 31) + BV7.A0I(this.A05)) * 31) + BV7.A0I(this.A03)) * 31) + C60R.A01(this.A09)) * 31) + C8j4.A0E(this.A08, 0)) * 31));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ExerciseSessionRecord(startTime=");
        AbstractC7608F5v.A1T(sbA0x, this.A07);
        AbstractC7608F5v.A1P(sbA0x, this.A09);
        AbstractC7608F5v.A1S(sbA0x, this.A06);
        sbA0x.append(this.A08);
        sbA0x.append(", exerciseType=");
        sbA0x.append(this.A00);
        sbA0x.append(", title=");
        sbA0x.append(this.A05);
        sbA0x.append(", notes=");
        sbA0x.append(this.A03);
        sbA0x.append(", metadata=");
        sbA0x.append(this.A02);
        sbA0x.append(", segments=");
        sbA0x.append(this.A0B);
        sbA0x.append(", laps=");
        sbA0x.append(this.A0A);
        sbA0x.append(", exerciseRouteResult=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;LX/FyD;ILjava/lang/String;Ljava/lang/String;Ljava/util/List<LX/Fxq;>;Ljava/util/List<LX/FyF;>;LX/FxP;Ljava/lang/String;)V */
    public C9048FxW(AbstractC9043FxP abstractC9043FxP, C9086FyD c9086FyD, String str, String str2, String str3, Instant instant, Instant instant2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, List list, List list2, int i) {
        Set<Integer> set;
        C7384Etj.A0Y(list, 8);
        C7384Etj.A0Y(list2, 9);
        this.A07 = instant;
        this.A09 = zoneOffset;
        this.A06 = instant2;
        this.A08 = zoneOffset2;
        this.A02 = c9086FyD;
        this.A00 = i;
        this.A05 = str;
        this.A03 = str2;
        this.A0B = list;
        this.A0A = list2;
        this.A01 = abstractC9043FxP;
        this.A04 = str3;
        if (instant.isBefore(instant2)) {
            int i2 = 0;
            if (!list.isEmpty()) {
                List listA0c = AbstractC0878AGe.A0c(list, new C10635I0f(new C8630Fhh(6), 1));
                int iA0E = AnonymousClass002.A0E(listA0c);
                int i3 = 0;
                while (i3 < iA0E) {
                    Instant instant3 = ((C9068Fxq) listA0c.get(i3)).A02;
                    i3++;
                    if (instant3.isAfter(((C9068Fxq) listA0c.get(i3)).A03)) {
                        throw C60O.A0i("segments can not overlap.");
                    }
                }
                if (!((C9068Fxq) AbstractC0878AGe.A0F(listA0c)).A03.isBefore(this.A07)) {
                    if (!((C9068Fxq) AbstractC0878AGe.A0H(listA0c)).A02.isAfter(this.A06)) {
                        Iterator it = listA0c.iterator();
                        while (it.hasNext()) {
                            int i4 = ((C9068Fxq) it.next()).A01;
                            int i5 = this.A00;
                            Set<Integer> set2 = C9068Fxq.A06;
                            Integer numValueOf = Integer.valueOf(i5);
                            if (!set2.contains(numValueOf)) {
                                Set<Integer> set3 = C9068Fxq.A05;
                                Integer numValueOf2 = Integer.valueOf(i4);
                                if (!set3.contains(numValueOf2) && ((set = C9068Fxq.A04.get(numValueOf)) == null || !set.contains(numValueOf2))) {
                                    throw C60O.A0i("segmentType and sessionType is not compatible.");
                                }
                            }
                        }
                    } else {
                        throw C60O.A0i("segments can not be out of parent time range.");
                    }
                } else {
                    throw C60O.A0i("segments can not be out of parent time range.");
                }
            }
            if (!this.A0A.isEmpty()) {
                List listA0c2 = AbstractC0878AGe.A0c(this.A0A, new C10635I0f(new C8630Fhh(5), 2));
                int iA0E2 = AnonymousClass002.A0E(listA0c2);
                while (i2 < iA0E2) {
                    Instant instant4 = ((C9088FyF) listA0c2.get(i2)).A01;
                    i2++;
                    if (instant4.isAfter(((C9088FyF) listA0c2.get(i2)).A02)) {
                        throw C60O.A0i("laps can not overlap.");
                    }
                }
                if (!((C9088FyF) AbstractC0878AGe.A0F(listA0c2)).A02.isBefore(this.A07)) {
                    if (((C9088FyF) AbstractC0878AGe.A0H(listA0c2)).A01.isAfter(this.A06)) {
                        throw C60O.A0i("laps can not be out of parent time range.");
                    }
                } else {
                    throw C60O.A0i("laps can not be out of parent time range.");
                }
            }
            AbstractC9043FxP abstractC9043FxP2 = this.A01;
            if (!(abstractC9043FxP2 instanceof C9039FxL) || ((C9039FxL) abstractC9043FxP2).A00.A00.isEmpty()) {
                return;
            }
            List<C9034FxG> list3 = ((C9039FxL) this.A01).A00.A00;
            Iterator<C9034FxG> it2 = list3.iterator();
            if (it2.hasNext()) {
                C9034FxG next = it2.next();
                if (it2.hasNext()) {
                    Instant instant5 = next.A05;
                    do {
                        C9034FxG next2 = it2.next();
                        Instant instant6 = next2.A05;
                        if (instant5.compareTo(instant6) > 0) {
                            next = next2;
                            instant5 = instant6;
                        }
                    } while (it2.hasNext());
                }
                Instant instant7 = next.A05;
                Iterator<C9034FxG> it3 = list3.iterator();
                if (it3.hasNext()) {
                    C9034FxG next3 = it3.next();
                    if (it3.hasNext()) {
                        Instant instant8 = next3.A05;
                        do {
                            C9034FxG next4 = it3.next();
                            Instant instant9 = next4.A05;
                            if (instant8.compareTo(instant9) < 0) {
                                next3 = next4;
                                instant8 = instant9;
                            }
                        } while (it3.hasNext());
                    }
                    Instant instant10 = next3.A05;
                    if (instant7.isBefore(this.A07) || !instant10.isBefore(this.A06)) {
                        throw C60O.A0i("route can not be out of parent time range.");
                    }
                    return;
                }
                throw C8j3.A1D();
            }
            throw C8j3.A1D();
        }
        throw AbstractC7608F5v.A0d();
    }
}
