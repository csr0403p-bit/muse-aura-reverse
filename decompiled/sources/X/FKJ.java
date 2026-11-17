package X;

import android.graphics.RectF;

/* loaded from: classes6.dex */
public final class FKJ {
    public final float A00;
    public final int A01;
    public final RectF A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FKJ) {
                FKJ fkj = (FKJ) obj;
                if (!this.A02.equals(fkj.A02) || Float.compare(this.A00, fkj.A00) != 0 || this.A01 != fkj.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A02(AnonymousClass005.A0E(this.A02), this.A00) + this.A01;
    }

    public final String toString() {
        RectF rectF = this.A02;
        float f = this.A00;
        int i = this.A01;
        StringBuilder sbA0f = C3cG.A0f(rectF, "RoundedBackgroundProps(padding=");
        sbA0f.append(", cornerRadius=");
        sbA0f.append(f);
        return AbstractC7610F5x.A0x(C8j2.A00(25), sbA0f, i);
    }

    public FKJ(RectF rectF, float f, int i) {
        this.A02 = rectF;
        this.A00 = f;
        this.A01 = i;
    }
}
