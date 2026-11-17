package X;

/* loaded from: classes5.dex */
public final class EQ2 implements EQN {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof EQ2) && this.A00 == ((EQ2) obj).A00);
    }

    public final int hashCode() {
        return EQB.A00(this.A00).hashCode() + 7;
    }

    public final String toString() {
        return C60O.A0r("Refused(reason=", EQB.A00(this.A00));
    }

    public EQ2(Integer num) {
        this.A00 = num;
    }
}
