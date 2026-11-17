package com.facebook.aura.network.transport;

import X.G0U;
import X.HtJ;

/* loaded from: classes5.dex */
public interface HatchVmProbeAuthProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes3.dex */
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final HatchVmProbeAuthProvider Legacy = new HatchVmProbeAuthProvider() { // from class: com.facebook.aura.network.transport.HatchVmProbeAuthProvider$Companion$Legacy$1
            @Override // com.facebook.aura.network.transport.HatchVmProbeAuthProvider
            public final Object connect(G0U<? super HatchNoisePrivateAuth, ? extends HatchWebSocketSession> g0u, HtJ<? super HatchWebSocketSession> htJ) {
                return g0u.invoke(null);
            }

            @Override // com.facebook.aura.network.transport.HatchVmProbeAuthProvider
            public /* bridge */ boolean acceptsHandshake(HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
                return true;
            }
        };

        public final HatchVmProbeAuthProvider getLegacy() {
            return Legacy;
        }
    }

    boolean acceptsHandshake(HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome);

    Object connect(G0U<? super HatchNoisePrivateAuth, ? extends HatchWebSocketSession> g0u, HtJ<? super HatchWebSocketSession> htJ);

    /* renamed from: com.facebook.aura.network.transport.HatchVmProbeAuthProvider$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean $default$acceptsHandshake(HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
            return true;
        }

        public static /* synthetic */ boolean access$acceptsHandshake$jd(HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
            return true;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static boolean acceptsHandshake(HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
            return true;
        }
    }
}
