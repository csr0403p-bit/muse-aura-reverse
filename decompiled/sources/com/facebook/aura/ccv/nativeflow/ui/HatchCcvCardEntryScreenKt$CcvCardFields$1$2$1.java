package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.C1518AkS;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$CcvCardFields$1$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ C1518AkS $expiryFocus;
    public final /* synthetic */ G0U<String, Unit> $onCardNumberChange;
    public final /* synthetic */ HatchCcvUiState $uiState;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        boolean zIsPanComplete = HatchCcvCardEntryScreenKt.isPanComplete(this.$uiState.cardNumber);
        this.$onCardNumberChange.invoke(str);
        if (zIsPanComplete || !HatchCcvCardEntryScreenKt.isPanComplete(str)) {
            return;
        }
        C1518AkS.A00(this.$expiryFocus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCcvCardEntryScreenKt$CcvCardFields$1$2$1(HatchCcvUiState hatchCcvUiState, G0U<? super String, Unit> g0u, C1518AkS c1518AkS) {
        super(1);
        this.$uiState = hatchCcvUiState;
        this.$onCardNumberChange = g0u;
        this.$expiryFocus = c1518AkS;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
