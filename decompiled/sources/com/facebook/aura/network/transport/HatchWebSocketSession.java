package com.facebook.aura.network.transport;

import X.C20Q;
import X.C8j3;

/* loaded from: classes5.dex */
public interface HatchWebSocketSession {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int NORMAL_CLOSURE = 1000;

    /* renamed from: com.facebook.aura.network.transport.HatchWebSocketSession$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ boolean close$default(HatchWebSocketSession hatchWebSocketSession, int i, String str, int i2, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i2 & 1) != 0) {
                i = 1000;
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            return hatchWebSocketSession.close(i, str);
        }

        public static HatchWebSocketPreconnectTiming $default$getPreconnectTiming(HatchWebSocketSession hatchWebSocketSession) {
            return null;
        }

        public static String $default$getRegionHint(HatchWebSocketSession hatchWebSocketSession) {
            return null;
        }

        public static Long $default$getTransportReadyTimestampNs(HatchWebSocketSession hatchWebSocketSession) {
            return null;
        }

        public static Long $default$getWebSocketUpgradeTimestampNs(HatchWebSocketSession hatchWebSocketSession) {
            return null;
        }

        public static /* synthetic */ HatchWebSocketPreconnectTiming access$getPreconnectTiming$jd(HatchWebSocketSession hatchWebSocketSession) {
            return null;
        }

        public static /* synthetic */ String access$getRegionHint$jd(HatchWebSocketSession hatchWebSocketSession) {
            return null;
        }

        public static /* synthetic */ Long access$getTransportReadyTimestampNs$jd(HatchWebSocketSession hatchWebSocketSession) {
            return null;
        }

        public static /* synthetic */ Long access$getWebSocketUpgradeTimestampNs$jd(HatchWebSocketSession hatchWebSocketSession) {
            return null;
        }
    }

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int NORMAL_CLOSURE = 1000;
    }

    boolean close(int i, String str);

    C20Q<HatchWsEvent> getConnectionEvents();

    C20Q<HatchWsMessage> getIncomingMessages();

    HatchWebSocketPreconnectTiming getPreconnectTiming();

    String getRegionHint();

    Long getTransportReadyTimestampNs();

    Long getWebSocketUpgradeTimestampNs();

    boolean send(String str);

    boolean send(byte[] bArr);

    public abstract class DefaultImpls {
        @Deprecated
        public static HatchWebSocketPreconnectTiming getPreconnectTiming(HatchWebSocketSession hatchWebSocketSession) {
            return null;
        }

        @Deprecated
        public static String getRegionHint(HatchWebSocketSession hatchWebSocketSession) {
            return null;
        }

        @Deprecated
        public static Long getTransportReadyTimestampNs(HatchWebSocketSession hatchWebSocketSession) {
            return null;
        }

        @Deprecated
        public static Long getWebSocketUpgradeTimestampNs(HatchWebSocketSession hatchWebSocketSession) {
            return null;
        }
    }
}
