package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$11$1$5$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<Boolean, Unit> $onPurchaseConfirmed;
    public final /* synthetic */ String $purchaseToast;
    public final /* synthetic */ G0U<String, Unit> $showDismissToast;
    public final /* synthetic */ MutableState<Boolean> $usesConfidentialVm$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$11$1$5$5$1(String str, G0U<? super String, Unit> g0u, G0U<? super Boolean, Unit> g0u2, MutableState<Boolean> mutableState) {
        super(0);
        this.$purchaseToast = str;
        this.$showDismissToast = g0u;
        this.$onPurchaseConfirmed = g0u2;
        this.$usesConfidentialVm$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str = this.$purchaseToast;
        if (str != null) {
            this.$showDismissToast.invoke(str);
        }
        AnonymousClass001.A1K(MutableState.A0A((MutableState) this.$usesConfidentialVm$delegate), this.$onPurchaseConfirmed);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
