package com.facebook.aura.subscription.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$submitSubscriptionCallback$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AuraSubscriptionRepository$submitSubscriptionCallback$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<SubscriptionCallbackRequestJson>> {
    public static final AuraSubscriptionRepository$submitSubscriptionCallback$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new AuraSubscriptionRepository$submitSubscriptionCallback$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public AuraSubscriptionRepository$submitSubscriptionCallback$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<SubscriptionCallbackRequestJson> invoke() {
        return SubscriptionCallbackRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<SubscriptionCallbackRequestJson> invoke() {
        return SubscriptionCallbackRequestJson$$serializer.INSTANCE;
    }
}
