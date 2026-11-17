package com.facebook.aura.gateway.noise.carrier;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BXZ;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.DCW;
import com.crossapp.tigonhttp.noise.NoiseChannelManagerHolder;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;

/* loaded from: classes5.dex */
public final class NoiseGatewayCarrier {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;
    public final NoiseChannelManagerHolder managerHolder;

    private final native void cancelHandshakeNative();

    public static final native HybridData createNative(TigonServiceHolder tigonServiceHolder, NoiseChannelManagerHolder noiseChannelManagerHolder);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static /* synthetic */ void getManagerHolder$annotations() {
    }

    private final native boolean sendWebsocketFrameNative(byte[] bArr);

    private final native boolean startNative(String str, String[] strArr, String[] strArr2, String[] strArr3, int i, int i2, int i3, int i4, long j, int i5, byte[] bArr, int i6, String str2, byte[] bArr2, AttestationVerifierHolder attestationVerifierHolder, Stream0Listener stream0Listener, boolean z, int i7, boolean z2, String str3, boolean z3);

    private final native void stopNative();

    public final boolean sendWebsocketFrame(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return sendWebsocketFrameNative(bArr);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final HybridData createNative(TigonServiceHolder tigonServiceHolder, NoiseChannelManagerHolder noiseChannelManagerHolder) {
            return NoiseGatewayCarrier.createNative(tigonServiceHolder, noiseChannelManagerHolder);
        }

        public final NoiseGatewayCarrier create(DCW dcw, NoiseChannelManagerHolder noiseChannelManagerHolder) {
            AnonymousClass003.A0u(dcw, noiseChannelManagerHolder);
            return new NoiseGatewayCarrier(NoiseGatewayCarrier.createNative(dcw.A00, noiseChannelManagerHolder), noiseChannelManagerHolder);
        }

        public Companion() {
        }
    }

    static {
        NoiseGatewayCarrierSoLoader.ensureLoaded();
    }

    public static final NoiseGatewayCarrier create(DCW dcw, NoiseChannelManagerHolder noiseChannelManagerHolder) {
        return Companion.create(dcw, noiseChannelManagerHolder);
    }

    public final boolean start(String str, String[] strArr, String[] strArr2, String[] strArr3, int i, int i2, int i3, int i4, long j, int i5, byte[] bArr, String str2, byte[] bArr2, AttestationVerifierHolder attestationVerifierHolder, Stream0Listener stream0Listener, boolean z, NoiseGatewayWebSocketTransportPolicy noiseGatewayWebSocketTransportPolicy, boolean z2, String str3, boolean z3) {
        AnonymousClass005.A14(str, strArr, strArr2, strArr3);
        C7384Etj.A0Y(bArr, 10);
        AnonymousClass002.A1H(attestationVerifierHolder, 13, stream0Listener);
        C7384Etj.A0Y(noiseGatewayWebSocketTransportPolicy, 16);
        C7384Etj.A0Y(str3, 18);
        return (str2 == null && bArr2 == null) ? start(str, strArr, strArr2, strArr3, i, i2, i3, i4, j, i5, bArr, attestationVerifierHolder, stream0Listener, z, noiseGatewayWebSocketTransportPolicy, z2, str3, z3) : start(str, strArr, strArr2, strArr3, i, i2, i3, i4, j, i5, bArr, BXZ.A03, str2, bArr2, attestationVerifierHolder, stream0Listener, z, noiseGatewayWebSocketTransportPolicy, z2, str3, z3);
    }

    public NoiseGatewayCarrier(HybridData hybridData, NoiseChannelManagerHolder noiseChannelManagerHolder) {
        AnonymousClass003.A0u(hybridData, noiseChannelManagerHolder);
        this.mHybridData = hybridData;
        this.managerHolder = noiseChannelManagerHolder;
    }

    public static /* synthetic */ boolean start$default(NoiseGatewayCarrier noiseGatewayCarrier, String str, String[] strArr, String[] strArr2, String[] strArr3, int i, int i2, int i3, int i4, long j, int i5, byte[] bArr, String str2, byte[] bArr2, AttestationVerifierHolder attestationVerifierHolder, Stream0Listener stream0Listener, boolean z, NoiseGatewayWebSocketTransportPolicy noiseGatewayWebSocketTransportPolicy, boolean z2, String str3, boolean z3, int i6, Object obj) {
        boolean zA1L = C3cH.A1L(i6, 32768, z);
        if ((i6 & 65536) != 0) {
            noiseGatewayWebSocketTransportPolicy = NoiseGatewayWebSocketTransportPolicy.HTTP1_UPGRADE;
        }
        boolean zA1L2 = C3cH.A1L(i6, 131072, z2);
        if ((i6 & 262144) != 0) {
            str3 = "";
        }
        return noiseGatewayCarrier.start(str, strArr, strArr2, strArr3, i, i2, i3, i4, j, i5, bArr, str2, bArr2, attestationVerifierHolder, stream0Listener, zA1L, noiseGatewayWebSocketTransportPolicy, zA1L2, str3, C3cH.A1L(i6, 524288, z3));
    }

    public final void cancelHandshake() {
        cancelHandshakeNative();
    }

    public final void stop() {
        stopNative();
    }

    public static /* synthetic */ boolean start$default(NoiseGatewayCarrier noiseGatewayCarrier, String str, String[] strArr, String[] strArr2, String[] strArr3, int i, int i2, int i3, int i4, long j, int i5, byte[] bArr, AttestationVerifierHolder attestationVerifierHolder, Stream0Listener stream0Listener, boolean z, NoiseGatewayWebSocketTransportPolicy noiseGatewayWebSocketTransportPolicy, boolean z2, String str2, boolean z3, int i6, Object obj) {
        boolean zA1K = C3cG.A1K(i6 & 8192, z);
        if ((i6 & 16384) != 0) {
            noiseGatewayWebSocketTransportPolicy = NoiseGatewayWebSocketTransportPolicy.HTTP1_UPGRADE;
        }
        boolean zA1L = C3cH.A1L(32768, i6, z2);
        if ((65536 & i6) != 0) {
            str2 = "";
        }
        return noiseGatewayCarrier.start(str, strArr, strArr2, strArr3, i, i2, i3, i4, j, i5, bArr, attestationVerifierHolder, stream0Listener, zA1K, noiseGatewayWebSocketTransportPolicy, zA1L, str2, C3cH.A1L(i6, 131072, z3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (com.facebook.aura.network.transport.HatchNoisePrivateAuthKt.isCvmHostDataFor(r25, r26.expectedHostData) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean start(java.lang.String r11, java.lang.String[] r12, java.lang.String[] r13, java.lang.String[] r14, int r15, int r16, int r17, int r18, long r19, int r21, byte[] r22, X.BXZ r23, java.lang.String r24, byte[] r25, com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder r26, com.facebook.aura.gateway.noise.carrier.Stream0Listener r27, boolean r28, com.facebook.aura.gateway.noise.carrier.NoiseGatewayWebSocketTransportPolicy r29, boolean r30, java.lang.String r31, boolean r32) {
        /*
            r10 = this;
            r1 = 0
            X.C7384Etj.A0Y(r11, r1)
            r0 = 1
            X.AnonymousClass005.A11(r12, r13, r14, r0)
            r0 = 10
            r6 = r22
            X.C7384Etj.A0Y(r6, r0)
            r0 = 11
            r8 = r23
            r4 = r26
            X.AnonymousClass002.A1H(r8, r0, r4)
            r0 = 15
            r3 = r27
            X.C7384Etj.A0Y(r3, r0)
            r0 = 17
            r7 = r29
            X.C7384Etj.A0Y(r7, r0)
            r0 = 19
            r2 = r31
            X.C7384Etj.A0Y(r2, r0)
            r9 = 1
            boolean r0 = X.AnonymousClass002.A1Y(r24)
            r5 = r25
            if (r25 == 0) goto L37
            r9 = 0
        L37:
            if (r0 != r9) goto L50
            if (r24 == 0) goto L51
            int r0 = r24.length()
            if (r0 == 0) goto L50
            if (r25 == 0) goto L50
            int r9 = r5.length
            r0 = 32
            if (r9 != r0) goto L50
        L48:
            byte[] r0 = r4.expectedHostData
            boolean r0 = com.facebook.aura.network.transport.HatchNoisePrivateAuthKt.isCvmHostDataFor(r5, r0)
            if (r0 != 0) goto L54
        L50:
            return r1
        L51:
            if (r25 == 0) goto L54
            goto L48
        L54:
            int r0 = r8.nativeCode
            int r29 = r7.getNativeCode$fbandroid_express_aura_java_com_facebook_aura_gateway_noise_carrier_carrier()
            r23 = r0
            boolean r1 = r10.startNative(r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.noise.carrier.NoiseGatewayCarrier.start(java.lang.String, java.lang.String[], java.lang.String[], java.lang.String[], int, int, int, int, long, int, byte[], X.BXZ, java.lang.String, byte[], com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder, com.facebook.aura.gateway.noise.carrier.Stream0Listener, boolean, com.facebook.aura.gateway.noise.carrier.NoiseGatewayWebSocketTransportPolicy, boolean, java.lang.String, boolean):boolean");
    }

    public final boolean start(String str, String[] strArr, String[] strArr2, String[] strArr3, int i, int i2, int i3, int i4, long j, int i5, byte[] bArr, AttestationVerifierHolder attestationVerifierHolder, Stream0Listener stream0Listener, boolean z, NoiseGatewayWebSocketTransportPolicy noiseGatewayWebSocketTransportPolicy, boolean z2, String str2, boolean z3) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(strArr, strArr2, strArr3, 1);
        C7384Etj.A0Y(bArr, 10);
        C7384Etj.A0Y(attestationVerifierHolder, 11);
        AnonymousClass002.A1H(stream0Listener, 12, noiseGatewayWebSocketTransportPolicy);
        C7384Etj.A0Y(str2, 16);
        return startNative(str, strArr, strArr2, strArr3, i, i2, i3, i4, j, i5, bArr, 0, null, null, attestationVerifierHolder, stream0Listener, z, noiseGatewayWebSocketTransportPolicy.getNativeCode$fbandroid_express_aura_java_com_facebook_aura_gateway_noise_carrier_carrier(), z2, str2, z3);
    }

    public static /* synthetic */ boolean start$default(NoiseGatewayCarrier noiseGatewayCarrier, String str, String[] strArr, String[] strArr2, String[] strArr3, int i, int i2, int i3, int i4, long j, int i5, byte[] bArr, BXZ bxz, String str2, byte[] bArr2, AttestationVerifierHolder attestationVerifierHolder, Stream0Listener stream0Listener, boolean z, NoiseGatewayWebSocketTransportPolicy noiseGatewayWebSocketTransportPolicy, boolean z2, String str3, boolean z3, int i6, Object obj) {
        boolean zA1L = C3cH.A1L(i6, 65536, z);
        if ((i6 & 131072) != 0) {
            noiseGatewayWebSocketTransportPolicy = NoiseGatewayWebSocketTransportPolicy.HTTP1_UPGRADE;
        }
        boolean zA1L2 = C3cH.A1L(i6, 262144, z2);
        if ((i6 & 524288) != 0) {
            str3 = "";
        }
        return noiseGatewayCarrier.start(str, strArr, strArr2, strArr3, i, i2, i3, i4, j, i5, bArr, bxz, str2, bArr2, attestationVerifierHolder, stream0Listener, zA1L, noiseGatewayWebSocketTransportPolicy, zA1L2, str3, C3cH.A1L(i6, 1048576, z3));
    }
}
