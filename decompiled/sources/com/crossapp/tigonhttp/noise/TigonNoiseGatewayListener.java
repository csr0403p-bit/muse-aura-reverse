package com.crossapp.tigonhttp.noise;

import X.ET9;

/* loaded from: classes5.dex */
public interface TigonNoiseGatewayListener {
    void onClose(String str);

    void onCloseWithOutcome(ET9 et9, String str);

    void onCloseWithOutcomeNative(int i, String str);

    void onFailure(int i, String str);

    void onFailureDiagnostic(String str);

    void onMessage(byte[] bArr);

    void onPreconnectTiming(boolean z, long j, long j2, long j3);

    void onReady();

    void onReadyWithOutcome(ET9 et9);

    void onReadyWithOutcomeNative(int i);

    void onTransportReady();

    void onWebSocketUpgraded();
}
