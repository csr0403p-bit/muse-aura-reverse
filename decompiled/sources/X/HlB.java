package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes6.dex */
public abstract class HlB {
    public static final ThreadLocal<Matrix> A00 = new ThreadLocal<>();
    public static final ThreadLocal<RectF> A01 = new ThreadLocal<>();

    public static void A00(Matrix matrix, View view, ViewParent viewParent) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            A00(matrix, (View) parent, viewParent);
            matrix.preTranslate(-r2.getScrollX(), -r2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    public static void A01(Rect rect, View view, ViewGroup viewGroup) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal = A00;
        Matrix matrixA08 = threadLocal.get();
        if (matrixA08 == null) {
            matrixA08 = BV4.A08();
            threadLocal.set(matrixA08);
        } else {
            matrixA08.reset();
        }
        A00(matrixA08, view, viewGroup);
        ThreadLocal<RectF> threadLocal2 = A01;
        RectF rectFA0Y = threadLocal2.get();
        if (rectFA0Y == null) {
            rectFA0Y = AbstractC7607F5u.A0Y();
            threadLocal2.set(rectFA0Y);
        }
        rectFA0Y.set(rect);
        matrixA08.mapRect(rectFA0Y);
        rect.set((int) (rectFA0Y.left + 0.5f), (int) (rectFA0Y.top + 0.5f), (int) (rectFA0Y.right + 0.5f), (int) (rectFA0Y.bottom + 0.5f));
    }
}
