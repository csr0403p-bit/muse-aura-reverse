package com.facebook.aura.localbrowser;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBlocklist$check$1", f = "LocalBrowserBlocklist.kt", l = {63}, m = "check", v = 2)
/* loaded from: classes4.dex */
public final class LocalBrowserBlocklist$check$1$check$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalBrowserBlocklist$check$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserBlocklist$check$1$check$1(LocalBrowserBlocklist$check$1 localBrowserBlocklist$check$1, HtJ<? super LocalBrowserBlocklist$check$1$check$1> htJ) {
        super(htJ);
        this.this$0 = localBrowserBlocklist$check$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.check(null, this);
    }
}
