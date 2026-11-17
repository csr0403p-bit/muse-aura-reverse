package X;

/* renamed from: X.1D9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1D9 implements C1D5 {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1D9) && C1DG.A08(this.A00, ((C1D9) obj).A00));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    @Override // X.C1D5
    /* renamed from: toPx-TmRCtEA */
    public final float mo1toPxTmRCtEA(long j, AXN axn) {
        return axn.Ah4(this.A00);
    }

    public final String toString() {
        return FGI.A0R("CornerSize(size = ", ".dp)", this.A00);
    }

    public C1D9(float f) {
        this.A00 = f;
    }
}
