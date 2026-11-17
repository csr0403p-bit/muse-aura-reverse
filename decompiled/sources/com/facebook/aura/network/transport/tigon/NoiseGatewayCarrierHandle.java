package com.facebook.aura.network.transport.tigon;

import X.C7384Etj;

/* loaded from: classes5.dex */
public interface NoiseGatewayCarrierHandle {

    public abstract class DefaultImpls {
        @Deprecated
        public static boolean refusesOwnerOf(NoiseGatewayCarrierHandle noiseGatewayCarrierHandle, byte[] bArr) {
            C7384Etj.A0Y(bArr, 1);
            return false;
        }
    }

    boolean refusesOwnerOf(byte[] bArr);

    boolean sendWebsocketFrame(byte[] bArr);

    boolean start(NoiseGatewayStartConfig noiseGatewayStartConfig);

    void stop();

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayCarrierHandle$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean $default$refusesOwnerOf(NoiseGatewayCarrierHandle noiseGatewayCarrierHandle, byte[] bArr) {
            return false;
        }

        public static /* synthetic */ boolean access$refusesOwnerOf$jd(NoiseGatewayCarrierHandle noiseGatewayCarrierHandle, byte[] bArr) {
            return false;
        }
    }
}
