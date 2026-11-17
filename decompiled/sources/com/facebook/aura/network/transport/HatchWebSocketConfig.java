package com.facebook.aura.network.transport;

import X.AGH;
import X.AnonymousClass005;
import X.C06H;
import X.C0881AGi;
import X.C3cH;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class HatchWebSocketConfig {
    public static final Companion Companion = new Companion();
    public static final long DEFAULT_PING_INTERVAL_MS = 30000;
    public final int connectAttemptNumber;
    public final Map<String, String> headers;
    public final HatchNoisePrivateAuth noisePrivateAuth;
    public final long pingIntervalMs;
    public final long readTimeoutMs;
    public final List<String> subprotocols;
    public final String url;

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final int getConnectAttemptNumber() {
        return this.connectAttemptNumber;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final HatchNoisePrivateAuth getNoisePrivateAuth() {
        return this.noisePrivateAuth;
    }

    public final long getPingIntervalMs() {
        return this.pingIntervalMs;
    }

    public final long getReadTimeoutMs() {
        return this.readTimeoutMs;
    }

    public final List<String> getSubprotocols() {
        return this.subprotocols;
    }

    public final String getUrl() {
        return this.url;
    }

    public HatchWebSocketConfig(String str, Map<String, String> map, List<String> list, long j, int i, long j2, HatchNoisePrivateAuth hatchNoisePrivateAuth) {
        AnonymousClass005.A0x(str, map, list);
        this.url = str;
        this.headers = map;
        this.subprotocols = list;
        this.pingIntervalMs = j;
        this.connectAttemptNumber = i;
        this.readTimeoutMs = j2;
        this.noisePrivateAuth = hatchNoisePrivateAuth;
    }

    public /* synthetic */ HatchWebSocketConfig(String str, Map map, List list, long j, int i, long j2, HatchNoisePrivateAuth hatchNoisePrivateAuth, int i2, C06H c06h) {
        this(str, (i2 & 2) != 0 ? AGH.A0E() : map, (i2 & 4) != 0 ? C0881AGi.A00 : list, (i2 & 8) != 0 ? 30000L : j, (i2 & 16) != 0 ? -1 : i, C3cH.A03(i2 & 32, j2), (i2 & 64) != 0 ? null : hatchNoisePrivateAuth);
    }
}
