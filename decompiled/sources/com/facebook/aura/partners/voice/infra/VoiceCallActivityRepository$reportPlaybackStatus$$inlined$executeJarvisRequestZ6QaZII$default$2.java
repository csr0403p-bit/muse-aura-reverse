package com.facebook.aura.partners.voice.infra;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportPlaybackStatus$$inlined$executeJarvisRequest-Z6QaZII$default$2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class VoiceCallActivityRepository$reportPlaybackStatus$$inlined$executeJarvisRequestZ6QaZII$default$2 extends AbstractC7559F3s implements Function0<C9hr<PlaybackStatusResponseJson>> {
    public static final VoiceCallActivityRepository$reportPlaybackStatus$$inlined$executeJarvisRequestZ6QaZII$default$2 INSTANCE = new VoiceCallActivityRepository$reportPlaybackStatus$$inlined$executeJarvisRequestZ6QaZII$default$2();

    public VoiceCallActivityRepository$reportPlaybackStatus$$inlined$executeJarvisRequestZ6QaZII$default$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<PlaybackStatusResponseJson> invoke() {
        return PlaybackStatusResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<PlaybackStatusResponseJson> invoke() {
        return PlaybackStatusResponseJson$$serializer.INSTANCE;
    }
}
