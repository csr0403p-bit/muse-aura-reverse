package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import com.facebook.aura.partners.voice.uicontrol.ReconnectVoiceCallRequest;
import com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SessionController$voiceControlHandler$1$reconnectCall$2 extends AbstractC7559F3s implements Function0<VoiceControlHandler.Result> {
    public final /* synthetic */ ReconnectVoiceCallRequest $request;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$voiceControlHandler$1$reconnectCall$2(SessionController sessionController, ReconnectVoiceCallRequest reconnectVoiceCallRequest) {
        super(0);
        this.this$0 = sessionController;
        this.$request = reconnectVoiceCallRequest;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final VoiceControlHandler.Result invoke() {
        return this.this$0.beginRtcRejoin(this.$request);
    }
}
