package com.facebook.traffic.nts.providers.devicestore;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class DeviceStoreV2ProviderImplHolder {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public DeviceStoreV2ProviderImplHolder(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    public static final native DeviceStoreV2ProviderImplHolder getInstance();

    public final native DeviceStoreV2ProviderAppLayer getDeviceStoreV2ProviderAppLayer();

    public final native void setUpcallImpl(DeviceStoreV2ProviderAppLayerUpcalls deviceStoreV2ProviderAppLayerUpcalls);

    public final class Companion {
        public Companion() {
        }

        public final DeviceStoreV2ProviderImplHolder getInstance() {
            return DeviceStoreV2ProviderImplHolder.getInstance();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("device_store_provider");
    }

    public final void releaseHybrid() {
        this.mHybridData.resetNative();
    }
}
