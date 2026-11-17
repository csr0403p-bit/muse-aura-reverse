package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$fullScreenCaption$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$fullScreenCaption$2$1(VoiceAvatarFullScreenState voiceAvatarFullScreenState) {
        super(0);
        this.$fullScreen = voiceAvatarFullScreenState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$fullScreen.getProgress() >= 1.0f);
    }
}
