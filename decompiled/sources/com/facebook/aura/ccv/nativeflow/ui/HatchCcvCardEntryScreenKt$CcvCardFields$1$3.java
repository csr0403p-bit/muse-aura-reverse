package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$CcvCardFields$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HatchCcvUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryScreenKt$CcvCardFields$1$3(HatchCcvUiState hatchCcvUiState) {
        super(2);
        this.$uiState = hatchCcvUiState;
    }

    public final void invoke(BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            bfm.Afo();
        } else {
            HatchCcvUiState hatchCcvUiState = this.$uiState;
            HatchCcvCardEntryScreenKt.CardBrandMarks(hatchCcvUiState.brand, hatchCcvUiState.acceptedNetworks, null, bfm, 0, 4);
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
