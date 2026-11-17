package com.facebook.aura.vds.compose.utils;

import X.C60Q;
import X.C7384Etj;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes4.dex */
public final class ViewUtils {
    public static final ViewUtils INSTANCE = new ViewUtils();

    public final float dpToPx(Context context, int i) {
        C7384Etj.A0Y(context, 0);
        return TypedValue.applyDimension(1, i, C60Q.A0B(context));
    }

    public final float pxToDp(Context context, float f) {
        C7384Etj.A0Y(context, 0);
        DisplayMetrics displayMetricsA0B = C60Q.A0B(context);
        C7384Etj.A0U(displayMetricsA0B);
        return f / displayMetricsA0B.density;
    }

    public final float dpToPx(Context context, float f) {
        C7384Etj.A0Y(context, 0);
        return TypedValue.applyDimension(1, f, C60Q.A0B(context));
    }

    public final float pxToDp(DisplayMetrics displayMetrics, float f) {
        C7384Etj.A0Y(displayMetrics, 0);
        return f / displayMetrics.density;
    }

    public final float dpToPx(DisplayMetrics displayMetrics, int i) {
        return TypedValue.applyDimension(1, i, displayMetrics);
    }

    public final float dpToPx(DisplayMetrics displayMetrics, float f) {
        return TypedValue.applyDimension(1, f, displayMetrics);
    }
}
