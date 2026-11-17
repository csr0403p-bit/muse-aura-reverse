package X;

import com.facebook.aura.avatarassets.AvatarMediaMapperKt;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;

/* renamed from: X.Frg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8867Frg implements Fx5 {
    public static final Map<Integer, String> A05;
    public static final Map<String, Integer> A06;
    public static final Map<Integer, String> A07;
    public static final Map<String, Integer> A08;
    public final int A00;
    public final int A01;
    public final C9086FyD A02;
    public final Instant A03;
    public final ZoneOffset A04;

    static {
        HxE hxEA0r = C3cG.A0r("clear", 5);
        Integer numA0Y = BV4.A0Y();
        HxE hxEA0r2 = C3cG.A0r("creamy", numA0Y);
        Integer numA0W = BV4.A0W();
        HxE hxEA0r3 = C3cG.A0r("dry", numA0W);
        Integer numA0X = BV4.A0X();
        Map<String, Integer> mapA0D = AGH.A0D(hxEA0r, hxEA0r2, hxEA0r3, C3cG.A0r("sticky", numA0X), AnonymousClass002.A0p("watery", 4), AnonymousClass002.A0p("unusual", 6));
        A06 = mapA0D;
        A05 = AbstractC8873Frm.A00(mapA0D);
        Map<String, Integer> mapA0m = C3cH.A0m("heavy", numA0Y, C3cG.A0r(AvatarMediaMapperKt.LIGHT, numA0W), C3cG.A0r("medium", numA0X));
        A08 = mapA0m;
        A07 = AbstractC8873Frm.A00(mapA0m);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.health.connect.client.records.CervicalMucusRecord");
                C8867Frg c8867Frg = (C8867Frg) obj;
                if (!this.A03.equals(c8867Frg.A03) || !C7384Etj.areEqual(this.A04, c8867Frg.A04) || this.A00 != c8867Frg.A00 || this.A01 != c8867Frg.A01 || !this.A02.equals(c8867Frg.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A02;
    }

    @Override // X.Fx5
    public final Instant ALd() {
        return this.A03;
    }

    @Override // X.Fx5
    public final ZoneOffset AMx() {
        return this.A04;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, (((((AnonymousClass005.A0E(this.A03) + C60R.A01(this.A04)) * 31) + this.A00) * 31) + this.A01) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CervicalMucusRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A03);
        sbA0x.append(this.A04);
        sbA0x.append(", appearance=");
        sbA0x.append(this.A00);
        sbA0x.append(", sensation=");
        AbstractC7608F5v.A1N(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    public C8867Frg(C9086FyD c9086FyD, Instant instant, ZoneOffset zoneOffset, int i, int i2) {
        this.A03 = instant;
        this.A04 = zoneOffset;
        this.A02 = c9086FyD;
        this.A00 = i;
        this.A01 = i2;
    }
}
