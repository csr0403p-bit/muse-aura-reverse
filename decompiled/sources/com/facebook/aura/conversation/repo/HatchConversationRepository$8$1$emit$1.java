package com.facebook.aura.conversation.repo;

import X.HtJ;
import X.HzP;
import com.facebook.aura.conversation.repo.HatchConversationRepository;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$8$1", f = "HatchConversationRepository.kt", l = {887}, m = "emit", v = 2)
/* loaded from: classes3.dex */
public final class HatchConversationRepository$8$1$emit$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchConversationRepository.AnonymousClass8.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationRepository$8$1$emit$1(HatchConversationRepository.AnonymousClass8.AnonymousClass1<? super T> anonymousClass1, HtJ<? super HatchConversationRepository$8$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((HatchGatewayConnectionState) null, (HtJ<? super Unit>) this);
    }
}
