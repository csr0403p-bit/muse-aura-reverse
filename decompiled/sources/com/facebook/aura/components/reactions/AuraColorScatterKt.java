package com.facebook.aura.components.reactions;

import X.AHD;
import X.AII;
import X.AIM;
import X.AT5;
import X.AnonymousClass001;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C60P;
import X.C78N;
import X.C8j4;
import X.HDi;
import X.HxS;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraColorScatterKt {
    public static final float ColorScatterDiscSize = 5.5f;
    public static final float DEEPEN_LUMA_CEILING = 0.7f;
    public static final float DEEPEN_TARGET_LUMA = 0.62f;
    public static final float LIFT_TOWARD_WHITE = 0.34f;
    public static final float SHADE_FACTOR = 0.74f;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraColorScatter(X.BRg r5, boolean r6, X.AHD<X.B6A> r7, X.BFM r8, int r9) {
        /*
            X.AnonymousClass003.A0v(r5, r7)
            int r1 = X.C8j3.A09(r9)
            r0 = 750(0x2ee, float:1.051E-42)
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
            com.facebook.aura.components.reactions.AuraColorScatterKt$auraColorScatter$1$1 r0 = new com.facebook.aura.components.reactions.AuraColorScatterKt$auraColorScatter$1$1
            r0.<init>(r4, r7)
            X.BBI.A0T(r8, r0)
        L38:
            X.BRg r0 = X.AEk.A00(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraColorScatterKt.auraColorScatter(X.BRg, boolean, X.AHD, X.BFM, int):X.BRg");
    }

    public static final BRg auraColorScatterGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, AuraScatterKt.SCATTER_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraColorScatterKt$auraColorScatterGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }

    /* renamed from: deepen-8_81llA, reason: not valid java name */
    public static final long m388deepen8_81llA(long j) {
        float fA03 = (B6A.A03(j) * 0.2126f) + (B6A.A02(j) * 0.7152f) + (B6A.A01(j) * 0.0722f);
        if (fA03 <= 0.7f) {
            return j;
        }
        float f = 0.62f / fA03;
        return HxS.A04(HDi.A0I, B6A.A03(j) * f, B6A.A02(j) * f, B6A.A01(j) * f, B6A.A00(j));
    }

    /* renamed from: lift-DxMtmZc, reason: not valid java name */
    public static final long m389liftDxMtmZc(long j, float f) {
        return HxS.A04(HDi.A0I, B6A.A03(j) + ((1.0f - B6A.A03(j)) * f), B6A.A02(j) + ((1.0f - B6A.A02(j)) * f), B6A.A01(j) + ((1.0f - B6A.A01(j)) * f), B6A.A00(j));
    }

    public static final List<B6A> scatterSwatches(AHD<B6A> ahd) {
        AII aiiA17 = AIM.A17();
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            long j = ((B6A) it.next()).A00;
            aiiA17.add(C60P.A04(m388deepen8_81llA(j)));
            aiiA17.add(C60P.A04(m389liftDxMtmZc(j, 0.34f)));
            aiiA17.add(C60P.A04(m390shadeDxMtmZc(j, 0.74f)));
        }
        return AIM.A18(aiiA17);
    }

    /* renamed from: shade-DxMtmZc, reason: not valid java name */
    public static final long m390shadeDxMtmZc(long j, float f) {
        return HxS.A04(HDi.A0I, B6A.A03(j) * f, B6A.A02(j) * f, B6A.A01(j) * f, B6A.A00(j));
    }
}
