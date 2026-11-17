package com.facebook.aura.subscription.view;

import X.C7438Evz;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$6$1 extends C7438Evz implements Function0<Unit> {
    public AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$6$1(Object obj) {
        super(0, obj, AuraSubscriptionPaywallViewModel.class, "dismissComplimentaryClaimFailure", "dismissComplimentaryClaimFailure()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AuraSubscriptionPaywallViewModel) this.receiver).dismissComplimentaryClaimFailure();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
