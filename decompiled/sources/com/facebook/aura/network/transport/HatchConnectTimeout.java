package com.facebook.aura.network.transport;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes5.dex */
public interface HatchConnectTimeout {

    public final class NoiseHandshake extends C06G implements HatchConnectTimeout {
        public final Integer elapsedMs;
        public final int timeoutMs;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof NoiseHandshake) {
                    NoiseHandshake noiseHandshake = (NoiseHandshake) obj;
                    if (this.timeoutMs != noiseHandshake.timeoutMs || !C7384Etj.areEqual(this.elapsedMs, noiseHandshake.elapsedMs)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ NoiseHandshake copy$default(NoiseHandshake noiseHandshake, int i, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = noiseHandshake.timeoutMs;
            }
            if ((i2 & 2) != 0) {
                num = noiseHandshake.elapsedMs;
            }
            return new NoiseHandshake(i, num);
        }

        public final int component1() {
            return this.timeoutMs;
        }

        public final Integer component2() {
            return this.elapsedMs;
        }

        public final NoiseHandshake copy(int i, Integer num) {
            return new NoiseHandshake(i, num);
        }

        @Override // com.facebook.aura.network.transport.HatchConnectTimeout
        public Integer getElapsedMs() {
            return this.elapsedMs;
        }

        @Override // com.facebook.aura.network.transport.HatchConnectTimeout
        public String getErrorType() {
            return "noise_handshake_timeout";
        }

        @Override // com.facebook.aura.network.transport.HatchConnectTimeout
        public int getTimeoutMs() {
            return this.timeoutMs;
        }

        public int hashCode() {
            return (this.timeoutMs * 31) + AnonymousClass006.A0D(this.elapsedMs);
        }

        public NoiseHandshake(int i, Integer num) {
            this.timeoutMs = i;
            this.elapsedMs = num;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class WebSocketUpgrade extends C06G implements HatchConnectTimeout {
        public final Integer elapsedMs;
        public final int timeoutMs;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof WebSocketUpgrade) {
                    WebSocketUpgrade webSocketUpgrade = (WebSocketUpgrade) obj;
                    if (this.timeoutMs != webSocketUpgrade.timeoutMs || !C7384Etj.areEqual(this.elapsedMs, webSocketUpgrade.elapsedMs)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ WebSocketUpgrade copy$default(WebSocketUpgrade webSocketUpgrade, int i, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = webSocketUpgrade.timeoutMs;
            }
            if ((i2 & 2) != 0) {
                num = webSocketUpgrade.elapsedMs;
            }
            return new WebSocketUpgrade(i, num);
        }

        public final int component1() {
            return this.timeoutMs;
        }

        public final Integer component2() {
            return this.elapsedMs;
        }

        public final WebSocketUpgrade copy(int i, Integer num) {
            return new WebSocketUpgrade(i, num);
        }

        @Override // com.facebook.aura.network.transport.HatchConnectTimeout
        public Integer getElapsedMs() {
            return this.elapsedMs;
        }

        @Override // com.facebook.aura.network.transport.HatchConnectTimeout
        public int getTimeoutMs() {
            return this.timeoutMs;
        }

        public int hashCode() {
            return (this.timeoutMs * 31) + AnonymousClass006.A0D(this.elapsedMs);
        }

        public WebSocketUpgrade(int i, Integer num) {
            this.timeoutMs = i;
            this.elapsedMs = num;
        }

        @Override // com.facebook.aura.network.transport.HatchConnectTimeout
        public String getErrorType() {
            return "ws_upgrade_timeout";
        }

        public String toString() {
            return super.toString();
        }
    }

    Integer getElapsedMs();

    String getErrorType();

    int getTimeoutMs();
}
