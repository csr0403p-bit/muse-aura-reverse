package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C57m;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$job$1$ownsAudioCollection$1$1", f = "SessionController.kt", l = {1477}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$startCallInternal$job$1$ownsAudioCollection$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $audioGeneration;
    public final /* synthetic */ long $callAttemptGeneration;
    public final /* synthetic */ C57m $session;
    public int label;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$startCallInternal$job$1$ownsAudioCollection$1$1(SessionController sessionController, C57m c57m, int i, long j, HtJ<? super SessionController$startCallInternal$job$1$ownsAudioCollection$1$1> htJ) {
        super(2, htJ);
        this.this$0 = sessionController;
        this.$session = c57m;
        this.$audioGeneration = i;
        this.$callAttemptGeneration = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SessionController$startCallInternal$job$1$ownsAudioCollection$1$1(this.this$0, this.$session, this.$audioGeneration, this.$callAttemptGeneration, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            SessionController sessionController = this.this$0;
            C57m c57m = this.$session;
            int i2 = this.$audioGeneration;
            long j = this.$callAttemptGeneration;
            this.label = 1;
            if (sessionController.collectAudioLevels(c57m, i2, j, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SessionController$startCallInternal$job$1$ownsAudioCollection$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
