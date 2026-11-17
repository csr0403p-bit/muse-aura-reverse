package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.C3cI;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.intf.VoiceCallPhase;
import com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdate;
import com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SessionController$voiceControlHandler$1$applyCallAvatarUpdate$2 extends AbstractC7559F3s implements Function0<VoiceControlHandler.Result> {
    public final /* synthetic */ CallAvatarUpdate $update;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$voiceControlHandler$1$applyCallAvatarUpdate$2(SessionController sessionController, CallAvatarUpdate callAvatarUpdate) {
        super(0);
        this.this$0 = sessionController;
        this.$update = callAvatarUpdate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final VoiceControlHandler.Result invoke() {
        VoiceControlHandler.Result result;
        SessionController sessionController = this.this$0;
        ReentrantLock reentrantLock = sessionController.lock;
        CallAvatarUpdate callAvatarUpdate = this.$update;
        reentrantLock.lock();
        try {
            String strA0X = C3cI.A0X(sessionController);
            boolean zIsLiveAvatarUpdateEnabled = VoiceGating.INSTANCE.isLiveAvatarUpdateEnabled();
            if (!zIsLiveAvatarUpdateEnabled) {
                result = VoiceControlHandler.Result.UNSUPPORTED;
                SessionController.access$logCallAvatarUpdateReceived(sessionController, strA0X, callAvatarUpdate, zIsLiveAvatarUpdateEnabled, result);
            } else if (strA0X == null || C3cI.A0I(sessionController) == VoiceCallPhase.ENDED) {
                result = VoiceControlHandler.Result.NO_ACTIVE_CALL;
                SessionController.access$logCallAvatarUpdateReceived(sessionController, strA0X, callAvatarUpdate, zIsLiveAvatarUpdateEnabled, result);
            } else {
                String str = callAvatarUpdate.targetCallId;
                if (str == null || !str.equalsIgnoreCase(strA0X)) {
                    result = VoiceControlHandler.Result.STALE_CALL;
                    SessionController.access$logCallAvatarUpdateReceived(sessionController, strA0X, callAvatarUpdate, zIsLiveAvatarUpdateEnabled, result);
                } else {
                    result = VoiceControlHandler.Result.PERFORMED;
                    SessionController.access$logCallAvatarUpdateReceived(sessionController, strA0X, callAvatarUpdate, zIsLiveAvatarUpdateEnabled, result);
                    sessionController.applyCallAvatarUpdateLocked(strA0X, callAvatarUpdate);
                }
            }
            return result;
        } finally {
            reentrantLock.unlock();
        }
    }
}
