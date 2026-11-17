package X;

/* loaded from: classes6.dex */
public final class Hjq {
    public final long A00;

    public static final String A00(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Hjq) && this.A00 == ((Hjq) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        return j != 9205357640488583168L ? FGI.A0c("Size(", A00(AnonymousClass003.A03(j)), ", ", A00(AnonymousClass004.A00(j))) : C8j2.A00(57);
    }
}
