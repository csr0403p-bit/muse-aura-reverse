package X;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class FXM implements FXF {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FXM) && this.A00 == ((FXM) obj).A00);
    }

    @Override // X.FXF
    public final float AE9(RectF rectF) {
        return this.A00 * rectF.height();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.A00)});
    }

    public FXM(float f) {
        this.A00 = f;
    }
}
