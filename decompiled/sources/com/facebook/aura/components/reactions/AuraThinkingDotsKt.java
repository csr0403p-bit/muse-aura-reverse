package com.facebook.aura.components.reactions;

import X.AEk;
import X.AT3;
import X.AT5;
import X.AWx;
import X.AXN;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C16a;
import X.C1DG;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraThinkingDotsKt {
    public static final float ACKNOWLEDGE_DELAY_MS = 620.0f;
    public static final float ACKNOWLEDGE_MS = 240.0f;
    public static final List<Float> AcknowledgeScales;
    public static final int DOT_COUNT = 3;
    public static final float DOT_MS = 480.0f;
    public static final long DotAbsorb;
    public static final List<Float> DotDelays;
    public static final List<Float> DotFadeKeyTimes;
    public static final List<Float> DotFadeTrack;
    public static final long DotHover;
    public static final List<Float> DotMoveKeyTimes;
    public static final List<AWx> DotOffsets;
    public static final List<Float> DotScaleKeyTimes;
    public static final List<Float> DotScaleTrack;
    public static final List<C1DG> DotSizes;
    public static final List<List<Float>> DotTrackX;
    public static final List<List<Float>> DotTrackY;
    public static final float THINKING_SCALE_MS = 260.0f;
    public static final int THINKING_TOTAL_MS = 860;
    public static final List<Float> ThinkingScales;
    public static final List<B6A> ThinkingTint;

    public static final void drawThoughts(AT3 at3, float f) {
        float fA00 = AXN.A00(at3);
        int i = 0;
        do {
            float fA03 = (f - C8j4.A03(DotDelays, i)) / 480.0f;
            if (fA03 > 0.0f && fA03 < 1.0f) {
                float fKeyframe = AuraReactionMotionKt.keyframe(DotFadeTrack, DotFadeKeyTimes, fA03);
                if (fKeyframe > 0.0f) {
                    float fA002 = AnonymousClass001.A00(at3.ADU());
                    List<Float> list = DotTrackX.get(i);
                    List<Float> list2 = DotMoveKeyTimes;
                    long jA0M = AnonymousClass005.A0M(fA002 + (AuraReactionMotionKt.smoothKeyframe(list, list2, fA03) * fA00), AnonymousClass001.A01(at3.ADU(), 4294967295L) + (AuraReactionMotionKt.smoothKeyframe(DotTrackY.get(i), list2, fA03) * fA00));
                    long jA0G = C8j5.A0G(ThinkingTint, i);
                    at3.A9N(null, C16a.A00, (at3.Ah4(DotSizes.get(i).A00) / 2.0f) * AuraReactionMotionKt.keyframe(DotScaleTrack, DotScaleKeyTimes, fA03), fKeyframe, 3, jA0G, jA0M);
                }
            }
            i++;
        } while (i < 3);
    }

    static {
        Float fValueOf = Float.valueOf(0.92f);
        Float fValueOf2 = Float.valueOf(1.04f);
        Float fA0t = C8j3.A0t();
        ThinkingScales = C8j4.A12(fValueOf, fValueOf2, fA0t);
        AcknowledgeScales = C8j5.A0b(fA0t, Float.valueOf(1.045f), 0.99f);
        List<AWx> listAsList = Arrays.asList(AWx.A0C(C8j3.A0P(10.0f) << 32, C8j3.A0P(-7.0f) & 4294967295L), AWx.A0C(C8j3.A0P(16.0f) << 32, C8j3.A0P(-13.0f) & 4294967295L), AWx.A0C(C8j3.A0P(22.0f) << 32, C8j3.A0P(-19.0f) & 4294967295L));
        DotOffsets = listAsList;
        DotHover = (C8j3.A0P(1.5f) << 32) | (C8j3.A0P(-2.0f) & 4294967295L);
        DotAbsorb = (C8j3.A0P(6.0f) << 32) | (C8j3.A0P(-4.0f) & 4294967295L);
        DotDelays = C8j5.A0a(Float.valueOf(80.0f), Float.valueOf(200.0f), 340.0f);
        DotSizes = Arrays.asList(C8j3.A0k(3.2f), C8j3.A0k(3.8f), C8j3.A0k(4.4f));
        ArrayList arrayListA0m = AnonymousClass002.A0m(listAsList);
        Iterator<AWx> it = listAsList.iterator();
        while (it.hasNext()) {
            float fA00 = AnonymousClass001.A00(it.next().A00);
            arrayListA0m.add(C8j5.A0a(Float.valueOf(fA00), Float.valueOf(fA00 + AnonymousClass001.A00(DotHover)), AnonymousClass001.A00(DotAbsorb)));
        }
        DotTrackX = arrayListA0m;
        List<AWx> list = DotOffsets;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
        Iterator<AWx> it2 = list.iterator();
        while (it2.hasNext()) {
            float fA01 = AnonymousClass001.A01(it2.next().A00, 4294967295L);
            arrayListA0m2.add(C8j5.A0a(Float.valueOf(fA01), Float.valueOf(fA01 + AnonymousClass001.A01(DotHover, 4294967295L)), AnonymousClass001.A01(DotAbsorb, 4294967295L)));
        }
        DotTrackY = arrayListA0m2;
        Float fA0a = AnonymousClass005.A0a();
        Float fValueOf3 = Float.valueOf(0.58f);
        DotMoveKeyTimes = C8j4.A12(fA0a, fValueOf3, fA0t);
        DotFadeTrack = Arrays.asList(fA0a, fA0t, fA0t, fA0a);
        DotFadeKeyTimes = C8j4.A13(fA0a, Float.valueOf(0.18f), fValueOf3, fA0t);
        DotScaleTrack = Arrays.asList(Float.valueOf(0.55f), fA0t, fA0t, Float.valueOf(0.45f));
        DotScaleKeyTimes = C8j4.A13(fA0a, Float.valueOf(0.2f), fValueOf3, fA0t);
        ThinkingTint = AnonymousClass004.A17(C8j4.A0Y(4294295867L), 4293440122L << 32);
    }

    public static final BRg auraThinkingDots(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 860, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraThinkingDotsKt$auraThinkingDots$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AEk.A00(bRg, objAaT);
    }

    public static final BRg auraThinkingDotsGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 860, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraThinkingDotsKt$auraThinkingDotsGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
