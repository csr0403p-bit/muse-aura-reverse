package com.facebook.aura.pairs;

import X.HtJ;
import X.HzP;
import com.facebook.aura.pairs.ConnectionsIdeaNamesProvider;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsIdeaNamesProvider$resolver$1", f = "ConnectionsIdeaNamesProvider.kt", l = {20}, m = "names", v = 2)
/* loaded from: classes3.dex */
public final class ConnectionsIdeaNamesProvider$resolver$1$names$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConnectionsIdeaNamesProvider.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsIdeaNamesProvider$resolver$1$names$1(ConnectionsIdeaNamesProvider.AnonymousClass1 anonymousClass1, HtJ<? super ConnectionsIdeaNamesProvider$resolver$1$names$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.names(null, this);
    }
}
