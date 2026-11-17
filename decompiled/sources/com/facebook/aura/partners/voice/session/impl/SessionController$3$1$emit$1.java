package com.facebook.aura.partners.voice.session.impl;

import X.HtJ;
import X.HzP;
import com.facebook.aura.gateway.HatchGatewayStateSnapshot;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$3$1", f = "SessionController.kt", l = {6105}, m = "emit", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$3$1$emit$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SessionController.AnonymousClass3.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SessionController$3$1$emit$1(SessionController.AnonymousClass3.AnonymousClass1<? super T> anonymousClass1, HtJ<? super SessionController$3$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((HatchGatewayStateSnapshot) null, (HtJ<? super Unit>) this);
    }
}
