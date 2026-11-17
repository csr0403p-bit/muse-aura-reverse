package X;

/* renamed from: X.2VV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2VV implements C1AC {
    public final float A00;

    @Override // X.C1AC
    public final int A4A(int i, int i2) {
        return Math.round(((i2 - i) / 2.0f) * (1.0f + this.A00));
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2VV) && Float.compare(this.A00, ((C2VV) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return FGI.A0F("Vertical(bias=", ')', this.A00);
    }

    public C2VV(float f) {
        this.A00 = f;
    }
}
