package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStateReason;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SessionController$trackEmbodimentVisibility$5$reason$1 extends AbstractC7559F3s implements Function0<VoiceEmbodimentStateReason> {
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$trackEmbodimentVisibility$5$reason$1(SessionController sessionController) {
        super(0);
        this.this$0 = sessionController;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final VoiceEmbodimentStateReason invoke() {
        return this.this$0.voiceCallStateHolder.consumeEmbodimentStateReason();
    }
}
