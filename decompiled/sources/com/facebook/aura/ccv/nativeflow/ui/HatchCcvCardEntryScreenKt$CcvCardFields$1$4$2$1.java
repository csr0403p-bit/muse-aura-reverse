package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.C1518AkS;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.payments.cardvalidation.HatchCardNetworkKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$CcvCardFields$1$4$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ G0U<String, Unit> $onExpiryChange;
    public final /* synthetic */ C1518AkS $securityCodeFocus;
    public final /* synthetic */ HatchCcvUiState $uiState;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        boolean z = HatchCardNetworkKt.digitsOnly(this.$uiState.expiry).length() >= 4;
        this.$onExpiryChange.invoke(str);
        if (z || HatchCardNetworkKt.digitsOnly(str).length() < 4) {
            return;
        }
        C1518AkS.A00(this.$securityCodeFocus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCcvCardEntryScreenKt$CcvCardFields$1$4$2$1(HatchCcvUiState hatchCcvUiState, G0U<? super String, Unit> g0u, C1518AkS c1518AkS) {
        super(1);
        this.$uiState = hatchCcvUiState;
        this.$onExpiryChange = g0u;
        this.$securityCodeFocus = c1518AkS;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
