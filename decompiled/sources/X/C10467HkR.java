package X;

import android.util.Size;

/* renamed from: X.HkR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10467HkR extends C06G {
    public final float A00 = 2.0f;
    public final Size A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10467HkR) {
                C10467HkR c10467HkR = (C10467HkR) obj;
                if (!C7384Etj.areEqual(this.A01, c10467HkR.A01) || Float.compare(this.A00, c10467HkR.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public C10467HkR(int i, int i2) {
        this.A01 = new Size(i, i2);
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A0E(this.A01), this.A00);
    }
}
