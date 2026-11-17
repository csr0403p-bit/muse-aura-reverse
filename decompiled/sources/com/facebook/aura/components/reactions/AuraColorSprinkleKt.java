package com.facebook.aura.components.reactions;

import X.AHD;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AXN;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C16a;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;

/* loaded from: classes4.dex */
public abstract class AuraColorSprinkleKt {
    public static final float SPRINKLE_ALPHA = 0.95f;
    public static final int SPRINKLE_COUNT = 7;
    public static final float SPRINKLE_DOT_RATIO = 0.5833333f;
    public static final float SPRINKLE_END_SCALE = 0.7f;
    public static final float SPRINKLE_LIFETIME_MS = 500.0f;
    public static final int SPRINKLE_LONG_EVERY = 3;
    public static final float SPRINKLE_LONG_EXTRA = 12.0f;
    public static final float SPRINKLE_RADIUS = 30.0f;
    public static final float SPRINKLE_STAGGER_MS = 22.0f;
    public static final int SPRINKLE_TOTAL_MS = 800;
    public static final float SPRINKLE_WAVE_DELAY_MS = 160.0f;
    public static final float SprinkleArcLift = 4.0f;
    public static final float SprinkleSize = 6.0f;

    public static final void drawSprinkle(AT3 at3, float f, AHD<B6A> ahd) {
        if (ahd.isEmpty()) {
            return;
        }
        float fA00 = AXN.A00(at3);
        float fAh4 = at3.Ah4(SprinkleArcLift);
        float fAh42 = (at3.Ah4(SprinkleSize) * 0.5833333f) / 2.0f;
        long jADU = at3.ADU();
        int i = 0;
        do {
            float f2 = i;
            float f3 = (f - ((22.0f * f2) + 160.0f)) / 500.0f;
            if (f3 > 0.0f && f3 < 1.0f) {
                float f4 = ((f2 * 6.2831855f) / 7.0f) - 1.5707964f;
                float f5 = ((i % 3 == 0 ? 12.0f : 0.0f) + 30.0f) * fA00;
                double d = f4;
                long jA0J = AnonymousClass005.A0J(((float) Math.cos(d)) * f5, ((float) Math.sin(d)) * f5);
                at3.A9N(null, C16a.A00, C8j3.A02(0.7f, 1.0f, f3) * fAh42, ATD.A03(f3 >= 0.55f ? C8j3.A02(0.0f, 0.95f, (f3 - 0.55f) / 0.45f) : 0.95f, 0.0f, 1.0f), 3, C8j5.A0G(ahd, i), AuraReactionMotionKt.m401arcPositionjyLRC_s(jADU, jA0J, fAh4, f3));
            }
            i++;
        } while (i < 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraColorSprinkle(X.BRg r5, boolean r6, X.AHD<X.B6A> r7, X.BFM r8, int r9) {
        /*
            X.AnonymousClass003.A0v(r5, r7)
            int r1 = X.C8j3.A09(r9)
            r0 = 800(0x320, float:1.121E-42)
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
            com.facebook.aura.components.reactions.AuraColorSprinkleKt$auraColorSprinkle$1$1 r0 = new com.facebook.aura.components.reactions.AuraColorSprinkleKt$auraColorSprinkle$1$1
            r0.<init>(r4, r7)
            X.BBI.A0T(r8, r0)
        L38:
            X.BRg r0 = X.AEk.A00(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraColorSprinkleKt.auraColorSprinkle(X.BRg, boolean, X.AHD, X.BFM, int):X.BRg");
    }

    public static final BRg auraColorSprinkleGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 800, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraColorSprinkleKt$auraColorSprinkleGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
