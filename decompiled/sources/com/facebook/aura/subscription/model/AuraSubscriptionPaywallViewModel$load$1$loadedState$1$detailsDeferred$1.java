package com.facebook.aura.subscription.model;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$load$1$loadedState$1$detailsDeferred$1", f = "AuraSubscriptionPaywallViewModel.kt", l = {342}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallViewModel$load$1$loadedState$1$detailsDeferred$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SubscriptionDetailsState>, Object> {
    public int label;
    public final /* synthetic */ AuraSubscriptionPaywallViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionPaywallViewModel$load$1$loadedState$1$detailsDeferred$1(AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, HtJ<? super AuraSubscriptionPaywallViewModel$load$1$loadedState$1$detailsDeferred$1> htJ) {
        super(2, htJ);
        this.this$0 = auraSubscriptionPaywallViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraSubscriptionPaywallViewModel$load$1$loadedState$1$detailsDeferred$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super SubscriptionDetailsState> htJ) {
        return new AuraSubscriptionPaywallViewModel$load$1$loadedState$1$detailsDeferred$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel = this.this$0;
            this.label = 1;
            obj = auraSubscriptionPaywallViewModel.cachedOrFetchedDetails(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }
}
