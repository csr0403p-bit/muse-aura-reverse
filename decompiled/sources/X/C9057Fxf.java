package X;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.Fxf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9057Fxf implements InterfaceC9020Fwx {
    public final C9086FyD A00;
    public final C9076Fy3 A01;
    public final Instant A02;
    public final Instant A03;
    public final ZoneOffset A04;
    public final ZoneOffset A05;
    public static final C9076Fy3 A07 = AbstractC7608F5v.A0I(1000000.0d);
    public static final C8993FwW<C9076Fy3> A06 = C8993FwW.A02(C79.A0P, "TotalCaloriesBurned", "energy", new C8838Fqo(C9076Fy3.A02, 15));

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9057Fxf) {
                C9057Fxf c9057Fxf = (C9057Fxf) obj;
                if (!this.A01.equals(c9057Fxf.A01) || !this.A03.equals(c9057Fxf.A03) || !C7384Etj.areEqual(this.A05, c9057Fxf.A05) || !this.A02.equals(c9057Fxf.A02) || !C7384Etj.areEqual(this.A04, c9057Fxf.A04) || !this.A00.equals(c9057Fxf.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C9057Fxf(C9086FyD c9086FyD, C9076Fy3 c9076Fy3, Instant instant, Instant instant2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.A03 = instant;
        this.A05 = zoneOffset;
        this.A02 = instant2;
        this.A04 = zoneOffset2;
        this.A01 = c9076Fy3;
        this.A00 = c9086FyD;
        if (!instant.isBefore(instant2)) {
            throw AbstractC7608F5v.A0d();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC9045FxR.A01(this);
            return;
        }
        AbstractC8873Frm.A01(c9076Fy3, (C9076Fy3) AbstractC7610F5x.A0s(c9076Fy3.A01, C9076Fy3.A03), "energy");
        AbstractC8873Frm.A02(c9076Fy3, A07, "energy");
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
        StringBuilder sbA0x = C60O.A0x("TotalCaloriesBurnedRecord(startTime=");
        AbstractC7608F5v.A1T(sbA0x, this.A03);
        AbstractC7608F5v.A1P(sbA0x, this.A05);
        AbstractC7608F5v.A1S(sbA0x, this.A02);
        sbA0x.append(this.A04);
        sbA0x.append(", energy=");
        AbstractC7608F5v.A1Q(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }
}
