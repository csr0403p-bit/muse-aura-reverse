package com.facebook.aura.components.reactions;

import X.AEk;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AWx;
import X.AaJ;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C60O;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraDoubleTakeKt {
    public static final float DOUBLE_TAKE_GLINT_DELAY_MS = 300.0f;
    public static final float DOUBLE_TAKE_GLINT_MS = 620.0f;
    public static final float DOUBLE_TAKE_GLINT_WIDTH = 2.4f;
    public static final float DOUBLE_TAKE_HALO_ALPHA = 0.42f;
    public static final float DOUBLE_TAKE_HALO_SPREAD = 3.0f;
    public static final float DOUBLE_TAKE_RING_DELAY_MS = 220.0f;
    public static final float DOUBLE_TAKE_RING_FROM_SCALE = 0.6f;
    public static final float DOUBLE_TAKE_RING_INSET = 2.0f;
    public static final float DOUBLE_TAKE_RING_MS = 660.0f;
    public static final float DOUBLE_TAKE_RING_MS_STEP = 80.0f;
    public static final float DOUBLE_TAKE_RING_STAGGER_MS = 160.0f;
    public static final float DOUBLE_TAKE_RING_TO_SCALE = 1.24f;
    public static final float DOUBLE_TAKE_STAMP_MS = 500.0f;
    public static final int DOUBLE_TAKE_TOTAL_MS = 1600;
    public static final long DoubleTakeCream;
    public static final List<Float> DoubleTakeGlintFade;
    public static final List<Float> DoubleTakeGlintFadeKeyTimes;
    public static final long DoubleTakeGlintFrom;
    public static final List<Float> DoubleTakeGlintHead;
    public static final List<Float> DoubleTakeGlintHeadKeyTimes;
    public static final List<Float> DoubleTakeGlintTail;
    public static final List<Float> DoubleTakeGlintTailKeyTimes;
    public static final long DoubleTakeGlintTo;
    public static final List<Float> DoubleTakeRingBoxes;
    public static final List<Float> DoubleTakeRingFade;
    public static final List<Float> DoubleTakeRingFadeKeyTimes;
    public static final List<Float> DoubleTakeRingWidths;
    public static final long DoubleTakeWarm;
    public static final List<Float> StampKeyTimes;
    public static final List<Float> StampScaleX;
    public static final List<Float> StampScaleY;
    public static final List<Float> StampTranslateY;

    /* renamed from: drawDoubleTakeGlints-ubNVwUQ, reason: not valid java name */
    public static final void m393drawDoubleTakeGlintsubNVwUQ(AT3 at3, long j, float f, float f2) {
        float f3 = (f - 300.0f) / 620.0f;
        if (f3 <= 0.0f || f3 >= 1.0f) {
            return;
        }
        List<Float> list = DoubleTakeGlintFade;
        List<Float> list2 = DoubleTakeGlintFadeKeyTimes;
        float fEaseInOut = AuraReactionMotionKt.easeInOut(f3);
        float fKeyframe = AuraReactionMotionKt.keyframe(list, list2, fEaseInOut);
        if (fKeyframe > 0.0f) {
            float fKeyframe2 = AuraReactionMotionKt.keyframe(DoubleTakeGlintHead, DoubleTakeGlintHeadKeyTimes, fEaseInOut);
            float fKeyframe3 = AuraReactionMotionKt.keyframe(DoubleTakeGlintTail, DoubleTakeGlintTailKeyTimes, fEaseInOut);
            if (fKeyframe2 > fKeyframe3) {
                Iterator it = Arrays.asList(Float.valueOf(-1.0f), Float.valueOf(1.0f)).iterator();
                while (it.hasNext()) {
                    float fA02 = AnonymousClass001.A02(it.next());
                    long j2 = DoubleTakeGlintFrom;
                    long jA03 = AWx.A03(AnonymousClass005.A0M(C8j4.A00(j2, fA02), AnonymousClass001.A01(j2, 4294967295L)), f2, j);
                    long j3 = DoubleTakeGlintTo;
                    long jA032 = AWx.A03(AnonymousClass005.A0L(C8j4.A00(j3, fA02), AnonymousClass001.A01(j3, 4294967295L)), f2, j);
                    at3.A9X(null, null, f2 * 2.4f, ATD.A03(fKeyframe, 0.0f, 1.0f), 1, 3, DoubleTakeCream, AuraReactionMotionKt.m407lerpWko1d7g(jA03, jA032, fKeyframe3), AuraReactionMotionKt.m407lerpWko1d7g(jA03, jA032, fKeyframe2));
                }
            }
        }
    }

    /* renamed from: drawDoubleTakeRings-ubNVwUQ, reason: not valid java name */
    public static final void m394drawDoubleTakeRingsubNVwUQ(AT3 at3, long j, float f, float f2) {
        List<Float> list = DoubleTakeRingBoxes;
        int size = list.size();
        int i = 0;
        while (i < size) {
            float f3 = i;
            float f4 = (f - ((160.0f * f3) + 220.0f)) / ((f3 * 80.0f) + 660.0f);
            if (f4 > 0.0f && f4 < 1.0f) {
                float fKeyframe = AuraReactionMotionKt.keyframe(DoubleTakeRingFade, DoubleTakeRingFadeKeyTimes, AuraReactionMotionKt.easeInOut(f4));
                if (fKeyframe > 0.0f) {
                    float fA00 = C8j3.A00(C8j4.A03(list, i), 4.0f) * f2 * C8j3.A02(1.24f, 0.6f, AuraReactionMotionKt.easeOut(f4));
                    float fA03 = C8j4.A03(DoubleTakeRingWidths, i) * f2;
                    long j2 = i == C60O.A00(list) ? DoubleTakeCream : DoubleTakeWarm;
                    at3.A9N(null, new AaJ(null, fA03 * 3.0f, 4.0f, 0, 0), fA00, ATD.A03(0.42f * fKeyframe, 0.0f, 1.0f), 3, DoubleTakeCream, j);
                    at3.A9N(null, new AaJ(null, fA03, 4.0f, 0, 0), fA00, ATD.A03(fKeyframe, 0.0f, 1.0f), 3, j2, j);
                }
            }
            i++;
        }
    }

    static {
        Float fA0a = AnonymousClass005.A0a();
        Float fValueOf = Float.valueOf(0.35f);
        Float fValueOf2 = Float.valueOf(0.65f);
        Float fA0t = C8j3.A0t();
        StampKeyTimes = C8j4.A13(fA0a, fValueOf, fValueOf2, fA0t);
        StampTranslateY = Arrays.asList(Float.valueOf(-18.0f), fA0a, Float.valueOf(-4.0f), fA0a);
        StampScaleX = C8j5.A0d(C8j3.A0s(), Float.valueOf(1.22f), fA0t, 0.96f);
        StampScaleY = C8j5.A0d(Float.valueOf(1.1f), Float.valueOf(0.78f), fA0t, 1.06f);
        long j = B6A.A01;
        DoubleTakeWarm = 4294091322L << 32;
        DoubleTakeCream = 4294961072L << 32;
        DoubleTakeRingBoxes = C8j5.A0a(Float.valueOf(44.0f), Float.valueOf(78.0f), 122.0f);
        Float fValueOf3 = Float.valueOf(1.4f);
        DoubleTakeRingWidths = Arrays.asList(fValueOf3, fValueOf3, Float.valueOf(2.2f));
        DoubleTakeRingFade = C8j5.A0b(fA0a, Float.valueOf(0.8f), 0.54f);
        DoubleTakeRingFadeKeyTimes = C8j5.A0d(fA0a, Float.valueOf(0.14f), fA0t, 0.46f);
        DoubleTakeGlintFrom = (C8j3.A0P(18.0f) << 32) | (C8j3.A0P(-8.0f) & 4294967295L);
        DoubleTakeGlintTo = (C8j3.A0P(31.0f) << 32) | (C8j3.A0P(-21.0f) & 4294967295L);
        DoubleTakeGlintHead = Arrays.asList(fA0a, fA0t, fA0t);
        DoubleTakeGlintHeadKeyTimes = C8j4.A12(fA0a, Float.valueOf(0.32f), fA0t);
        DoubleTakeGlintTail = Arrays.asList(fA0a, fA0a, fA0t);
        DoubleTakeGlintTailKeyTimes = C8j4.A12(fA0a, Float.valueOf(0.48f), fA0t);
        DoubleTakeGlintFade = C8j5.A0b(fA0a, fA0t, 0.82f);
        DoubleTakeGlintFadeKeyTimes = C8j5.A0d(fA0a, Float.valueOf(0.16f), fA0t, 0.58f);
    }

    public static final BRg auraDoubleTake(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, DOUBLE_TAKE_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraDoubleTakeKt$auraDoubleTake$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AEk.A00(bRg, objAaT);
    }

    public static final BRg auraDoubleTakeGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, DOUBLE_TAKE_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraDoubleTakeKt$auraDoubleTakeGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
