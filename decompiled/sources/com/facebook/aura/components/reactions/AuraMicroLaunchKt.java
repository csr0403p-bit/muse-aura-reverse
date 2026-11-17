package com.facebook.aura.components.reactions;

import X.AT3;
import X.AT5;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AnonymousClass001;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C16a;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraMicroLaunchKt {
    public static final float EXHAUST_ALPHA = 0.75f;
    public static final int EXHAUST_COUNT = 5;
    public static final float EXHAUST_DELAY_MS = 100.0f;
    public static final float EXHAUST_END_SCALE = 0.4f;
    public static final float EXHAUST_MS = 340.0f;
    public static final float EXHAUST_STAGGER_MS = 45.0f;
    public static final float ExhaustFall = 14.0f;
    public static final float ExhaustOffset = 1.5f;
    public static final float ExhaustSize = 5.0f;
    public static final float ExhaustSizeStep = 0.7f;
    public static final float ExhaustTop = 6.0f;
    public static final float LAUNCH_GLYPH_MS = 620.0f;
    public static final List<Float> LaunchLift;
    public static final List<Float> LaunchScales;
    public static final int MICRO_LAUNCH_TOTAL_MS = 710;
    public static final float PUFF_ALPHA = 0.5f;
    public static final float PUFF_DELAY_MS = 160.0f;
    public static final float PUFF_FROM_SCALE = 0.4f;
    public static final float PUFF_MS = 550.0f;
    public static final float PUFF_TO_SCALE = 1.7f;
    public static final long PuffAt;
    public static final float PuffSize = 10.0f;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        LaunchLift = Arrays.asList(fValueOf, Float.valueOf(2.0f), Float.valueOf(-16.0f), Float.valueOf(-19.0f), Float.valueOf(-2.0f), fValueOf);
        LaunchScales = C8j5.A0b(C8j3.A0t(), Float.valueOf(0.94f), 1.06f);
        PuffAt = C8j3.A0V(C8j3.A0P(10.0f), C8j3.A0P(0.0f) << 32);
    }

    /* renamed from: drawExhaust-mxwnekA, reason: not valid java name */
    public static final void m400drawExhaustmxwnekA(AT3 at3, float f, long j) {
        float fA00 = AXN.A00(at3);
        int i = 0;
        do {
            float f2 = i;
            float f3 = ((f - 100.0f) - (45.0f * f2)) / 340.0f;
            if (f3 > 0.0f && f3 < 1.0f) {
                long jADU = at3.ADU();
                float fA002 = AnonymousClass001.A00(jADU);
                int i2 = i % 2;
                float f4 = ExhaustOffset;
                if (i2 == 0) {
                    f4 = -f4;
                }
                float fA01 = AnonymousClass001.A01(jADU, 4294967295L) + at3.Ah4(ExhaustTop);
                long jA0P = C8j3.A0P(fA002 + (f4 * fA00)) << 32;
                long jA0P2 = jA0P | (C8j3.A0P(fA01) & 4294967295L);
                long jA0P3 = (C8j3.A0P(AnonymousClass001.A01(jA0P2, 4294967295L) + at3.Ah4(ExhaustFall)) & 4294967295L) | jA0P;
                float fAh4 = at3.Ah4(ExhaustSize) - (f2 * at3.Ah4(ExhaustSizeStep));
                if (fAh4 < 0.0f) {
                    fAh4 = 0.0f;
                }
                at3.A9N(null, C16a.A00, C8j5.A01(fAh4, f3), C8j3.A02(0.0f, 0.75f, ATD.A01(f3)), 3, j, AuraReactionMotionKt.m402curvePointAtjyLRC_s(jA0P2, jA0P3, 0.0f, AuraReactionMotionKt.easeInOut(f3)));
            }
            i++;
        } while (i < 5);
    }

    public static final void drawPuff(AT3 at3, float f) {
        float f2 = (f - 160.0f) / 550.0f;
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        long j = B6A.A08;
        float fAh4 = (at3.Ah4(PuffSize) / 2.0f) * C8j3.A02(1.7f, 0.4f, f2);
        long jA03 = AWx.A03(PuffAt, AXN.A00(at3), at3.ADU());
        at3.A9N(null, C16a.A00, fAh4, C8j3.A02(0.0f, 0.5f, f2), 3, j, jA03);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraMicroLaunch(X.BRg r5, boolean r6, X.AHD<X.B6A> r7, X.BFM r8, int r9) {
        /*
            X.AnonymousClass003.A0v(r5, r7)
            int r1 = X.C8j3.A09(r9)
            r0 = 710(0x2c6, float:9.95E-43)
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
            com.facebook.aura.components.reactions.AuraMicroLaunchKt$auraMicroLaunch$1$1 r0 = new com.facebook.aura.components.reactions.AuraMicroLaunchKt$auraMicroLaunch$1$1
            r0.<init>(r4, r7)
            X.BBI.A0T(r8, r0)
        L38:
            X.BRg r0 = X.AEk.A00(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraMicroLaunchKt.auraMicroLaunch(X.BRg, boolean, X.AHD, X.BFM, int):X.BRg");
    }

    public static final BRg auraMicroLaunchGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, MICRO_LAUNCH_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraMicroLaunchKt$auraMicroLaunchGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
