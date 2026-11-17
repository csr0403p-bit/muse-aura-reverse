package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$8$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ MutableState<Boolean> $isConfirmingName$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<Boolean, Unit> $onPurchaseConfirmed;
    public final /* synthetic */ MutableState<Boolean> $usesConfidentialVm$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$8$1(G0U<? super Boolean, Unit> g0u, AuraNavigator auraNavigator, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$onPurchaseConfirmed = g0u;
        this.$navigator = auraNavigator;
        this.$isConfirmingName$delegate = mutableState;
        this.$usesConfidentialVm$delegate = mutableState2;
    }

    public final void invoke(boolean z) {
        MutableState.A09(false, this.$isConfirmingName$delegate);
        if (!z) {
            this.$navigator.back();
        } else {
            AnonymousClass001.A1K(MutableState.A0A((MutableState) this.$usesConfidentialVm$delegate), this.$onPurchaseConfirmed);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
