package X;

import android.view.View;
import com.facebook.flexlayout.layoutoutput.LayoutOutput;

/* loaded from: classes6.dex */
public abstract class FIG {
    public static final InterfaceC7823FGe A00;
    public static final LayoutOutput<InterfaceC7823FGe> A01;

    static {
        LayoutOutput<InterfaceC7823FGe> layoutOutput = new LayoutOutput<>(0);
        A01 = layoutOutput;
        A00 = new FIO(layoutOutput, null, null);
    }

    public static final float[] A00(float f, float f2, float f3, float f4, float f5) {
        float[] fArr;
        if (!Float.isNaN(f)) {
            float f6 = Float.isNaN(f4) ? 0.0f : f4;
            float f7 = f5;
            if (Float.isNaN(f5)) {
                f7 = Float.POSITIVE_INFINITY;
            }
            if (f >= f6 && f <= f7) {
                return new float[]{f, f};
            }
        } else {
            if (!Float.isNaN(f2)) {
                if (Float.isNaN(f4)) {
                    f4 = 0.0f;
                }
                fArr = new float[]{Math.max(f2, f4), 0.0f};
                fArr[1] = f5;
                return fArr;
            }
            if (!Float.isNaN(f3)) {
                return AbstractC7607F5u.A1Z(f4, f3, 2);
            }
        }
        fArr = new float[]{f4, 0.0f};
        fArr[1] = f5;
        return fArr;
    }

    public static final float[] A01(int i) {
        float[] fArr;
        float size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            fArr = new float[2];
            if (mode != 1073741824) {
                size = Float.NaN;
            }
            fArr[0] = size;
        } else {
            fArr = new float[]{0.0f, 0.0f};
        }
        fArr[1] = size;
        return fArr;
    }
}
