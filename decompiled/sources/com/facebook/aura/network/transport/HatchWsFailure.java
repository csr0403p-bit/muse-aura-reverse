package com.facebook.aura.network.transport;

import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import X.C3cH;
import java.util.Map;

/* loaded from: classes5.dex */
public final class HatchWsFailure {
    public final Throwable cause;
    public final HatchConnectTimeout connectTimeout;
    public final Integer httpCode;
    public final Map<String, String> httpHeaders;
    public final String logDiagnostic;
    public final HatchNoiseHandshakeOutcome noiseHandshakeOutcome;
    public final boolean transportPingTimedOut;

    public final Throwable getCause() {
        return this.cause;
    }

    public final HatchConnectTimeout getConnectTimeout() {
        return this.connectTimeout;
    }

    public final Integer getHttpCode() {
        return this.httpCode;
    }

    public final Map<String, String> getHttpHeaders() {
        return this.httpHeaders;
    }

    public final String getLogDiagnostic() {
        return this.logDiagnostic;
    }

    public final HatchNoiseHandshakeOutcome getNoiseHandshakeOutcome() {
        return this.noiseHandshakeOutcome;
    }

    public final boolean getTransportPingTimedOut() {
        return this.transportPingTimedOut;
    }

    public HatchWsFailure(Throwable th, Integer num, Map<String, String> map, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, String str, HatchConnectTimeout hatchConnectTimeout, boolean z) {
        AnonymousClass003.A0v(th, map);
        this.cause = th;
        this.httpCode = num;
        this.httpHeaders = map;
        this.noiseHandshakeOutcome = hatchNoiseHandshakeOutcome;
        this.logDiagnostic = str;
        this.connectTimeout = hatchConnectTimeout;
        this.transportPingTimedOut = z;
    }

    public /* synthetic */ HatchWsFailure(Throwable th, Integer num, Map map, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, String str, HatchConnectTimeout hatchConnectTimeout, boolean z, int i, C06H c06h) {
        this(th, (i & 2) != 0 ? null : num, C3cH.A0o(map, i & 4), (i & 8) != 0 ? null : hatchNoiseHandshakeOutcome, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : hatchConnectTimeout, C3cG.A1K(i & 64, z));
    }
}
