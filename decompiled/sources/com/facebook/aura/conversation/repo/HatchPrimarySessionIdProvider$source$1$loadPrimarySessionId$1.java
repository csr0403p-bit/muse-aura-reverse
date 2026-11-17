package com.facebook.aura.conversation.repo;

import X.HtJ;
import X.HzP;
import com.facebook.aura.conversation.repo.HatchPrimarySessionIdProvider;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchPrimarySessionIdProvider$source$1", f = "HatchPrimarySessionIdProvider.kt", l = {19}, m = "loadPrimarySessionId", v = 2)
/* loaded from: classes3.dex */
public final class HatchPrimarySessionIdProvider$source$1$loadPrimarySessionId$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchPrimarySessionIdProvider.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPrimarySessionIdProvider$source$1$loadPrimarySessionId$1(HatchPrimarySessionIdProvider.AnonymousClass1 anonymousClass1, HtJ<? super HatchPrimarySessionIdProvider$source$1$loadPrimarySessionId$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadPrimarySessionId(this);
    }
}
