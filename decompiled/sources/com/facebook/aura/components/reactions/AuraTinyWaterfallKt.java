package com.facebook.aura.components.reactions;

import X.AEk;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AXN;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.InterfaceC1068ATy;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraTinyWaterfallKt {
    public static final float RIPPLE_DELAY_MS = 520.0f;
    public static final float RippleDrop = 1.0f;
    public static final float TEAR_CONVERGENCE = 0.35f;
    public static final float TEAR_FALL_DELAY_MS = 100.0f;
    public static final float TEAR_FALL_LIFT = -1.5f;
    public static final float TEAR_FALL_MS = 380.0f;
    public static final float TEAR_STAGGER_MS = 100.0f;
    public static final float TEAR_VANISH_AT_MS = 460.0f;
    public static final float TEAR_VANISH_MS = 80.0f;
    public static final float TearFloor = 18.0f;
    public static final float TearTop = 2.0f;
    public static final float WATERFALL_SCALE_MS = 280.0f;
    public static final float WATERFALL_TEAR_ALPHA = 0.92f;
    public static final int WATERFALL_TOTAL_MS = 800;
    public static final List<Float> WaterfallScales = C8j4.A12(C8j3.A0s(), Float.valueOf(1.06f), C8j3.A0t());
    public static final List<Float> TearStartOffsets = Arrays.asList(Float.valueOf(-5.5f), Float.valueOf(6.0f));
    public static final List<C1DG> TearSizes = Arrays.asList(C8j3.A0k(5.8f), C8j3.A0k(5.2f));
    public static final long WaterfallColor = C8j3.A0U(4283410687L);

    public static final void drawFallingTears(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, float f) {
        float fA00 = AXN.A00(at3);
        float fA002 = AnonymousClass004.A00(at3.ADU()) + at3.Ah4(TearFloor);
        List<Float> list = TearStartOffsets;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float f2 = i * 100.0f;
            float f3 = ((f - 100.0f) - f2) / 380.0f;
            if (f3 > 0.0f) {
                float fA03 = ATD.A03(((f - 460.0f) - f2) / 80.0f, 0.0f, 1.0f);
                if (fA03 < 1.0f) {
                    float fA032 = C8j4.A03(list, i);
                    long jADU = at3.ADU();
                    AuraReactionMotionKt.m406drawReactionTearDrop6TbYsW0(at3, interfaceC1068ATy, AuraReactionMotionKt.m402curvePointAtjyLRC_s(AnonymousClass005.A0M(AnonymousClass001.A00(jADU) + (fA032 * fA00), AnonymousClass001.A01(jADU, 4294967295L) + at3.Ah4(TearTop)), AnonymousClass005.A0L(AnonymousClass001.A00(at3.ADU()) + (fA032 * 0.35f * fA00), fA002), fA00 * (-1.5f), AuraReactionMotionKt.easeInOut(f3 <= 1.0f ? f3 : 1.0f)), WaterfallColor, at3.Ah4(TearSizes.get(i).A00), C8j3.A02(0.0f, 0.92f, fA03));
                }
            }
        }
    }

    public static final BRg auraTinyWaterfall(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 800, bfm, C8j4.A0D(bRg, i));
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        InterfaceC1068ATy interfaceC1068ATy = (InterfaceC1068ATy) C8j4.A0o(bfm, objAaT, obj);
        boolean zA1M = AnonymousClass003.A1M(bfm, at5RememberBurstProgress, interfaceC1068ATy);
        Object objAaT2 = bfm.AaT();
        if (zA1M || objAaT2 == obj) {
            objAaT2 = new AuraTinyWaterfallKt$auraTinyWaterfall$1$1(at5RememberBurstProgress, interfaceC1068ATy);
            BBI.A0T(bfm, objAaT2);
        }
        return AEk.A00(bRg, objAaT2);
    }

    public static final BRg auraTinyWaterfallGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 800, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraTinyWaterfallKt$auraTinyWaterfallGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
