package X;

import java.time.Instant;

/* renamed from: X.Frs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8879Frs {
    public final long A00;
    public final Instant A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8879Frs) {
                C8879Frs c8879Frs = (C8879Frs) obj;
                if (!this.A01.equals(c8879Frs.A01) || this.A00 != c8879Frs.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Sample(time=");
        sbA0x.append(this.A01);
        sbA0x.append(", beatsPerMinute=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C8879Frs(long j, Instant instant) {
        this.A01 = instant;
        this.A00 = j;
        Long lValueOf = Long.valueOf(j);
        AbstractC8873Frm.A01(lValueOf, 1L, "beatsPerMinute");
        AbstractC8873Frm.A02(lValueOf, 300L, "beatsPerMinute");
    }
}
