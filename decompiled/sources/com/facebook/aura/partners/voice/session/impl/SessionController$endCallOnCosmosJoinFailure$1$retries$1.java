package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$endCallOnCosmosJoinFailure$1$retries$1", f = "SessionController.kt", l = {1613}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$endCallOnCosmosJoinFailure$1$retries$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $callId;
    public final /* synthetic */ long $generation;
    public final /* synthetic */ int $markerKey;
    public int label;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$endCallOnCosmosJoinFailure$1$retries$1(SessionController sessionController, String str, long j, int i, HtJ<? super SessionController$endCallOnCosmosJoinFailure$1$retries$1> htJ) {
        super(2, htJ);
        this.this$0 = sessionController;
        this.$callId = str;
        this.$generation = j;
        this.$markerKey = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SessionController$endCallOnCosmosJoinFailure$1$retries$1(this.this$0, this.$callId, this.$generation, this.$markerKey, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<HatchCallJoinContext.JoinRetry> c20qJoinRetries = this.this$0.joinContext.joinRetries(this.$callId, this.$generation);
            final SessionController sessionController = this.this$0;
            final int i2 = this.$markerKey;
            C20Z<? super HatchCallJoinContext.JoinRetry> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController$endCallOnCosmosJoinFailure$1$retries$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((HatchCallJoinContext.JoinRetry) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(HatchCallJoinContext.JoinRetry joinRetry, HtJ<? super Unit> htJ) {
                    sessionController.connectionTracker.point("cosmos_join_retry", C3cG.A0R(i2), true);
                    sessionController.connectionTracker.annotate("cosmos_join_retries", joinRetry.failedAttempt, C3cG.A0R(i2));
                    sessionController.connectionTracker.annotate("cosmos_join_retry_error_code", joinRetry.errorCode, C3cG.A0R(i2));
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c20qJoinRetries.collect(c20z, this) == enumC10460Hji) {
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
        return ((SessionController$endCallOnCosmosJoinFailure$1$retries$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
