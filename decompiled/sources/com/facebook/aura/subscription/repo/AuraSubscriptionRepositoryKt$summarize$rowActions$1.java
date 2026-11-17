package com.facebook.aura.subscription.repo;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes.dex */
public final class AuraSubscriptionRepositoryKt$summarize$rowActions$1 extends AbstractC7559F3s implements G0U<SubscriptionManagementCta, CharSequence> {
    public static final AuraSubscriptionRepositoryKt$summarize$rowActions$1 INSTANCE = new AuraSubscriptionRepositoryKt$summarize$rowActions$1();

    public AuraSubscriptionRepositoryKt$summarize$rowActions$1() {
        super(1);
    }

    @Override // X.G0U
    public final CharSequence invoke(SubscriptionManagementCta subscriptionManagementCta) {
        C7384Etj.A0Y(subscriptionManagementCta, 0);
        return subscriptionManagementCta.action.name();
    }
}
