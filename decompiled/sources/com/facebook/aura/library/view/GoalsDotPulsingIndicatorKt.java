package com.facebook.aura.library.view;

import X.AEk;
import X.AbstractC1046ASq;
import X.AbstractC1052ASw;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C1041ASi;
import X.C1049ASt;
import X.C1050ASu;
import X.C10G;
import X.C1116Aaf;
import X.C78N;
import X.C79;
import X.G0U;

/* loaded from: classes4.dex */
public abstract class GoalsDotPulsingIndicatorKt {
    public static final float ContainerSize = 24.0f;
    public static final int ExpandMillis = 1400;
    public static final int FadeMillis = 700;
    public static final int HoldMillis = 1000;
    public static final float InnerDotSize = 6.0f;
    public static final float PulseBaseAlpha = 0.2f;
    public static final int PulseCycleMillis = 3100;
    public static final float PulseSeedScale = 0.25f;

    /* renamed from: GoalsDotPulsingIndicator-3J-VO9M, reason: not valid java name */
    public static final void m1157GoalsDotPulsingIndicator3JVO9M(long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(577415568);
        int iA0M = (i & 6) == 0 ? i | AnonymousClass004.A0M(bfm, j) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0M |= 48;
        } else if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0M), bfm, iA0M)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1049ASt c1049AStA01 = AbstractC1046ASq.A01(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = GoalsDotPulsingIndicatorKt$GoalsDotPulsingIndicator$scale$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            C1116Aaf c1116AafA00 = AbstractC1052ASw.A00((G0U) objAaT);
            Integer num = C79.A00;
            C1050ASu c1050ASuA00 = AbstractC1046ASq.A00(new C1041ASi(c1116AafA00, num, 0L), c1049AStA01, bfm, 0.25f, 1.0f);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = GoalsDotPulsingIndicatorKt$GoalsDotPulsingIndicator$pulseAlpha$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            C1050ASu c1050ASuA002 = AbstractC1046ASq.A00(new C1041ASi(AbstractC1052ASw.A00((G0U) objAaT2), num, 0L), c1049AStA01, bfm, 1.0f, 0.0f);
            BRg bRgA07 = C10G.A07(bRg2, ContainerSize);
            boolean zA1P = AnonymousClass003.A1P(bfm, c1050ASuA00, c1050ASuA002, AnonymousClass003.A1B(iA0M));
            Object objAaT3 = bfm.AaT();
            if (zA1P || objAaT3 == obj) {
                objAaT3 = new GoalsDotPulsingIndicatorKt$GoalsDotPulsingIndicator$1$1(j, c1050ASuA00, c1050ASuA002);
                BBI.A0T(bfm, objAaT3);
            }
            C01N.A07(bfm, AEk.A01(bRgA07, (G0U) objAaT3));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new GoalsDotPulsingIndicatorKt$GoalsDotPulsingIndicator$2(j, bRg2, i, i2);
        }
    }
}
