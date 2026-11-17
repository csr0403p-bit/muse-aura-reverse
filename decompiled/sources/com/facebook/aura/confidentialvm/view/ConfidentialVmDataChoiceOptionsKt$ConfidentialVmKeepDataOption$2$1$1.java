package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C3U4;
import X.G0W;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConfidentialVmDataChoiceOptionsKt$ConfidentialVmKeepDataOption$2$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ String $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmDataChoiceOptionsKt$ConfidentialVmKeepDataOption$2$1$1(String str) {
        super(3);
        this.$it = str;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            ConfidentialVmDataChoiceOptionsKt.ConfidentialVmDataTransferTime(this.$it, C3U4.A04(BRg.A00, AuraDimensKt.SpacingMicroPlusNano), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
    }
}
