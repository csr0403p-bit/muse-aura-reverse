package X;

/* loaded from: classes5.dex */
public final class EQ1 implements EQN {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof EQ1) && this.A00 == ((EQ1) obj).A00);
    }

    public final int hashCode() {
        Integer num = this.A00;
        return BV5.A03(num, EQB.A00(num));
    }

    public final String toString() {
        return C60O.A0r("FallBackToIpc(reason=", EQB.A00(this.A00));
    }

    public EQ1(Integer num) {
        this.A00 = num;
    }
}
