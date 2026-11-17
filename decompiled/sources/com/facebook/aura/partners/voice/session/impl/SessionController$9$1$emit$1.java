package com.facebook.aura.partners.voice.session.impl;

import X.HtJ;
import X.HzP;
import com.facebook.aura.gateway.AgentStatusPayload;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$9$1", f = "SessionController.kt", l = {6105}, m = "emit", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$9$1$emit$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SessionController.AnonymousClass9.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SessionController$9$1$emit$1(SessionController.AnonymousClass9.AnonymousClass1<? super T> anonymousClass1, HtJ<? super SessionController$9$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((AgentStatusPayload) null, (HtJ<? super Unit>) this);
    }
}
