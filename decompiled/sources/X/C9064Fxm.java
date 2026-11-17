package X;

import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.Fxm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9064Fxm implements InterfaceC9020Fwx {
    public final C9086FyD A00;
    public final C9076Fy3 A01;
    public final Instant A02;
    public final Instant A03;
    public final ZoneOffset A04;
    public final ZoneOffset A05;
    public static final C9076Fy3 A07 = AbstractC7608F5v.A0I(1000000.0d);
    public static final C8993FwW<C9076Fy3> A06 = C8993FwW.A02(C79.A0P, "ActiveCaloriesBurned", "energy", AbstractC7607F5u.A1B(C9076Fy3.A02, 0));

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9064Fxm) {
                C9064Fxm c9064Fxm = (C9064Fxm) obj;
                if (!this.A01.equals(c9064Fxm.A01) || !this.A03.equals(c9064Fxm.A03) || !C7384Etj.areEqual(this.A05, c9064Fxm.A05) || !this.A02.equals(c9064Fxm.A02) || !C7384Etj.areEqual(this.A04, c9064Fxm.A04) || !this.A00.equals(c9064Fxm.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C9064Fxm(C9086FyD c9086FyD, C9076Fy3 c9076Fy3, Instant instant, Instant instant2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.A03 = instant;
        this.A05 = zoneOffset;
        this.A02 = instant2;
        this.A04 = zoneOffset2;
        this.A01 = c9076Fy3;
        this.A00 = c9086FyD;
        AbstractC8873Frm.A01(c9076Fy3, (C9076Fy3) AbstractC7610F5x.A0s(c9076Fy3.A01, C9076Fy3.A03), "energy");
        AbstractC8873Frm.A02(c9076Fy3, A07, "energy");
        if (!this.A03.isBefore(this.A02)) {
            throw AbstractC7608F5v.A0d();
        }
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AFC() {
        return this.A02;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AFE() {
        return this.A04;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A00;
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AKy() {
        return this.A03;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AKz() {
        return this.A05;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, (AnonymousClass005.A0F(this.A02, (AnonymousClass005.A0F(this.A03, AnonymousClass005.A0E(this.A01)) + C60R.A01(this.A05)) * 31) + C8j4.A0E(this.A04, 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ActiveCaloriesBurnedRecord(startTime=");
        AbstractC7608F5v.A1T(sbA0x, this.A03);
        AbstractC7608F5v.A1P(sbA0x, this.A05);
        AbstractC7608F5v.A1S(sbA0x, this.A02);
        sbA0x.append(this.A04);
        sbA0x.append(", energy=");
        AbstractC7608F5v.A1Q(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }
}
