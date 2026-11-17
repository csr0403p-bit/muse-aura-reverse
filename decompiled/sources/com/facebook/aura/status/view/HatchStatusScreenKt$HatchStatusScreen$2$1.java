package com.facebook.aura.status.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt;

/* loaded from: classes.dex */
public final class HatchStatusScreenKt$HatchStatusScreen$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusScreenKt$HatchStatusScreen$2$1(AbstractC3358CGz abstractC3358CGz) {
        super(1);
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        AuraSubscriptionRepository.Companion.getInstance(this.$userSession).m2262refreshIfStaleLRDsOJo(AuraSubscriptionRepositoryKt.DEFAULT_SUBSCRIPTION_FRESHNESS);
        return new C78g() { // from class: com.facebook.aura.status.view.HatchStatusScreenKt$HatchStatusScreen$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
