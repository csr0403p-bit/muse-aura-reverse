package com.facebook.aura.components.reactions;

import X.AEk;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AXN;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.InterfaceC1068ATy;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraSingleTearKt {
    public static final float RIPPLE_DELAY_MS = 740.0f;
    public static final float RippleDrop = 1.0f;
    public static final float SINGLE_TEAR_ALPHA = 0.92f;
    public static final float SINGLE_TEAR_SCALE_MS = 280.0f;
    public static final int SINGLE_TEAR_TOTAL_MS = 1020;
    public static final float SingleTearSize = 5.8f;
    public static final float TEAR_CONVERGENCE = 0.35f;
    public static final float TEAR_FALL_DELAY_MS = 100.0f;
    public static final float TEAR_FALL_LIFT = -1.5f;
    public static final float TEAR_FALL_MS = 600.0f;
    public static final float TEAR_START_OFFSET = -5.5f;
    public static final float TEAR_VANISH_AT_MS = 680.0f;
    public static final float TEAR_VANISH_MS = 80.0f;
    public static final float TearFloor = 18.0f;
    public static final float TearTop = 2.0f;
    public static final List<Float> SingleTearScales = C8j5.A0a(C8j3.A0s(), Float.valueOf(1.06f), 1.0f);
    public static final long SingleTearColor = C8j3.A0U(4283410687L);

    /* renamed from: drawFallingTear-moWRBKg, reason: not valid java name */
    public static final void m419drawFallingTearmoWRBKg(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, float f, long j) {
        float f2 = (f - 100.0f) / 600.0f;
        if (f2 > 0.0f) {
            float fA03 = ATD.A03((f - 680.0f) / 80.0f, 0.0f, 1.0f);
            if (fA03 < 1.0f) {
                float fA00 = AXN.A00(at3);
                long jADU = at3.ADU();
                long jA0M = AnonymousClass005.A0M(AnonymousClass001.A00(jADU) + ((-5.5f) * fA00), AnonymousClass001.A01(jADU, 4294967295L) + at3.Ah4(TearTop));
                float f3 = fA00 * (-1.5f);
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                AuraReactionMotionKt.m406drawReactionTearDrop6TbYsW0(at3, interfaceC1068ATy, AuraReactionMotionKt.m402curvePointAtjyLRC_s(jA0M, j, f3, AuraReactionMotionKt.easeInOut(f2)), SingleTearColor, at3.Ah4(SingleTearSize), C8j3.A02(0.0f, 0.92f, fA03));
            }
        }
    }

    public static final BRg auraSingleTear(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, SINGLE_TEAR_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        InterfaceC1068ATy interfaceC1068ATy = (InterfaceC1068ATy) C8j4.A0o(bfm, objAaT, obj);
        boolean zA1M = AnonymousClass003.A1M(bfm, at5RememberBurstProgress, interfaceC1068ATy);
        Object objAaT2 = bfm.AaT();
        if (zA1M || objAaT2 == obj) {
            objAaT2 = new AuraSingleTearKt$auraSingleTear$1$1(at5RememberBurstProgress, interfaceC1068ATy);
            BBI.A0T(bfm, objAaT2);
        }
        return AEk.A00(bRg, objAaT2);
    }

    public static final BRg auraSingleTearGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, SINGLE_TEAR_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraSingleTearKt$auraSingleTearGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }

    public static final long landingPoint(AT3 at3, float f) {
        long jADU = at3.ADU();
        return AnonymousClass005.A0M(AnonymousClass001.A00(jADU) + (f * (-1.925f)), AnonymousClass001.A01(jADU, 4294967295L) + at3.Ah4(TearFloor));
    }
}
