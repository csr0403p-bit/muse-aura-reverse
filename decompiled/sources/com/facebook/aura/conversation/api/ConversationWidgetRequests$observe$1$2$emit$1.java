package com.facebook.aura.conversation.api;

import X.HtJ;
import X.HzP;
import com.facebook.aura.conversation.api.ConversationWidgetRequests;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationWidgetRequests$observe$1$2", f = "ConversationWidgetRequests.kt", l = {63}, m = "emit", v = 2)
/* loaded from: classes2.dex */
public final class ConversationWidgetRequests$observe$1$2$emit$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConversationWidgetRequests.C113401.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationWidgetRequests$observe$1$2$emit$1(ConversationWidgetRequests.C113401.AnonymousClass2<? super T> anonymousClass2, HtJ<? super ConversationWidgetRequests$observe$1$2$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((List<ConversationWidgetRequests.PendingRequest>) null, (HtJ<? super Unit>) this);
    }
}
