package X;

import java.time.Instant;

/* renamed from: X.Frn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8874Frn {
    public final double A00;
    public final Instant A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8874Frn) {
                C8874Frn c8874Frn = (C8874Frn) obj;
                if (!this.A01.equals(c8874Frn.A01) || this.A00 != c8874Frn.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + AnonymousClass002.A0A(Double.doubleToLongBits(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Sample(time=");
        sbA0x.append(this.A01);
        sbA0x.append(", revolutionsPerMinute=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C8874Frn(double d, Instant instant) {
        this.A01 = instant;
        this.A00 = d;
        AbstractC8873Frm.A03("revolutionsPerMinute", d);
        AbstractC8873Frm.A02(Double.valueOf(d), Double.valueOf(10000.0d), "revolutionsPerMinute");
    }
}
