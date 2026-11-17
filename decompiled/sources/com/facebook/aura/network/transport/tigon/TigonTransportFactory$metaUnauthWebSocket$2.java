package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import com.facebook.aura.network.transport.HatchAuthScheme;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TigonTransportFactory$metaUnauthWebSocket$2 extends AbstractC7559F3s implements Function0<TigonHatchWebSocket> {
    public static final TigonTransportFactory$metaUnauthWebSocket$2 INSTANCE = new TigonTransportFactory$metaUnauthWebSocket$2();

    public TigonTransportFactory$metaUnauthWebSocket$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final TigonHatchWebSocket invoke() {
        return new TigonHatchWebSocket(HatchAuthScheme.META_UNAUTH);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ TigonHatchWebSocket invoke() {
        return new TigonHatchWebSocket(HatchAuthScheme.META_UNAUTH);
    }
}
