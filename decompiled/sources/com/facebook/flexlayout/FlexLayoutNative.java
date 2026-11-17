package com.facebook.flexlayout;

import X.ETi;
import com.facebook.flexlayout.layoutoutput.LayoutOutput;

/* loaded from: classes6.dex */
public class FlexLayoutNative {
    public static native <MeasureResult> void jni_calculateLayout(float[] fArr, float[][] fArr2, float f, float f2, float f3, float f4, float f5, float f6, LayoutOutput<MeasureResult> layoutOutput, FlexLayoutNativeMeasureCallback<MeasureResult> flexLayoutNativeMeasureCallback);

    public static native <MeasureResult> void jni_computeMinContentSize(float[] fArr, float[][] fArr2, float f, float f2, FlexLayoutNativeMeasureCallback<MeasureResult> flexLayoutNativeMeasureCallback, float[] fArr3);

    static {
        ETi.loadLibrary("flexlayout");
    }
}
