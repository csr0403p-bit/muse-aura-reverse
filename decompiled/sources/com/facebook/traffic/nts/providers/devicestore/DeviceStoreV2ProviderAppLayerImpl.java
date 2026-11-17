package com.facebook.traffic.nts.providers.devicestore;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class DeviceStoreV2ProviderAppLayerImpl implements DeviceStoreV2ProviderAppLayer {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public DeviceStoreV2ProviderAppLayerImpl(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.traffic.nts.providers.devicestore.DeviceStoreV2ProviderAppLayer
    public native void setUpcallImpl(DeviceStoreV2ProviderAppLayerUpcalls deviceStoreV2ProviderAppLayerUpcalls);

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("device_store_provider");
    }
}
