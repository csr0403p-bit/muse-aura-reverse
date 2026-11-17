package X;

import android.graphics.RectF;

/* loaded from: classes6.dex */
public final class FXC implements FXF {
    public final float A00;
    public final FXF A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FXC) {
                FXC fxc = (FXC) obj;
                if (!this.A01.equals(fxc.A01) || this.A00 != fxc.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.FXF
    public final float AE9(RectF rectF) {
        return Math.max(0.0f, this.A01.AE9(rectF) + this.A00);
    }

    public final int hashCode() {
        return BV7.A0D(this.A01, Float.valueOf(this.A00));
    }

    public FXC(FXF fxf, float f) {
        if (fxf instanceof FXC) {
            throw BV4.A0a("adjustment");
        }
        this.A01 = fxf;
        this.A00 = f;
    }
}
