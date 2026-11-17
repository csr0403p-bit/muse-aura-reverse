package com.facebook.traffic.nts;

import com.facebook.traffic.nts.providers.init.InitOption;

/* loaded from: classes3.dex */
public interface TrafficNTSManagerConfigInterface {
    AppNetSessionIdManagerConfigInterface getAppNetSessionIdManagerConfig();

    boolean getEnableAccessNetworkMetricsLogger();

    boolean getEnableAmp();

    boolean getEnableAppFgBgStateProvider();

    boolean getEnableAppLifeCycleObserver();

    boolean getEnableAppNetSessionIdManager();

    boolean getEnableConnectivityInfoProvider();

    boolean getEnableDeviceStoreV2Provider();

    boolean getEnableIpAssoc();

    boolean getEnableLoggerV2Provider();

    boolean getEnableNetSeer();

    boolean getEnableNetSeerV2();

    boolean getEnableNetSeerV2Prototype();

    boolean getEnableTasos();

    boolean getEnableTelemetryClaimProvider();

    boolean getEnableUserDetailsProvider();

    boolean getEnableUserPrefsProvider();

    TrafficNTSIPAssocConfigInterface getIpAssocConfig();

    TrafficNTSNetSeerV1ConfigInterface getNetSeerV1Config();

    TrafficNTSNetSeerV2ConfigInterface getNetSeerV2Config();

    RadioSignalProviderConfigInterface getRadioSignalProviderConfig();

    InitOption getRadioSignalProviderInitOption();

    TrafficNTSTasosConfigInterface getTasosConfig();
}
