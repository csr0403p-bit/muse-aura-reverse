package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.C0Hi;
import X.C1518AkS;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.payments.cardvalidation.HatchCardNetworkKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$CcvCardFields$1$4$4$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ G0U<String, Unit> $onSecurityCodeChange;
    public final /* synthetic */ HatchCcvUiState $uiState;
    public final /* synthetic */ C1518AkS $zipFocus;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        HatchCcvUiState hatchCcvUiState = this.$uiState;
        int securityCodeLength = hatchCcvUiState.brand.getSecurityCodeLength();
        boolean z = HatchCardNetworkKt.digitsOnly(hatchCcvUiState.securityCode).length() >= securityCodeLength;
        this.$onSecurityCodeChange.invoke(str);
        if (z || HatchCardNetworkKt.digitsOnly(str).length() < securityCodeLength) {
            return;
        }
        if (this.$uiState.postalField != null) {
            C1518AkS.A00(this.$zipFocus);
        } else {
            this.$focusManager.A6G(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCcvCardEntryScreenKt$CcvCardFields$1$4$4$1(HatchCcvUiState hatchCcvUiState, G0U<? super String, Unit> g0u, C1518AkS c1518AkS, C0Hi c0Hi) {
        super(1);
        this.$uiState = hatchCcvUiState;
        this.$onSecurityCodeChange = g0u;
        this.$zipFocus = c1518AkS;
        this.$focusManager = c0Hi;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
