package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SessionController$15$1$1$ownership$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$15$1$1$ownership$1(SessionController sessionController) {
        super(0);
        this.this$0 = sessionController;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SessionController sessionController = this.this$0;
        sessionController.connectionTracker.onCallEnded(VoiceCallConnectionTracker.END_REASON_RESTART, Integer.valueOf(sessionController.currentMarkerKey), null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
