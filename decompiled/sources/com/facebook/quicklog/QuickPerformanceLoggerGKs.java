package com.facebook.quicklog;

import X.InterfaceC3173C1c;

/* loaded from: classes5.dex */
public interface QuickPerformanceLoggerGKs {
    boolean aggregateCrashEvents();

    boolean enableHealthCounters();

    boolean enableTracing();

    int getHealthCountersInitStage();

    InterfaceC3173C1c getMetadataGKs();

    boolean isAppIdBasedConfigWithSamplingFallbackEnabled();

    boolean isMetadataProvidersFixEnabled();

    boolean isSamplingFallbackEnabled();

    boolean orangeBoxAllocateFileOnInit();

    boolean replayEarlyEventsToCrashResiliency();

    boolean setLoggerOnMarkerStart();

    boolean shouldOffloadListeners();

    boolean shouldOptimiseBatchMutations();

    boolean shouldReportTriggerSourceAsCrucial();

    boolean useEarlyConfigInEarlyStage();

    boolean useThreadLocalRandom();
}
