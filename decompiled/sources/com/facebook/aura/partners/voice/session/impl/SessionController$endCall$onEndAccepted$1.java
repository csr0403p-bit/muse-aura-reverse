package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SessionController$endCall$onEndAccepted$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $endReason;
    public final /* synthetic */ String $endSubReason;
    public final /* synthetic */ int $markerKey;
    public final /* synthetic */ Function0<Unit> $onAccepted;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$endCall$onEndAccepted$1(SessionController sessionController, String str, int i, String str2, Function0<Unit> function0) {
        super(0);
        this.this$0 = sessionController;
        this.$endReason = str;
        this.$markerKey = i;
        this.$endSubReason = str2;
        this.$onAccepted = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.connectionTracker.onCallEnded(this.$endReason, Integer.valueOf(this.$markerKey), this.$endSubReason);
        this.$onAccepted.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
