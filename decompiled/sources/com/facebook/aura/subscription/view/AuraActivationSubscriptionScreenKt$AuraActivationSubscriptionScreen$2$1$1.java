package com.facebook.aura.subscription.view;

import X.C7438Evz;
import com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class AuraActivationSubscriptionScreenKt$AuraActivationSubscriptionScreen$2$1$1 extends C7438Evz implements Function0<Unit> {
    public AuraActivationSubscriptionScreenKt$AuraActivationSubscriptionScreen$2$1$1(Object obj) {
        super(0, obj, AuraActivationPlanFinishViewModel.class, "loadPage", "loadPage()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AuraActivationPlanFinishViewModel) this.receiver).loadPage();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
