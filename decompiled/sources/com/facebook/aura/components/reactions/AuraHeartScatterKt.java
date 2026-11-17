package com.facebook.aura.components.reactions;

import X.AEk;
import X.AT2;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AW9;
import X.AXN;
import X.AaI;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.InterfaceC1068ATy;
import X.InterfaceC1279AgP;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraHeartScatterKt {
    public static final float RADIANS_TO_DEGREES = 57.295776f;
    public static final float HeartScatterSize = 12.0f;
    public static final List<B6A> HeartScatterTint = AnonymousClass004.A17(C8j4.A0Y(4292883291L), 4294933411L << 32);
    public static final List<Float> HeartScatterSpin = Arrays.asList(Float.valueOf(0.5f), Float.valueOf(-0.4f), Float.valueOf(0.8f), Float.valueOf(-0.7f), Float.valueOf(0.3f), Float.valueOf(-0.55f), Float.valueOf(0.65f), Float.valueOf(-0.35f), Float.valueOf(0.45f));

    public static final BRg auraHeartScatter(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, AuraScatterKt.SCATTER_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        InterfaceC1068ATy interfaceC1068ATy = (InterfaceC1068ATy) C8j4.A0o(bfm, objAaT, obj);
        boolean zA1M = AnonymousClass003.A1M(bfm, at5RememberBurstProgress, interfaceC1068ATy);
        Object objAaT2 = bfm.AaT();
        if (zA1M || objAaT2 == obj) {
            objAaT2 = new AuraHeartScatterKt$auraHeartScatter$1$1(at5RememberBurstProgress, interfaceC1068ATy);
            BBI.A0T(bfm, objAaT2);
        }
        return AEk.A00(bRg, objAaT2);
    }

    public static final BRg auraHeartScatterGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, AuraScatterKt.SCATTER_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraHeartScatterKt$auraHeartScatterGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }

    public static final void drawHeartScatter(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, float f) {
        float fA00 = AXN.A00(at3);
        float fAh4 = at3.Ah4(HeartScatterSize);
        List<Float> list = AuraScatterKt.ScatterDx;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float fScatterStartMs = (f - AuraScatterKt.scatterStartMs(i)) / 640.0f;
            if (fScatterStartMs > 0.0f && fScatterStartMs < 1.0f) {
                long jM415scatterPointULxng0E = AuraScatterKt.m415scatterPointULxng0E(at3.ADU(), C8j4.A03(list, i), C8j4.A03(AuraScatterKt.ScatterApex, i), fScatterStartMs, fA00);
                float fA03 = C8j4.A03(AuraScatterKt.ScatterScales, i) * fAh4 * C8j3.A02(0.82f, 1.0f, fScatterStartMs);
                float fA032 = C8j4.A03(HeartScatterSpin, i) * fScatterStartMs * 57.295776f;
                InterfaceC1279AgP interfaceC1279AgPAEq = at3.AEq();
                AaI aaI = (AaI) interfaceC1279AgPAEq;
                AW9 aw9 = aaI.A02.A02;
                long jA00 = AW9.A00(aw9);
                try {
                    AT2 at2 = aaI.A01;
                    at2.Abq(fA032, jM415scatterPointULxng0E);
                    float f2 = fA03 / 2.0f;
                    at2.AhL(AnonymousClass003.A03(jM415scatterPointULxng0E) - f2, AnonymousClass004.A00(jM415scatterPointULxng0E) - f2);
                    try {
                        AuraReactionShapesKt.heartPath(interfaceC1068ATy, fA03);
                        C8j4.A1K(at3, interfaceC1068ATy, ATD.A03(AuraScatterKt.scatterAlpha(i, fScatterStartMs), 0.0f, 1.0f), C8j5.A0G(HeartScatterTint, i));
                    } finally {
                    }
                } finally {
                    AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
                }
            }
        }
    }
}
