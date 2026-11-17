package X;

/* renamed from: X.2Cx, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Cx {
    public static final C2Cx A03 = new C2Cx(new C2Cy(0.0f, 0.0f), 0.0f, 0);
    public final float A00;
    public final int A01;
    public final ATE<Float> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2Cx) {
                C2Cx c2Cx = (C2Cx) obj;
                if (this.A00 != c2Cx.A00 || !this.A02.equals(c2Cx.A02) || this.A01 != c2Cx.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A02, Float.floatToIntBits(this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.A00);
        sb.append(", range=");
        sb.append(this.A02);
        sb.append(", steps=");
        sb.append(this.A01);
        return AnonymousClass006.A0z(sb);
    }

    /* JADX WARN: Incorrect types in method signature: (FLX/ATE<Ljava/lang/Float;>;I)V */
    public C2Cx(ATE ate, float f, int i) {
        this.A00 = f;
        this.A02 = ate;
        this.A01 = i;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }
}
