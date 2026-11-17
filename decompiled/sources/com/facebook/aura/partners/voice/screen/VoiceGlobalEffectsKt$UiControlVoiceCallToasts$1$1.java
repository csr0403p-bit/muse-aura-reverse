package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceGlobalEffectsKt$UiControlVoiceCallToasts$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ VoiceCallStateHolder $voiceCallStateHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceGlobalEffectsKt$UiControlVoiceCallToasts$1$1(VoiceCallStateHolder voiceCallStateHolder) {
        super(0);
        this.$voiceCallStateHolder = voiceCallStateHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$voiceCallStateHolder.embodimentVideoSuppression.getValue().poorLink);
    }
}
