package com.facebook.aura.network.traffic.nts;

import X.AnonymousClass001;
import X.C31u;
import X.C7462Ewq;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.network.traffic.nts.MC;
import com.facebook.traffic.nts.AppNetSessionIdManagerConfigInterface;
import com.facebook.traffic.nts.RadioSignalProviderConfigInterface;
import com.facebook.traffic.nts.TrafficNTSIPAssocConfigInterface;
import com.facebook.traffic.nts.TrafficNTSManagerConfigInterface;
import com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface;
import com.facebook.traffic.nts.TrafficNTSNetSeerV2ConfigInterface;
import com.facebook.traffic.nts.TrafficNTSTasosConfigInterface;
import com.facebook.traffic.nts.providers.init.InitOption;

/* loaded from: classes3.dex */
public final class HatchTrafficNTSManagerConfigImpl implements TrafficNTSManagerConfigInterface {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(HatchTrafficNTSManagerConfigImpl.class, "enabled", "<v#0>", 0), new C7462Ewq(HatchTrafficNTSManagerConfigImpl.class, "enabled", "<v#1>", 0)};
    public final AppNetSessionIdManagerConfigInterface appNetSessionIdManagerConfig;
    public final boolean enableAccessNetworkMetricsLogger;
    public final boolean enableAmp;
    public final boolean enableAppFgBgStateProvider;
    public final boolean enableAppLifeCycleObserver;
    public final boolean enableAppNetSessionIdManager;
    public final boolean enableConnectivityInfoProvider;
    public final boolean enableIpAssoc;
    public final boolean enableLoggerV2Provider;
    public final boolean enableNetSeer;
    public final boolean enableNetSeerV2;
    public final boolean enableNetSeerV2Prototype;
    public final boolean enableTasos;
    public final boolean enableTelemetryClaimProvider;
    public final boolean enableUserDetailsProvider;
    public final boolean enableUserPrefsProvider;
    public final TrafficNTSIPAssocConfigInterface ipAssocConfig;
    public final TrafficNTSNetSeerV1ConfigInterface netSeerV1Config;
    public final TrafficNTSNetSeerV2ConfigInterface netSeerV2Config;
    public final RadioSignalProviderConfigInterface radioSignalProviderConfig;
    public final TrafficNTSTasosConfigInterface tasosConfig = new HatchTrafficNTSTasosConfigImpl();
    public final boolean enableDeviceStoreV2Provider = enableDeviceStoreV2Provider$lambda$0$0(AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_traffic_nts_v2.enable_device_store_v2_provider));
    public final boolean enableReachabilityV2Provider = enableReachabilityV2Provider$lambda$0$0(AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_traffic_nts_v2.enable_reachability_v2_provider));
    public final InitOption radioSignalProviderInitOption = InitOption.DISABLED;

    public static final boolean enableDeviceStoreV2Provider$lambda$0$0(C31u<Object, Boolean> c31u) {
        return AnonymousClass001.A1X(C31u.A00(c31u, $$delegatedProperties));
    }

    public static final boolean enableReachabilityV2Provider$lambda$0$0(C31u<Object, Boolean> c31u) {
        return AnonymousClass001.A1X(c31u.getValue(null, $$delegatedProperties[1]));
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public AppNetSessionIdManagerConfigInterface getAppNetSessionIdManagerConfig() {
        return this.appNetSessionIdManagerConfig;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableAccessNetworkMetricsLogger() {
        return this.enableAccessNetworkMetricsLogger;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableAmp() {
        return this.enableAmp;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableAppFgBgStateProvider() {
        return this.enableAppFgBgStateProvider;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableAppLifeCycleObserver() {
        return this.enableAppLifeCycleObserver;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableAppNetSessionIdManager() {
        return this.enableAppNetSessionIdManager;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableConnectivityInfoProvider() {
        return this.enableConnectivityInfoProvider;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableDeviceStoreV2Provider() {
        return this.enableDeviceStoreV2Provider;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableIpAssoc() {
        return this.enableIpAssoc;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableLoggerV2Provider() {
        return this.enableLoggerV2Provider;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableNetSeer() {
        return this.enableNetSeer;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableNetSeerV2() {
        return this.enableNetSeerV2;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableNetSeerV2Prototype() {
        return this.enableNetSeerV2Prototype;
    }

    public final boolean getEnableReachabilityV2Provider() {
        return this.enableReachabilityV2Provider;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableTasos() {
        return this.enableTasos;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableTelemetryClaimProvider() {
        return this.enableTelemetryClaimProvider;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableUserDetailsProvider() {
        return this.enableUserDetailsProvider;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public boolean getEnableUserPrefsProvider() {
        return this.enableUserPrefsProvider;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public TrafficNTSIPAssocConfigInterface getIpAssocConfig() {
        return this.ipAssocConfig;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public TrafficNTSNetSeerV1ConfigInterface getNetSeerV1Config() {
        return this.netSeerV1Config;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public TrafficNTSNetSeerV2ConfigInterface getNetSeerV2Config() {
        return this.netSeerV2Config;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public RadioSignalProviderConfigInterface getRadioSignalProviderConfig() {
        return this.radioSignalProviderConfig;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public InitOption getRadioSignalProviderInitOption() {
        return this.radioSignalProviderInitOption;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public TrafficNTSTasosConfigInterface getTasosConfig() {
        return this.tasosConfig;
    }
}
