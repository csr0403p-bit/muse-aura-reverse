package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0Yr;
import X.C78g;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$5$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isComplimentaryClaimCompleted;
    public final /* synthetic */ G0U<Boolean, Unit> $onPurchaseConfirmed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$5$1(boolean z, G0U<? super Boolean, Unit> g0u) {
        super(1);
        this.$isComplimentaryClaimCompleted = z;
        this.$onPurchaseConfirmed = g0u;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$isComplimentaryClaimCompleted) {
            AnonymousClass001.A1K(true, this.$onPurchaseConfirmed);
        }
        return new C78g() { // from class: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$5$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
