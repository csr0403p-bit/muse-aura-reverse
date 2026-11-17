package com.facebook.aura.ui;

import X.AXN;
import X.Am0;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C1743Apg;
import X.C1Ny;
import X.C3UC;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;

/* loaded from: classes.dex */
public abstract class BrowserScreenshotSizeKt {
    public static final BRg browserScreenshotSize(BRg bRg, float f, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        long jAuraLayoutContainerSize = AuraLayoutSizeKt.auraLayoutContainerSize(bfm, 0);
        AXN axn = (AXN) bfm.A6v(Am0.A04);
        C1Ny c1Ny = C1743Apg.A01(bfm).A0E;
        bfm.AgE(420186823);
        int iAbr = axn.Abr(AuraLayoutSizeKt.auraLayoutWidth(bfm, 0));
        BBI bbi = (BBI) bfm;
        BBI.A0R(bbi, false);
        bfm.AgE(420189096);
        int iAbr2 = axn.Abr(AuraLayoutSizeKt.auraLayoutHeight(bfm, 0));
        BBI.A0R(bbi, false);
        boolean zA1P = AnonymousClass003.A1P(bfm, c1Ny, axn, AnonymousClass002.A1S(bfm, iAbr2, bfm.A64(jAuraLayoutContainerSize), bfm.A63(iAbr))) | ((((i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) ^ 48) > 32 && bfm.A62(f)) || (i & 48) == 32);
        Object objAaT = bfm.AaT();
        if (zA1P || objAaT == C78N.A00) {
            objAaT = new BrowserScreenshotSizeKt$browserScreenshotSize$1$1(jAuraLayoutContainerSize, iAbr, iAbr2, c1Ny, axn, f);
            bfm.Ai0(objAaT);
        }
        return C3UC.A00(bRg, (G0W) objAaT);
    }
}
