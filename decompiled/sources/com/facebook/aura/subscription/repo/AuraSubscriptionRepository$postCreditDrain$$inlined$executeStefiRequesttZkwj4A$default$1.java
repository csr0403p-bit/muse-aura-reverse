package com.facebook.aura.subscription.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postCreditDrain$$inlined$executeStefiRequest-tZkwj4A$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AuraSubscriptionRepository$postCreditDrain$$inlined$executeStefiRequesttZkwj4A$default$1 extends AbstractC7559F3s implements Function0<C9hr<CreditDrainRequestJson>> {
    public static final AuraSubscriptionRepository$postCreditDrain$$inlined$executeStefiRequesttZkwj4A$default$1 INSTANCE = new AuraSubscriptionRepository$postCreditDrain$$inlined$executeStefiRequesttZkwj4A$default$1();

    public AuraSubscriptionRepository$postCreditDrain$$inlined$executeStefiRequesttZkwj4A$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<CreditDrainRequestJson> invoke() {
        return CreditDrainRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<CreditDrainRequestJson> invoke() {
        return CreditDrainRequestJson$$serializer.INSTANCE;
    }
}
