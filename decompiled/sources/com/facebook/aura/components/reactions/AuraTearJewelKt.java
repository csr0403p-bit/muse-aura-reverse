package com.facebook.aura.components.reactions;

import X.AEk;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C16a;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.InterfaceC1068ATy;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraTearJewelKt {
    public static final float GLINT_DELAY_MS = 500.0f;
    public static final float GlintSize = 6.5f;
    public static final float HIGHLIGHT_ALPHA = 0.95f;
    public static final long HighlightOffset;
    public static final float HighlightSize = 1.8f;
    public static final float JEWEL_SCALE_MS = 300.0f;
    public static final float ROLL_DELAY_MS = 120.0f;
    public static final float ROLL_LIFT = -3.0f;
    public static final float ROLL_MS = 420.0f;
    public static final int TEAR_JEWEL_TOTAL_MS = 800;
    public static final long TearColor;
    public static final float TearSize = 7.0f;
    public static final List<Float> JewelScales = C8j5.A0a(Float.valueOf(0.88f), Float.valueOf(1.05f), 1.0f);
    public static final long TearStart = (C8j3.A0P(7.0f) << 32) | (C8j3.A0P(2.0f) & 4294967295L);
    public static final long TearEnd = (C8j3.A0P(9.0f) << 32) | (C8j3.A0P(16.0f) & 4294967295L);

    public static final void drawRoll(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, float f) {
        float f2 = (f - 120.0f) / 420.0f;
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        float fA00 = AXN.A00(at3);
        float fEaseInOut = AuraReactionMotionKt.easeInOut(f2);
        float f3 = fA00 * (-3.0f);
        float fA01 = ATD.A01(f2);
        long jADU = at3.ADU();
        long jA03 = AWx.A03(TearStart, fA00, jADU);
        long jA032 = AWx.A03(TearEnd, fA00, jADU);
        AuraReactionMotionKt.m406drawReactionTearDrop6TbYsW0(at3, interfaceC1068ATy, AuraReactionMotionKt.m402curvePointAtjyLRC_s(jA03, jA032, f3, fEaseInOut), TearColor, at3.Ah4(TearSize), 1.0f - fA01);
        long jA02 = AWx.A02(HighlightOffset, fA00);
        long jA05 = AWx.A05(jA03, jA02);
        long jA052 = AWx.A05(jA032, jA02);
        long j = B6A.A08;
        float fAh4 = at3.Ah4(HighlightSize) / 2.0f;
        long jM402curvePointAtjyLRC_s = AuraReactionMotionKt.m402curvePointAtjyLRC_s(jA05, jA052, f3, fEaseInOut);
        at3.A9N(null, C16a.A00, fAh4, C8j3.A02(0.0f, 0.95f, fA01), 3, j, jM402curvePointAtjyLRC_s);
    }

    static {
        long j = B6A.A01;
        TearColor = 4285511925L << 32;
        HighlightOffset = (C8j3.A0P(-1.1f) << 32) | (C8j3.A0P(-1.2f) & 4294967295L);
    }

    public static final BRg auraTearJewel(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 800, bfm, C8j4.A0D(bRg, i));
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        InterfaceC1068ATy interfaceC1068ATy = (InterfaceC1068ATy) C8j4.A0o(bfm, objAaT, obj);
        boolean zA1M = AnonymousClass003.A1M(bfm, at5RememberBurstProgress, interfaceC1068ATy);
        Object objAaT2 = bfm.AaT();
        if (zA1M || objAaT2 == obj) {
            objAaT2 = new AuraTearJewelKt$auraTearJewel$1$1(at5RememberBurstProgress, interfaceC1068ATy);
            BBI.A0T(bfm, objAaT2);
        }
        return AEk.A00(bRg, objAaT2);
    }

    public static final BRg auraTearJewelGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 800, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraTearJewelKt$auraTearJewelGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
