package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import X.G0V;

/* loaded from: classes5.dex */
public final class NoiseGatewayHatchWebSocketFactory$createScoped$2 extends AbstractC7559F3s implements G0V<String, String, String> {
    public final /* synthetic */ String $notaryToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoiseGatewayHatchWebSocketFactory$createScoped$2(String str) {
        super(2);
        this.$notaryToken = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ String invoke(String str, String str2) {
        return this.$notaryToken;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final String invoke2(String str, String str2) {
        return this.$notaryToken;
    }
}
