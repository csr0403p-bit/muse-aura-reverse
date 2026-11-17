package X;

/* renamed from: X.FyU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9103FyU extends AbstractC8804FlF {
    public final C9076Fy3 A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9103FyU) {
            return C7384Etj.areEqual(this.A00, ((C9103FyU) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("TotalCaloriesBurnedGoal(totalCalories="));
    }

    public C9103FyU(C9076Fy3 c9076Fy3) {
        this.A00 = c9076Fy3;
    }
}
