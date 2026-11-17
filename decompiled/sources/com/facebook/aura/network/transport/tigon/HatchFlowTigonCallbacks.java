package com.facebook.aura.network.transport.tigon;

import X.AGH;
import X.AbstractC10395HbC;
import X.AnonymousClass003;
import X.C3Em;
import X.C4256CrU;
import X.C7384Etj;
import com.facebook.aura.network.transport.HatchWsEvent;
import com.facebook.aura.network.transport.HatchWsFailure;
import com.facebook.aura.network.transport.HatchWsMessage;
import java.util.Map;

/* loaded from: classes5.dex */
public final class HatchFlowTigonCallbacks extends AbstractC10395HbC {
    public final C3Em<HatchWsEvent> connectionEvents;
    public final C3Em<HatchWsMessage> incomingMessages;

    @Override // X.AbstractC10395HbC
    public void onClosed(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.connectionEvents.AhV(new HatchWsEvent.Closed(i, str));
    }

    @Override // X.AbstractC10395HbC
    public void onClosing(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.connectionEvents.AhV(new HatchWsEvent.Closing(i, str));
    }

    @Override // X.AbstractC10395HbC
    public void onFailure(String str, C4256CrU c4256CrU) {
        Integer numValueOf;
        Map mapA0E;
        C7384Etj.A0Y(str, 0);
        C3Em<HatchWsEvent> c3Em = this.connectionEvents;
        TigonWebSocketException tigonWebSocketException = new TigonWebSocketException(str);
        if (c4256CrU != null) {
            numValueOf = Integer.valueOf(c4256CrU.A00);
            mapA0E = TigonHatchWebSocketKt.handshakeHeaders(c4256CrU);
        } else {
            numValueOf = null;
            mapA0E = AGH.A0E();
        }
        c3Em.AhV(new HatchWsEvent.Failed(new HatchWsFailure(tigonWebSocketException, numValueOf, mapA0E, null, null, null, false)));
    }

    @Override // X.AbstractC10395HbC
    public void onMessage(String str) {
        C7384Etj.A0Y(str, 0);
        this.incomingMessages.AhV(new HatchWsMessage.Text(str));
    }

    @Override // X.AbstractC10395HbC
    public void onOpen(C4256CrU c4256CrU) {
        C7384Etj.A0Y(c4256CrU, 0);
        this.connectionEvents.AhV(new HatchWsEvent.Open(TigonHatchWebSocketKt.handshakeHeaders(c4256CrU), null));
    }

    public HatchFlowTigonCallbacks(C3Em<HatchWsMessage> c3Em, C3Em<HatchWsEvent> c3Em2) {
        AnonymousClass003.A0u(c3Em, c3Em2);
        this.incomingMessages = c3Em;
        this.connectionEvents = c3Em2;
    }

    @Override // X.AbstractC10395HbC
    public void onMessage(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        this.incomingMessages.AhV(new HatchWsMessage.Binary(bArr));
    }
}
