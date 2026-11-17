package com.facebook.aura.partners.voice.infra;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository$reset$$inlined$executeJarvisRequest-Z6QaZII$default$2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class VoiceOnboardingRepository$reset$$inlined$executeJarvisRequestZ6QaZII$default$2 extends AbstractC7559F3s implements Function0<C9hr<VoiceOnboardingStatusJson>> {
    public static final VoiceOnboardingRepository$reset$$inlined$executeJarvisRequestZ6QaZII$default$2 INSTANCE = new VoiceOnboardingRepository$reset$$inlined$executeJarvisRequestZ6QaZII$default$2();

    public VoiceOnboardingRepository$reset$$inlined$executeJarvisRequestZ6QaZII$default$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<VoiceOnboardingStatusJson> invoke() {
        return VoiceOnboardingStatusJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<VoiceOnboardingStatusJson> invoke() {
        return VoiceOnboardingStatusJson$$serializer.INSTANCE;
    }
}
