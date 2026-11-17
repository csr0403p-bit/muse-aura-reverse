package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.FWn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8149FWn implements FXF {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C8149FWn) && this.A00 == ((C8149FWn) obj).A00);
    }

    @Override // X.FXF
    public final float AE9(RectF rectF) {
        return this.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.A00)});
    }

    public C8149FWn(float f) {
        this.A00 = f;
    }
}
