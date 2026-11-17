package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel", f = "NativeLoginViewModel.kt", l = {1999}, m = "requestCrossAppRemoval-BWLJW6A", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$requestCrossAppRemoval$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NativeLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$requestCrossAppRemoval$1(NativeLoginViewModel nativeLoginViewModel, HtJ<? super NativeLoginViewModel$requestCrossAppRemoval$1> htJ) {
        super(htJ);
        this.this$0 = nativeLoginViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1318requestCrossAppRemovalBWLJW6A(null, null, null, this));
    }
}
