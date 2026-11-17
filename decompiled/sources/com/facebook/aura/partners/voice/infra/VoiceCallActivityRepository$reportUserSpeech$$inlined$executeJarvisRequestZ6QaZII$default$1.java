package com.facebook.aura.partners.voice.infra;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportUserSpeech$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class VoiceCallActivityRepository$reportUserSpeech$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<UserSpeechRequestJson>> {
    public static final VoiceCallActivityRepository$reportUserSpeech$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new VoiceCallActivityRepository$reportUserSpeech$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public VoiceCallActivityRepository$reportUserSpeech$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<UserSpeechRequestJson> invoke() {
        return UserSpeechRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<UserSpeechRequestJson> invoke() {
        return UserSpeechRequestJson$$serializer.INSTANCE;
    }
}
