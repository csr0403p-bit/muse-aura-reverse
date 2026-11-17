package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;

/* loaded from: classes6.dex */
public abstract class HlH {
    public static final float[] A01 = new float[2];
    public static final Matrix A00 = BV4.A08();

    public static final PointF A00(PointF pointF, View view) {
        float[] fArr = A01;
        fArr[0] = pointF.x - view.getLeft();
        fArr[1] = pointF.y - view.getTop();
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = A00;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        matrix2.reset();
        return new PointF(fArr[0], fArr[1]);
    }
}
