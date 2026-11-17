package X;

import java.time.Duration;

/* renamed from: X.FwN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8985FwN extends AbstractC8804FlF {
    public final Duration A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8985FwN) {
            return C7384Etj.areEqual(this.A00, ((C8985FwN) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("DurationGoal(duration="));
    }

    public C8985FwN(Duration duration) {
        this.A00 = duration;
    }
}
