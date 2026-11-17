package com.facebook.aura.onboarding;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.onboarding.OnboardingIntroApi$getVariants$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class OnboardingIntroApi$getVariants$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<OnboardingVariantsPayloadJson>> {
    public static final OnboardingIntroApi$getVariants$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new OnboardingIntroApi$getVariants$$inlined$executeJarvisRequest1iavgos$default$1();

    public OnboardingIntroApi$getVariants$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<OnboardingVariantsPayloadJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = OnboardingVariantsPayloadJson.$childSerializers;
        return OnboardingVariantsPayloadJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<OnboardingVariantsPayloadJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = OnboardingVariantsPayloadJson.$childSerializers;
        return OnboardingVariantsPayloadJson$$serializer.INSTANCE;
    }
}
