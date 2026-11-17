package com.facebook.aura.components.reactions;

import X.AEk;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AXN;
import X.AaJ;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraSingleClapKt {
    public static final float CLAP_SCALE_DELAY_MS = 200.0f;
    public static final float CLAP_SCALE_MS = 280.0f;
    public static final long ClapColor;
    public static final List<Float> ClapScales;
    public static final float LINE_DELAY_MS = 220.0f;
    public static final float LINE_FADE_MS = 240.0f;
    public static final float LINE_HOLD_MS = 40.0f;
    public static final float LINE_REVEAL_MS = 100.0f;
    public static final List<Float> LineAngles;
    public static final float LineInnerRadius = 11.0f;
    public static final float LineOuterRadius = 20.0f;
    public static final float LineWidth = 1.8f;
    public static final int SINGLE_CLAP_TOTAL_MS = 600;
    public static final float WAVE_ALPHA = 0.9f;
    public static final float WAVE_HALF_SWEEP = 0.7f;
    public static final float WAVE_MS = 220.0f;
    public static final float WaveEndOffset = 9.0f;
    public static final float WaveRadius = 10.0f;
    public static final float WaveStartOffset = 24.0f;
    public static final float WaveWidth = 2.0f;

    public static final void drawImpactLines(AT3 at3, float f) {
        float f2;
        float f3 = f - 220.0f;
        if (f3 > 0.0f) {
            float fEaseOut = AuraReactionMotionKt.easeOut(ATD.A03(f3 / 100.0f, 0.0f, 1.0f));
            if (fEaseOut > 0.0f) {
                if (f3 < 140.0f) {
                    f2 = 1.0f;
                } else {
                    f2 = 1.0f - ((f3 - 140.0f) / 240.0f);
                    if (f2 <= 0.0f) {
                        return;
                    }
                }
                float fA00 = AXN.A00(at3);
                float fAh4 = at3.Ah4(LineWidth);
                Iterator<Float> it = LineAngles.iterator();
                while (it.hasNext()) {
                    float fA02 = AnonymousClass001.A02(it.next()) - 1.5707964f;
                    long jADU = at3.ADU();
                    float fA002 = AnonymousClass001.A00(jADU);
                    double d = fA02;
                    float fCos = (float) Math.cos(d);
                    float f4 = LineInnerRadius;
                    float fA01 = AnonymousClass001.A01(jADU, 4294967295L);
                    float fSin = (float) Math.sin(d);
                    long jA0L = AnonymousClass005.A0L(fA002 + (fCos * f4 * fA00), (fSin * f4 * fA00) + fA01);
                    float f5 = LineOuterRadius;
                    at3.A9X(null, null, fAh4, ATD.A03(f2, 0.0f, 1.0f), 0, 3, ClapColor, jA0L, AuraReactionMotionKt.m407lerpWko1d7g(jA0L, AnonymousClass005.A0L(fA002 + (fCos * f5 * fA00), fA01 + (fSin * f5 * fA00)), fEaseOut));
                }
            }
        }
    }

    public static final void drawWaves(AT3 at3, float f) {
        float f2 = f / 220.0f;
        if (f2 < 1.0f) {
            float fA00 = AXN.A00(at3);
            float f3 = f2 * f2;
            float fAh4 = at3.Ah4(WaveRadius);
            AaJ aaJ = new AaJ(null, at3.Ah4(WaveWidth), 4.0f, 1, 0);
            Iterator it = Arrays.asList(Float.valueOf(-1.0f), Float.valueOf(1.0f)).iterator();
            while (it.hasNext()) {
                float fA02 = AnonymousClass001.A02(it.next());
                long jADU = at3.ADU();
                float fA002 = AnonymousClass001.A00(jADU) + (C8j3.A02(WaveEndOffset, WaveStartOffset, f3) * fA02 * fA00);
                float f4 = 2.4415927f;
                if (fA02 < 0.0f) {
                    f4 = -0.7f;
                }
                long j = ClapColor;
                float degrees = (float) Math.toDegrees(f4);
                float degrees2 = (float) Math.toDegrees(1.399999976158142d);
                long jA0M = AnonymousClass005.A0M(fA002 - fAh4, AnonymousClass001.A01(jADU, 4294967295L) - fAh4);
                long jA0P = C8j3.A0P(2.0f * fAh4);
                at3.A9K(null, aaJ, degrees, degrees2, (1.0f - f3) * 0.9f, 3, j, jA0M, (4294967295L & jA0P) | (jA0P << 32), false);
            }
        }
    }

    static {
        Float fA0t = C8j3.A0t();
        ClapScales = Arrays.asList(fA0t, Float.valueOf(1.2f), Float.valueOf(0.95f), fA0t);
        LineAngles = C8j5.A0a(Float.valueOf(-0.55f), AnonymousClass005.A0a(), 0.55f);
        ClapColor = C8j3.A0U(4294295867L);
    }

    public static final BRg auraSingleClap(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 600, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraSingleClapKt$auraSingleClap$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AEk.A00(bRg, objAaT);
    }

    public static final BRg auraSingleClapGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 600, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraSingleClapKt$auraSingleClapGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
