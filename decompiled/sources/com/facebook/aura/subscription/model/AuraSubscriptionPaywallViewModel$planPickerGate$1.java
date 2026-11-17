package com.facebook.aura.subscription.model;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.subscription.repo.SubscriptionDetails;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$planPickerGate$1", f = "AuraSubscriptionPaywallViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallViewModel$planPickerGate$1 extends AbstractC07127nr implements G0W<SubscriptionDetailsState, ComplimentarySubscriptionRedemptionState, HtJ<? super PlanPickerGateState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public AuraSubscriptionPaywallViewModel$planPickerGate$1(HtJ<? super AuraSubscriptionPaywallViewModel$planPickerGate$1> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final Object invoke(SubscriptionDetailsState subscriptionDetailsState, ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState, HtJ<? super PlanPickerGateState> htJ) {
        AuraSubscriptionPaywallViewModel$planPickerGate$1 auraSubscriptionPaywallViewModel$planPickerGate$1 = new AuraSubscriptionPaywallViewModel$planPickerGate$1(htJ);
        auraSubscriptionPaywallViewModel$planPickerGate$1.L$0 = subscriptionDetailsState;
        auraSubscriptionPaywallViewModel$planPickerGate$1.L$1 = complimentarySubscriptionRedemptionState;
        return auraSubscriptionPaywallViewModel$planPickerGate$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        SubscriptionDetailsState.Success success;
        SubscriptionDetailsState subscriptionDetailsState = (SubscriptionDetailsState) this.L$0;
        ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState = (ComplimentarySubscriptionRedemptionState) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        SubscriptionDetails subscriptionDetails = null;
        if ((subscriptionDetailsState instanceof SubscriptionDetailsState.Success) && (success = (SubscriptionDetailsState.Success) subscriptionDetailsState) != null) {
            subscriptionDetails = success.details;
        }
        return AuraSubscriptionPaywallViewModelKt.planPickerGateState(subscriptionDetails, complimentarySubscriptionRedemptionState);
    }
}
