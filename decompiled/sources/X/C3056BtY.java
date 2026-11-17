package X;

import android.graphics.Matrix;

/* renamed from: X.BtY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3056BtY extends C06G implements InterfaceC3055BtX {
    public final float A00;
    public final float A01;

    @Override // X.InterfaceC3055BtX
    public final void A4b(Matrix matrix) {
        C7384Etj.A0Y(matrix, 0);
        matrix.postTranslate(this.A00, this.A01);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3056BtY) {
                C3056BtY c3056BtY = (C3056BtY) obj;
                if (Float.compare(this.A00, c3056BtY.A00) != 0 || Float.compare(this.A01, c3056BtY.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public C3056BtY(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
