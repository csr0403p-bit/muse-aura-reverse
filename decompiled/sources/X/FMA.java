package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class FMA {
    public static final FMA A00 = new FMA();

    public static final boolean A02(Object obj) {
        return (obj instanceof FH4) && ((FH4) obj).getForwardsOutsetBoxShadows();
    }

    public static final void A00(Canvas canvas, View view) {
        AnonymousClass003.A0u(canvas, view);
        if (view instanceof FM6) {
            ((FM6) view).A0E(canvas, 1.0f);
        } else if ((view instanceof ViewGroup) && A02(view)) {
            A00.A01(canvas, (ViewGroup) view, 1.0f);
        }
    }

    private final void A01(Canvas canvas, ViewGroup viewGroup, float f) {
        if (viewGroup.getVisibility() == 0) {
            float alpha = f * viewGroup.getAlpha() * viewGroup.getTransitionAlpha();
            int iSave = canvas.save();
            canvas.translate(viewGroup.getLeft(), viewGroup.getTop());
            Matrix matrix = viewGroup.getMatrix();
            if (!matrix.isIdentity()) {
                canvas.concat(matrix);
            }
            canvas.translate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof FM6) {
                    ((FM6) childAt).A0E(canvas, alpha);
                } else if ((childAt instanceof ViewGroup) && A02(childAt)) {
                    A01(canvas, (ViewGroup) childAt, alpha);
                }
            }
            canvas.restoreToCount(iSave);
        }
    }
}
