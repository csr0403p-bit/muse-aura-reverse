package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.C0Hi;
import X.C0Ou;
import X.C1518AkS;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$CcvCardFields$1$4$3$1 extends AbstractC7559F3s implements G0U<C0Ou, Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ HatchCcvUiState $uiState;
    public final /* synthetic */ C1518AkS $zipFocus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryScreenKt$CcvCardFields$1$4$3$1(HatchCcvUiState hatchCcvUiState, C1518AkS c1518AkS, C0Hi c0Hi) {
        super(1);
        this.$uiState = hatchCcvUiState;
        this.$zipFocus = c1518AkS;
        this.$focusManager = c0Hi;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0Ou c0Ou) {
        if (this.$uiState.postalField != null) {
            C1518AkS.A00(this.$zipFocus);
        } else {
            this.$focusManager.A6G(false);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0Ou c0Ou) {
        invoke2(c0Ou);
        return Unit.INSTANCE;
    }
}
