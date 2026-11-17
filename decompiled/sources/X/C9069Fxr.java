package X;

import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.Fxr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9069Fxr implements Fx5 {
    public static final C8993FwW<C9076Fy3> A04;
    public static final C9077Fy4 A05;
    public final C9086FyD A00;
    public final C9077Fy4 A01;
    public final Instant A02;
    public final ZoneOffset A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9069Fxr) {
                C9069Fxr c9069Fxr = (C9069Fxr) obj;
                if (!this.A01.equals(c9069Fxr.A01) || !this.A02.equals(c9069Fxr.A02) || !C7384Etj.areEqual(this.A03, c9069Fxr.A03) || !this.A00.equals(c9069Fxr.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A00;
    }

    @Override // X.Fx5
    public final Instant ALd() {
        return this.A02;
    }

    @Override // X.Fx5
    public final ZoneOffset AMx() {
        return this.A03;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, (AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A01)) + C60R.A01(this.A03)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("BasalMetabolicRateRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A02);
        sbA0x.append(this.A03);
        sbA0x.append(", basalMetabolicRate=");
        AbstractC7608F5v.A1Q(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public C9069Fxr(C9086FyD c9086FyD, C9077Fy4 c9077Fy4, Instant instant, ZoneOffset zoneOffset) {
        this.A02 = instant;
        this.A03 = zoneOffset;
        this.A01 = c9077Fy4;
        this.A00 = c9086FyD;
        AbstractC8873Frm.A01(c9077Fy4, (C9077Fy4) AbstractC7610F5x.A0s(c9077Fy4.A01, C9077Fy4.A03), "bmr");
        AbstractC8873Frm.A02(c9077Fy4, A05, "bmr");
    }

    static {
        C9144FzD c9144FzD = C9077Fy4.A02;
        A05 = new C9077Fy4(EnumC9091FyI.A02, 10000.0d);
        A04 = C8993FwW.A02(C79.A0P, "BasalCaloriesBurned", "energy", AbstractC7607F5u.A1B(C9076Fy3.A02, 1));
    }
}
