package com.facebook.aura.vds.compose.bottomsheet.wrapper;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BBI;
import X.BFM;
import X.C1743Apg;
import X.C1CH;
import X.C1DK;
import X.C1Ny;
import X.C1OP;
import X.C1OQ;
import X.G0V;

/* loaded from: classes.dex */
public final class AuraModalBottomSheetWrapperKt$AuraModalBottomSheetWrapper$3 extends AbstractC7559F3s implements G0V<BFM, Integer, C1Ny> {
    public final /* synthetic */ boolean $preventKeyboardResize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraModalBottomSheetWrapperKt$AuraModalBottomSheetWrapper$3(boolean z) {
        super(2);
        this.$preventKeyboardResize = z;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ C1Ny invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final C1Ny invoke(BFM bfm, int i) {
        C1Ny c1op;
        BBI bbi;
        boolean z;
        bfm.AgE(-316837536);
        if (this.$preventKeyboardResize) {
            bfm.AgE(1431122213);
            bbi = (BBI) bfm;
            z = false;
            BBI.A0R(bbi, false);
            c1op = new C1DK(0);
        } else {
            bfm.AgE(1431268161);
            c1op = new C1OP(new C1CH(new C1OQ(C1743Apg.A01(bfm).A0E, 32), new C1OQ(new C1OQ(C1743Apg.A01(bfm).A0E, 32), 32)), C1743Apg.A01(bfm).A02);
            bbi = (BBI) bfm;
            z = false;
            BBI.A0R(bbi, false);
        }
        BBI.A0R(bbi, z);
        return c1op;
    }
}
