package com.meta.maps.fancypins;

import X.AbstractC7607F5u;
import X.AnonymousClass002;
import X.BV4;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class FancyPinHitTestMapper {
    public float localX;
    public float localY;
    public final float[] point = new float[2];
    public final Matrix inverseMatrix = BV4.A08();

    public final boolean isPointInside(ViewGroup viewGroup, View view, float f, float f2) {
        boolean zA1a = AnonymousClass002.A1a(viewGroup, view);
        if (mapToChild(viewGroup, view, f, f2)) {
            float f3 = this.localX;
            if (f3 >= 0.0f && this.localY >= 0.0f && f3 < AbstractC7607F5u.A02(view) && this.localY < AbstractC7607F5u.A03(view)) {
                return zA1a;
            }
        }
        return false;
    }

    public final boolean mapToChild(ViewGroup viewGroup, View view, float f, float f2) {
        boolean zA1a = AnonymousClass002.A1a(viewGroup, view);
        this.point[0] = (f + viewGroup.getScrollX()) - view.getLeft();
        this.point[zA1a ? 1 : 0] = (f2 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity() && !matrix.invert(this.inverseMatrix)) {
            return false;
        }
        if (!matrix.isIdentity()) {
            this.inverseMatrix.mapPoints(this.point);
        }
        float[] fArr = this.point;
        this.localX = fArr[0];
        this.localY = fArr[zA1a ? 1 : 0];
        return zA1a;
    }

    public final float getLocalX() {
        return this.localX;
    }

    public final float getLocalY() {
        return this.localY;
    }
}
