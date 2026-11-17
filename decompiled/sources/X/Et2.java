package X;

import android.graphics.Matrix;

/* loaded from: classes5.dex */
public final class Et2 extends C06G implements InterfaceC3055BtX {
    public final float A00;
    public final float A01;
    public final long A02;

    @Override // X.InterfaceC3055BtX
    public final void A4b(Matrix matrix) {
        C7384Etj.A0Y(matrix, 0);
        float f = this.A00;
        float f2 = this.A01;
        long j = this.A02;
        matrix.postSkew(f, f2, AnonymousClass003.A03(j), AnonymousClass004.A00(j));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Et2) {
                Et2 et2 = (Et2) obj;
                if (Float.compare(this.A00, et2.A00) != 0 || Float.compare(this.A01, et2.A01) != 0 || this.A02 != et2.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A02, AnonymousClass005.A02(Float.floatToIntBits(this.A00) * 31, this.A01));
    }

    public Et2(float f, float f2, long j) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = j;
    }
}
