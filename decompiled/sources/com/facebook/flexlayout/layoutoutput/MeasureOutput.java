package com.facebook.flexlayout.layoutoutput;

import X.AbstractC7607F5u;
import X.C79;

/* loaded from: classes6.dex */
public class MeasureOutput<MeasureResult> {
    public float[] arr;
    public final MeasureResult measureResult;

    public MeasureOutput(float f, float f2, float f3, MeasureResult measureresult) {
        float[] fArr = new float[C79.A00(3).length];
        this.arr = fArr;
        AbstractC7607F5u.A1S(fArr, f, f2, Float.NaN);
        this.measureResult = measureresult;
    }
}
