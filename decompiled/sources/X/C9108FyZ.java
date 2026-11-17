package X;

/* renamed from: X.FyZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9108FyZ extends AbstractC9142FzB {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9108FyZ) && this.A00 == ((C9108FyZ) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0G("RateOfPerceivedExertionTarget(rpe=", ')', this.A00);
    }

    public C9108FyZ(int i) {
        this.A00 = i;
        if (i < 0 || i >= 11) {
            throw C60O.A0i("RPE value must be between 0 and 10, inclusive.");
        }
    }
}
