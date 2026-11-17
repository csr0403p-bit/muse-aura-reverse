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
import X.C8j5;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraDiscoFlashKt {
    public static final float DISCO_ROTATE_DELAY_MS = 60.0f;
    public static final float DISCO_ROTATE_MS = 460.0f;
    public static final float DISCO_SCALE_MS = 340.0f;
    public static final int DISCO_TOTAL_MS = 560;
    public static final List<Float> DiscoDegrees;
    public static final List<Float> DiscoScales;
    public static final float LIGHT_BASE_ALPHA = 0.75f;
    public static final int LIGHT_COUNT = 3;
    public static final float LIGHT_MS = 420.0f;
    public static final float LIGHT_REACH = 34.0f;
    public static final float LIGHT_ROW_STEP = 12.0f;
    public static final float LIGHT_ROW_TOP = -12.0f;
    public static final float LIGHT_STAGGER_MS = 70.0f;
    public static final List<Float> LightOpacityKeyTimes;
    public static final List<Float> LightOpacityTrack;
    public static final float LightSize = 9.0f;

    static {
        Float fValueOf = Float.valueOf(0.94f);
        Float fValueOf2 = Float.valueOf(1.08f);
        Float fA0t = C8j3.A0t();
        DiscoScales = C8j4.A12(fValueOf, fValueOf2, fA0t);
        Float fA0a = AnonymousClass005.A0a();
        DiscoDegrees = C8j5.A0b(fA0a, Float.valueOf(-10.0f), 8.0f);
        LightOpacityTrack = C8j5.A0Z(fA0a, 0.8f);
        LightOpacityKeyTimes = C8j4.A12(fA0a, Float.valueOf(0.4f), fA0t);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraDiscoFlash(X.BRg r5, boolean r6, X.AHD<X.B6A> r7, X.BFM r8, int r9) {
        /*
            X.AnonymousClass003.A0v(r5, r7)
            int r1 = X.C8j3.A09(r9)
            r0 = 560(0x230, float:7.85E-43)
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
            com.facebook.aura.components.reactions.AuraDiscoFlashKt$auraDiscoFlash$1$1 r0 = new com.facebook.aura.components.reactions.AuraDiscoFlashKt$auraDiscoFlash$1$1
            r0.<init>(r4, r7)
            X.BBI.A0T(r8, r0)
        L38:
            X.BRg r0 = X.AEk.A00(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraDiscoFlashKt.auraDiscoFlash(X.BRg, boolean, X.AHD, X.BFM, int):X.BRg");
    }

    public static final BRg auraDiscoFlashGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 560, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraDiscoFlashKt$auraDiscoFlashGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
