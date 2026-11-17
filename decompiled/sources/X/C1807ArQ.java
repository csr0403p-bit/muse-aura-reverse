package X;

/* renamed from: X.ArQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1807ArQ {
    public static final C1807ArQ A02 = new C1807ArQ(1.0f, 0.0f);
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1807ArQ) {
                C1807ArQ c1807ArQ = (C1807ArQ) obj;
                if (this.A00 != c1807ArQ.A00 || this.A01 != c1807ArQ.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A06(C8j4.A04(this.A00), this.A01);
    }

    public final String toString() {
        return FGI.A0P("TextGeometricTransform(scaleX=", ", skewX=", ')', this.A00, this.A01);
    }

    public C1807ArQ(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public C1807ArQ() {
        this(1.0f, 0.0f);
    }
}
