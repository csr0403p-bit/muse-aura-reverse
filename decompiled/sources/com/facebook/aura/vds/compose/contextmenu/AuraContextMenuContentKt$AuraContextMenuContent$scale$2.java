package com.facebook.aura.vds.compose.contextmenu;

import X.AOB;
import X.AOe;
import X.ASj;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C2HU;
import X.C7384Etj;
import X.G0W;

/* loaded from: classes.dex */
public final class AuraContextMenuContentKt$AuraContextMenuContent$scale$2 extends AbstractC7559F3s implements G0W<AOB<Boolean>, BFM, Integer, AOe<Float>> {
    public static final AuraContextMenuContentKt$AuraContextMenuContent$scale$2 INSTANCE = new AuraContextMenuContentKt$AuraContextMenuContent$scale$2();

    public AuraContextMenuContentKt$AuraContextMenuContent$scale$2() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AOe<Float> invoke(AOB<Boolean> aob, BFM bfm, Integer num) {
        return invoke(aob, bfm, AnonymousClass001.A0F(num));
    }

    public final AOe<Float> invoke(AOB<Boolean> aob, BFM bfm, int i) {
        ASj aSj;
        C7384Etj.A0Y(aob, 0);
        bfm.AgE(1731024224);
        if (aob.APD(false, AnonymousClass001.A0i())) {
            aSj = new ASj(C2HU.A03, 200, 0);
        } else {
            aSj = new ASj(C2HU.A01, 0, 0);
        }
        AnonymousClass001.A1D(bfm);
        return aSj;
    }
}
