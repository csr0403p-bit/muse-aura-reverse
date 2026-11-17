package X;

/* renamed from: X.Fye, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9113Fye extends AbstractC8804FlF {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9113Fye) && this.A00 == ((C9113Fye) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0G("RepetitionsGoal(repetitions=", ')', this.A00);
    }

    public C9113Fye(int i) {
        this.A00 = i;
    }
}
