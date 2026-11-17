package com.facebook.aura.components.reactions;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C8j3;
import X.C8j4;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraScatterKt {
    public static final float SCATTER_APEX_FRACTION = 0.52f;
    public static final float SCATTER_END_SCALE = 0.82f;
    public static final float SCATTER_FLIGHT_MS = 640.0f;
    public static final float SCATTER_LEAD_MS = 50.0f;
    public static final int SCATTER_TOTAL_MS = 750;
    public static final List<Float> ScatterAlphas;
    public static final List<Float> ScatterApex;
    public static final List<Float> ScatterDelaysMs;
    public static final List<Float> ScatterDx;
    public static final List<Float> ScatterScales;

    /* renamed from: scatterPoint-ULxng0E, reason: not valid java name */
    public static final long m415scatterPointULxng0E(long j, float f, float f2, float f3, float f4) {
        float f5 = f2 * f4;
        return AnonymousClass005.A0L(AnonymousClass001.A00(j) + (f * f4 * f3), AnonymousClass001.A01(j, 4294967295L) + (((f5 * (-2.0f)) / 0.52f) * f3) + (((2.0f * f5) / 0.2704f) * 0.5f * f3 * f3));
    }

    static {
        Float fValueOf = Float.valueOf(-8.0f);
        Float fValueOf2 = Float.valueOf(29.0f);
        Float fValueOf3 = Float.valueOf(-40.0f);
        Float fValueOf4 = Float.valueOf(5.0f);
        Float fValueOf5 = Float.valueOf(18.0f);
        Float fValueOf6 = Float.valueOf(-23.0f);
        Float fValueOf7 = Float.valueOf(43.0f);
        Float fValueOf8 = Float.valueOf(-12.0f);
        Float fA0t = C8j3.A0t();
        ScatterDx = Arrays.asList(fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, fValueOf6, fValueOf7, fValueOf8, fA0t);
        ScatterApex = Arrays.asList(Float.valueOf(49.0f), Float.valueOf(28.0f), Float.valueOf(21.0f), Float.valueOf(22.0f), Float.valueOf(45.0f), Float.valueOf(38.0f), Float.valueOf(13.0f), Float.valueOf(31.0f), Float.valueOf(19.0f));
        Float fValueOf9 = Float.valueOf(0.78f);
        Float fValueOf10 = Float.valueOf(1.3f);
        Float fA0s = C8j3.A0s();
        ScatterScales = Arrays.asList(fValueOf9, fValueOf10, fA0s, Float.valueOf(1.15f), Float.valueOf(0.72f), fA0t, Float.valueOf(1.35f), Float.valueOf(0.85f), Float.valueOf(1.05f));
        ScatterDelaysMs = Arrays.asList(AnonymousClass005.A0a(), Float.valueOf(26.0f), Float.valueOf(10.0f), Float.valueOf(46.0f), Float.valueOf(60.0f), Float.valueOf(16.0f), Float.valueOf(36.0f), Float.valueOf(55.0f), fValueOf4);
        ScatterAlphas = Arrays.asList(fA0t, Float.valueOf(0.68f), fA0s, Float.valueOf(0.58f), Float.valueOf(0.96f), Float.valueOf(0.74f), Float.valueOf(0.52f), Float.valueOf(0.86f), Float.valueOf(0.64f));
    }

    public static final List<Float> getScatterAlphas() {
        return ScatterAlphas;
    }

    public static final List<Float> getScatterApex() {
        return ScatterApex;
    }

    public static final List<Float> getScatterDelaysMs() {
        return ScatterDelaysMs;
    }

    public static final List<Float> getScatterDx() {
        return ScatterDx;
    }

    public static final List<Float> getScatterScales() {
        return ScatterScales;
    }

    public static final float scatterAlpha(int i, float f) {
        float fA03 = C8j4.A03(ScatterAlphas, i);
        return f < 0.06f ? C8j3.A02(fA03, 0.0f, f / 0.06f) : f >= 0.52f ? C8j3.A02(0.0f, fA03, (f - 0.52f) / 0.48f) : fA03;
    }

    public static final float scatterStartMs(int i) {
        return C8j4.A03(ScatterDelaysMs, i) + 50.0f;
    }
}
