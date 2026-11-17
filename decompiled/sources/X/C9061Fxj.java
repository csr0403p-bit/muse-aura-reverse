package X;

import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.Fxj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9061Fxj implements InterfaceC9020Fwx {
    public static final C8993FwW<Fy1> A06;
    public static final Fy1 A07;
    public final C9086FyD A00;
    public final Fy1 A01;
    public final Instant A02;
    public final Instant A03;
    public final ZoneOffset A04;
    public final ZoneOffset A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9061Fxj) {
                Fy1 fy1 = this.A01;
                C9061Fxj c9061Fxj = (C9061Fxj) obj;
                Fy1 fy12 = c9061Fxj.A01;
                if (!fy1.equals(fy12) || !this.A03.equals(c9061Fxj.A03) || !C7384Etj.areEqual(this.A05, c9061Fxj.A05) || !this.A02.equals(c9061Fxj.A02) || !C7384Etj.areEqual(this.A04, c9061Fxj.A04) || !this.A00.equals(c9061Fxj.A00) || AbstractC7609F5w.A01(fy1) != AbstractC7609F5w.A01(fy12)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        C9119Fyk c9119Fyk = Fy1.A02;
        A07 = new Fy1(EnumC9152FzL.A02, 1000000.0d);
        A06 = C8993FwW.A02(C79.A0P, "Distance", "distance", AbstractC7607F5u.A1B(Fy1.A02, 8));
    }

    public C9061Fxj(C9086FyD c9086FyD, Fy1 fy1, Instant instant, Instant instant2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.A03 = instant;
        this.A05 = zoneOffset;
        this.A02 = instant2;
        this.A04 = zoneOffset2;
        this.A01 = fy1;
        this.A00 = c9086FyD;
        AbstractC8873Frm.A01(fy1, (Fy1) AbstractC7610F5x.A0s(fy1.A01, Fy1.A03), "distance");
        AbstractC8873Frm.A02(fy1, A07, "distance");
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
        Fy1 fy1 = this.A01;
        return AnonymousClass005.A0F(this.A00, (AnonymousClass005.A0F(this.A02, (AnonymousClass005.A0F(this.A03, AnonymousClass005.A0E(fy1)) + C60R.A01(this.A05)) * 31) + C8j4.A0E(this.A04, 0)) * 31) + AnonymousClass002.A0A(Double.doubleToLongBits(AbstractC7609F5w.A01(fy1)));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("DistanceRecord(startTime=");
        AbstractC7608F5v.A1T(sbA0x, this.A03);
        AbstractC7608F5v.A1P(sbA0x, this.A05);
        AbstractC7608F5v.A1S(sbA0x, this.A02);
        sbA0x.append(this.A04);
        sbA0x.append(", distance=");
        AbstractC7608F5v.A1Q(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }
}
