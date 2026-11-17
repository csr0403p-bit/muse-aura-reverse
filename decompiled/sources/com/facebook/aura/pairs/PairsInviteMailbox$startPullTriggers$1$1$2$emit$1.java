package com.facebook.aura.pairs;

import X.HtJ;
import X.HzP;
import com.facebook.aura.pairs.PairsInviteMailbox$startPullTriggers$1$1;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsInviteMailbox$startPullTriggers$1$1$2", f = "PairsInviteMailbox.kt", l = {74}, m = "emit", v = 2)
/* loaded from: classes3.dex */
public final class PairsInviteMailbox$startPullTriggers$1$1$2$emit$1 extends HzP {
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PairsInviteMailbox$startPullTriggers$1$1.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PairsInviteMailbox$startPullTriggers$1$1$2$emit$1(PairsInviteMailbox$startPullTriggers$1$1.AnonymousClass2<? super T> anonymousClass2, HtJ<? super PairsInviteMailbox$startPullTriggers$1$1$2$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(false, (HtJ<? super Unit>) this);
    }
}
