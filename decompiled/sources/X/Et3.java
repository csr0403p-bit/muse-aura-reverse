package X;

import android.graphics.Matrix;

/* loaded from: classes5.dex */
public final class Et3 extends C06G implements InterfaceC3055BtX {
    public final float A00;
    public final long A01;

    @Override // X.InterfaceC3055BtX
    public final void A4b(Matrix matrix) {
        C7384Etj.A0Y(matrix, 0);
        float f = this.A00;
        long j = this.A01;
        matrix.postRotate(f, AnonymousClass003.A03(j), AnonymousClass004.A00(j));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Et3) {
                Et3 et3 = (Et3) obj;
                if (Float.compare(this.A00, et3.A00) != 0 || this.A01 != et3.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A01, Float.floatToIntBits(this.A00) * 31);
    }

    public Et3(float f, long j) {
        this.A00 = f;
        this.A01 = j;
    }
}
