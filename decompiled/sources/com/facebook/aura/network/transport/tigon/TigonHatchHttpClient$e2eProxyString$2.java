package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TigonHatchHttpClient$e2eProxyString$2 extends AbstractC7559F3s implements Function0<String> {
    public final /* synthetic */ TigonHatchHttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonHatchHttpClient$e2eProxyString$2(TigonHatchHttpClient tigonHatchHttpClient) {
        super(0);
        this.this$0 = tigonHatchHttpClient;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String strInvoke = this.this$0.e2eProxyStringProvider.invoke();
        if (strInvoke.length() <= 0) {
            strInvoke = null;
        }
        return strInvoke;
    }
}
