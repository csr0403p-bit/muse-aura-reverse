package com.facebook.primitive.canvas.model;

import X.C7384Etj;
import X.Hx0;
import X.InterfaceC3055BtX;
import android.graphics.Matrix;

/* loaded from: classes5.dex */
public final class CanvasInverseTransform implements InterfaceC3055BtX {
    public static final CanvasInverseTransform A00 = new CanvasInverseTransform();

    @Override // X.InterfaceC3055BtX
    public final void A4b(Matrix matrix) {
        C7384Etj.A0Y(matrix, 0);
        if (matrix.invert(matrix)) {
            return;
        }
        Hx0.A01();
    }
}
