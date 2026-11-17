package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginPrefetch", f = "NativeLoginPrefetch.kt", l = {185, 193, 194}, m = "accountInfo-BWLJW6A$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginPrefetch$accountInfo$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NativeLoginPrefetch this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginPrefetch$accountInfo$1(NativeLoginPrefetch nativeLoginPrefetch, HtJ<? super NativeLoginPrefetch$accountInfo$1> htJ) {
        super(htJ);
        this.this$0 = nativeLoginPrefetch;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1303xbd8257f5(null, null, null, this));
    }
}
