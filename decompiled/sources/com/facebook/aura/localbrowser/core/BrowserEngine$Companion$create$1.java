package com.facebook.aura.localbrowser.core;

import X.HtJ;
import X.HzP;
import com.facebook.aura.localbrowser.core.BrowserEngine;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngine$Companion", f = "BrowserEngine.kt", l = {133, 164}, m = "create", v = 2)
/* loaded from: classes2.dex */
public final class BrowserEngine$Companion$create$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BrowserEngine.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserEngine$Companion$create$1(BrowserEngine.Companion companion, HtJ<? super BrowserEngine$Companion$create$1> htJ) {
        super(htJ);
        this.this$0 = companion;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create(null, null, this);
    }
}
