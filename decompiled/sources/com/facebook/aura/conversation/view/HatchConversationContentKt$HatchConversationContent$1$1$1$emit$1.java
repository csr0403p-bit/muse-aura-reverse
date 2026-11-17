package com.facebook.aura.conversation.view;

import X.HtJ;
import X.HzP;
import com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$1$1;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$1$1$1", f = "HatchConversationContent.kt", l = {239}, m = "emit", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$1$1$1$emit$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchConversationContentKt$HatchConversationContent$1$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationContentKt$HatchConversationContent$1$1$1$emit$1(HatchConversationContentKt$HatchConversationContent$1$1.AnonymousClass1<? super T> anonymousClass1, HtJ<? super HatchConversationContentKt$HatchConversationContent$1$1$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((String) null, (HtJ<? super Unit>) this);
    }
}
