package com.facebook.aura.conversation.repo;

import X.HtJ;
import X.HzP;
import com.facebook.aura.conversation.repo.HatchConversationRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$13$1", f = "HatchConversationRepository.kt", l = {1036}, m = "emit", v = 2)
/* loaded from: classes3.dex */
public final class HatchConversationRepository$13$1$emit$1 extends HzP {
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchConversationRepository.AnonymousClass13.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationRepository$13$1$emit$1(HatchConversationRepository.AnonymousClass13.AnonymousClass1<? super T> anonymousClass1, HtJ<? super HatchConversationRepository$13$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(false, (HtJ<? super Unit>) this);
    }
}
