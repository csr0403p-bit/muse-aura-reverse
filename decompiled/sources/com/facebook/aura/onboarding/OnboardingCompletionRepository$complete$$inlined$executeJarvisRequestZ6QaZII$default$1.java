package com.facebook.aura.onboarding;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.onboarding.OnboardingCompletionRepository$complete$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class OnboardingCompletionRepository$complete$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<OnboardingCompleteRequestJson>> {
    public static final OnboardingCompletionRepository$complete$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new OnboardingCompletionRepository$complete$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public OnboardingCompletionRepository$complete$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<OnboardingCompleteRequestJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = OnboardingCompleteRequestJson.$childSerializers;
        return OnboardingCompleteRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<OnboardingCompleteRequestJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = OnboardingCompleteRequestJson.$childSerializers;
        return OnboardingCompleteRequestJson$$serializer.INSTANCE;
    }
}
