package X;

import android.graphics.Rect;

/* loaded from: classes4.dex */
public final class B0T {
    public final B0U A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(obj != null ? obj.getClass() : null)) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
                B0T b0t = (B0T) obj;
                if (!this.A00.equals(b0t.A00) || this.A01 != b0t.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public B0T(Rect rect, float f) {
        this(new B0U(rect.left, rect.top, rect.right, rect.bottom), f);
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A0E(this.A00), this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("WindowMetrics(_bounds=");
        sbA0x.append(this.A00);
        sbA0x.append(", density=");
        sbA0x.append(this.A01);
        return AnonymousClass006.A0z(sbA0x);
    }

    public B0T(B0U b0u, float f) {
        this.A00 = b0u;
        this.A01 = f;
    }
}
