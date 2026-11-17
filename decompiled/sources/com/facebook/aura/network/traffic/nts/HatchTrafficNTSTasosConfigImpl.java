package com.facebook.aura.network.traffic.nts;

import com.facebook.traffic.nts.CongestionManagerConfigInterface;
import com.facebook.traffic.nts.DccManagerConfigInterface;
import com.facebook.traffic.nts.ThrottlingDetectorConfigInterface;
import com.facebook.traffic.nts.TrafficNTSTasosConfigInterface;
import com.facebook.traffic.nts.tasos.bwe_state_logger.BandwidthStateLoggerConfig;
import com.facebook.traffic.nts.tasos.bwemanager.BWEManagerV2Config;
import com.facebook.traffic.nts.tasos.download_bwe_logger.DownloadBweLoggerConfig;
import com.facebook.traffic.nts.tasos.header_injector.HeaderInjectorConfig;
import com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig;
import com.facebook.traffic.nts.tasos.upload_bwe_logger.UploadBweLoggerConfig;

/* loaded from: classes6.dex */
public final class HatchTrafficNTSTasosConfigImpl implements TrafficNTSTasosConfigInterface {
    public final BandwidthStateLoggerConfig bandwidthStateLoggerConfig;
    public final BWEManagerV2Config bweManagerV2Config;
    public final CongestionManagerConfigInterface congestionManagerConfig;
    public final DownloadBweLoggerConfig downloadBweLoggerConfig;
    public final boolean enableDownloadBweLogger;
    public final boolean enableHttpLayerBwe;
    public final boolean enableRadioMetricsHeaderInjection;
    public final boolean enableTasosBandwidthStateLogger;
    public final boolean enableTasosBweManagerV2;
    public final boolean enableTasosCongestionManager;
    public final boolean enableTasosHeaderInjector;
    public final boolean enableTasosNetworkInfo;
    public final boolean enableThrottlingDetector;
    public final boolean enableUploadBweLogger;
    public final HeaderInjectorConfig headerInjectorConfig;
    public final HttpLayerBweConfig httpLayerBweConfig;
    public final ThrottlingDetectorConfigInterface throttlingDetectorConfig;
    public final UploadBweLoggerConfig uploadBweLoggerConfig;

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public BandwidthStateLoggerConfig getBandwidthStateLoggerConfig() {
        return this.bandwidthStateLoggerConfig;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public BWEManagerV2Config getBweManagerV2Config() {
        return this.bweManagerV2Config;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public CongestionManagerConfigInterface getCongestionManagerConfig() {
        return this.congestionManagerConfig;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public /* bridge */ DccManagerConfigInterface getDccManagerConfig() {
        return null;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public DownloadBweLoggerConfig getDownloadBweLoggerConfig() {
        return this.downloadBweLoggerConfig;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public boolean getEnableDownloadBweLogger() {
        return this.enableDownloadBweLogger;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public boolean getEnableHttpLayerBwe() {
        return this.enableHttpLayerBwe;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public boolean getEnableRadioMetricsHeaderInjection() {
        return this.enableRadioMetricsHeaderInjection;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public boolean getEnableTasosBandwidthStateLogger() {
        return this.enableTasosBandwidthStateLogger;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public boolean getEnableTasosBweManagerV2() {
        return this.enableTasosBweManagerV2;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public boolean getEnableTasosCongestionManager() {
        return this.enableTasosCongestionManager;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public /* bridge */ boolean getEnableTasosDccManager() {
        return false;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public boolean getEnableTasosHeaderInjector() {
        return this.enableTasosHeaderInjector;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public boolean getEnableTasosNetworkInfo() {
        return this.enableTasosNetworkInfo;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public boolean getEnableThrottlingDetector() {
        return this.enableThrottlingDetector;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public boolean getEnableUploadBweLogger() {
        return this.enableUploadBweLogger;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public HeaderInjectorConfig getHeaderInjectorConfig() {
        return this.headerInjectorConfig;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public HttpLayerBweConfig getHttpLayerBweConfig() {
        return this.httpLayerBweConfig;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public ThrottlingDetectorConfigInterface getThrottlingDetectorConfig() {
        return this.throttlingDetectorConfig;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
    public UploadBweLoggerConfig getUploadBweLoggerConfig() {
        return this.uploadBweLoggerConfig;
    }
}
