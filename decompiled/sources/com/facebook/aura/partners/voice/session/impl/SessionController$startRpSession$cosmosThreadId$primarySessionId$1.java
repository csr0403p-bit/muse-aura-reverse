package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.api.PrimarySessionIds;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$startRpSession$cosmosThreadId$primarySessionId$1", f = "SessionController.kt", l = {3320}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$startRpSession$cosmosThreadId$primarySessionId$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public int label;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$startRpSession$cosmosThreadId$primarySessionId$1(SessionController sessionController, HtJ<? super SessionController$startRpSession$cosmosThreadId$primarySessionId$1> htJ) {
        super(2, htJ);
        this.this$0 = sessionController;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SessionController$startRpSession$cosmosThreadId$primarySessionId$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PrimarySessionIds primarySessionIds = PrimarySessionIds.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
            this.label = 1;
            obj = primarySessionIds.load(abstractC3358CGz, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return new SessionController$startRpSession$cosmosThreadId$primarySessionId$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
