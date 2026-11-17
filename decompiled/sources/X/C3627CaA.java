package X;

import com.facebook.quicklog.QuickPerformanceLoggerGKs;

/* renamed from: X.CaA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3627CaA implements QuickPerformanceLoggerGKs {
    public String[] getContextPropagationDomains() {
        return new String[0];
    }

    public int[] getHoldoutAllowedMarkerIds() {
        return new int[0];
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public boolean aggregateCrashEvents() {
        return false;
    }

    public long aggregationCachingIntervalMs() {
        return 0L;
    }

    public boolean delayListenersCreationV2() {
        return false;
    }

    public /* synthetic */ boolean deliverJoinEventsImmediately() {
        return false;
    }

    public boolean enableCrashReporting() {
        return false;
    }

    public boolean enableCrashResiliencyHigherGuaranteeStorage() {
        return false;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public boolean enableHealthCounters() {
        return false;
    }

    public boolean enableHealthCountersBgUpdate() {
        return false;
    }

    public boolean enableInstrumentationErrorDetection() {
        return false;
    }

    public boolean enableInstrumentationErrorDetectionV2() {
        return false;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public boolean enableTracing() {
        return false;
    }

    public String getContextPropagationScope() {
        return "";
    }

    public int getEnhancedInitStageTransitStrategy() {
        return 0;
    }

    public int getHealthCountersBufferSize() {
        return 0;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public int getHealthCountersInitStage() {
        return 0;
    }

    public int getHealthCountersSessionSamplingRate() {
        return 0;
    }

    public int getInstrumentationMistakesStackTraceSamplingRate() {
        return 0;
    }

    public int[] getMarkerLossTrackingOverrides() {
        return null;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public InterfaceC3173C1c getMetadataGKs() {
        return null;
    }

    public int getOrangeBoxV2DataBufferSize() {
        return 4096;
    }

    public int getOrangeBoxV2EventsTableSize() {
        return 500;
    }

    public int getOrangeBoxV3AnnotationsTableSize() {
        throw C8j3.A18("OrangeBox V3 is not yet default");
    }

    public int getOrangeBoxV3AnnotationsTableSizeForCriticallyLowDiskSpace() {
        return 0;
    }

    public int getOrangeBoxV3AnnotationsTableSizeForLowDiskSpace() {
        return 0;
    }

    public boolean getOrangeBoxV3AnnotationsUseHashFunctionV2() {
        return false;
    }

    public int getOrangeBoxV3EventsTableSize() {
        throw C8j3.A18("OrangeBox V3 is not yet default");
    }

    public int getOrangeBoxV3EventsTableSizeForCriticallyLowDiskSpace() {
        return 0;
    }

    public int getOrangeBoxV3EventsTableSizeForLowDiskSpace() {
        return 0;
    }

    public boolean getOrangeBoxV3EventsUseHashFunctionV2() {
        return false;
    }

    public int getOrangeBoxV3MaxAttemptCnt() {
        return 5;
    }

    public int getOrangeBoxVersion() {
        return 2;
    }

    public long getScrollHealthSampleRate() {
        return 0L;
    }

    public long getUpdatePeriodMs() {
        return 0L;
    }

    public boolean isAggregationDiskCacheEnabled() {
        return false;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public boolean isAppIdBasedConfigWithSamplingFallbackEnabled() {
        return false;
    }

    public boolean isContextPropagationEnabled() {
        return false;
    }

    public boolean isFileLoggingEnabled() {
        return false;
    }

    public boolean isFrameCounterEnabled() {
        return false;
    }

    public boolean isHealthMonitoringEnabled() {
        return false;
    }

    public boolean isLocalAggregationEnabled() {
        return false;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public boolean isMetadataProvidersFixEnabled() {
        return false;
    }

    public boolean isMethodTracerEnabled() {
        return false;
    }

    public boolean isMethodTracerInjectionEnabled() {
        return false;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public boolean isSamplingFallbackEnabled() {
        return false;
    }

    public boolean isScrollHealthTracingEnabled() {
        return false;
    }

    public int localAggregationEventLimit() {
        return 0;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public boolean orangeBoxAllocateFileOnInit() {
        return false;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public boolean replayEarlyEventsToCrashResiliency() {
        return false;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public boolean setLoggerOnMarkerStart() {
        return true;
    }

    public boolean shouldDelayXplatQPL() {
        return true;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public boolean shouldOffloadListeners() {
        return false;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public boolean shouldOptimiseBatchMutations() {
        return false;
    }

    public boolean shouldProcessPerfEventsOnIdle() {
        return true;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public boolean shouldReportTriggerSourceAsCrucial() {
        return true;
    }

    public boolean shouldSendAggregatedEventsOnBackground() {
        return false;
    }

    public boolean shouldTrackOrangeBoxDataLossRatio() {
        return false;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public boolean useEarlyConfigInEarlyStage() {
        return false;
    }

    public boolean useEarlyConfiguration() {
        return false;
    }

    public boolean useEnhancedInit() {
        return false;
    }

    public boolean useLazyAnalytics2LoggerForQplEvent() {
        return false;
    }

    public boolean useNativeHealthCounters() {
        return false;
    }

    public boolean useSelectedMarkersHoldout() {
        return false;
    }

    public boolean useSynchronizedAnnotationsList() {
        return false;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLoggerGKs
    public boolean useThreadLocalRandom() {
        return false;
    }
}
