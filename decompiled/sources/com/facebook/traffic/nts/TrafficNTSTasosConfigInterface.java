package com.facebook.traffic.nts;

import com.facebook.traffic.nts.tasos.bwe_state_logger.BandwidthStateLoggerConfig;
import com.facebook.traffic.nts.tasos.bwemanager.BWEManagerV2Config;
import com.facebook.traffic.nts.tasos.download_bwe_logger.DownloadBweLoggerConfig;
import com.facebook.traffic.nts.tasos.header_injector.HeaderInjectorConfig;
import com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig;
import com.facebook.traffic.nts.tasos.upload_bwe_logger.UploadBweLoggerConfig;

/* loaded from: classes6.dex */
public interface TrafficNTSTasosConfigInterface {

    /* renamed from: com.facebook.traffic.nts.TrafficNTSTasosConfigInterface$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static DccManagerConfigInterface $default$getDccManagerConfig(TrafficNTSTasosConfigInterface trafficNTSTasosConfigInterface) {
            return null;
        }

        public static boolean $default$getEnableTasosDccManager(TrafficNTSTasosConfigInterface trafficNTSTasosConfigInterface) {
            return false;
        }
    }

    BandwidthStateLoggerConfig getBandwidthStateLoggerConfig();

    BWEManagerV2Config getBweManagerV2Config();

    CongestionManagerConfigInterface getCongestionManagerConfig();

    DccManagerConfigInterface getDccManagerConfig();

    DownloadBweLoggerConfig getDownloadBweLoggerConfig();

    boolean getEnableDownloadBweLogger();

    boolean getEnableHttpLayerBwe();

    boolean getEnableRadioMetricsHeaderInjection();

    boolean getEnableTasosBandwidthStateLogger();

    boolean getEnableTasosBweManagerV2();

    boolean getEnableTasosCongestionManager();

    boolean getEnableTasosDccManager();

    boolean getEnableTasosHeaderInjector();

    boolean getEnableTasosNetworkInfo();

    boolean getEnableThrottlingDetector();

    boolean getEnableUploadBweLogger();

    HeaderInjectorConfig getHeaderInjectorConfig();

    HttpLayerBweConfig getHttpLayerBweConfig();

    ThrottlingDetectorConfigInterface getThrottlingDetectorConfig();

    UploadBweLoggerConfig getUploadBweLoggerConfig();
}
