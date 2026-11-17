package com.crossapp.tigonhttp.noise;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.BV6;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.ET9;
import X.ETA;
import X.ETG;
import X.ETK;
import X.ETi;
import com.facebook.jni.HybridData;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TigonNoiseGatewayCarrier {
    public static final ETG Companion = new ETG();
    public static final int PRIVATE_AUTH_DISABLED = 0;
    public final TigonNoiseContext context;
    public final HybridData mHybridData;
    public final Set<RetainedListener> retainedListeners;

    public final class RetainedListener implements TigonNoiseGatewayListener {
        public final TigonNoiseGatewayListener delegate;
        public final AtomicBoolean terminalDelivered;
        public final /* synthetic */ TigonNoiseGatewayCarrier this$0;

        public RetainedListener(TigonNoiseGatewayCarrier tigonNoiseGatewayCarrier, TigonNoiseGatewayListener tigonNoiseGatewayListener) {
            C7384Etj.A0Y(tigonNoiseGatewayListener, 1);
            this.this$0 = tigonNoiseGatewayCarrier;
            this.delegate = tigonNoiseGatewayListener;
            this.terminalDelivered = C60O.A1E();
        }

        @Override // com.crossapp.tigonhttp.noise.TigonNoiseGatewayListener
        public void onClose(String str) {
            C7384Etj.A0Y(str, 0);
            if (BV4.A1V(this.terminalDelivered)) {
                try {
                    this.delegate.onClose(str);
                } finally {
                    BV6.A12(this);
                }
            }
        }

        @Override // com.crossapp.tigonhttp.noise.TigonNoiseGatewayListener
        public void onCloseWithOutcome(ET9 et9, String str) {
            if (this.terminalDelivered.compareAndSet(false, AnonymousClass002.A1a(et9, str))) {
                try {
                    this.delegate.onCloseWithOutcome(et9, str);
                } finally {
                    BV6.A12(this);
                }
            }
        }

        @Override // com.crossapp.tigonhttp.noise.TigonNoiseGatewayListener
        public void onFailure(int i, String str) {
            C7384Etj.A0Y(str, 1);
            if (this.terminalDelivered.compareAndSet(false, true)) {
                try {
                    this.delegate.onFailure(i, str);
                } finally {
                    BV6.A12(this);
                }
            }
        }

        @Override // com.crossapp.tigonhttp.noise.TigonNoiseGatewayListener
        public void onFailureDiagnostic(String str) {
            C7384Etj.A0Y(str, 0);
            if (this.terminalDelivered.get()) {
                return;
            }
            this.delegate.onFailureDiagnostic(str);
        }

        @Override // com.crossapp.tigonhttp.noise.TigonNoiseGatewayListener
        public void onMessage(byte[] bArr) {
            C7384Etj.A0Y(bArr, 0);
            if (this.terminalDelivered.get()) {
                return;
            }
            this.delegate.onMessage(bArr);
        }

        @Override // com.crossapp.tigonhttp.noise.TigonNoiseGatewayListener
        public void onReadyWithOutcome(ET9 et9) {
            C7384Etj.A0Y(et9, 0);
            if (this.terminalDelivered.get()) {
                return;
            }
            this.delegate.onReadyWithOutcome(et9);
        }

        private final void deliverIfActive(Function0<Unit> function0) {
            if (this.terminalDelivered.get()) {
                return;
            }
            function0.invoke();
        }

        private final void deliverTerminal(Function0<Unit> function0) {
            if (C3cI.A1W(this.terminalDelivered)) {
                try {
                    function0.invoke();
                } finally {
                    BV6.A12(this);
                }
            }
        }

        @Override // com.crossapp.tigonhttp.noise.TigonNoiseGatewayListener
        public void onPreconnectTiming(boolean z, long j, long j2, long j3) {
            if (this.terminalDelivered.get()) {
                return;
            }
            this.delegate.onPreconnectTiming(z, j, j2, j3);
        }

        @Override // com.crossapp.tigonhttp.noise.TigonNoiseGatewayListener
        public void onReady() {
            if (this.terminalDelivered.get()) {
                return;
            }
            this.delegate.onReady();
        }

        @Override // com.crossapp.tigonhttp.noise.TigonNoiseGatewayListener
        public void onTransportReady() {
            if (this.terminalDelivered.get()) {
                return;
            }
            this.delegate.onTransportReady();
        }

        @Override // com.crossapp.tigonhttp.noise.TigonNoiseGatewayListener
        public void onWebSocketUpgraded() {
            if (this.terminalDelivered.get()) {
                return;
            }
            this.delegate.onWebSocketUpgraded();
        }

        @Override // com.crossapp.tigonhttp.noise.TigonNoiseGatewayListener
        public /* synthetic */ void onReadyWithOutcomeNative(int i) {
            ETA.$default$onReadyWithOutcomeNative(this, i);
        }

        @Override // com.crossapp.tigonhttp.noise.TigonNoiseGatewayListener
        public /* synthetic */ void onCloseWithOutcomeNative(int i, String str) {
            ETA.$default$onCloseWithOutcomeNative(this, i, str);
        }
    }

    private final native void cancelHandshakeNative();

    public static final TigonNoiseGatewayCarrier create(TigonNoiseContext tigonNoiseContext) {
        C7384Etj.A0Y(tigonNoiseContext, 0);
        return new TigonNoiseGatewayCarrier(initHybrid(tigonNoiseContext, null), tigonNoiseContext);
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid(TigonNoiseContext tigonNoiseContext, TigonNoiseGatewayTransport tigonNoiseGatewayTransport);

    private final native boolean sendWebsocketFrameNative(byte[] bArr);

    private final native boolean startNative(String str, String[] strArr, String[] strArr2, int i, boolean z, boolean z2, byte[] bArr, int i2, String str2, byte[] bArr2, TigonNoiseAttestationVerifier tigonNoiseAttestationVerifier, TigonNoiseGatewayListener tigonNoiseGatewayListener);

    private final native void stopNative();

    public final boolean sendWebsocketFrame(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return sendWebsocketFrameNative(bArr);
    }

    static {
        ETi.loadLibrary("tigon-noise-context-jni");
    }

    public TigonNoiseGatewayCarrier(HybridData hybridData, TigonNoiseContext tigonNoiseContext) {
        AnonymousClass003.A0u(hybridData, tigonNoiseContext);
        this.mHybridData = hybridData;
        this.context = tigonNoiseContext;
        this.retainedListeners = C60O.A18();
    }

    public final void cancelHandshake() {
        cancelHandshakeNative();
    }

    public final boolean start(ETK etk, TigonNoiseAttestationVerifier tigonNoiseAttestationVerifier, TigonNoiseGatewayListener tigonNoiseGatewayListener) {
        AnonymousClass005.A0x(etk, tigonNoiseAttestationVerifier, tigonNoiseGatewayListener);
        throw BV4.A0a("hasPairedHeaders$fbandroid_java_com_crossapp_tigonhttp_noise_tigon_noise_context");
    }

    public final void stop() {
        stopNative();
    }

    public static final TigonNoiseGatewayCarrier create(TigonNoiseContext tigonNoiseContext, TigonNoiseGatewayTransport tigonNoiseGatewayTransport) {
        C7384Etj.A0Y(tigonNoiseContext, 0);
        return new TigonNoiseGatewayCarrier(initHybrid(tigonNoiseContext, tigonNoiseGatewayTransport), tigonNoiseContext);
    }
}
