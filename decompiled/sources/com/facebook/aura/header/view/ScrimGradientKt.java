package com.facebook.aura.header.view;

import X.ATD;
import X.B6A;
import X.G0U;
import X.HDi;
import X.HxE;
import X.HxS;

/* loaded from: classes.dex */
public abstract class ScrimGradientKt {
    public static final int ScrimStopCount = 16;

    public static final float smoothStep(float f) {
        float fA03 = ATD.A03(f, 0.0f, 1.0f);
        return fA03 * fA03 * (3.0f - (fA03 * 2.0f));
    }

    /* renamed from: scrimFadeInStops-DxMtmZc, reason: not valid java name */
    public static final HxE<Float, B6A>[] m1052scrimFadeInStopsDxMtmZc(long j, float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        return m1054scrimStopsDxMtmZc(j, new ScrimGradientKt$scrimFadeInStops$1(f));
    }

    /* renamed from: scrimFadeOutStops-DxMtmZc, reason: not valid java name */
    public static final HxE<Float, B6A>[] m1053scrimFadeOutStopsDxMtmZc(long j, float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        return m1054scrimStopsDxMtmZc(j, new ScrimGradientKt$scrimFadeOutStops$1(f));
    }

    /* renamed from: scrimStops-DxMtmZc, reason: not valid java name */
    public static final HxE<Float, B6A>[] m1054scrimStopsDxMtmZc(long j, G0U<? super Float, Float> g0u) {
        HxE<Float, B6A>[] hxEArr = new HxE[16];
        int i = 0;
        do {
            Float fValueOf = Float.valueOf(i / 15.0f);
            hxEArr[i] = new HxE<>(fValueOf, new B6A(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), B6A.A00(j) * g0u.invoke(fValueOf).floatValue())));
            i++;
        } while (i < 16);
        return hxEArr;
    }
}
