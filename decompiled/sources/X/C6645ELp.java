package X;

/* renamed from: X.ELp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6645ELp extends ENN {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C6645ELp) && this.A00 == ((C6645ELp) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0I("ConstraintsNotMet(reason=", this.A00, ")");
    }

    public C6645ELp(int i) {
        this.A00 = i;
    }
}
