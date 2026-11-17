package com.facebook.aura.network.transport.tigon;

import X.C8j3;
import com.facebook.aura.network.transport.HatchNoisePrivateAuth;

/* loaded from: classes5.dex */
public interface NoiseGatewayCarrierFactory {

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayCarrierFactory$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ NoiseGatewayCarrierHandle create$default(NoiseGatewayCarrierFactory noiseGatewayCarrierFactory, HatchNoisePrivateAuth hatchNoisePrivateAuth, int i, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i & 1) != 0) {
                hatchNoisePrivateAuth = null;
            }
            return noiseGatewayCarrierFactory.create(hatchNoisePrivateAuth);
        }
    }

    NoiseGatewayCarrierHandle create(HatchNoisePrivateAuth hatchNoisePrivateAuth);

    public abstract class DefaultImpls {
    }
}
