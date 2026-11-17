package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoicePreConnectFailure;

/* loaded from: classes2.dex */
public final /* synthetic */ class VoiceGlobalEffectsKt$RetryableFailureToasts$2$1 extends C7438Evz implements G0U<VoicePreConnectFailure, Boolean> {
    public VoiceGlobalEffectsKt$RetryableFailureToasts$2$1(Object obj) {
        super(1, obj, VoiceCallStateHolder.class, "isPreConnectFailureNoticeCurrent", "isPreConnectFailureNoticeCurrent(Lcom/facebook/aura/partners/voice/intf/VoicePreConnectFailure;)Z", 0);
    }

    @Override // X.G0U
    public final Boolean invoke(VoicePreConnectFailure voicePreConnectFailure) {
        return Boolean.valueOf(((VoiceCallStateHolder) AnonymousClass006.A0o(voicePreConnectFailure, this)).isPreConnectFailureNoticeCurrent(voicePreConnectFailure));
    }
}
