package X;

/* renamed from: X.G4w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9193G4w {
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9193G4w) {
                C9193G4w c9193G4w = (C9193G4w) obj;
                if (Float.compare(this.A00, c9193G4w.A00) != 0 || Float.compare(this.A01, c9193G4w.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final float[] A00() {
        float f = this.A00;
        float f2 = this.A01;
        float f3 = f / f2;
        float f4 = ((1.0f - f) - f2) / f2;
        float[] fArr = new float[3];
        AbstractC7607F5u.A1S(fArr, f3, 1.0f, f4);
        return fArr;
    }

    public final int hashCode() {
        return C8j4.A06(C8j4.A04(this.A00), this.A01);
    }

    public final String toString() {
        return FGI.A0P("WhitePoint(x=", ", y=", ')', this.A00, this.A01);
    }

    public C9193G4w(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
