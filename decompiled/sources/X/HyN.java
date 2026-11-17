package X;

import android.graphics.RadialGradient;
import android.graphics.Shader;

/* loaded from: classes6.dex */
public abstract class HyN {
    public static RadialGradient A01(Shader.TileMode tileMode, double d, float f) {
        return new RadialGradient(f, 0.0f, (float) Math.max((float) d, 1.401298464324817E-45d), new int[]{A00(-1, 0.25f), A00(-1, 0.0f)}, (float[]) null, tileMode);
    }

    public static final int A00(int i, float f) {
        return (i & 16777215) | (BV5.A02((int) (f * 255.0f), 255, 0) << 24);
    }
}
