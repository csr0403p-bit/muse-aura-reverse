package com.facebook.aura.subscription.view;

import X.C7438Evz;
import X.G0U;
import X.HtJ;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;

/* loaded from: classes.dex */
public final /* synthetic */ class AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$8$1$1$ok$1 extends C7438Evz implements G0U {
    public AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$8$1$1$ok$1(Object obj) {
        super(1, obj, AuraSubscriptionUsageViewModel.class, "cancelSubscription", "cancelSubscription(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Boolean> htJ) {
        return ((AuraSubscriptionUsageViewModel) this.receiver).cancelSubscription(htJ);
    }
}
