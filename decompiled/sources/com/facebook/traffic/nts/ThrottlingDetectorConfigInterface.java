package com.facebook.traffic.nts;

/* loaded from: classes6.dex */
public interface ThrottlingDetectorConfigInterface {

    /* renamed from: com.facebook.traffic.nts.ThrottlingDetectorConfigInterface$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean $default$getUseShortTermHistogramForDominantRate(ThrottlingDetectorConfigInterface throttlingDetectorConfigInterface) {
            return false;
        }
    }

    boolean getEnableTasosSignalHeader();

    boolean getEnableTasosThrottlingHeader();

    boolean getEnableThrottlingDetector();

    boolean getEnableThrottlingMaintenanceExecutor();

    String getTasosSignalHeaderKey();

    long getTasosSignalMaxRateBps();

    int getTasosSignalMaxRateCounts();

    long getTasosSignalMinRateBps();

    int getTasosSignalRateCountsCoveragePct();

    int getTasosSignalThrottlingThresholdPct();

    String getTasosThrottlingHeaderKey();

    long getTasosThrottlingHeaderRefreshIntervalMs();

    String getThrottlingActiveDetectorKey();

    String getThrottlingAllowedDetectorTypes();

    int getThrottlingClientSignalMinIntervalSecs();

    boolean getThrottlingEnableFullHistogramWipe();

    int getThrottlingLogInterval();

    boolean getThrottlingLoggingEnabled();

    int getThrottlingLongTermHistogramLifetimeSecs();

    long getThrottlingMaintenanceIntervalMs();

    int getThrottlingMaxHistorySize();

    int getThrottlingMaxObservationAgeSecs();

    int getThrottlingRateExpirationSecs();

    String getThrottlingRateKey();

    String getThrottlingResponseHeaderKey();

    boolean getThrottlingShortTermHistogramEnabled();

    int getThrottlingShortTermSliceSecs();

    int getThrottlingShortTermWindowSecs();

    int getThrottlingStatePersistMinIntervalSecs();

    boolean getThrottlingStatePersistenceEnabled();

    boolean getThrottlingVerboseLoggingEnabled();

    boolean getUseShortTermHistogramForDominantRate();
}
