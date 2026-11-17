package X;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;

/* renamed from: X.Fxe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9056Fxe implements Fx5 {
    public static final C8993FwW<C9095FyM> A07;
    public static final C8993FwW<C9095FyM> A08;
    public static final C8993FwW<C9095FyM> A09;
    public static final C8993FwW<C9095FyM> A0A;
    public static final C8993FwW<C9095FyM> A0B;
    public static final C8993FwW<C9095FyM> A0C;
    public static final Map<Integer, String> A0D;
    public static final Map<String, Integer> A0E;
    public static final Map<Integer, String> A0F;
    public static final Map<String, Integer> A0G;
    public static final C9095FyM A0H;
    public static final C9095FyM A0I;
    public static final C9095FyM A0J;
    public static final C9095FyM A0K;
    public final int A00;
    public final int A01;
    public final C9086FyD A02;
    public final C9095FyM A03;
    public final C9095FyM A04;
    public final Instant A05;
    public final ZoneOffset A06;

    static {
        HxE hxEA0r = C3cG.A0r("left_upper_arm", 3);
        Integer numA0W = BV4.A0W();
        Map<String, Integer> mapA0n = C3cH.A0n("right_wrist", 2, hxEA0r, C3cG.A0r("left_wrist", numA0W), C3cG.A0r("right_upper_arm", 4));
        A0G = mapA0n;
        A0F = AbstractC8873Frm.A00(mapA0n);
        Map<String, Integer> mapA0n2 = C3cH.A0n("standing_up", numA0W, C3cG.A0r("lying_down", 3), C3cG.A0r("reclining", 4), C3cG.A0r("sitting_down", 2));
        A0E = mapA0n2;
        A0D = AbstractC8873Frm.A00(mapA0n2);
        A0K = new C9095FyM(20.0d);
        A0I = new C9095FyM(200.0d);
        A0J = new C9095FyM(10.0d);
        A0H = new C9095FyM(180.0d);
        Integer num = C79.A01;
        C9145FzE c9145FzE = C9095FyM.A01;
        A0A = C8993FwW.A02(num, "BloodPressure", "systolic", AbstractC7607F5u.A1B(c9145FzE, 5));
        Integer num2 = C79.A0C;
        A0C = C8993FwW.A02(num2, "BloodPressure", "systolic", AbstractC7607F5u.A1B(c9145FzE, 7));
        Integer num3 = C79.A0K;
        A0B = C8993FwW.A02(num3, "BloodPressure", "systolic", AbstractC7607F5u.A1B(c9145FzE, 6));
        A07 = C8993FwW.A02(num, "BloodPressure", "diastolic", AbstractC7607F5u.A1B(c9145FzE, 2));
        A09 = C8993FwW.A02(num2, "BloodPressure", "diastolic", AbstractC7607F5u.A1B(c9145FzE, 4));
        A08 = C8993FwW.A02(num3, "BloodPressure", "diastolic", AbstractC7607F5u.A1B(c9145FzE, 3));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9056Fxe) {
                C9056Fxe c9056Fxe = (C9056Fxe) obj;
                if (!this.A04.equals(c9056Fxe.A04) || !this.A03.equals(c9056Fxe.A03) || this.A00 != c9056Fxe.A00 || this.A01 != c9056Fxe.A01 || !this.A05.equals(c9056Fxe.A05) || !C7384Etj.areEqual(this.A06, c9056Fxe.A06) || !this.A02.equals(c9056Fxe.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public C9056Fxe(C9086FyD c9086FyD, C9095FyM c9095FyM, C9095FyM c9095FyM2, Instant instant, ZoneOffset zoneOffset, int i, int i2) {
        this.A05 = instant;
        this.A06 = zoneOffset;
        this.A02 = c9086FyD;
        this.A04 = c9095FyM;
        this.A03 = c9095FyM2;
        this.A00 = i;
        this.A01 = i2;
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC9045FxR.A01(this);
            return;
        }
        AbstractC8873Frm.A01(c9095FyM, A0K, "systolic");
        AbstractC8873Frm.A02(c9095FyM, A0I, "systolic");
        AbstractC8873Frm.A01(c9095FyM2, A0J, "diastolic");
        AbstractC8873Frm.A02(c9095FyM2, A0H, "diastolic");
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A02;
    }

    @Override // X.Fx5
    public final Instant ALd() {
        return this.A05;
    }

    @Override // X.Fx5
    public final ZoneOffset AMx() {
        return this.A06;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, (AnonymousClass005.A0F(this.A05, (((AnonymousClass005.A0F(this.A03, AnonymousClass005.A0E(this.A04)) + this.A00) * 31) + this.A01) * 31) + C60R.A01(this.A06)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("BloodPressureRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A05);
        sbA0x.append(this.A06);
        sbA0x.append(", systolic=");
        sbA0x.append(this.A04);
        sbA0x.append(", diastolic=");
        sbA0x.append(this.A03);
        sbA0x.append(", bodyPosition=");
        sbA0x.append(this.A00);
        sbA0x.append(", measurementLocation=");
        AbstractC7608F5v.A1N(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }
}
