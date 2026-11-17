package com.facebook.aura.network.transport.tigon;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$httpClient$1", f = "TigonScopedVmChannel.kt", l = {124}, m = "openDuplexStream", v = 2)
/* loaded from: classes5.dex */
public final class TigonScopedVmChannel$httpClient$1$openDuplexStream$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TigonScopedVmChannel$httpClient$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonScopedVmChannel$httpClient$1$openDuplexStream$1(TigonScopedVmChannel$httpClient$1 tigonScopedVmChannel$httpClient$1, HtJ<? super TigonScopedVmChannel$httpClient$1$openDuplexStream$1> htJ) {
        super(htJ);
        this.this$0 = tigonScopedVmChannel$httpClient$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.openDuplexStream(null, null, this);
    }
}
