package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class BfO {
    public static final RectF A00 = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Size A01(Size size, int i) {
        BeS.A06(AnonymousClass002.A1M(i % 90), FGI.A0H("Invalid rotation degrees: ", i));
        return A03(((i % 360) + 360) % 360) ? BV8.A0a(size) : size;
    }

    public static String A02(Rect rect) {
        return String.format(Locale.US, "%s(%dx%d)", rect, Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    public static boolean A03(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw BV5.A0Q("Invalid rotation degrees: ", i);
    }

    public static Matrix A00(RectF rectF, RectF rectF2, int i, boolean z) {
        Matrix matrixA08 = BV4.A08();
        RectF rectF3 = A00;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrixA08.setRectToRect(rectF, rectF3, scaleToFit);
        matrixA08.postRotate(i);
        if (z) {
            matrixA08.postScale(-1.0f, 1.0f);
        }
        Matrix matrixA082 = BV4.A08();
        matrixA082.setRectToRect(rectF3, rectF2, scaleToFit);
        matrixA08.postConcat(matrixA082);
        return matrixA08;
    }
}
