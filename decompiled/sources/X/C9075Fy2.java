package X;

import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.Fy2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9075Fy2 implements Fx5 {
    public static final C9087FyE A05;
    public static final C9087FyE A06;
    public final int A00;
    public final C9086FyD A01;
    public final C9087FyE A02;
    public final Instant A03;
    public final ZoneOffset A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9075Fy2) {
                C9075Fy2 c9075Fy2 = (C9075Fy2) obj;
                if (!this.A02.equals(c9075Fy2.A02) || this.A00 != c9075Fy2.A00 || !this.A03.equals(c9075Fy2.A03) || !C7384Etj.areEqual(this.A04, c9075Fy2.A04) || !this.A01.equals(c9075Fy2.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        EnumC9110Fyb enumC9110Fyb = EnumC9110Fyb.A02;
        A06 = new C9087FyE(enumC9110Fyb, 0.0d);
        A05 = new C9087FyE(enumC9110Fyb, 100.0d);
    }

    public C9075Fy2(C9086FyD c9086FyD, C9087FyE c9087FyE, Instant instant, ZoneOffset zoneOffset, int i) {
        this.A03 = instant;
        this.A04 = zoneOffset;
        this.A01 = c9086FyD;
        this.A02 = c9087FyE;
        this.A00 = i;
        AbstractC8873Frm.A01(c9087FyE, A06, "temperature");
        AbstractC8873Frm.A02(c9087FyE, A05, "temperature");
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A01;
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
        return AnonymousClass005.A0G(this.A01, (AnonymousClass005.A0F(this.A03, (AnonymousClass005.A0E(this.A02) + this.A00) * 31) + C60R.A01(this.A04)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("BasalBodyTemperatureRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A03);
        sbA0x.append(this.A04);
        sbA0x.append(", temperature=");
        sbA0x.append(this.A02);
        sbA0x.append(", measurementLocation=");
        AbstractC7608F5v.A1N(sbA0x, this.A00);
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }
}
