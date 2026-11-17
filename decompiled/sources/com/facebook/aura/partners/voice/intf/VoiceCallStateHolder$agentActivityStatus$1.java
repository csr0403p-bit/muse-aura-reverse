package com.facebook.aura.partners.voice.intf;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.model.AgentActivityStatus;

/* loaded from: classes2.dex */
public final class VoiceCallStateHolder$agentActivityStatus$1 extends AbstractC7559F3s implements G0U<VoiceAgentActivity, AgentActivityStatus> {
    public static final VoiceCallStateHolder$agentActivityStatus$1 INSTANCE = new VoiceCallStateHolder$agentActivityStatus$1();

    public VoiceCallStateHolder$agentActivityStatus$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ AgentActivityStatus invoke(VoiceAgentActivity voiceAgentActivity) {
        VoiceAgentActivity voiceAgentActivity2 = voiceAgentActivity;
        C7384Etj.A0Y(voiceAgentActivity2, 0);
        return voiceAgentActivity2.status;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AgentActivityStatus invoke2(VoiceAgentActivity voiceAgentActivity) {
        C7384Etj.A0Y(voiceAgentActivity, 0);
        return voiceAgentActivity.status;
    }
}
