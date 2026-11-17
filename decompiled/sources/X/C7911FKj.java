package X;

import java.util.Arrays;

/* renamed from: X.FKj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7911FKj extends C06G {
    public final float[] A00;
    public final int[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.primitive.canvas.model.CanvasGradient");
                C7911FKj c7911FKj = (C7911FKj) obj;
                if (Arrays.equals(this.A01, c7911FKj.A01)) {
                    float[] fArr = this.A00;
                    float[] fArr2 = c7911FKj.A00;
                    if (fArr != null) {
                        if (fArr2 == null || !Arrays.equals(fArr, fArr2)) {
                        }
                    } else if (fArr2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.A01) * 31;
        float[] fArr = this.A00;
        return iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0);
    }

    public C7911FKj(float[] fArr, int[] iArr) {
        this.A01 = iArr;
        this.A00 = fArr;
    }
}
