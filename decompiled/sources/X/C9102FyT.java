package X;

/* renamed from: X.FyT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9102FyT extends AbstractC8804FlF {
    public final C9076Fy3 A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9102FyT) {
            return C7384Etj.areEqual(this.A00, ((C9102FyT) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("ActiveCaloriesBurnedGoal(activeCalories="));
    }

    public C9102FyT(C9076Fy3 c9076Fy3) {
        this.A00 = c9076Fy3;
    }
}
