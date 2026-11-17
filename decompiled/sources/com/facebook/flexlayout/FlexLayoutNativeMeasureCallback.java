package com.facebook.flexlayout;

import X.BV4;
import com.facebook.flexlayout.layoutoutput.MeasureOutput;

/* loaded from: classes6.dex */
public abstract class FlexLayoutNativeMeasureCallback<MeasureResult> {
    public abstract MeasureOutput<MeasureResult> measure(int i, float f, float f2, float f3, float f4, float f5, float f6, boolean z);

    public final float baselineNative(int i, float f, float f2) {
        throw BV4.A0c("Baseline function isn't defined!");
    }

    public final MeasureOutput<MeasureResult> measureNative(int i, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        return measure(i, f, f2, f3, f4, f5, f6, z);
    }
}
