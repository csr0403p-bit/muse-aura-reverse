package com.facebook.aura.login.nativeflow;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel", f = "NativeLoginViewModel.kt", l = {2511, 2513}, m = "retrySsoWithFreshToken-P62Ms4M", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$retrySsoWithFreshToken$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NativeLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$retrySsoWithFreshToken$1(NativeLoginViewModel nativeLoginViewModel, HtJ<? super NativeLoginViewModel$retrySsoWithFreshToken$1> htJ) {
        super(htJ);
        this.this$0 = nativeLoginViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m1319retrySsoWithFreshTokenP62Ms4M(null, null, null, null, null, null, this);
    }
}
