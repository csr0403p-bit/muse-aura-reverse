package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import X.ESo;
import X.F0C;
import com.crossapp.tigonhttp.websocket.TigonHttpWebSocketClient;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TigonHatchWebSocket$client$2 extends AbstractC7559F3s implements Function0<TigonHttpWebSocketClient> {
    public static final TigonHatchWebSocket$client$2 INSTANCE = new TigonHatchWebSocket$client$2();

    public TigonHatchWebSocket$client$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final TigonHttpWebSocketClient invoke() {
        ESo eSo = TigonHttpWebSocketClient.Companion;
        return new TigonHttpWebSocketClient(F0C.A02());
    }
}
