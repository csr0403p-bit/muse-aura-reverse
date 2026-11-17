package com.facebook.traffic.nts.providers;

import com.facebook.traffic.nts.providers.http.HttpProviderImpl;
import com.facebook.traffic.nts.providers.logger.LoggerProviderImpl;

/* loaded from: classes6.dex */
public interface TrafficNTSProvidersAppLayer {
    void eagerInitMobileProberEngines();

    boolean getAppFgBgStateProviderEnabled();

    boolean getBackgroundTaskSchedulerEnabled();

    boolean getDeviceStoreV2ProviderEnabled();

    boolean getEnableMobileProber();

    HttpProviderImpl getHttpProvider();

    LoggerProviderImpl getLoggerV2Provider();

    boolean getRadioSignalProviderEnabled();

    boolean getReachabilityV2ProviderEnabled();

    boolean getStartupSignalsProviderEnabled();

    boolean getTelemetryClaimProviderEnabled();

    boolean getUserDetailsProviderEnabled();
}
