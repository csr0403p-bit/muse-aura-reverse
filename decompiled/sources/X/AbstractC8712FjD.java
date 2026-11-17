package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: X.FjD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8712FjD {
    public static final ThreadLocal<PathMeasure> A02 = new C8781FkL();
    public static final ThreadLocal<Path> A03 = new C8782FkM();
    public static final ThreadLocal<Path> A04 = new C8783FkN();
    public static final ThreadLocal<float[]> A00 = new C8788FkS();
    public static final float A01 = (float) (Math.sqrt(2.0d) / 2.0d);

    public static float A01(Matrix matrix) {
        float[] fArr = A00.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = A01;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void A03(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = A02.get();
        Path path2 = A03.get();
        Path path3 = A04.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f == 1.0f && f2 == 0.0f) && length >= 1.0f && C8j3.A01(f2 - f, 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = AbstractC8699Fiz.A00(fMin, length);
                fMax = AbstractC8699Fiz.A00(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = AbstractC8699Fiz.A00(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = AbstractC8699Fiz.A00(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax <= length) {
                if (fMin < 0.0f) {
                    path3.reset();
                    pathMeasure.getSegment(fMin + length, length, path3, true);
                }
                path.set(path2);
            }
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
            path.set(path2);
        }
    }

    public static float A00() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap A02(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void A04(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }
}
