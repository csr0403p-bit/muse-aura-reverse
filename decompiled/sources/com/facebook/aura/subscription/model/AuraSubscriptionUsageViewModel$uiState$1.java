package com.facebook.aura.subscription.model;

import X.AnonymousClass001;
import X.F2X;
import X.G2k;
import X.HtJ;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;

/* loaded from: classes.dex */
public final /* synthetic */ class AuraSubscriptionUsageViewModel$uiState$1 extends F2X implements G2k {
    public static final AuraSubscriptionUsageViewModel$uiState$1 INSTANCE = new AuraSubscriptionUsageViewModel$uiState$1();

    public AuraSubscriptionUsageViewModel$uiState$1() {
        super(5, AuraSubscriptionUsageViewModelKt.class, "toUiState", "toUiState(Lcom/facebook/aura/subscription/repo/SubscriptionDetailsState;ZZZ)Lcom/facebook/aura/subscription/model/AuraSubscriptionUsageViewModel$UiState;", 5);
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return AuraSubscriptionUsageViewModelKt.toUiState((SubscriptionDetailsState) obj, AnonymousClass001.A1X(obj2), AnonymousClass001.A1X(obj3), AnonymousClass001.A1X(obj4));
    }

    public final Object invoke(SubscriptionDetailsState subscriptionDetailsState, boolean z, boolean z2, boolean z3, HtJ<? super AuraSubscriptionUsageViewModel.UiState> htJ) {
        return AuraSubscriptionUsageViewModelKt.toUiState(subscriptionDetailsState, z, z2, z3);
    }
}
