package com.facebook.aura.login.nativeflow;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel", f = "NativeLoginViewModel.kt", l = {913}, m = "recentLandingSavedAccounts-YNEx5aM", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$recentLandingSavedAccounts$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NativeLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$recentLandingSavedAccounts$1(NativeLoginViewModel nativeLoginViewModel, HtJ<? super NativeLoginViewModel$recentLandingSavedAccounts$1> htJ) {
        super(htJ);
        this.this$0 = nativeLoginViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m1317recentLandingSavedAccountsYNEx5aM(null, this);
    }
}
