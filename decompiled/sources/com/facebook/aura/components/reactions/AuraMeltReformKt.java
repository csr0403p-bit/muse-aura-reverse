package com.facebook.aura.components.reactions;

import X.AT5;
import X.AnonymousClass001;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraMeltReformKt {
    public static final float MELT_GLYPH_MS = 860.0f;
    public static final int MELT_TOTAL_MS = 920;
    public static final List<Float> MeltKeyTimes;
    public static final List<Float> MeltNudgeDy;
    public static final List<Float> MeltScaleX;
    public static final List<Float> MeltScaleY;
    public static final float PUDDLE_ALPHA = 0.85f;
    public static final float PUDDLE_DELAY_MS = 100.0f;
    public static final float PUDDLE_MS = 820.0f;
    public static final long PuddleOffset;
    public static final List<Float> PuddleOpacityKeyTimes;
    public static final List<Float> PuddleOpacityTrack;
    public static final List<Float> PuddleScaleKeyTimes;
    public static final List<Float> PuddleScaleTrack;
    public static final long PuddleSize;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(0.24f);
        Float fValueOf3 = Float.valueOf(0.42f);
        Float fValueOf4 = Float.valueOf(0.72f);
        Float fA0t = C8j3.A0t();
        MeltKeyTimes = C8j4.A14(fValueOf, fValueOf2, fValueOf3, fValueOf4, fA0t);
        Float fValueOf5 = Float.valueOf(1.18f);
        Float fValueOf6 = Float.valueOf(1.05f);
        MeltScaleX = C8j5.A0c(fA0t, fValueOf5, fValueOf6, 0.85f);
        Float fValueOf7 = Float.valueOf(0.35f);
        MeltScaleY = C8j5.A0c(fA0t, fValueOf7, Float.valueOf(0.1f), 1.16f);
        MeltNudgeDy = C8j5.A0c(fValueOf, Float.valueOf(5.0f), Float.valueOf(8.0f), -2.0f);
        PuddleSize = (C8j3.A0P(26.0f) << 32) | (C8j3.A0P(10.0f) & 4294967295L);
        PuddleOffset = (C8j3.A0P(0.0f) << 32) | (C8j3.A0P(11.0f) & 4294967295L);
        PuddleScaleTrack = C8j4.A13(Float.valueOf(0.2f), fA0t, fValueOf6, Float.valueOf(0.15f));
        PuddleScaleKeyTimes = C8j5.A0d(fValueOf, fValueOf7, fA0t, 0.55f);
        Float fA0s = C8j3.A0s();
        PuddleOpacityTrack = Arrays.asList(fValueOf, fA0s, fA0s, fValueOf);
        PuddleOpacityKeyTimes = C8j5.A0d(fValueOf, Float.valueOf(0.3f), fA0t, 0.6f);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraMeltReform(X.BRg r5, boolean r6, X.AHD<X.B6A> r7, X.BFM r8, int r9) {
        /*
            X.AnonymousClass003.A0v(r5, r7)
            int r1 = X.C8j3.A09(r9)
            r0 = 920(0x398, float:1.289E-42)
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
            com.facebook.aura.components.reactions.AuraMeltReformKt$auraMeltReform$1$1 r0 = new com.facebook.aura.components.reactions.AuraMeltReformKt$auraMeltReform$1$1
            r0.<init>(r4, r7)
            X.BBI.A0T(r8, r0)
        L38:
            X.BRg r0 = X.AEk.A00(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraMeltReformKt.auraMeltReform(X.BRg, boolean, X.AHD, X.BFM, int):X.BRg");
    }

    public static final BRg auraMeltReformGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 920, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraMeltReformKt$auraMeltReformGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
