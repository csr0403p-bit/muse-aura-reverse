package X;

/* renamed from: X.1D8, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1D8 {
    public static final C1D3 A00 = A02(50);

    public static final C1D3 A02(int i) {
        final float f = i;
        C1D5 c1d5 = new C1D5(f) { // from class: X.1DB
            public final float A00;

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C1DB) && Float.compare(this.A00, ((C1DB) obj).A00) == 0);
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.A00);
            }

            public final String toString() {
                return FGI.A0R("CornerSize(size = ", "%)", this.A00);
            }

            {
                this.A00 = f;
                if (f < 0.0f || f > 100.0f) {
                    AbstractC1061ATk.A00("The percent should be in the range of [0, 100]");
                    throw F60.createAndThrow();
                }
            }

            @Override // X.C1D5
            /* renamed from: toPx-TmRCtEA */
            public final float mo1toPxTmRCtEA(long j, AXN axn) {
                return AWA.A01(j) * (this.A00 / 100.0f);
            }
        };
        return new C1D3(c1d5, c1d5, c1d5, c1d5);
    }

    public static final C1D3 A00(float f) {
        C1D9 c1d9 = new C1D9(f);
        return new C1D3(c1d9, c1d9, c1d9, c1d9);
    }

    public static final C1D3 A01(float f, float f2, float f3, float f4) {
        return new C1D3(new C1D9(f), new C1D9(f2), new C1D9(f3), new C1D9(f4));
    }
}
