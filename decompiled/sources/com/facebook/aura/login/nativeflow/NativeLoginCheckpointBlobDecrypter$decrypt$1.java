package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginCheckpointBlobDecrypter", f = "NativeLoginCheckpointContinuation.kt", l = {56, 97}, m = "decrypt-0E7RQCE", v = 2)
/* loaded from: classes3.dex */
public final class NativeLoginCheckpointBlobDecrypter$decrypt$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NativeLoginCheckpointBlobDecrypter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCheckpointBlobDecrypter$decrypt$1(NativeLoginCheckpointBlobDecrypter nativeLoginCheckpointBlobDecrypter, HtJ<? super NativeLoginCheckpointBlobDecrypter$decrypt$1> htJ) {
        super(htJ);
        this.this$0 = nativeLoginCheckpointBlobDecrypter;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1275decrypt0E7RQCE(null, null, this));
    }
}
