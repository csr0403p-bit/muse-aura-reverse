package com.facebook.aura.skills.view.common;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C78N;
import X.InterfaceC8647Fhz;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.aura.vds.compose.image.AuraImageKt;

/* loaded from: classes.dex */
public abstract class HatchConnectorIconKt {
    public static final float ConnectorFallbackIconSize = 20.0f;
    public static final float ConnectorIconCornerRadius = 10.0f;
    public static final float ConnectorIconShadowAlpha = 0.08f;
    public static final float ConnectorIconShadowElevation = 3.0f;
    public static final float ConnectorIconSize = 32.0f;

    /* renamed from: ConnectorFallbackIcon-PZ-HvWI, reason: not valid java name */
    public static final void m2168ConnectorFallbackIconPZHvWI(int i, float f, long j, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-336407873);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A05(bfm, f);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0O(bfm, j);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            boolean z = (iA0D & 896) == 256;
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                C7196Ei8 c7196Ei8 = new C7196Ei8(C7197Ei9.A0P);
                c7196Ei8.A00(InterfaceC8647Fhz.A05);
                AuraImageKt.m2576auraTintColor4WTKRHQ(c7196Ei8, j);
                objAaT = new C7197Ei9(c7196Ei8);
                bfm.Ai0(objAaT);
            }
            AuraImageKt.AuraImage(new AuraDrawableSourceResource(i), C10G.A07(bRg2, f), null, (C7197Ei9) objAaT, false, false, null, false, null, bfm, 0, 500);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchConnectorIconKt$ConnectorFallbackIcon$1(i, f, j, bRg2, i2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* renamed from: ConnectorIcon-VRRgpyE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2169ConnectorIconVRRgpyE(java.lang.String r29, java.lang.Integer r30, X.BRg r31, float r32, float r33, int r34, float r35, X.B6A r36, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r37, X.BFM r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.view.common.HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(java.lang.String, java.lang.Integer, X.BRg, float, float, int, float, X.B6A, X.G0V, X.BFM, int, int):void");
    }
}
