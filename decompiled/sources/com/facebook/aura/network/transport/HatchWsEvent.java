package com.facebook.aura.network.transport;

import X.AGH;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes5.dex */
public interface HatchWsEvent {

    public final class Closed implements HatchWsEvent {
        public final int code;
        public final String reason;

        public Closed(int i, String str) {
            C7384Etj.A0Y(str, 1);
            this.code = i;
            this.reason = str;
        }

        public final int getCode() {
            return this.code;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    public final class Closing implements HatchWsEvent {
        public final int code;
        public final String reason;

        public Closing(int i, String str) {
            C7384Etj.A0Y(str, 1);
            this.code = i;
            this.reason = str;
        }

        public final int getCode() {
            return this.code;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    public final class Failed implements HatchWsEvent {
        public final HatchWsFailure failure;

        public Failed(HatchWsFailure hatchWsFailure) {
            C7384Etj.A0Y(hatchWsFailure, 0);
            this.failure = hatchWsFailure;
        }

        public final HatchWsFailure getFailure() {
            return this.failure;
        }
    }

    public final class Open implements HatchWsEvent {
        public final Map<String, String> handshakeHeaders;
        public final HatchNoiseHandshakeOutcome noiseHandshakeOutcome;

        public Open() {
            this(AGH.A0E(), null);
        }

        public final Map<String, String> getHandshakeHeaders() {
            return this.handshakeHeaders;
        }

        public final HatchNoiseHandshakeOutcome getNoiseHandshakeOutcome() {
            return this.noiseHandshakeOutcome;
        }

        public Open(Map<String, String> map, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
            C7384Etj.A0Y(map, 0);
            this.handshakeHeaders = map;
            this.noiseHandshakeOutcome = hatchNoiseHandshakeOutcome;
        }

        public /* synthetic */ Open(Map map, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, int i, C06H c06h) {
            this(C3cH.A0o(map, i & 1), (i & 2) != 0 ? null : hatchNoiseHandshakeOutcome);
        }
    }

    public final class PreconnectTiming implements HatchWsEvent {
        public final HatchWebSocketPreconnectTiming timing;

        public PreconnectTiming(HatchWebSocketPreconnectTiming hatchWebSocketPreconnectTiming) {
            C7384Etj.A0Y(hatchWebSocketPreconnectTiming, 0);
            this.timing = hatchWebSocketPreconnectTiming;
        }

        public final HatchWebSocketPreconnectTiming getTiming() {
            return this.timing;
        }
    }

    public final class TransportReady implements HatchWsEvent {
        public final long timestampNs;

        public final long getTimestampNs() {
            return this.timestampNs;
        }

        public TransportReady(long j) {
            this.timestampNs = j;
        }
    }

    public final class WebSocketUpgraded implements HatchWsEvent {
        public final long timestampNs;

        public final long getTimestampNs() {
            return this.timestampNs;
        }

        public WebSocketUpgraded(long j) {
            this.timestampNs = j;
        }
    }
}
