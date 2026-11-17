package com.facebook.aura.ui;

import X.AGO;
import X.AKH;
import X.AXN;
import X.AbstractC1462AjV;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C3cG;
import X.C60K;
import X.C7384Etj;
import X.C78N;
import X.G0U;

/* loaded from: classes2.dex */
public abstract class HatchComposerGeometryKt {
    public static final AKH<HatchComposerGeometry> LocalHatchComposerGeometry = new AGO(HatchComposerGeometryKt$LocalHatchComposerGeometry$1.INSTANCE);

    public static final BRg trackHatchComposerClearance(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        HatchComposerGeometry hatchComposerGeometry = (HatchComposerGeometry) bfm.A6v(LocalHatchComposerGeometry);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = C3cG.A0T();
            bfm.Ai0(objAaT);
        }
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        bfm.AgE(-799780726);
        float fAgy = axnA0Y.Agy(AnonymousClass002.A09(((C60K) bfm.A6v(Am0.A0I)).AE1()));
        AnonymousClass001.A1D(bfm);
        boolean zA1J = AnonymousClass003.A1J(bfm, hatchComposerGeometry, objAaT);
        Object objAaT2 = bfm.AaT();
        if (zA1J || objAaT2 == obj) {
            objAaT2 = new HatchComposerGeometryKt$trackHatchComposerClearance$1$1(hatchComposerGeometry, objAaT);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A19(bfm, objAaT2, hatchComposerGeometry, objAaT);
        boolean zA1X = AnonymousClass005.A1X(bfm, axnA0Y, objAaT, bfm.A65(hatchComposerGeometry), bfm.A62(fAgy));
        Object objAaT3 = bfm.AaT();
        if (zA1X || objAaT3 == obj) {
            objAaT3 = new HatchComposerGeometryKt$trackHatchComposerClearance$2$1(hatchComposerGeometry, fAgy, axnA0Y, objAaT);
            bfm.Ai0(objAaT3);
        }
        return AbstractC1462AjV.A00(bRg, (G0U) objAaT3, 0L, 0L);
    }

    public static final AKH<HatchComposerGeometry> getLocalHatchComposerGeometry() {
        return LocalHatchComposerGeometry;
    }
}
