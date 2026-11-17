package X;

/* renamed from: X.Ddc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5220Ddc {
    public static final C5220Ddc A04 = new C5220Ddc(0, 0, 0, 0);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5220Ddc) {
                C5220Ddc c5220Ddc = (C5220Ddc) obj;
                if (this.A01 != c5220Ddc.A01 || this.A03 != c5220Ddc.A03 || this.A02 != c5220Ddc.A02 || this.A00 != c5220Ddc.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public final String toString() {
        return FGI.A0i("RenderMarginsPx(left=", AnonymousClass000.A00(7), AnonymousClass000.A00(18), AnonymousClass000.A00(17), ")", this.A01, this.A03, this.A02, this.A00);
    }

    public C5220Ddc(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
