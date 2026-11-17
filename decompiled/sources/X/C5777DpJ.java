package X;

/* renamed from: X.DpJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5777DpJ {
    public final float A00;
    public final float A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C5777DpJ(float f, float f2, long j, long j2, long j3) {
        this.A04 = j3;
        this.A03 = j2;
        this.A02 = j;
        this.A01 = f2;
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5777DpJ) {
                C5777DpJ c5777DpJ = (C5777DpJ) obj;
                if (this.A04 != c5777DpJ.A04 || this.A03 != c5777DpJ.A03 || this.A02 != c5777DpJ.A02 || this.A01 != c5777DpJ.A01 || this.A00 != c5777DpJ.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public C5777DpJ(C5798Dpi c5798Dpi) {
        long j = c5798Dpi.A04;
        long j2 = c5798Dpi.A03;
        long j3 = c5798Dpi.A02;
        float f = c5798Dpi.A01;
        float f2 = c5798Dpi.A00;
        this.A04 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A01 = f;
        this.A00 = f2;
    }

    public final int hashCode() {
        int iA06 = AnonymousClass006.A06(this.A02, AnonymousClass006.A06(this.A03, AnonymousClass005.A07(this.A04)));
        float f = this.A01;
        int iFloatToIntBits = (iA06 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.A00;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
