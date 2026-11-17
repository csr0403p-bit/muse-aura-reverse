package X;

import android.graphics.RenderEffect;

/* renamed from: X.2b1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2b1 extends AbstractC1408Aid {
    public final float A00;
    public final float A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2b1) {
                C2b1 c2b1 = (C2b1) obj;
                if (this.A00 != c2b1.A00 || this.A01 != c2b1.A01 || this.A02 != c2b1.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1408Aid
    public final RenderEffect A01() {
        return C2b2.A00(this.A00, this.A01, this.A02);
    }

    public final int hashCode() {
        return AnonymousClass005.A02(Float.floatToIntBits(this.A00) * 31, this.A01) + this.A02;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlurEffect(renderEffect=");
        sb.append((Object) null);
        sb.append(", radiusX=");
        sb.append(this.A00);
        sb.append(", radiusY=");
        sb.append(this.A01);
        sb.append(", edgeTreatment=");
        return AnonymousClass007.A0Z(C2b3.A00(this.A02), sb);
    }

    public C2b1(float f, float f2, int i) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i;
    }
}
