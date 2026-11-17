package X;

import java.time.Duration;

/* renamed from: X.FwO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8986FwO extends AbstractC8804FlF {
    public final Fy1 A00;
    public final Duration A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8986FwO) {
                C8986FwO c8986FwO = (C8986FwO) obj;
                if (!C7384Etj.areEqual(this.A00, c8986FwO.A00) || !C7384Etj.areEqual(this.A01, c8986FwO.A01)) {
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
        StringBuilder sbA0x = C60O.A0x("DistanceAndDurationGoal(distance=");
        sbA0x.append(this.A00);
        sbA0x.append(", duration=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C8986FwO(Fy1 fy1, Duration duration) {
        this.A00 = fy1;
        this.A01 = duration;
    }
}
