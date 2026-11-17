package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.composer.dictation.pcm.PcmDictation;
import com.facebook.aura.composer.dictation.pcm.PcmDictationStream;

/* loaded from: classes2.dex */
public final class SessionController$startPreConnectCaptionLocked$caption$1 extends AbstractC7559F3s implements G0U<String, PcmDictationStream> {
    public final /* synthetic */ SessionController this$0;

    @Override // X.G0U
    public final PcmDictationStream invoke(String str) {
        C7384Etj.A0Y(str, 0);
        PcmDictation pcmDictation = PcmDictation.INSTANCE;
        SessionController sessionController = this.this$0;
        return pcmDictation.start(sessionController.userSession, sessionController.context, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$startPreConnectCaptionLocked$caption$1(SessionController sessionController) {
        super(1);
        this.this$0 = sessionController;
    }
}
