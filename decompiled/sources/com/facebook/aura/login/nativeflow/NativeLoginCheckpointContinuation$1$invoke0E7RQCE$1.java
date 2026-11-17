package com.facebook.aura.login.nativeflow;

import X.HtJ;
import X.HzP;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$1", f = "NativeLoginCheckpointContinuation.kt", l = {24}, m = "invoke-0E7RQCE", v = 2)
/* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$1$invoke-0E7RQCE$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class NativeLoginCheckpointContinuation$1$invoke0E7RQCE$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NativeLoginCheckpointContinuation.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCheckpointContinuation$1$invoke0E7RQCE$1(NativeLoginCheckpointContinuation.AnonymousClass1 anonymousClass1, HtJ<? super NativeLoginCheckpointContinuation$1$invoke0E7RQCE$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}
