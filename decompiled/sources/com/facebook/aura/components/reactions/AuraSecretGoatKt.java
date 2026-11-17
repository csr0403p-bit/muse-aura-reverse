package com.facebook.aura.components.reactions;

import X.AT5;
import X.AWx;
import X.AnonymousClass001;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C78N;
import X.C8j3;
import X.C8j4;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraSecretGoatKt {
    public static final float CROWN_APPEAR_AT_MS = 160.0f;
    public static final float CROWN_APPEAR_MS = 80.0f;
    public static final float CROWN_FADE_AT_MS = 680.0f;
    public static final float CROWN_FADE_MS = 220.0f;
    public static final float CROWN_FROM_Y = -24.0f;
    public static final float CROWN_LAND_AT_MS = 220.0f;
    public static final float CROWN_LAND_MS = 220.0f;
    public static final float CROWN_TO_Y = -13.0f;
    public static final long CrownBox;
    public static final List<AWx> CrownPoints;
    public static final float GOAT_HOP_MS = 560.0f;
    public static final int GOAT_TOTAL_MS = 900;
    public static final List<Float> GoatHopDy;
    public static final List<Float> GoatSquashKeyTimes;
    public static final List<Float> GoatSquashY;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        GoatHopDy = Arrays.asList(fValueOf, Float.valueOf(-13.0f), fValueOf, Float.valueOf(-2.0f), fValueOf);
        Float fValueOf2 = Float.valueOf(0.12f);
        Float fValueOf3 = Float.valueOf(0.5f);
        Float fValueOf4 = Float.valueOf(0.7f);
        Float fValueOf5 = Float.valueOf(1.0f);
        GoatSquashKeyTimes = C8j4.A14(fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5);
        GoatSquashY = Arrays.asList(fValueOf5, C8j3.A0s(), Float.valueOf(1.06f), fValueOf5, fValueOf5);
        long jA0P = C8j3.A0P(0.0f);
        long jA0P2 = C8j3.A0P(6.0f);
        long j = jA0P << 32;
        long j2 = jA0P2 & 4294967295L;
        AWx aWxA0C = AWx.A0C(j, j2);
        long jA0P3 = C8j3.A0P(1.0f) & 4294967295L;
        AWx aWxA0C2 = AWx.A0C(j, jA0P3);
        long jA0P4 = C8j3.A0P(3.0f);
        long jA0P5 = C8j3.A0P(4.0f) & 4294967295L;
        AWx aWxA0C3 = AWx.A0C(jA0P4 << 32, jA0P5);
        AWx aWxA0C4 = AWx.A0C(jA0P2 << 32, jA0P & 4294967295L);
        AWx aWxA0C5 = AWx.A0C(C8j4.A0K(9.0f), jA0P5);
        long jA0K = C8j4.A0K(12.0f);
        CrownPoints = Arrays.asList(aWxA0C, aWxA0C2, aWxA0C3, aWxA0C4, aWxA0C5, AWx.A0C(jA0K, jA0P3), AWx.A0C(jA0K, j2));
        CrownBox = jA0K | (C8j3.A0P(7.0f) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraSecretGoat(X.BRg r7, boolean r8, X.AHD<X.B6A> r9, X.BFM r10, int r11) {
        /*
            X.AnonymousClass003.A0v(r7, r9)
            int r1 = X.C8j3.A09(r11)
            r0 = 900(0x384, float:1.261E-42)
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
            com.facebook.aura.components.reactions.AuraSecretGoatKt$auraSecretGoat$1$1 r0 = new com.facebook.aura.components.reactions.AuraSecretGoatKt$auraSecretGoat$1$1
            r0.<init>(r6, r9, r4)
            X.BBI.A0T(r10, r0)
        L45:
            X.BRg r0 = X.AEk.A00(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraSecretGoatKt.auraSecretGoat(X.BRg, boolean, X.AHD, X.BFM, int):X.BRg");
    }

    public static final BRg auraSecretGoatGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 900, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraSecretGoatKt$auraSecretGoatGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
