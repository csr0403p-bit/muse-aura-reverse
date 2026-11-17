package com.facebook.aura.components.reactions;

import X.AEk;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AW9;
import X.AXN;
import X.AaI;
import X.AbstractC1826Arq;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C1868Asi;
import X.C1958Aux;
import X.C19U;
import X.C2KR;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.InterfaceC1279AgP;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraGlyphScatterKt {
    public static final long GlyphScatterSize = C19U.A03(10);

    public static final BRg auraGlyphScatter(BRg bRg, boolean z, String str, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, AuraScatterKt.SCATTER_TOTAL_MS, bfm, C8j3.A09(i));
        C1868Asi c1868AsiA00 = C2KR.A00(bfm, 0, 1);
        boolean zA1W = AnonymousClass002.A1W(bfm, c1868AsiA00, bfm.A67(at5RememberBurstProgress), (((i & 896) ^ 384) > 256 && bfm.A65(str)) || (i & 384) == 256);
        Object objAaT = bfm.AaT();
        if (zA1W || objAaT == C78N.A00) {
            objAaT = new AuraGlyphScatterKt$auraGlyphScatter$1$1(at5RememberBurstProgress, str, c1868AsiA00);
            BBI.A0T(bfm, objAaT);
        }
        return AEk.A00(bRg, objAaT);
    }

    public static final void drawGlyphScatter(AT3 at3, float f, C1958Aux c1958Aux) {
        float fA00 = AXN.A00(at3);
        long j = c1958Aux.A02;
        long jA0L = AnonymousClass005.A0L(((int) (j >> 32)) / 2.0f, ((int) (j & 4294967295L)) / 2.0f);
        List<Float> list = AuraScatterKt.ScatterDx;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float fScatterStartMs = (f - AuraScatterKt.scatterStartMs(i)) / 640.0f;
            if (fScatterStartMs > 0.0f && fScatterStartMs < 1.0f) {
                long jM415scatterPointULxng0E = AuraScatterKt.m415scatterPointULxng0E(at3.ADU(), C8j4.A03(list, i), C8j4.A03(AuraScatterKt.ScatterApex, i), fScatterStartMs, fA00);
                float fA03 = C8j4.A03(AuraScatterKt.ScatterScales, i) * C8j3.A02(0.82f, 1.0f, fScatterStartMs);
                InterfaceC1279AgP interfaceC1279AgPAEq = at3.AEq();
                AaI aaI = (AaI) interfaceC1279AgPAEq;
                AW9 aw9 = aaI.A02.A02;
                long jA00 = AW9.A00(aw9);
                try {
                    aaI.A01.Ac6(fA03, fA03, jM415scatterPointULxng0E);
                    AbstractC1826Arq.A00(at3, c1958Aux, ATD.A03(AuraScatterKt.scatterAlpha(i, fScatterStartMs), 0.0f, 1.0f), B6A.A07, AnonymousClass005.A0M(AnonymousClass001.A00(jM415scatterPointULxng0E) - AnonymousClass001.A00(jA0L), AnonymousClass001.A01(jM415scatterPointULxng0E, 4294967295L) - AnonymousClass001.A01(jA0L, 4294967295L)));
                } finally {
                    AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
                }
            }
        }
    }

    public static final BRg auraGlyphScatterGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, AuraScatterKt.SCATTER_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraGlyphScatterKt$auraGlyphScatterGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
