package com.facebook.aura.subscription.model;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$planPickerGate$2", f = "AuraSubscriptionPaywallViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallViewModel$planPickerGate$2 extends AbstractC07127nr implements G0V<C20Z<? super PlanPickerGateState>, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ AuraSubscriptionPaywallViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionPaywallViewModel$planPickerGate$2(AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, HtJ<? super AuraSubscriptionPaywallViewModel$planPickerGate$2> htJ) {
        super(2, htJ);
        this.this$0 = auraSubscriptionPaywallViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraSubscriptionPaywallViewModel$planPickerGate$2(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C20Z<? super PlanPickerGateState> c20z, HtJ<? super Unit> htJ) {
        return new AuraSubscriptionPaywallViewModel$planPickerGate$2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.this$0.repository.m2262refreshIfStaleLRDsOJo(AuraSubscriptionRepositoryKt.DEFAULT_SUBSCRIPTION_FRESHNESS);
        return Unit.INSTANCE;
    }
}
