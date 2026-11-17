package com.facebook.aura.network.traffic.nts;

import X.C4JM;
import X.C7384Etj;
import com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer;
import com.facebook.traffic.nts.providers.devicestore.DeviceStoreV2ProviderImplHolder;
import com.facebook.traffic.nts.providers.http.HttpProviderImpl;
import com.facebook.traffic.nts.providers.logger.LoggerProviderImpl;
import com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderImplHolder;
import com.facebook.traffic.nts.providers.reachability.TrafficNTSReachabilityV2ProviderAppLayerUpcallsImpl;

/* loaded from: classes6.dex */
public final class HatchTrafficNTSProvidersAppLayerImpl implements TrafficNTSProvidersAppLayer {
    public final HatchTrafficNTSManagerConfigImpl config;
    public ReachabilityV2ProviderImplHolder reachabilityV2ProviderImplHolder;

    public HatchTrafficNTSProvidersAppLayerImpl(HatchTrafficNTSManagerConfigImpl hatchTrafficNTSManagerConfigImpl) {
        C7384Etj.A0Y(hatchTrafficNTSManagerConfigImpl, 0);
        this.config = hatchTrafficNTSManagerConfigImpl;
        if (hatchTrafficNTSManagerConfigImpl.getEnableDeviceStoreV2Provider()) {
            DeviceStoreV2ProviderImplHolder.getInstance().setUpcallImpl(new HatchDeviceStoreProviderAppLayerUpcallsImpl());
        }
        if (hatchTrafficNTSManagerConfigImpl.enableReachabilityV2Provider) {
            initReachabilityV2Provider();
        }
    }

    private final synchronized void initReachabilityV2Provider() {
        if (this.reachabilityV2ProviderImplHolder == null) {
            ReachabilityV2ProviderImplHolder reachabilityV2ProviderImplHolder = ReachabilityV2ProviderImplHolder.getInstance();
            reachabilityV2ProviderImplHolder.setUpcallImpl(new TrafficNTSReachabilityV2ProviderAppLayerUpcallsImpl(C4JM.A00(), reachabilityV2ProviderImplHolder.getReachabilityV2ProviderAppLayer()));
            this.reachabilityV2ProviderImplHolder = reachabilityV2ProviderImplHolder;
        }
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public void eagerInitMobileProberEngines() {
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public boolean getAppFgBgStateProviderEnabled() {
        return false;
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public boolean getBackgroundTaskSchedulerEnabled() {
        return false;
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public boolean getDeviceStoreV2ProviderEnabled() {
        return this.config.getEnableDeviceStoreV2Provider();
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public boolean getEnableMobileProber() {
        return false;
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public HttpProviderImpl getHttpProvider() {
        return null;
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public LoggerProviderImpl getLoggerV2Provider() {
        return null;
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public boolean getRadioSignalProviderEnabled() {
        return false;
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public boolean getReachabilityV2ProviderEnabled() {
        return this.config.enableReachabilityV2Provider;
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public boolean getStartupSignalsProviderEnabled() {
        return false;
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public boolean getTelemetryClaimProviderEnabled() {
        return false;
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public boolean getUserDetailsProviderEnabled() {
        return false;
    }
}
