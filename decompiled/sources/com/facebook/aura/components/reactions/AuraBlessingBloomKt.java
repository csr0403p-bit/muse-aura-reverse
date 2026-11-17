package com.facebook.aura.components.reactions;

import X.AEk;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AW9;
import X.AWx;
import X.AaI;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C16a;
import X.C1EQ;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.HxE;
import X.InterfaceC1279AgP;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraBlessingBloomKt {
    public static final int BLESSING_BLOOM_TOTAL_MS = 1650;
    public static final float BLESSING_GLOW_ASPECT = 0.93333334f;
    public static final float BLESSING_GLOW_DELAY_MS = 40.0f;
    public static final float BLESSING_GLOW_MS = 1360.0f;
    public static final float BLESSING_RAY_DELAY_MS = 180.0f;
    public static final float BLESSING_RAY_DRAW_MS = 280.0f;
    public static final float BLESSING_RAY_LIFE_MS = 920.0f;
    public static final float BLESSING_RAY_STAGGER_MS = 45.0f;
    public static final long BlessingCream;
    public static final long BlessingDeep;
    public static final List<Float> BlessingGlowFade;
    public static final List<Float> BlessingGlowFadeKeyTimes;
    public static final float BlessingGlowRadius = 120.0f;
    public static final List<Float> BlessingRayFade;
    public static final List<Float> BlessingRayFadeKeyTimes;
    public static final List<AWx> BlessingRayTargets;
    public static final List<Float> BlessingRayWidths;
    public static final long BlessingWarm;

    public static final BRg auraBlessingBloomGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        return AuraLittleWishKt.auraLittleWishGlyph(bRg, z, bfm, i & 126);
    }

    /* renamed from: drawBlessingGlow-d-4ec7I, reason: not valid java name */
    public static final void m382drawBlessingGlowd4ec7I(AT3 at3, long j, float f) {
        float f2 = (f - 40.0f) / 1360.0f;
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        float fKeyframe = AuraReactionMotionKt.keyframe(BlessingGlowFade, BlessingGlowFadeKeyTimes, AuraReactionMotionKt.easeInOut(f2));
        if (fKeyframe > 0.0f) {
            float fAh4 = at3.Ah4(BlessingGlowRadius);
            InterfaceC1279AgP interfaceC1279AgPAEq = at3.AEq();
            AaI aaI = (AaI) interfaceC1279AgPAEq;
            AW9 aw9 = aaI.A02.A02;
            long jA00 = AW9.A00(aw9);
            try {
                aaI.A01.Ac6(1.0f, 0.93333334f, j);
                at3.A9M(C1EQ.A04(new HxE[]{C8j4.A17(Float.valueOf(0.0f), BlessingWarm), AnonymousClass007.A0h(Float.valueOf(0.34f), 0.72f, BlessingDeep), AnonymousClass007.A0h(Float.valueOf(0.7f), 0.38f, BlessingCream), C8j4.A17(Float.valueOf(1.0f), B6A.A06)}, fAh4, j), null, C16a.A00, fAh4, ATD.A03(fKeyframe, 0.0f, 1.0f), 3, j);
            } finally {
                AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
            }
        }
    }

    /* renamed from: drawBlessingRays-ubNVwUQ, reason: not valid java name */
    public static final void m383drawBlessingRaysubNVwUQ(AT3 at3, long j, float f, float f2) {
        List<AWx> list = BlessingRayTargets;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float f3 = f - ((i * 45.0f) + 180.0f);
            float f4 = f3 / 920.0f;
            if (f4 > 0.0f && f4 < 1.0f) {
                float fKeyframe = AuraReactionMotionKt.keyframe(BlessingRayFade, BlessingRayFadeKeyTimes, AuraReactionMotionKt.easeInOut(f4));
                if (fKeyframe > 0.0f) {
                    float fEaseOut = AuraReactionMotionKt.easeOut(ATD.A02(f3, 280.0f));
                    at3.A9X(null, null, C8j4.A03(BlessingRayWidths, i) * f2, ATD.A03(fKeyframe, 0.0f, 1.0f), 1, 3, BlessingCream, j, AuraReactionMotionKt.m407lerpWko1d7g(j, AWx.A03(AWx.A09(list, i), f2, j), fEaseOut));
                }
            }
        }
    }

    static {
        Float fA0a = AnonymousClass005.A0a();
        BlessingGlowFade = Arrays.asList(fA0a, Float.valueOf(0.34f), Float.valueOf(0.3f), fA0a);
        Float fValueOf = Float.valueOf(0.2f);
        Float fValueOf2 = Float.valueOf(0.58f);
        Float fA0t = C8j3.A0t();
        BlessingGlowFadeKeyTimes = C8j4.A13(fA0a, fValueOf, fValueOf2, fA0t);
        long j = B6A.A01;
        BlessingWarm = 4294091322L << 32;
        BlessingDeep = 4292438802L << 32;
        BlessingCream = 4294961072L << 32;
        AWx aWxA0C = AWx.A0C(C8j3.A0P(-30.0f) << 32, C8j3.A0P(-48.0f) & 4294967295L);
        long jA0P = C8j3.A0P(-10.0f);
        long jA0P2 = C8j3.A0P(-66.0f) & 4294967295L;
        BlessingRayTargets = Arrays.asList(aWxA0C, AWx.A0C(jA0P2, jA0P << 32), AWx.A0C(C8j4.A0K(12.0f), jA0P2), AWx.A0C(C8j3.A0P(34.0f) << 32, C8j3.A0P(-46.0f) & 4294967295L));
        Float fValueOf3 = Float.valueOf(2.2f);
        Float fValueOf4 = Float.valueOf(1.4f);
        BlessingRayWidths = Arrays.asList(fValueOf3, fValueOf4, fValueOf3, fValueOf4);
        BlessingRayFade = C8j5.A0b(fA0a, Float.valueOf(0.92f), 0.7f);
        BlessingRayFadeKeyTimes = C8j4.A13(fA0a, Float.valueOf(0.22f), fValueOf2, fA0t);
    }

    public static final BRg auraBlessingBloom(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 1650, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraBlessingBloomKt$auraBlessingBloom$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AEk.A00(bRg, objAaT);
    }
}
