package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cH;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$showLiveAvatarUpdateStatusLocked$job$1", f = "SessionController.kt", l = {4039}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$showLiveAvatarUpdateStatusLocked$job$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $callId;
    public final /* synthetic */ long $deadlineMs;
    public final /* synthetic */ int $markerKey;
    public int label;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$showLiveAvatarUpdateStatusLocked$job$1(long j, SessionController sessionController, String str, int i, HtJ<? super SessionController$showLiveAvatarUpdateStatusLocked$job$1> htJ) {
        super(2, htJ);
        this.$deadlineMs = j;
        this.this$0 = sessionController;
        this.$callId = str;
        this.$markerKey = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SessionController$showLiveAvatarUpdateStatusLocked$job$1(this.$deadlineMs, this.this$0, this.$callId, this.$markerKey, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            long jA04 = C3cH.A04(this.$deadlineMs);
            this.label = 1;
            if (C7Bq.A01(jA04, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        SessionController sessionController = this.this$0;
        ReentrantLock reentrantLock = sessionController.lock;
        String str = this.$callId;
        int i2 = this.$markerKey;
        reentrantLock.lock();
        try {
            sessionController.timeOutLiveAvatarUpdateLocked(str, i2);
            return Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SessionController$showLiveAvatarUpdateStatusLocked$job$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
