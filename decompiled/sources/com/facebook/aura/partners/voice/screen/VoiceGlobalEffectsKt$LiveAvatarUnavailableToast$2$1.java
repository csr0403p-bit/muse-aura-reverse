package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.CFK;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$2$1 extends AbstractC7559F3s implements G0U<Unit, Boolean> {
    public final /* synthetic */ VoiceCallStateHolder $voiceCallStateHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$2$1(VoiceCallStateHolder voiceCallStateHolder) {
        super(1);
        this.$voiceCallStateHolder = voiceCallStateHolder;
    }

    @Override // X.G0U
    public final Boolean invoke(Unit unit) {
        Boolean value = this.$voiceCallStateHolder.isCallActive.getValue();
        if (!value.booleanValue()) {
            CFK.A05(VoiceGlobalEffectsKt.TAG, "live_avatar.unavailable_toast decision=suppressed why=not_foreground");
        }
        return value;
    }
}
