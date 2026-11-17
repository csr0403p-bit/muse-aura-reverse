package com.facebook.aura.devices.link.ordering;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderEvent;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$observeSubscriptionActivation$1$event$1", f = "HatchLinkOrderViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchLinkOrderViewModel$observeSubscriptionActivation$1$event$1 extends AbstractC07127nr implements G0W<SubscriptionDetailsState, Boolean, HtJ<? super HatchLinkOrderEvent>, Object> {
    public final /* synthetic */ AuraSubscriptionRepository $subscriptionRepository;
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkOrderViewModel$observeSubscriptionActivation$1$event$1(AuraSubscriptionRepository auraSubscriptionRepository, HtJ<? super HatchLinkOrderViewModel$observeSubscriptionActivation$1$event$1> htJ) {
        super(3, htJ);
        this.$subscriptionRepository = auraSubscriptionRepository;
    }

    public final Object invoke(SubscriptionDetailsState subscriptionDetailsState, boolean z, HtJ<? super HatchLinkOrderEvent> htJ) {
        HatchLinkOrderViewModel$observeSubscriptionActivation$1$event$1 hatchLinkOrderViewModel$observeSubscriptionActivation$1$event$1 = new HatchLinkOrderViewModel$observeSubscriptionActivation$1$event$1(this.$subscriptionRepository, htJ);
        hatchLinkOrderViewModel$observeSubscriptionActivation$1$event$1.L$0 = subscriptionDetailsState;
        hatchLinkOrderViewModel$observeSubscriptionActivation$1$event$1.Z$0 = z;
        return hatchLinkOrderViewModel$observeSubscriptionActivation$1$event$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        SubscriptionDetailsState value = (SubscriptionDetailsState) this.L$0;
        boolean z = this.Z$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!z) {
            value = this.$subscriptionRepository.subscriptionDetailsState.getValue();
        }
        HatchLinkOrderRepository hatchLinkOrderRepository = HatchLinkOrderRepository.INSTANCE;
        if (hatchLinkOrderRepository.hasActivePaidSubscription(value)) {
            return new HatchLinkOrderEvent.SubscriptionActivated(hatchLinkOrderRepository.isTestEnvironment(value));
        }
        if (z) {
            return null;
        }
        return HatchLinkOrderEvent.ActivationTimedOut.INSTANCE;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(SubscriptionDetailsState subscriptionDetailsState, Boolean bool, HtJ<? super HatchLinkOrderEvent> htJ) {
        return invoke(subscriptionDetailsState, AnonymousClass001.A1X(bool), htJ);
    }
}
