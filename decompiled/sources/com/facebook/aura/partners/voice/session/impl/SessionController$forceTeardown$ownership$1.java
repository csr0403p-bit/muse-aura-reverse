package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SessionController$forceTeardown$ownership$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $markerKey;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$forceTeardown$ownership$1(SessionController sessionController, int i) {
        super(0);
        this.this$0 = sessionController;
        this.$markerKey = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.connectionTracker.onCallEnded(VoiceCallConnectionTracker.END_REASON_TEARDOWN, Integer.valueOf(this.$markerKey), null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
