package com.facebook.aura.network.transport.tigon;

import X.AnonymousClass005;
import X.C20Q;
import X.C22I;
import X.C7384Etj;
import com.crossapp.tigonhttp.websocket.TigonHttpWebSocket;
import com.facebook.aura.network.transport.HatchWebSocketPreconnectTiming;
import com.facebook.aura.network.transport.HatchWebSocketSession;
import com.facebook.aura.network.transport.HatchWsEvent;
import com.facebook.aura.network.transport.HatchWsMessage;

/* loaded from: classes5.dex */
public final class TigonHatchWebSocketSession implements HatchWebSocketSession {
    public final C22I<HatchWsEvent> connectionEvents;
    public final C22I<HatchWsMessage> incomingMessages;
    public final TigonHttpWebSocket webSocket;

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public boolean send(String str) {
        C7384Etj.A0Y(str, 0);
        return this.webSocket.send(str);
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public boolean close(int i, String str) {
        TigonHttpWebSocket tigonHttpWebSocket = this.webSocket;
        if (str == null) {
            str = "";
        }
        boolean zClose = tigonHttpWebSocket.close(i, str);
        if (!zClose) {
            this.webSocket.cancel();
        }
        return zClose;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public /* bridge */ /* synthetic */ C20Q getConnectionEvents() {
        return this.connectionEvents;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public /* bridge */ /* synthetic */ C20Q getIncomingMessages() {
        return this.incomingMessages;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public /* bridge */ HatchWebSocketPreconnectTiming getPreconnectTiming() {
        return null;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public /* bridge */ String getRegionHint() {
        return null;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public /* bridge */ Long getTransportReadyTimestampNs() {
        return null;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public /* bridge */ Long getWebSocketUpgradeTimestampNs() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TigonHatchWebSocketSession(TigonHttpWebSocket tigonHttpWebSocket, C22I<? extends HatchWsMessage> c22i, C22I<? extends HatchWsEvent> c22i2) {
        AnonymousClass005.A0x(tigonHttpWebSocket, c22i, c22i2);
        this.webSocket = tigonHttpWebSocket;
        this.incomingMessages = c22i;
        this.connectionEvents = c22i2;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public C22I<HatchWsEvent> getConnectionEvents() {
        return this.connectionEvents;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public C22I<HatchWsMessage> getIncomingMessages() {
        return this.incomingMessages;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public boolean send(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return this.webSocket.send(bArr);
    }
}
