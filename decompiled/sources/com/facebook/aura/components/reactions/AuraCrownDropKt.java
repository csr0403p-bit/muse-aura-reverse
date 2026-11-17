package com.facebook.aura.components.reactions;

import X.AT5;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C78N;
import X.C8j3;
import X.C8j4;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraCrownDropKt {
    public static final float CROWN_DROP_MS = 600.0f;
    public static final int CROWN_TOTAL_MS = 840;
    public static final List<Float> CrownDropKeyTimes;
    public static final List<Float> CrownDropY;
    public static final List<Float> CrownSquashKeyTimes;
    public static final List<Float> CrownSquashY;
    public static final float GLINT_DELAY_MS = 550.0f;
    public static final long GlintAt;
    public static final float GlintSize = 5.5f;
    public static final float SWEEP_DELAY_MS = 340.0f;
    public static final float SWEEP_GLOW = 0.7f;
    public static final float SWEEP_MS = 380.0f;
    public static final long SweepAt;
    public static final float SweepSize = 14.0f;
    public static final float SweepTravel = 8.0f;
    public static final float SweepWidth = 2.4f;

    static {
        Float fA0a = AnonymousClass005.A0a();
        Float fValueOf = Float.valueOf(0.42f);
        Float fValueOf2 = Float.valueOf(0.58f);
        Float fValueOf3 = Float.valueOf(0.76f);
        Float fA0s = C8j3.A0s();
        Float fA0t = C8j3.A0t();
        CrownDropKeyTimes = Arrays.asList(fA0a, fValueOf, fValueOf2, fValueOf3, fA0s, fA0t);
        CrownDropY = Arrays.asList(Float.valueOf(-16.0f), fA0a, Float.valueOf(-5.0f), fA0a, Float.valueOf(-1.5f), fA0a);
        CrownSquashKeyTimes = C8j4.A14(fA0a, Float.valueOf(0.4f), Float.valueOf(0.46f), Float.valueOf(0.6f), fA0t);
        CrownSquashY = Arrays.asList(fA0t, fA0t, Float.valueOf(0.84f), Float.valueOf(1.05f), fA0t);
        SweepAt = (C8j3.A0P(2.0f) << 32) | (C8j3.A0P(-7.0f) & 4294967295L);
        GlintAt = (C8j3.A0P(9.0f) << 32) | (C8j3.A0P(-10.0f) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraCrownDrop(X.BRg r7, boolean r8, X.AHD<X.B6A> r9, X.BFM r10, int r11) {
        /*
            X.AnonymousClass003.A0v(r7, r9)
            int r1 = X.C8j3.A09(r11)
            r0 = 840(0x348, float:1.177E-42)
            X.AT5 r6 = com.facebook.aura.components.reactions.AuraReactionMotionKt.rememberBurstProgress(r8, r0, r10, r1)
            java.lang.Object r0 = r10.AaT()
            java.lang.Object r5 = X.C78N.A00
            java.lang.Object r4 = X.C8j4.A0o(r10, r0, r5)
            X.ATy r4 = (X.InterfaceC1068ATy) r4
            boolean r3 = r10.A67(r6)
            r0 = r11 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L2b
            boolean r0 = r10.A65(r9)
            if (r0 != 0) goto L30
        L2b:
            r1 = r11 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L31
        L30:
            r0 = 1
        L31:
            boolean r1 = X.AnonymousClass002.A1V(r10, r4, r0, r3)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L3d
            if (r0 != r5) goto L45
        L3d:
            com.facebook.aura.components.reactions.AuraCrownDropKt$auraCrownDrop$1$1 r0 = new com.facebook.aura.components.reactions.AuraCrownDropKt$auraCrownDrop$1$1
            r0.<init>(r6, r9, r4)
            X.BBI.A0T(r10, r0)
        L45:
            X.BRg r0 = X.AEk.A00(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraCrownDropKt.auraCrownDrop(X.BRg, boolean, X.AHD, X.BFM, int):X.BRg");
    }

    public static final BRg auraCrownDropGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 840, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraCrownDropKt$auraCrownDropGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
