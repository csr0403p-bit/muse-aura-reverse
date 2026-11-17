package X;

/* loaded from: classes4.dex */
public final class AOW extends AOd {
    public float A00;

    @Override // X.AOd
    public final /* bridge */ /* synthetic */ AOd A03() {
        AOW aow = new AOW();
        aow.A00 = 0.0f;
        return aow;
    }

    @Override // X.AOd
    public final void A04() {
        this.A00 = 0.0f;
    }

    public static AOW A00(float f) {
        AOW aow = new AOW();
        aow.A00 = f;
        return aow;
    }

    @Override // X.AOd
    public final float A01(int i) {
        if (i == 0) {
            return this.A00;
        }
        return 0.0f;
    }

    @Override // X.AOd
    public final int A02() {
        return 1;
    }

    @Override // X.AOd
    public final void A05(int i, float f) {
        if (i == 0) {
            this.A00 = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AOW) && ((AOW) obj).A00 == this.A00;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        float f = this.A00;
        StringBuilder sbA0g = C3cG.A0g("AnimationVector1D: value = ");
        sbA0g.append(f);
        return sbA0g.toString();
    }
}
