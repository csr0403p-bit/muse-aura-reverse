package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import com.facebook.aura.network.transport.HatchAuthScheme;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TigonTransportFactory$metaBearerWebSocket$2 extends AbstractC7559F3s implements Function0<TigonHatchWebSocket> {
    public static final TigonTransportFactory$metaBearerWebSocket$2 INSTANCE = new TigonTransportFactory$metaBearerWebSocket$2();

    public TigonTransportFactory$metaBearerWebSocket$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final TigonHatchWebSocket invoke() {
        return new TigonHatchWebSocket(HatchAuthScheme.META_BEARER);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ TigonHatchWebSocket invoke() {
        return new TigonHatchWebSocket(HatchAuthScheme.META_BEARER);
    }
}
