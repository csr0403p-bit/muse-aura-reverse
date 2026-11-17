package X;

/* renamed from: X.1Pk, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Pk implements BLC {
    public final float A00;

    @Override // X.BLC
    public final int A5l(AXN axn, int i) {
        return axn.Abr(this.A00);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1Pk) {
            return C1DG.A08(this.A00, ((C1Pk) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public C1Pk(float f) {
        this.A00 = f;
    }
}
