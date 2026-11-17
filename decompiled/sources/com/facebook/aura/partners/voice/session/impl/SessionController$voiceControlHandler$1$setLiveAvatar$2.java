package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.C3cI;
import X.C57m;
import com.facebook.aura.partners.voice.intf.VoiceCallPhase;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SessionController$voiceControlHandler$1$setLiveAvatar$2 extends AbstractC7559F3s implements Function0<VoiceControlHandler.Result> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$voiceControlHandler$1$setLiveAvatar$2(SessionController sessionController, boolean z) {
        super(0);
        this.this$0 = sessionController;
        this.$enabled = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final VoiceControlHandler.Result invoke() throws InterruptedException {
        VoiceControlHandler.Result result;
        SessionController sessionController = this.this$0;
        boolean z = this.$enabled;
        int i = sessionController.connectAttempt.get();
        sessionController.lock.lockInterruptibly();
        try {
            if (sessionController.controllerClosed.get()) {
                result = VoiceControlHandler.Result.NO_ACTIVE_CALL;
            } else if (i != sessionController.connectAttempt.get() || sessionController.voiceRestartInProgress) {
                result = VoiceControlHandler.Result.CALL_TRANSITIONING;
            } else {
                VoiceCallPhase voiceCallPhaseA0I = C3cI.A0I(sessionController);
                if (voiceCallPhaseA0I == VoiceCallPhase.ENDED) {
                    result = VoiceControlHandler.Result.NO_ACTIVE_CALL;
                } else {
                    C57m c57m = sessionController.currentSession;
                    if (c57m == null) {
                        result = voiceCallPhaseA0I == VoiceCallPhase.CONNECTING ? VoiceControlHandler.Result.CALL_TRANSITIONING : VoiceControlHandler.Result.NO_ACTIVE_CALL;
                    } else if (C57m.A00(c57m)) {
                        result = VoiceControlHandler.Result.CALL_TRANSITIONING;
                    } else {
                        VoicePrefs.INSTANCE.setLiveAvatarEnabled(sessionController.userSession, z);
                        result = VoiceControlHandler.Result.PERFORMED;
                    }
                }
            }
            return result;
        } finally {
            sessionController.lock.unlock();
        }
    }
}
