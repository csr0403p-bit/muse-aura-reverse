package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.C3cI;
import com.facebook.aura.partners.voice.intf.VoiceCallPhase;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.uicontrol.EndVoiceCallRequest;
import com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SessionController$voiceControlHandler$1$endCall$2 extends AbstractC7559F3s implements Function0<VoiceControlHandler.Result> {
    public final /* synthetic */ EndVoiceCallRequest $request;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$voiceControlHandler$1$endCall$2(SessionController sessionController, EndVoiceCallRequest endVoiceCallRequest) {
        super(0);
        this.this$0 = sessionController;
        this.$request = endVoiceCallRequest;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final VoiceControlHandler.Result invoke() {
        String strA0X = C3cI.A0X(this.this$0);
        if (C3cI.A0I(this.this$0) == VoiceCallPhase.ENDED) {
            return VoiceControlHandler.Result.NO_ACTIVE_CALL;
        }
        EndVoiceCallRequest endVoiceCallRequest = this.$request;
        String str = endVoiceCallRequest.targetCallId;
        if (str != null && !str.equalsIgnoreCase(strA0X)) {
            return VoiceControlHandler.Result.STALE_CALL;
        }
        VoiceCallStateHolder voiceCallStateHolder = this.this$0.voiceCallStateHolder;
        String str2 = endVoiceCallRequest.activeCallId;
        String str3 = endVoiceCallRequest.reason;
        if (str3 == null) {
            str3 = VoiceCallConnectionTracker.END_REASON_SERVER_ENDED;
        }
        voiceCallStateHolder.requestEndCall(str2, str, str3);
        return VoiceControlHandler.Result.PERFORMED;
    }
}
