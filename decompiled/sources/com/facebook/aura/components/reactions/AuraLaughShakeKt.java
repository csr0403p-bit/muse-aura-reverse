package com.facebook.aura.components.reactions;

import X.AT2;
import X.AT3;
import X.ATD;
import X.AW9;
import X.AWx;
import X.AXN;
import X.AaI;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.B6A;
import X.C16a;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraLaughShakeKt {
    public static final float HOP_END = 0.46875f;
    public static final float HOP_SETTLE_SCALE_X = 1.06f;
    public static final float HOP_SETTLE_SCALE_Y = 0.9f;
    public static final float HOP_START_SCALE = 0.86f;
    public static final float HopSettleOffset = 3.0f;
    public static final float HopStartOffset = -15.0f;
    public static final int LAUGH_GLYPH_DURATION_MS = 640;
    public static final float SHAKE_DEGREES = 8.181818f;
    public static final float SHAKE_LEFT_END = 0.734375f;
    public static final float SHAKE_LIFT_END = 0.8671875f;
    public static final float SHAKE_RIGHT_END = 0.6015625f;
    public static final float ShakeLift = -4.0f;
    public static final int TEARS_DURATION_MS = 900;
    public static final float TEARS_WAVE_DELAY_MS = 360.0f;
    public static final float TEAR_ALPHA = 0.95f;
    public static final float TEAR_END_SCALE = 0.7f;
    public static final float TEAR_HEIGHT_RATIO = 0.75f;
    public static final float TEAR_LIFETIME_MS = 500.0f;
    public static final float TEAR_SPIN_PER_DX = 0.025f;
    public static final float TEAR_STAGGER_STEP_MS = 22.0f;
    public static final float TEAR_WIDTH_RATIO = 0.5f;
    public static final float TearArcLift = 4.0f;
    public static final long TearColor;
    public static final float TearSize = 8.0f;
    public static final List<AWx> TearTravel;

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraLaughShakeGlyph(X.BRg r8, boolean r9, X.BFM r10, int r11) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r8, r0)
            java.lang.Object r0 = r10.AaT()
            java.lang.Object r6 = X.C78N.A00
            r7 = 0
            java.lang.Object r5 = X.AnonymousClass005.A0e(r10, r0, r6)
            X.AT5 r5 = (X.AT5) r5
            java.lang.Object r4 = X.C8j3.A0z(r10, r6, r9)
            androidx.compose.runtime.MutableState r4 = (androidx.compose.runtime.MutableState) r4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r0 = r11 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L29
            boolean r0 = r10.A66(r9)
            if (r0 != 0) goto L2e
        L29:
            r1 = r11 & 48
            r0 = 0
            if (r1 != r2) goto L2f
        L2e:
            r0 = 1
        L2f:
            boolean r1 = X.AnonymousClass001.A1T(r10, r5, r0)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L3b
            if (r0 != r6) goto L43
        L3b:
            com.facebook.aura.components.reactions.AuraLaughShakeKt$auraLaughShakeGlyph$1$1 r0 = new com.facebook.aura.components.reactions.AuraLaughShakeKt$auraLaughShakeGlyph$1$1
            r0.<init>(r9, r5, r4, r7)
            X.BBI.A0T(r10, r0)
        L43:
            X.AnonymousClass001.A18(r10, r0, r3)
            float r4 = com.facebook.aura.components.reactions.AuraLaughShakeKt.HopStartOffset
            float r3 = com.facebook.aura.components.reactions.AuraLaughShakeKt.HopSettleOffset
            float r2 = com.facebook.aura.components.reactions.AuraLaughShakeKt.ShakeLift
            boolean r1 = r10.A67(r5)
            boolean r0 = r10.A62(r4)
            r1 = r1 | r0
            boolean r0 = r10.A62(r3)
            r1 = r1 | r0
            boolean r0 = r10.A62(r2)
            r1 = r1 | r0
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L67
            if (r0 != r6) goto L6f
        L67:
            com.facebook.aura.components.reactions.AuraLaughShakeKt$auraLaughShakeGlyph$2$1 r0 = new com.facebook.aura.components.reactions.AuraLaughShakeKt$auraLaughShakeGlyph$2$1
            r0.<init>(r5, r4, r3, r2)
            X.BBI.A0T(r10, r0)
        L6f:
            X.BRg r0 = X.AnonymousClass001.A0W(r8, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraLaughShakeKt.auraLaughShakeGlyph(X.BRg, boolean, X.BFM, int):X.BRg");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraLaughTears(X.BRg r8, boolean r9, X.BFM r10, int r11) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r8, r0)
            java.lang.Object r0 = r10.AaT()
            java.lang.Object r5 = X.C78N.A00
            r7 = 0
            java.lang.Object r4 = X.AnonymousClass005.A0e(r10, r0, r5)
            X.AT5 r4 = (X.AT5) r4
            java.lang.Object r6 = X.C8j3.A0z(r10, r5, r9)
            androidx.compose.runtime.MutableState r6 = (androidx.compose.runtime.MutableState) r6
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r0 = r11 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L29
            boolean r0 = r10.A66(r9)
            if (r0 != 0) goto L2e
        L29:
            r1 = r11 & 48
            r0 = 0
            if (r1 != r2) goto L2f
        L2e:
            r0 = 1
        L2f:
            boolean r1 = X.AnonymousClass001.A1T(r10, r4, r0)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L3b
            if (r0 != r5) goto L43
        L3b:
            com.facebook.aura.components.reactions.AuraLaughShakeKt$auraLaughTears$1$1 r0 = new com.facebook.aura.components.reactions.AuraLaughShakeKt$auraLaughTears$1$1
            r0.<init>(r9, r4, r6, r7)
            X.BBI.A0T(r10, r0)
        L43:
            X.AnonymousClass001.A18(r10, r0, r3)
            boolean r1 = r10.A67(r4)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L52
            if (r0 != r5) goto L5a
        L52:
            com.facebook.aura.components.reactions.AuraLaughShakeKt$auraLaughTears$2$1 r0 = new com.facebook.aura.components.reactions.AuraLaughShakeKt$auraLaughTears$2$1
            r0.<init>(r4)
            X.BBI.A0T(r10, r0)
        L5a:
            X.BRg r0 = X.AEk.A00(r8, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraLaughShakeKt.auraLaughTears(X.BRg, boolean, X.BFM, int):X.BRg");
    }

    public static final float span(float f, float f2, float f3) {
        return AnonymousClass003.A00((f - f2) / (f3 - f2));
    }

    static {
        long jA0P = C8j3.A0P(-26.0f);
        long jA0P2 = C8j3.A0P(-18.0f) & 4294967295L;
        TearTravel = Arrays.asList(AWx.A0C(jA0P << 32, jA0P2), AWx.A0C(C8j4.A0K(26.0f), jA0P2));
        long j = B6A.A01;
        TearColor = 4283410687L << 32;
    }

    public static final void drawTears(AT3 at3, float f, AXN axn) {
        float f2 = AuraReactionMotionKt.OneDp;
        C7384Etj.A0Y(axn, 1);
        float fA01 = AXN.A01(axn, f2);
        float fA012 = AXN.A01(axn, TearArcLift);
        float fA013 = AXN.A01(axn, TearSize);
        long jADU = at3.ADU();
        List<AWx> list = TearTravel;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float f3 = (f - ((i * 22.0f) + 360.0f)) / 500.0f;
            if (f3 > 0.0f && f3 < 1.0f) {
                long jM401arcPositionjyLRC_s = AuraReactionMotionKt.m401arcPositionjyLRC_s(jADU, AWx.A02(AWx.A09(list, i), fA01), fA012, f3);
                float fA02 = C8j3.A02(0.7f, 1.0f, f3);
                float f4 = 0.5f * fA013 * fA02;
                float f5 = fA02 * 0.75f * fA013;
                float fA022 = f3 >= 0.55f ? C8j3.A02(0.0f, 0.95f, (f3 - 0.55f) / 0.45f) : 0.95f;
                float fA00 = AnonymousClass001.A00(jM401arcPositionjyLRC_s);
                float fA014 = AnonymousClass001.A01(jM401arcPositionjyLRC_s, 4294967295L);
                AaI aaI = (AaI) at3.AEq();
                AT2 at2 = aaI.A01;
                at2.AhL(fA00, fA014);
                try {
                    float degrees = (float) Math.toDegrees(Float.intBitsToFloat((int) (r0 >> 32)) * 0.025f * f3);
                    long jA00 = AW9.A00(aaI.A02.A02);
                    try {
                        at2.Abq(degrees, 0L);
                        at3.A9a(null, C16a.A00, ATD.A03(fA022, 0.0f, 1.0f), 3, TearColor, AnonymousClass005.A0L((-f4) / 2.0f, (-f5) / 2.0f), AnonymousClass005.A0L(f4, f5));
                    } finally {
                    }
                } finally {
                    AT2.A01(at2, fA00, fA014);
                }
            }
        }
    }

    public static final float ease(float f) {
        return C8j5.A02((f > 0.5f ? 1 : (f == 0.5f ? 0 : -1)), f);
    }
}
