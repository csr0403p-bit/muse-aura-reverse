package X;

import java.time.Instant;

/* renamed from: X.Fwh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9004Fwh {
    public final int A00;
    public final Instant A01;
    public final Instant A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9004Fwh) {
                C9004Fwh c9004Fwh = (C9004Fwh) obj;
                if (this.A00 != c9004Fwh.A00 || !this.A02.equals(c9004Fwh.A02) || !this.A01.equals(c9004Fwh.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0F(this.A02, this.A00 * 31));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Stage(startTime=");
        AbstractC7608F5v.A1P(sbA0x, this.A02);
        sbA0x.append(this.A01);
        sbA0x.append(", stage=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public C9004Fwh(Instant instant, Instant instant2, int i) {
        this.A02 = instant;
        this.A01 = instant2;
        this.A00 = i;
        if (!instant.isBefore(instant2)) {
            throw AbstractC7608F5v.A0d();
        }
    }
}
