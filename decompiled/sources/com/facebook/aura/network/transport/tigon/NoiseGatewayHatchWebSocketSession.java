package com.facebook.aura.network.transport.tigon;

import X.AGH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.BV6;
import X.C06H;
import X.C0881AGi;
import X.C20Q;
import X.C22I;
import X.C3Em;
import X.C3cG;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C8j3;
import X.C9290GCr;
import X.C9jH;
import X.DCl;
import X.ET9;
import X.Ey9;
import X.FGI;
import com.facebook.aura.common.HatchCvmChipPinPurpose;
import com.facebook.aura.gateway.HatchCvmReplacementFailure;
import com.facebook.aura.gateway.noise.carrier.Stream0Listener;
import com.facebook.aura.network.transport.HatchConnectTimeout;
import com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome;
import com.facebook.aura.network.transport.HatchWebSocketPreconnectTiming;
import com.facebook.aura.network.transport.HatchWebSocketSession;
import com.facebook.aura.network.transport.HatchWsEvent;
import com.facebook.aura.network.transport.HatchWsFailure;
import com.facebook.aura.network.transport.HatchWsMessage;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocketSession;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class NoiseGatewayHatchWebSocketSession implements HatchWebSocketSession {
    public static final Companion Companion = new Companion();
    public static final int EVENT_BUFFER_CAPACITY = 8;
    public static final int INCOMING_BUFFER_CAPACITY = 512;
    public final C3Em<HatchWsEvent> _connectionEvents;
    public final C3Em<HatchWsMessage> _incomingMessages;
    public final Object callbackLock;
    public final NoiseGatewayCarrierHandle carrier;
    public final HatchCvmChipPinPurpose chipPinPurpose;
    public final C22I<HatchWsEvent> connectionEvents;
    public String failureDiagnostic;
    public final FlipperNoiseReporter flipperReporter;
    public final C22I<HatchWsMessage> incomingMessages;
    public final boolean isPinnedDiscovery;
    public Lifecycle lifecycle;
    public final Stream0Listener listener;
    public final int noiseHandshakeTimeoutMs;
    public final boolean preserveTypedFailureDetails;
    public HatchWebSocketPreconnectTiming recordedPreconnectTiming;
    public String recordedRegionHint;
    public Long recordedTransportReadyTimestampNs;
    public Long recordedWebSocketUpgradeTimestampNs;
    public final int upgradeTimeoutMs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Lifecycle {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Lifecycle[] $VALUES;
        public static final Lifecycle OPEN;
        public static final Lifecycle OPENING;
        public static final Lifecycle TERMINAL;
        public static final Lifecycle WEBSOCKET_UPGRADED;

        static {
            Lifecycle lifecycle = new Lifecycle("OPENING", 0);
            OPENING = lifecycle;
            Lifecycle lifecycle2 = new Lifecycle("WEBSOCKET_UPGRADED", 1);
            WEBSOCKET_UPGRADED = lifecycle2;
            Lifecycle lifecycle3 = new Lifecycle("OPEN", 2);
            OPEN = lifecycle3;
            Lifecycle lifecycle4 = new Lifecycle("TERMINAL", 3);
            TERMINAL = lifecycle4;
            Lifecycle[] lifecycleArr = {lifecycle, lifecycle2, lifecycle3, lifecycle4};
            $VALUES = lifecycleArr;
            $ENTRIES = C3cG.A0w(lifecycleArr);
        }

        public static Ey9<Lifecycle> getEntries() {
            return $ENTRIES;
        }

        public static Lifecycle valueOf(String str) {
            return (Lifecycle) Enum.valueOf(Lifecycle.class, str);
        }

        public static Lifecycle[] values() {
            return (Lifecycle[]) $VALUES.clone();
        }

        public Lifecycle(String str, int i) {
        }
    }

    public NoiseGatewayHatchWebSocketSession(NoiseGatewayCarrierHandle noiseGatewayCarrierHandle, FlipperNoiseReporter flipperNoiseReporter, boolean z, HatchCvmChipPinPurpose hatchCvmChipPinPurpose, boolean z2, int i, int i2) {
        boolean zA1a = AnonymousClass002.A1a(noiseGatewayCarrierHandle, flipperNoiseReporter);
        this.carrier = noiseGatewayCarrierHandle;
        this.flipperReporter = flipperNoiseReporter;
        this.preserveTypedFailureDetails = z;
        this.chipPinPurpose = hatchCvmChipPinPurpose;
        this.isPinnedDiscovery = z2;
        this.upgradeTimeoutMs = i;
        this.noiseHandshakeTimeoutMs = i2;
        this.callbackLock = C3cG.A0T();
        this.lifecycle = Lifecycle.OPENING;
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 512);
        this._incomingMessages = c9290GCr;
        C9290GCr c9290GCr2 = new C9290GCr(C79.A01, zA1a ? 1 : 0, 9);
        this._connectionEvents = c9290GCr2;
        this.listener = new Stream0Listener() { // from class: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocketSession$listener$1
            @Override // com.facebook.aura.gateway.noise.carrier.Stream0Listener
            public void onClose(String str) {
                C7384Etj.A0Y(str, 0);
                this.this$0.fail(str, null, null, null);
            }

            @Override // com.facebook.aura.gateway.noise.carrier.Stream0Listener
            public void onFailure(int i3, String str) {
                C7384Etj.A0Y(str, 1);
                NoiseGatewayHatchWebSocketSession noiseGatewayHatchWebSocketSession = this.this$0;
                Integer numValueOf = Integer.valueOf(i3);
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                noiseGatewayHatchWebSocketSession.fail(str, numValueOf, null, null);
            }

            @Override // com.facebook.aura.gateway.noise.carrier.Stream0Listener
            public void onFailureDiagnostic(String str) {
                C7384Etj.A0Y(str, 0);
                NoiseGatewayHatchWebSocketSession noiseGatewayHatchWebSocketSession = this.this$0;
                synchronized (noiseGatewayHatchWebSocketSession.callbackLock) {
                    if (noiseGatewayHatchWebSocketSession.lifecycle != NoiseGatewayHatchWebSocketSession.Lifecycle.TERMINAL) {
                        noiseGatewayHatchWebSocketSession.failureDiagnostic = str;
                    }
                }
            }

            @Override // com.facebook.aura.gateway.noise.carrier.Stream0Listener
            public void onMessage(byte[] bArr) {
                C7384Etj.A0Y(bArr, 0);
                NoiseGatewayHatchWebSocketSession noiseGatewayHatchWebSocketSession = this.this$0;
                synchronized (noiseGatewayHatchWebSocketSession.callbackLock) {
                    if (noiseGatewayHatchWebSocketSession.lifecycle != NoiseGatewayHatchWebSocketSession.Lifecycle.OPEN || noiseGatewayHatchWebSocketSession._incomingMessages.AhV(new HatchWsMessage.Text(new String(bArr, DCl.A05)))) {
                        return;
                    }
                    noiseGatewayHatchWebSocketSession.fail("noise.gateway.incoming_buffer_overflow", null, null, null);
                    this.this$0.carrier.stop();
                }
            }

            @Override // com.facebook.aura.gateway.noise.carrier.Stream0Listener
            public void onReadyWithOutcome(ET9 et9) {
                int iA0E = AnonymousClass001.A0E(et9, 0);
                if (iA0E == 0 || iA0E == 1) {
                    this.this$0.publishOpen(new HatchWsEvent.Open(AGH.A0E(), NoiseGatewayHatchWebSocketKt.toTransportOutcome(et9)));
                } else if (iA0E != 2 && iA0E != 3 && iA0E != 4) {
                    this.this$0.fail("noise.handshake.unknown_outcome", null, null, null);
                } else {
                    NoiseGatewayHatchWebSocketSession noiseGatewayHatchWebSocketSession = this.this$0;
                    noiseGatewayHatchWebSocketSession.fail(noiseGatewayHatchWebSocketSession.failureDescription(et9, "noise.handshake.failed"), null, NoiseGatewayHatchWebSocketKt.toTransportOutcome(et9), null);
                }
            }

            @Override // com.facebook.aura.gateway.noise.carrier.Stream0Listener
            public void onWebSocketUpgraded(String str) {
                C7384Etj.A0Y(str, 0);
                NoiseGatewayHatchWebSocketSession noiseGatewayHatchWebSocketSession = this.this$0;
                if (str.length() == 0) {
                    str = null;
                }
                noiseGatewayHatchWebSocketSession.publishWebSocketUpgraded(str);
            }

            public abstract /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ET9.values().length];
                    try {
                        BV6.A1T(iArr);
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[2] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[3] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[4] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.facebook.aura.gateway.noise.carrier.Stream0Listener
            public void onPreconnectTiming(boolean z3, long j, long j2, long j3) {
                NoiseGatewayHatchWebSocketSession noiseGatewayHatchWebSocketSession = this.this$0;
                synchronized (noiseGatewayHatchWebSocketSession.callbackLock) {
                    if (noiseGatewayHatchWebSocketSession.lifecycle == NoiseGatewayHatchWebSocketSession.Lifecycle.OPENING) {
                        Long lValueOf = Long.valueOf(j2);
                        Long l = null;
                        if (lValueOf.longValue() >= 0) {
                            l = lValueOf;
                        }
                        Long lValueOf2 = Long.valueOf(j3);
                        HatchWebSocketPreconnectTiming hatchWebSocketPreconnectTiming = new HatchWebSocketPreconnectTiming(z3, j, l, lValueOf2.longValue() >= 0 ? lValueOf2 : null);
                        noiseGatewayHatchWebSocketSession.recordedPreconnectTiming = hatchWebSocketPreconnectTiming;
                        noiseGatewayHatchWebSocketSession._connectionEvents.AhV(new HatchWsEvent.PreconnectTiming(hatchWebSocketPreconnectTiming));
                    }
                }
            }

            @Override // com.facebook.aura.gateway.noise.carrier.Stream0Listener
            public void onReady() {
                this.this$0.publishOpen(new HatchWsEvent.Open(AGH.A0E(), null));
            }

            @Override // com.facebook.aura.gateway.noise.carrier.Stream0Listener
            public void onTransportReady() {
                this.this$0.publishTransportReady();
            }

            @Override // com.facebook.aura.gateway.noise.carrier.Stream0Listener
            public void onCloseWithOutcome(ET9 et9, String str) {
                AnonymousClass003.A0u(et9, str);
                NoiseGatewayHatchWebSocketSession noiseGatewayHatchWebSocketSession = this.this$0;
                String strFailureDescription = noiseGatewayHatchWebSocketSession.failureDescription(et9, str);
                HatchNoiseHandshakeOutcome transportOutcome = NoiseGatewayHatchWebSocketKt.toTransportOutcome(et9);
                if (this.this$0.chipPinPurpose != HatchCvmChipPinPurpose.HARD_REPLACEMENT || !NoiseGatewayHatchWebSocketKt.CHIP_BINDING_FAILURE_DETAILS.contains(str)) {
                    str = null;
                }
                noiseGatewayHatchWebSocketSession.fail(strFailureDescription, null, transportOutcome, str);
            }

            @Override // com.facebook.aura.gateway.noise.carrier.Stream0Listener
            public /* bridge */ void onReadyWithOutcomeNative(int i3) {
                Stream0Listener.CC.$default$onReadyWithOutcomeNative(this, i3);
            }

            @Override // com.facebook.aura.gateway.noise.carrier.Stream0Listener
            public /* bridge */ void onCloseWithOutcomeNative(int i3, String str) {
                Stream0Listener.CC.$default$onCloseWithOutcomeNative(this, i3, str);
            }
        };
        this.incomingMessages = new C3pd(c9290GCr);
        this.connectionEvents = new C3pd(c9290GCr2);
    }

    public final void fail(String str, Integer num, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, String str2) {
        boolean z;
        C7384Etj.A0Y(str, 0);
        synchronized (this.callbackLock) {
            Lifecycle lifecycle = this.lifecycle;
            Lifecycle lifecycle2 = Lifecycle.TERMINAL;
            if (lifecycle != lifecycle2) {
                this.lifecycle = lifecycle2;
                HatchConnectTimeout hatchConnectTimeoutConnectTimeout = connectTimeout(str);
                this.flipperReporter.onFailure(str, num);
                C3Em<HatchWsEvent> c3Em = this._connectionEvents;
                IOException iOExceptionA0K = BV4.A0K(NoiseGatewayHatchWebSocketKt.sanitizedFailureDescription(str, num));
                C9jH c9jHA0E = AGH.A0E();
                String strA0U = this.failureDiagnostic;
                if (str2 != null) {
                    strA0U = strA0U != null ? FGI.A0U(strA0U, "; ", str2) : str2;
                }
                if (strA0U != null) {
                    z = true;
                    if (!C7BY.A0q(strA0U, NoiseGatewayHatchWebSocketKt.HTTP2_PING_TIMEOUT_DIAGNOSTIC, false)) {
                    }
                    c3Em.AhV(new HatchWsEvent.Failed(new HatchWsFailure(iOExceptionA0K, num, c9jHA0E, hatchNoiseHandshakeOutcome, strA0U, hatchConnectTimeoutConnectTimeout, z)));
                }
                z = false;
                c3Em.AhV(new HatchWsEvent.Failed(new HatchWsFailure(iOExceptionA0K, num, c9jHA0E, hatchNoiseHandshakeOutcome, strA0U, hatchConnectTimeoutConnectTimeout, z)));
            }
        }
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public boolean send(String str) {
        C7384Etj.A0Y(str, 0);
        return this.carrier.sendWebsocketFrame(C3cG.A1S(str));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final HatchConnectTimeout connectTimeout(String str) {
        HatchConnectTimeout webSocketUpgrade;
        Long l = this.recordedWebSocketUpgradeTimestampNs;
        String str2 = this.failureDiagnostic;
        if (NoiseGatewayHatchWebSocketKt.NOISE_HANDSHAKE_TIMEOUT_DETAIL.equals(str)) {
            webSocketUpgrade = new HatchConnectTimeout.NoiseHandshake(this.noiseHandshakeTimeoutMs, elapsedMsSince(l));
        } else {
            if (l != null || str2 == null || !C7BY.A0q(str2, NoiseGatewayHatchWebSocketKt.WS_UPGRADE_TIMEOUT_DIAGNOSTIC, false)) {
                return null;
            }
            webSocketUpgrade = new HatchConnectTimeout.WebSocketUpgrade(this.upgradeTimeoutMs, elapsedMsSince(this.recordedTransportReadyTimestampNs));
        }
        return webSocketUpgrade;
    }

    private final Integer elapsedMsSince(Long l) {
        if (l == null) {
            return null;
        }
        long jNanoTime = System.nanoTime() - l.longValue();
        if (jNanoTime < 0) {
            jNanoTime = 0;
        }
        long jA05 = BV4.A05(jNanoTime);
        if (jA05 > 2147483647L) {
            jA05 = 2147483647L;
        }
        return Integer.valueOf((int) jA05);
    }

    public static /* synthetic */ void fail$default(NoiseGatewayHatchWebSocketSession noiseGatewayHatchWebSocketSession, String str, Integer num, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchNoiseHandshakeOutcome = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        noiseGatewayHatchWebSocketSession.fail(str, num, hatchNoiseHandshakeOutcome, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String failureDescription(ET9 et9, String str) {
        return (this.chipPinPurpose == HatchCvmChipPinPurpose.HARD_REPLACEMENT && et9 == ET9.A06 && NoiseGatewayHatchWebSocketKt.CHIP_BINDING_FAILURE_DETAILS.contains(str)) ? HatchCvmReplacementFailure.ATTESTATION_FAILED : this.preserveTypedFailureDetails ? str : NoiseGatewayHatchWebSocketKt.canonicalFailureDescription(et9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishOpen(HatchWsEvent.Open open) {
        if (this.isPinnedDiscovery) {
            rejectUnverifiedProvisioningPeer();
            return;
        }
        synchronized (this.callbackLock) {
            Lifecycle lifecycle = this.lifecycle;
            if (lifecycle == Lifecycle.OPENING || lifecycle == Lifecycle.WEBSOCKET_UPGRADED) {
                this.lifecycle = Lifecycle.OPEN;
                this.flipperReporter.onReady();
                this._connectionEvents.AhV(open);
            }
        }
    }

    private final void publishTransportReadyAt(long j) {
        synchronized (this.callbackLock) {
            if (this.lifecycle == Lifecycle.OPENING && this.recordedTransportReadyTimestampNs == null) {
                this.recordedTransportReadyTimestampNs = Long.valueOf(j);
                this._connectionEvents.AhV(new HatchWsEvent.TransportReady(j));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishWebSocketUpgraded(String str) {
        synchronized (this.callbackLock) {
            if (this.lifecycle == Lifecycle.OPENING) {
                long jNanoTime = System.nanoTime();
                this.lifecycle = Lifecycle.WEBSOCKET_UPGRADED;
                this.recordedRegionHint = str;
                this.recordedWebSocketUpgradeTimestampNs = Long.valueOf(jNanoTime);
                this._connectionEvents.AhV(new HatchWsEvent.WebSocketUpgraded(jNanoTime));
            }
        }
    }

    private final void rejectUnverifiedProvisioningPeer() {
        fail("noise.handshake.private_auth.downgrade_detected", null, HatchNoiseHandshakeOutcome.VERIFICATION_FAILED, null);
        this.carrier.stop();
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public boolean close(int i, String str) {
        synchronized (this.callbackLock) {
            Lifecycle lifecycle = this.lifecycle;
            Lifecycle lifecycle2 = Lifecycle.TERMINAL;
            if (lifecycle != lifecycle2) {
                this.lifecycle = lifecycle2;
                C3Em<HatchWsEvent> c3Em = this._connectionEvents;
                if (str == null) {
                    str = "";
                }
                c3Em.AhV(new HatchWsEvent.Closed(i, str));
            }
        }
        this.carrier.stop();
        return true;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public /* bridge */ /* synthetic */ C20Q getConnectionEvents() {
        return this.connectionEvents;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public /* bridge */ /* synthetic */ C20Q getIncomingMessages() {
        return this.incomingMessages;
    }

    public final Stream0Listener getListener() {
        return this.listener;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public HatchWebSocketPreconnectTiming getPreconnectTiming() {
        HatchWebSocketPreconnectTiming hatchWebSocketPreconnectTiming;
        synchronized (this.callbackLock) {
            hatchWebSocketPreconnectTiming = this.recordedPreconnectTiming;
        }
        return hatchWebSocketPreconnectTiming;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public String getRegionHint() {
        String str;
        synchronized (this.callbackLock) {
            str = this.recordedRegionHint;
        }
        return str;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public Long getTransportReadyTimestampNs() {
        Long l;
        synchronized (this.callbackLock) {
            l = this.recordedTransportReadyTimestampNs;
        }
        return l;
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocketSession
    public Long getWebSocketUpgradeTimestampNs() {
        Long l;
        synchronized (this.callbackLock) {
            l = this.recordedWebSocketUpgradeTimestampNs;
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishTransportReady() {
        publishTransportReadyAt(System.nanoTime());
    }

    public /* synthetic */ NoiseGatewayHatchWebSocketSession(NoiseGatewayCarrierHandle noiseGatewayCarrierHandle, FlipperNoiseReporter flipperNoiseReporter, boolean z, HatchCvmChipPinPurpose hatchCvmChipPinPurpose, boolean z2, int i, int i2, int i3, C06H c06h) {
        this(noiseGatewayCarrierHandle, (i3 & 2) != 0 ? new FlipperNoiseReporter(null, C0881AGi.A00, false) : flipperNoiseReporter, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? null : hatchCvmChipPinPurpose, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2);
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
        throw C8j3.A18("Noise gateway WebSocket only supports text frames");
    }
}
