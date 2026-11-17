package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt;

/* loaded from: classes4.dex */
public final class AuraSubscriptionSheetKt$PurchaseGate$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraSubscriptionRepository $repository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionSheetKt$PurchaseGate$1$1(AuraSubscriptionRepository auraSubscriptionRepository) {
        super(1);
        this.$repository = auraSubscriptionRepository;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$repository.m2262refreshIfStaleLRDsOJo(AuraSubscriptionRepositoryKt.DEFAULT_SUBSCRIPTION_FRESHNESS);
        return new C78g() { // from class: com.facebook.aura.subscription.view.AuraSubscriptionSheetKt$PurchaseGate$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
