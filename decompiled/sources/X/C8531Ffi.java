package X;

import android.graphics.PointF;

/* renamed from: X.Ffi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8531Ffi extends C06G {
    public final int A02;
    public final PointF A03;
    public final float A01 = 8.0f;
    public final float A00 = 0.5f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8531Ffi) {
                C8531Ffi c8531Ffi = (C8531Ffi) obj;
                if (this.A02 != c8531Ffi.A02 || Float.compare(this.A01, c8531Ffi.A01) != 0 || !C7384Etj.areEqual(this.A03, c8531Ffi.A03) || Float.compare(this.A00, c8531Ffi.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public C8531Ffi(PointF pointF, int i) {
        this.A02 = i;
        this.A03 = pointF;
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A0F(this.A03, AnonymousClass005.A02(this.A02 * 31, this.A01)), this.A00);
    }
}
