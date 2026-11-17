package X;

/* loaded from: classes4.dex */
public final class ArS {
    public final float A00;

    public final boolean equals(Object obj) {
        return (obj instanceof ArS) && Float.compare(this.A00, ((ArS) obj).A00) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return FGI.A0F("BaselineShift(multiplier=", ')', this.A00);
    }
}
