package com.facebook.aura.browsertask.control;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.browsertask.control.BrowserTaskControlTransport", f = "BrowserTaskControlTransport.kt", l = {25}, m = "takeover-0E7RQCE", v = 2)
/* loaded from: classes6.dex */
public final class BrowserTaskControlTransport$takeover$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BrowserTaskControlTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserTaskControlTransport$takeover$1(BrowserTaskControlTransport browserTaskControlTransport, HtJ<? super BrowserTaskControlTransport$takeover$1> htJ) {
        super(htJ);
        this.this$0 = browserTaskControlTransport;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m299takeover0E7RQCE(null, null, this));
    }
}
