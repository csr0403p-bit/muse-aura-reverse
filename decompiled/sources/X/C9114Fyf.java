package X;

/* renamed from: X.Fyf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9114Fyf extends AbstractC8804FlF {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9114Fyf) && this.A00 == ((C9114Fyf) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0G("StepsGoal(steps=", ')', this.A00);
    }

    public C9114Fyf(int i) {
        this.A00 = i;
    }
}
