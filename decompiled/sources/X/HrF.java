package X;

import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes6.dex */
public abstract class HrF {
    public static float A00(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Hvz.A00(edgeEffect);
        }
        return 0.0f;
    }

    public static float A01(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Hvz.A01(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }
}
