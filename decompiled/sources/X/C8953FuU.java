package X;

import java.time.Instant;

/* renamed from: X.FuU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8953FuU {
    public final Instant A00;
    public final Instant A01;

    public C8953FuU(Instant instant, Instant instant2) {
        C7384Etj.A0Y(instant, 0);
        this.A01 = instant;
        this.A00 = instant2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8953FuU) {
                C8953FuU c8953FuU = (C8953FuU) obj;
                if (!this.A01.equals(c8953FuU.A01) || !C7384Etj.areEqual(this.A00, c8953FuU.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass005.A0E(this.A01) + AnonymousClass006.A0D(this.A00)) * 31) + 1000) * 31;
    }

    public final String toString() {
        Instant instant = this.A01;
        Instant instant2 = this.A00;
        StringBuilder sbA0f = C3cG.A0f(instant, "MetaHealthWorkoutQueryParams(startDate=");
        sbA0f.append(", endDate=");
        sbA0f.append(instant2);
        sbA0f.append(", limit=");
        sbA0f.append(1000);
        return C3cJ.A0L(null, ", workoutType=", sbA0f);
    }
}
