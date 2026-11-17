package X;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.Frp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8876Frp implements Fx5 {
    public final double A00;
    public final C9086FyD A01;
    public final Instant A02;
    public final ZoneOffset A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8876Frp) {
                C8876Frp c8876Frp = (C8876Frp) obj;
                if (this.A00 != c8876Frp.A00 || !this.A02.equals(c8876Frp.A02) || !C7384Etj.areEqual(this.A03, c8876Frp.A03) || !this.A01.equals(c8876Frp.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A01;
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
        return AnonymousClass005.A0G(this.A01, (AnonymousClass005.A0F(this.A02, AnonymousClass002.A0A(Double.doubleToLongBits(this.A00)) * 31) + C60R.A01(this.A03)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RespiratoryRateRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A02);
        sbA0x.append(this.A03);
        sbA0x.append(", rate=");
        sbA0x.append(this.A00);
        sbA0x.append(", metadata=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C8876Frp(C9086FyD c9086FyD, Instant instant, ZoneOffset zoneOffset, double d) {
        this.A02 = instant;
        this.A03 = zoneOffset;
        this.A00 = d;
        this.A01 = c9086FyD;
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC9045FxR.A01(this);
        } else {
            AbstractC8873Frm.A03("rate", d);
            AbstractC8873Frm.A02(Double.valueOf(d), Double.valueOf(1000.0d), "rate");
        }
    }
}
