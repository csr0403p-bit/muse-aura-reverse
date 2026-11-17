package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0Yr;
import X.C78g;
import X.G0U;
import X.G0V;
import com.facebook.aura.activation.data.ActivationState;
import com.facebook.aura.activation.model.AuraActivationViewModel;
import com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore;
import com.facebook.aura.deeplink.HatchDeeplinkHolder;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AuraActivationScreenKt$AuraActivationScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ G0V<Boolean, String, Unit> $onInviteStepChanged;
    public final /* synthetic */ HatchDeferredInviteCodeStore.PendingInviteCode $pendingManualInvite;
    public final /* synthetic */ AuraActivationViewModel.UiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraActivationScreenKt$AuraActivationScreen$1$1(G0V<? super Boolean, ? super String, Unit> g0v, AuraActivationViewModel.UiState uiState, HatchDeferredInviteCodeStore.PendingInviteCode pendingInviteCode) {
        super(1);
        this.$onInviteStepChanged = g0v;
        this.$uiState = uiState;
        this.$pendingManualInvite = pendingInviteCode;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        String str;
        G0V<Boolean, String, Unit> g0v = this.$onInviteStepChanged;
        ActivationState activationState = this.$uiState.activationState;
        ActivationState activationState2 = ActivationState.REQUEST_INVITE_CODE;
        Boolean boolValueOf = Boolean.valueOf(AnonymousClass002.A1Z(activationState, activationState2));
        HatchDeferredInviteCodeStore.PendingInviteCode pendingInviteCode = this.$pendingManualInvite;
        if (pendingInviteCode == null || (str = pendingInviteCode.code) == null) {
            str = "";
        }
        g0v.invoke(boolValueOf, str);
        HatchDeferredInviteCodeStore.PendingInviteCode pendingInviteCode2 = this.$pendingManualInvite;
        if (pendingInviteCode2 != null && this.$uiState.activationState == activationState2) {
            HatchDeeplinkHolder.INSTANCE.consumePendingInviteCode(pendingInviteCode2);
        }
        return new C78g() { // from class: com.facebook.aura.activation.view.AuraActivationScreenKt$AuraActivationScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
