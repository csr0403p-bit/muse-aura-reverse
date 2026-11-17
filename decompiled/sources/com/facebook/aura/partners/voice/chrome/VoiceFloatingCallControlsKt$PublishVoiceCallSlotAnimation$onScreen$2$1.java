package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$PublishVoiceCallSlotAnimation$onScreen$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ VoiceCallSlotAnimation $animation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$PublishVoiceCallSlotAnimation$onScreen$2$1(VoiceCallSlotAnimation voiceCallSlotAnimation) {
        super(0);
        this.$animation = voiceCallSlotAnimation;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        VoiceCallSlotAnimation voiceCallSlotAnimation = this.$animation;
        return Boolean.valueOf(voiceCallSlotAnimation != null && (voiceCallSlotAnimation.getShowsCall() || this.$animation.getTurnShown()));
    }
}
