package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$rememberCurrentCallControlsPresentation$controlReveal$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$rememberCurrentCallControlsPresentation$controlReveal$1$1(VoiceAvatarFullScreenState voiceAvatarFullScreenState) {
        super(0);
        this.$fullScreen = voiceAvatarFullScreenState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$fullScreen.getProgress());
    }
}
