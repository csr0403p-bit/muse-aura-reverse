package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.FKr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7919FKr {
    public static final C7919FKr A01 = new C7919FKr();
    public static final Handler A00 = new FFG(Looper.getMainLooper());

    public static final GradientDrawable A00(Drawable drawable, C7919FKr c7919FKr) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof GradientDrawable) {
            return (GradientDrawable) drawable;
        }
        if (drawable instanceof ScaleDrawable) {
            return A00(((DrawableWrapper) drawable).getDrawable(), c7919FKr);
        }
        if (!(drawable instanceof StateListDrawable) || drawable.getConstantState() == null) {
            return null;
        }
        DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState) drawable.getConstantState();
        C7384Etj.A0X(drawableContainerState);
        int childCount = drawableContainerState.getChildCount();
        for (int i = 0; i < childCount; i++) {
            GradientDrawable gradientDrawableA00 = A00(drawableContainerState.getChild(i), c7919FKr);
            if (gradientDrawableA00 != null) {
                return gradientDrawableA00;
            }
        }
        return null;
    }

    public static final void A01(C7918FKq c7918FKq, int i) {
        GradientDrawable gradientDrawable = c7918FKq.A0C;
        if (gradientDrawable == null || c7918FKq.A0D == null || c7918FKq.A0E == null) {
            return;
        }
        C7384Etj.A0X(gradientDrawable);
        gradientDrawable.setSize(-1, i);
        GradientDrawable gradientDrawable2 = c7918FKq.A0D;
        C7384Etj.A0X(gradientDrawable2);
        gradientDrawable2.setSize(-1, i);
        GradientDrawable gradientDrawable3 = c7918FKq.A0E;
        C7384Etj.A0X(gradientDrawable3);
        gradientDrawable3.setSize(-1, i);
    }
}
