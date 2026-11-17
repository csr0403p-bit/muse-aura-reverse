package com.facebook.aura.localbrowser;

import X.HtJ;
import X.HzP;
import com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler;
import com.facebook.aura.pairs.PairsPendingLevelStoreKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1", f = "LocalBrowserEndpointNodeHandler.kt", l = {467}, m = PairsPendingLevelStoreKt.STATE_DROPPED, v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserEndpointNodeHandler$deferred$1$dropped$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalBrowserEndpointNodeHandler.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserEndpointNodeHandler$deferred$1$dropped$1(LocalBrowserEndpointNodeHandler.AnonymousClass1 anonymousClass1, HtJ<? super LocalBrowserEndpointNodeHandler$deferred$1$dropped$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.dropped(null, null, this);
    }
}
