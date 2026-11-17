package X;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.FuQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8951FuQ implements Fx5 {
    public final C9086FyD A00;
    public final Hj8 A01;
    public final Instant A02;
    public final ZoneOffset A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8951FuQ) {
                C8951FuQ c8951FuQ = (C8951FuQ) obj;
                if (!this.A01.equals(c8951FuQ.A01) || !this.A02.equals(c8951FuQ.A02) || !C7384Etj.areEqual(this.A03, c8951FuQ.A03) || !this.A00.equals(c8951FuQ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C8951FuQ(C9086FyD c9086FyD, Hj8 hj8, Instant instant, ZoneOffset zoneOffset) {
        this.A02 = instant;
        this.A03 = zoneOffset;
        this.A01 = hj8;
        this.A00 = c9086FyD;
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC9045FxR.A01(this);
            return;
        }
        double d = hj8.A00;
        AbstractC8873Frm.A03("percentage", d);
        AbstractC8873Frm.A02(Double.valueOf(d), Double.valueOf(100.0d), "percentage");
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
        StringBuilder sbA0x = C60O.A0x("OxygenSaturationRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A02);
        sbA0x.append(this.A03);
        sbA0x.append(", percentage=");
        AbstractC7608F5v.A1Q(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }
}
