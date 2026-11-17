package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.C10543Hqv;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SessionController$endCallOnFailure$ownership$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $endReason;
    public final /* synthetic */ C10543Hqv<Long> $failedAtElapsedRealtimeMs;
    public final /* synthetic */ boolean $genericFailureNotice;
    public final /* synthetic */ SessionController.CallMarkerState $marker;
    public final /* synthetic */ int $markerKey;
    public final /* synthetic */ C10543Hqv<SessionController.CapturedUndeliveredSpeech> $speech;
    public final /* synthetic */ String $subReason;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$endCallOnFailure$ownership$1(boolean z, C10543Hqv<Long> c10543Hqv, SessionController sessionController, String str, C10543Hqv<SessionController.CapturedUndeliveredSpeech> c10543Hqv2, SessionController.CallMarkerState callMarkerState, int i, String str2) {
        super(0);
        this.$genericFailureNotice = z;
        this.$failedAtElapsedRealtimeMs = c10543Hqv;
        this.this$0 = sessionController;
        this.$endReason = str;
        this.$speech = c10543Hqv2;
        this.$marker = callMarkerState;
        this.$markerKey = i;
        this.$subReason = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Long] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$genericFailureNotice) {
            this.$failedAtElapsedRealtimeMs.element = this.this$0.preConnectFailureTimeLocked(this.$endReason);
        }
        C10543Hqv<SessionController.CapturedUndeliveredSpeech> c10543Hqv = this.$speech;
        SessionController.CallMarkerState callMarkerState = this.$marker;
        c10543Hqv.element = callMarkerState != null ? this.this$0.takeUndeliveredSpeechLocked(callMarkerState, this.$endReason, this.$markerKey) : 0;
        this.this$0.connectionTracker.onCallEnded(this.$endReason, Integer.valueOf(this.$markerKey), this.$subReason);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
