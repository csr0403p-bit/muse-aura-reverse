package com.facebook.traffic.nts.tasos.header_injector;

/* loaded from: classes6.dex */
public interface HeaderInjectorConfig {

    /* renamed from: com.facebook.traffic.nts.tasos.header_injector.HeaderInjectorConfig$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static String $default$getCongDetectServerConfigHeaderKey(HeaderInjectorConfig headerInjectorConfig) {
            return "";
        }

        public static String $default$getCongDetectServerConfigHeaderValue(HeaderInjectorConfig headerInjectorConfig) {
            return "";
        }

        public static boolean $default$getEnableCongDetectConfigHeaderInjection(HeaderInjectorConfig headerInjectorConfig) {
            return false;
        }
    }

    String getCongDetectServerConfigHeaderKey();

    String getCongDetectServerConfigHeaderValue();

    boolean getEnableCongDetectConfigHeaderInjection();

    boolean getEnableSsbweRequestHeaderInjection();

    boolean getEnableSsbweServerConfigHeaderInjection();

    boolean getEnableTasosHeaderInjector();

    String getExperimentalHeaderValue();

    String getProdThrottlingDetectorConfig();

    String getSsbweRequestHeaderKey();

    String getSsbweRequestHeaderValue();

    String getSsbweServerConfigHeaderKey();

    String getSsbweServerConfigHeaderValue();

    String getTasosBwBrokerHeaderKey();

    String getTasosBwBrokerHeaderValue();

    String getThrottlingDetectorConfigHeaderValue();

    String getThrottlingDetectorV2ConfigHeaderValue();

    String getTrafficGkQeHeaderValue();
}
