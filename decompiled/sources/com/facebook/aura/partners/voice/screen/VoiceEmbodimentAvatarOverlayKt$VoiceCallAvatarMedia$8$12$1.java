package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$12$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ boolean $inSystemPip;
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$12$1(boolean z, VoiceAvatarTakeoverState voiceAvatarTakeoverState) {
        super(0);
        this.$inSystemPip = z;
        this.$takeoverState = voiceAvatarTakeoverState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$inSystemPip ? 0.0f : this.$takeoverState.fullScreen.getProgress() / 2.0f);
    }
}
