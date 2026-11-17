package com.facebook.aura.components.reactions;

import X.AHD;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C16a;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.HDi;
import X.HxS;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraVictoryGleamKt {
    public static final float GLEAM_DELAY_MS = 160.0f;
    public static final float GLEAM_FROM_X = -6.0f;
    public static final float GLEAM_MS = 400.0f;
    public static final float GLEAM_TO_X = 24.0f;
    public static final long GleamColor;
    public static final long GleamEnd;
    public static final List<Float> GleamOpacityKeyTimes;
    public static final List<Float> GleamOpacityTrack;
    public static final long GleamStart;
    public static final float GleamWidth;
    public static final float STAR_DELAY_MS = 220.0f;
    public static final float STAR_END_SCALE = 0.4f;
    public static final float STAR_LIFT = 3.0f;
    public static final float STAR_MS = 500.0f;
    public static final float STAR_STAGGER_MS = 60.0f;
    public static final long StarFrom;
    public static final List<Float> StarSides;
    public static final float StarSize;
    public static final long StarTo;
    public static final float VICTORY_SCALE_MS = 360.0f;
    public static final int VICTORY_TOTAL_MS = 780;
    public static final List<Float> VictoryScales;

    public static final void drawGleam(AT3 at3, float f) {
        float f2 = (f - 160.0f) / 400.0f;
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        float fA00 = AXN.A00(at3);
        long jA0A = AnonymousClass007.A0A(C8j3.A02(24.0f, -6.0f, f2) * fA00, 0.0f);
        long j = GleamColor;
        long jADU = at3.ADU();
        at3.A9X(null, null, at3.Ah4(GleamWidth), AuraReactionMotionKt.keyframe(GleamOpacityTrack, GleamOpacityKeyTimes, f2), 1, 3, j, AWx.A05(AWx.A03(GleamStart, fA00, jADU), jA0A), AWx.A05(AWx.A03(GleamEnd, fA00, jADU), jA0A));
    }

    public static final void drawVictoryStars(AT3 at3, float f, AHD<B6A> ahd) {
        float fA00 = AXN.A00(at3);
        List<Float> list = StarSides;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float f2 = ((f - 220.0f) - (i * 60.0f)) / 500.0f;
            if (f2 > 0.0f && f2 < 1.0f) {
                float fA03 = C8j4.A03(list, i);
                long jADU = at3.ADU();
                long j = StarFrom;
                long jA03 = AWx.A03(AnonymousClass005.A0M(C8j4.A00(j, fA03), AnonymousClass001.A01(j, 4294967295L)), fA00, jADU);
                long j2 = StarTo;
                long jA032 = AWx.A03(AnonymousClass005.A0L(C8j4.A00(j2, fA03), AnonymousClass001.A01(j2, 4294967295L)), fA00, jADU);
                long jA0G = C8j5.A0G(ahd, i);
                at3.A9N(null, C16a.A00, C8j5.A01(at3.Ah4(StarSize), f2), 1.0f - ATD.A01(f2), 3, jA0G, AuraReactionMotionKt.m402curvePointAtjyLRC_s(jA03, jA032, fA00 * 3.0f, AuraReactionMotionKt.easeInOut(f2)));
            }
        }
    }

    static {
        Float fValueOf = Float.valueOf(0.8f);
        Float fValueOf2 = Float.valueOf(1.12f);
        Float fValueOf3 = Float.valueOf(0.97f);
        Float fA0t = C8j3.A0t();
        VictoryScales = C8j4.A13(fValueOf, fValueOf2, fValueOf3, fA0t);
        GleamStart = (C8j3.A0P(-14.0f) << 32) | (C8j3.A0P(11.0f) & 4294967295L);
        GleamEnd = (C8j3.A0P(-2.0f) << 32) | (C8j3.A0P(-12.0f) & 4294967295L);
        GleamWidth = 4.0f;
        Float fA0a = AnonymousClass005.A0a();
        GleamOpacityTrack = C8j5.A0Z(fA0a, 0.85f);
        GleamOpacityKeyTimes = C8j4.A12(fA0a, Float.valueOf(0.4f), fA0t);
        long j = B6A.A08;
        GleamColor = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.92f);
        StarSides = Arrays.asList(Float.valueOf(-1.0f), fA0t);
        StarFrom = AnonymousClass005.A0L(15.0f, 4.0f);
        StarTo = (C8j3.A0P(19.0f) << 32) | (C8j3.A0P(-16.0f) & 4294967295L);
        StarSize = 4.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraVictoryGleam(X.BRg r5, boolean r6, X.AHD<X.B6A> r7, X.BFM r8, int r9) {
        /*
            X.AnonymousClass003.A0v(r5, r7)
            int r1 = X.C8j3.A09(r9)
            r0 = 780(0x30c, float:1.093E-42)
            X.AT5 r4 = com.facebook.aura.components.reactions.AuraReactionMotionKt.rememberBurstProgress(r6, r0, r8, r1)
            boolean r3 = r8.A67(r4)
            r0 = r9 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L1f
            boolean r0 = r8.A65(r7)
            if (r0 != 0) goto L24
        L1f:
            r0 = r9 & 384(0x180, float:5.38E-43)
            r1 = 0
            if (r0 != r2) goto L25
        L24:
            r1 = 1
        L25:
            r1 = r1 | r3
            java.lang.Object r0 = r8.AaT()
            if (r1 != 0) goto L30
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L38
        L30:
            com.facebook.aura.components.reactions.AuraVictoryGleamKt$auraVictoryGleam$1$1 r0 = new com.facebook.aura.components.reactions.AuraVictoryGleamKt$auraVictoryGleam$1$1
            r0.<init>(r4, r7)
            X.BBI.A0T(r8, r0)
        L38:
            X.BRg r0 = X.AEk.A00(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraVictoryGleamKt.auraVictoryGleam(X.BRg, boolean, X.AHD, X.BFM, int):X.BRg");
    }

    public static final BRg auraVictoryGleamGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, VICTORY_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraVictoryGleamKt$auraVictoryGleamGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
