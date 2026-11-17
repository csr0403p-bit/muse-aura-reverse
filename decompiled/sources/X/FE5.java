package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: classes6.dex */
public abstract class FE5 {
    public static final float A00(Context context, float f) {
        C7384Etj.A0Y(context, 0);
        DisplayMetrics displayMetricsA0B = C60Q.A0B(context);
        C7384Etj.A0U(displayMetricsA0B);
        return f / displayMetricsA0B.density;
    }
}
