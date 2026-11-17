package X;

/* renamed from: X.Ak8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1501Ak8 implements InterfaceC1502Ak9 {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1501Ak8) && Float.compare(this.A00, ((C1501Ak8) obj).A00) == 0);
    }

    @Override // X.InterfaceC1502Ak9
    public final float A7F(float f) {
        return f / this.A00;
    }

    @Override // X.InterfaceC1502Ak9
    public final float A7H(float f) {
        return f * this.A00;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return FGI.A0F("LinearFontScaleConverter(fontScale=", ')', this.A00);
    }

    public C1501Ak8(float f) {
        this.A00 = f;
    }
}
