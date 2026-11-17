package X;

import java.time.Instant;

/* renamed from: X.Fx2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9024Fx2 {
    public final C9030FxB A00;
    public final Instant A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9024Fx2) {
                C9024Fx2 c9024Fx2 = (C9024Fx2) obj;
                if (!this.A00.equals(c9024Fx2.A00) || !this.A01.equals(c9024Fx2.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AggregationResultGroupedByDurationWithMinTime(aggregationResultGroupedByDuration=");
        sbA0x.append(this.A00);
        sbA0x.append(", minTime=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C9024Fx2(C9030FxB c9030FxB, Instant instant) {
        this.A00 = c9030FxB;
        this.A01 = instant;
    }
}
