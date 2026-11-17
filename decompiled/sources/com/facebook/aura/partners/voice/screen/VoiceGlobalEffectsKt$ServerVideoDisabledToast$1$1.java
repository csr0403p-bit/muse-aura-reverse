package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceGlobalEffectsKt$ServerVideoDisabledToast$1$1 extends AbstractC7559F3s implements G0U<Unit, Boolean> {
    public final /* synthetic */ VoiceCallStateHolder $voiceCallStateHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceGlobalEffectsKt$ServerVideoDisabledToast$1$1(VoiceCallStateHolder voiceCallStateHolder) {
        super(1);
        this.$voiceCallStateHolder = voiceCallStateHolder;
    }

    @Override // X.G0U
    public final Boolean invoke(Unit unit) {
        return this.$voiceCallStateHolder.isCallActive.getValue();
    }
}
