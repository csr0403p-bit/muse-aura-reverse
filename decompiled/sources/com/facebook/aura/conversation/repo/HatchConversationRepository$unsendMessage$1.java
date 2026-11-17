package com.facebook.aura.conversation.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository", f = "HatchConversationRepository.kt", l = {5059}, m = "unsendMessage-0E7RQCE", v = 2)
/* loaded from: classes3.dex */
public final class HatchConversationRepository$unsendMessage$1 extends HzP {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchConversationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationRepository$unsendMessage$1(HatchConversationRepository hatchConversationRepository, HtJ<? super HatchConversationRepository$unsendMessage$1> htJ) {
        super(htJ);
        this.this$0 = hatchConversationRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m495unsendMessage0E7RQCE(null, null, this));
    }
}
