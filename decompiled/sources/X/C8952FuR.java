package X;

import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.FuR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8952FuR implements Fx5 {
    public static final Hj8 A04 = new Hj8(100.0d);
    public final C9086FyD A00;
    public final Hj8 A01;
    public final Instant A02;
    public final ZoneOffset A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8952FuR) {
                C8952FuR c8952FuR = (C8952FuR) obj;
                if (!this.A01.equals(c8952FuR.A01) || !this.A02.equals(c8952FuR.A02) || !C7384Etj.areEqual(this.A03, c8952FuR.A03) || !this.A00.equals(c8952FuR.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C8952FuR(C9086FyD c9086FyD, Hj8 hj8, Instant instant, ZoneOffset zoneOffset) {
        this.A02 = instant;
        this.A03 = zoneOffset;
        this.A01 = hj8;
        this.A00 = c9086FyD;
        AbstractC8873Frm.A03("percentage", hj8.A00);
        AbstractC8873Frm.A02(hj8, A04, "percentage");
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
        StringBuilder sbA0x = C60O.A0x("BodyFatRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A02);
        sbA0x.append(this.A03);
        sbA0x.append(", percentage=");
        AbstractC7608F5v.A1Q(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }
}
