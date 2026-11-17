package X;

import java.time.Instant;

/* renamed from: X.FuY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8956FuY {
    public final int A00;
    public final Instant A01;
    public final Instant A02;

    public C8956FuY(Instant instant, Instant instant2, int i) {
        C7384Etj.A0Y(instant, 0);
        this.A02 = instant;
        this.A01 = instant2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8956FuY) {
                C8956FuY c8956FuY = (C8956FuY) obj;
                if (!this.A02.equals(c8956FuY.A02) || !C7384Etj.areEqual(this.A01, c8956FuY.A01) || this.A00 != c8956FuY.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass005.A0E(this.A02) + AnonymousClass006.A0D(this.A01)) * 31) + this.A00) * 31) + 1231;
    }

    public final String toString() {
        Instant instant = this.A02;
        Instant instant2 = this.A01;
        int i = this.A00;
        StringBuilder sbA0f = C3cG.A0f(instant, "MetaHealthSleepSampleQueryParams(startDate=");
        sbA0f.append(", endDate=");
        sbA0f.append(instant2);
        sbA0f.append(", limit=");
        sbA0f.append(i);
        return C8j5.A0W(", requireCompleteResult=", sbA0f, true);
    }
}
