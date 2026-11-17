package X;

import com.facebook.aura.devices.entries.HatchLinkOrderDeeplink;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;

/* renamed from: X.Fxn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9065Fxn implements Fx5 {
    public static final Map<Integer, String> A07;
    public static final Map<String, Integer> A08;
    public static final Map<Integer, String> A09;
    public static final Map<String, Integer> A0A;
    public static final C9080Fy7 A0B;
    public final int A00;
    public final int A01;
    public final int A02;
    public final C9086FyD A03;
    public final C9080Fy7 A04;
    public final Instant A05;
    public final ZoneOffset A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.health.connect.client.records.BloodGlucoseRecord");
                C9065Fxn c9065Fxn = (C9065Fxn) obj;
                if (!this.A05.equals(c9065Fxn.A05) || !C7384Etj.areEqual(this.A06, c9065Fxn.A06) || !this.A04.equals(c9065Fxn.A04) || this.A02 != c9065Fxn.A02 || this.A00 != c9065Fxn.A00 || this.A01 != c9065Fxn.A01 || !this.A03.equals(c9065Fxn.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Map<EnumC9093FyK, C9080Fy7> map = C9080Fy7.A02;
        A0B = new C9080Fy7(EnumC9093FyK.A02, 50.0d);
        Integer numA0Z = BV4.A0Z();
        Integer numA0W = BV4.A0W();
        HxE hxEA0r = C3cG.A0r(HatchLinkOrderDeeplink.GENERAL_SETTINGS_TAB, numA0W);
        HxE hxEA0r2 = C3cG.A0r("after_meal", numA0Z);
        Integer numA0X = BV4.A0X();
        HxE hxEA0r3 = C3cG.A0r("fasting", numA0X);
        Integer numA0Y = BV4.A0Y();
        Map<String, Integer> mapA0n = C3cH.A0n("before_meal", numA0Y, hxEA0r, hxEA0r2, hxEA0r3);
        A08 = mapA0n;
        A07 = AbstractC8873Frm.A00(mapA0n);
        Map<String, Integer> mapA0D = AGH.A0D(C3cG.A0r("interstitial_fluid", numA0W), C3cG.A0r("capillary_blood", numA0X), C3cG.A0r("plasma", numA0Y), C3cG.A0r("tears", 5), AnonymousClass002.A0p("whole_blood", 6), C3cG.A0r("serum", numA0Z));
        A0A = mapA0D;
        A09 = AbstractC8873Frm.A00(mapA0D);
    }

    public C9065Fxn(C9086FyD c9086FyD, C9080Fy7 c9080Fy7, Instant instant, ZoneOffset zoneOffset, int i, int i2, int i3) {
        this.A05 = instant;
        this.A06 = zoneOffset;
        this.A03 = c9086FyD;
        this.A04 = c9080Fy7;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        AbstractC8873Frm.A01(c9080Fy7, (C9080Fy7) AbstractC7610F5x.A0s(c9080Fy7.A01, C9080Fy7.A02), "level");
        AbstractC8873Frm.A02(c9080Fy7, A0B, "level");
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A03;
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
        return AnonymousClass005.A0G(this.A03, (((((AnonymousClass005.A0F(this.A04, (AnonymousClass005.A0E(this.A05) + C60R.A01(this.A06)) * 31) + this.A02) * 31) + this.A00) * 31) + this.A01) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("BloodGlucoseRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A05);
        sbA0x.append(this.A06);
        sbA0x.append(", level=");
        sbA0x.append(this.A04);
        sbA0x.append(", specimenSource=");
        sbA0x.append(this.A02);
        sbA0x.append(", mealType=");
        sbA0x.append(this.A00);
        sbA0x.append(", relationToMeal=");
        AbstractC7608F5v.A1N(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A03, sbA0x);
    }
}
