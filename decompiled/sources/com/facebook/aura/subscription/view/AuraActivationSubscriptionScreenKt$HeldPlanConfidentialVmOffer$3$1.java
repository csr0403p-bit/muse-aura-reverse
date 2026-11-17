package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraActivationSubscriptionScreenKt$HeldPlanConfidentialVmOffer$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0V<Boolean, HatchComponent, Unit> $finishActivation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraActivationSubscriptionScreenKt$HeldPlanConfidentialVmOffer$3$1(G0V<? super Boolean, ? super HatchComponent, Unit> g0v) {
        super(0);
        this.$finishActivation = g0v;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$finishActivation.invoke(AnonymousClass001.A0i(), HatchComponent.TRY_IT_BUTTON);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
