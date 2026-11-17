package X;

/* renamed from: X.FwP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8987FwP extends AbstractC8804FlF {
    public final Fy1 A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8987FwP) {
            return C7384Etj.areEqual(this.A00, ((C8987FwP) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("DistanceGoal(distance="));
    }

    public C8987FwP(Fy1 fy1) {
        this.A00 = fy1;
    }
}
