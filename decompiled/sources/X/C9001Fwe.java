package X;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.Fwe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9001Fwe implements InterfaceC9020Fwx {
    public static final C8993FwW<Double> A06 = C8992FwV.A00(C79.A0P, "FloorsClimbed", "floors");
    public final double A00;
    public final C9086FyD A01;
    public final Instant A02;
    public final Instant A03;
    public final ZoneOffset A04;
    public final ZoneOffset A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9001Fwe) {
                C9001Fwe c9001Fwe = (C9001Fwe) obj;
                if (this.A00 != c9001Fwe.A00 || !this.A03.equals(c9001Fwe.A03) || !C7384Etj.areEqual(this.A05, c9001Fwe.A05) || !this.A02.equals(c9001Fwe.A02) || !C7384Etj.areEqual(this.A04, c9001Fwe.A04) || !this.A01.equals(c9001Fwe.A01)) {
                }
            }
            return false;
        }
        return true;
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
        return this.A01;
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
        return AnonymousClass005.A0G(this.A01, (AnonymousClass005.A0F(this.A02, ((AnonymousClass002.A0A(Double.doubleToLongBits(this.A00)) * 31) + C60R.A01(this.A05)) * 31) + C8j4.A0E(this.A04, 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("FloorsClimbedRecord(startTime=");
        AbstractC7608F5v.A1T(sbA0x, this.A03);
        AbstractC7608F5v.A1P(sbA0x, this.A05);
        AbstractC7608F5v.A1S(sbA0x, this.A02);
        sbA0x.append(this.A04);
        sbA0x.append(", floors=");
        sbA0x.append(this.A00);
        sbA0x.append(", metadata=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C9001Fwe(C9086FyD c9086FyD, Instant instant, Instant instant2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, double d) {
        this.A03 = instant;
        this.A05 = zoneOffset;
        this.A02 = instant2;
        this.A04 = zoneOffset2;
        this.A00 = d;
        this.A01 = c9086FyD;
        if (!instant.isBefore(instant2)) {
            throw AbstractC7608F5v.A0d();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC9045FxR.A01(this);
        } else {
            AbstractC8873Frm.A03("floors", d);
            AbstractC8873Frm.A02(Double.valueOf(d), Double.valueOf(1000000.0d), "floors");
        }
    }
}
