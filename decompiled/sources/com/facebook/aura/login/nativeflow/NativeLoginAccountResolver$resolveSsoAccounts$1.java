package com.facebook.aura.login.nativeflow;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginAccountResolver", f = "NativeLoginAccountResolver.kt", l = {192}, m = "resolveSsoAccounts$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api", v = 2)
/* loaded from: classes5.dex */
public final class NativeLoginAccountResolver$resolveSsoAccounts$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NativeLoginAccountResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginAccountResolver$resolveSsoAccounts$1(NativeLoginAccountResolver nativeLoginAccountResolver, HtJ<? super NativeLoginAccountResolver$resolveSsoAccounts$1> htJ) {
        super(htJ);
        this.this$0 = nativeLoginAccountResolver;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.resolveSsoAccounts$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(null, null, null, null, this);
    }
}
