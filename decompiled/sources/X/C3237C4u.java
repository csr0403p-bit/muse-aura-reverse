package X;

import java.util.Map;

/* renamed from: X.C4u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3237C4u {
    public /* synthetic */ int anrRecoveryTimeoutEarlyOsVersionsMs() {
        return 30000;
    }

    public /* synthetic */ int anrRecoveryTimeoutMs() {
        return 30000;
    }

    public /* synthetic */ int anrWarningActionsMask() {
        return 0;
    }

    public /* synthetic */ int anrWarningMemoryRedHoldMs() {
        return 30000;
    }

    public /* synthetic */ int anrWarningMemoryRedMode() {
        return 0;
    }

    public /* synthetic */ int anrWarningReportMaxEntries() {
        return 5;
    }

    public /* synthetic */ boolean avoidLoadingFullReportWhenSending() {
        return false;
    }

    public /* synthetic */ int backgroundANRSamplingRate() {
        return 0;
    }

    public /* synthetic */ int backgroundJavaSamplingRate() {
        return 0;
    }

    public /* synthetic */ int backgroundNativeSamplingRate() {
        return 0;
    }

    public /* synthetic */ int backgroundUnexplainedIfHasBeenForegroundSamplingRate() {
        return 0;
    }

    public /* synthetic */ int backgroundUnexplainedSamplingRate() {
        return 0;
    }

    public /* synthetic */ int broadcastReceiverPriority() {
        return -4;
    }

    public /* synthetic */ boolean captureLogcatAtNativeCrashTime() {
        return false;
    }

    public /* synthetic */ boolean checkForegroundStateBeforeFirstActivityTransition() {
        return false;
    }

    public /* synthetic */ boolean collectLmkAdjAndMinFree() {
        return false;
    }

    public /* synthetic */ boolean considerFgInitFirstForeground() {
        return false;
    }

    public /* synthetic */ boolean delayAddingExtraMemoryCollector() {
        return false;
    }

    public /* synthetic */ boolean disableAbortHooks() {
        return false;
    }

    public /* synthetic */ boolean disableEarlyJavaInitSendReports() {
        return false;
    }

    public /* synthetic */ boolean disableGlobalPropForBGDetector() {
        return false;
    }

    public /* synthetic */ boolean disableLacrima() {
        return false;
    }

    public /* synthetic */ boolean disableLacrimaScreenBroadcastReceiver() {
        return false;
    }

    public /* synthetic */ boolean disableReportAssemblyAndSend() {
        return false;
    }

    public /* synthetic */ boolean doAsyncMultiWindowQuery() {
        return false;
    }

    public /* synthetic */ boolean enableBatteryDetector() {
        return true;
    }

    public /* synthetic */ boolean enableEmulatorFileSignalCollector() {
        return false;
    }

    public /* synthetic */ boolean enableGpuInfoCollector() {
        return false;
    }

    public /* synthetic */ boolean enableMemoryDetector() {
        return true;
    }

    public /* synthetic */ boolean enableThermalInfoCollector() {
        return false;
    }

    public /* synthetic */ boolean enableThermalOnCrashDetectors() {
        return false;
    }

    public /* synthetic */ boolean enableVulkanInfoCollector() {
        return false;
    }

    public /* synthetic */ int exitInfoHistoryCount() {
        return 0;
    }

    public /* synthetic */ long getAbortHooksEnableFlags() {
        return 15L;
    }

    public /* synthetic */ int getAbortHooksMaxMessageLength() {
        return 0;
    }

    public /* synthetic */ Map getBlackBoxUploadProbabilityByType() {
        return null;
    }

    public /* synthetic */ int getBlackBoxUploadProbabilityOnBackground() {
        return 0;
    }

    public /* synthetic */ int getClassesToTrackOnGlobalRefMonitor() {
        return 0;
    }

    public /* synthetic */ int getDelayTimeForReboundCalculationMs() {
        return 0;
    }

    public /* synthetic */ String getEmulatorFileSignalPaths() {
        return "";
    }

    public /* synthetic */ int getHistoryBufferOperationHistorySize() {
        return 0;
    }

    public /* synthetic */ int getJavaTracesDividingFactor() {
        return 0;
    }

    public /* synthetic */ int getLargeBackgroundAnrReportingStrategy() {
        return 0;
    }

    public /* synthetic */ int getLevel1InstacrashThreshold() {
        return 2;
    }

    public /* synthetic */ int getLevel2InstacrashThreshold() {
        return 5;
    }

    public /* synthetic */ int getLevel3InstacrashThreshold() {
        return 10;
    }

    public /* synthetic */ boolean getLogStringValueOnFullGlobalRefMonitoring() {
        return false;
    }

    public /* synthetic */ int getLogcatMaxLines() {
        return 200;
    }

    public /* synthetic */ int getMaximumLengthForStringProperties() {
        return 0;
    }

    public /* synthetic */ int getMaximumNumberOfLifecycleEventsToReport() {
        return 0;
    }

    public /* synthetic */ int getMaximumSenderQueueSize() {
        return 0;
    }

    public /* synthetic */ int getMemorySnapshotIntervalSec() {
        return 30;
    }

    public /* synthetic */ long getMobileConfigCanaryIntervalMs() {
        return 1000L;
    }

    public /* synthetic */ int getNumberOfGlobalRefCountsToLog() {
        return 0;
    }

    public /* synthetic */ long getPeriodicBatteryInfoCollectionInterval() {
        return 30L;
    }

    public /* synthetic */ int getProcessErrorMonitorIntervalMs() {
        return 500;
    }

    public /* synthetic */ int getProcessErrorMonitorTimesHistorySize() {
        return 0;
    }

    public /* synthetic */ int getProfilingRateLimitPeriodInHours() {
        return 0;
    }

    public /* synthetic */ int getProfilingTriggersMask() {
        return 0;
    }

    public /* synthetic */ long getReboundTimeLimitMs() {
        return 0L;
    }

    public /* synthetic */ String getSanitizedAttachments() {
        return "";
    }

    public /* synthetic */ String getSanitizerDropAttachments() {
        return "";
    }

    public /* synthetic */ String getSanitizerDropFields() {
        return "";
    }

    public /* synthetic */ String getSanitizerPattern() {
        return "";
    }

    public /* synthetic */ String getSanitizerReplacementText() {
        return "";
    }

    public /* synthetic */ int getSigquitBehaviorBasedOnUid() {
        return 0;
    }

    public /* synthetic */ boolean getSuspendWhenInstallingGlobalRefMonitor() {
        return true;
    }

    public /* synthetic */ long getThermalInfoCollectionIntervalSec() {
        return 10L;
    }

    public /* synthetic */ int getTraceProfilingMaxFilesToKeep() {
        return 10;
    }

    public /* synthetic */ int getTraceProfilingUploadMaxChunkSizeKb() {
        return 0;
    }

    public /* synthetic */ boolean getTrackGlobalRefCountsPerInstance() {
        return false;
    }

    public /* synthetic */ boolean hasOnDeviceTraceSampling() {
        return true;
    }

    public /* synthetic */ boolean isAnrAvoidMutexOnSignalHandler() {
        return false;
    }

    public /* synthetic */ boolean isAnrCollectLargeReports() {
        return true;
    }

    public /* synthetic */ boolean isAnrLogOnSignalHandler() {
        return false;
    }

    public /* synthetic */ boolean isAnrRecordSignalTime() {
        return false;
    }

    public /* synthetic */ boolean isAnrReportSoftErrors() {
        return true;
    }

    public /* synthetic */ boolean isAnrWarningListenerEnabled() {
        return false;
    }

    public /* synthetic */ boolean isBlackBoxAnrAppDeathCollectionEnabled() {
        return false;
    }

    public /* synthetic */ boolean isBlackBoxAnrCollectionEnabled() {
        return false;
    }

    public /* synthetic */ boolean isBlackBoxAnyTraceFallbackEnabled() {
        return false;
    }

    public /* synthetic */ boolean isBlackBoxJavaCrashCollectionEnabled() {
        return false;
    }

    public /* synthetic */ boolean isBlackBoxMultiTenantCollectionEnabled() {
        return true;
    }

    public /* synthetic */ boolean isBlackBoxNativeCrashCollectionEnabled() {
        return false;
    }

    public /* synthetic */ boolean isBlackBoxTraceAsReportAttachmentEnabled() {
        return false;
    }

    public boolean isBlackBoxUfadCollectionEnabled() {
        return false;
    }

    public /* synthetic */ boolean isCustomPropertiesEnabled() {
        return true;
    }

    public /* synthetic */ boolean isDelayLaterInitDetector() {
        return false;
    }

    public /* synthetic */ boolean isEnableOxygenCrashReporter() {
        return false;
    }

    public /* synthetic */ boolean isForegroundTransitionEnabled() {
        return true;
    }

    public /* synthetic */ boolean isGlobalLibraryCollectorEnabled() {
        return false;
    }

    public /* synthetic */ boolean isKeepNavigationEndpointHistoryEnabled() {
        return false;
    }

    public /* synthetic */ boolean isKeepNavigationHistoryEnabled() {
        return false;
    }

    public boolean isLacrimaFilesCollectorEnabled() {
        return false;
    }

    public /* synthetic */ boolean isLibunwindstackElfCacheEnabled() {
        return false;
    }

    public /* synthetic */ boolean isMobileConfigCanaryEnabled() {
        return true;
    }

    public /* synthetic */ boolean isMobileConfigCanaryUsePolling() {
        return false;
    }

    public /* synthetic */ boolean isMonitorNativelibrariesContinuouslyEnabled() {
        return true;
    }

    public /* synthetic */ boolean isNativeEnabled() {
        return true;
    }

    public /* synthetic */ boolean isNativelibrariesEnabled() {
        return false;
    }

    public /* synthetic */ boolean isNotifyAndApplyInBackground() {
        return true;
    }

    public /* synthetic */ boolean isProfilingEnabled() {
        return false;
    }

    public /* synthetic */ boolean isReportThrottlingEnabled() {
        return false;
    }

    public /* synthetic */ boolean isResumableUploadEnabled() {
        return false;
    }

    public /* synthetic */ boolean isSanitizerEnabled() {
        return false;
    }

    public /* synthetic */ boolean isSoftErrorCustomPropertiesEnabled() {
        return true;
    }

    public /* synthetic */ boolean isTombstoneSessionIdEnabled() {
        return false;
    }

    public /* synthetic */ boolean isTooManySessionsBlocking() {
        return true;
    }

    public /* synthetic */ boolean isUnwindStackEnabled() {
        return true;
    }

    public /* synthetic */ boolean isViewWrongThreadListenerEnabled() {
        return false;
    }

    public /* synthetic */ int lifecycleTickerIntervalMs() {
        return 0;
    }

    public /* synthetic */ boolean looperCollectorUseAllocateDirect() {
        return false;
    }

    public /* synthetic */ int memoryPressureCollectionIntervalSec() {
        return 0;
    }

    public /* synthetic */ boolean memoryTrimListenerEnabled() {
        return false;
    }

    public /* synthetic */ boolean nativeMemoryCollectorEnabled() {
        return false;
    }

    public /* synthetic */ boolean notifyJavaOnSigquit() {
        return false;
    }

    public /* synthetic */ boolean notifyJavaOnSigquitInfo() {
        return false;
    }

    public /* synthetic */ boolean preserveNavigationOnBackground() {
        return false;
    }

    public /* synthetic */ int processImportanceForegroundLimit() {
        return 100;
    }

    public /* synthetic */ boolean recordOnPauseRequestReceived() {
        return false;
    }

    public /* synthetic */ boolean recordOnPauseRequestStartExecuting() {
        return false;
    }

    public /* synthetic */ boolean recordUserLeaveMainThreadAcknowledgement() {
        return false;
    }

    public /* synthetic */ boolean registerLifecycleCallbacksFirst() {
        return false;
    }

    public /* synthetic */ int removeTaskUBADSamplingRate() {
        return 0;
    }

    public /* synthetic */ boolean reportANR() {
        return true;
    }

    public /* synthetic */ boolean reportBackgroundANR() {
        return false;
    }

    public /* synthetic */ boolean reportBackgroundJava() {
        return true;
    }

    public /* synthetic */ boolean reportBackgroundNative() {
        return true;
    }

    public /* synthetic */ boolean reportBackgroundUnexplained() {
        return false;
    }

    public /* synthetic */ boolean reportBackgroundUnexplainedIfHasBeenForeground() {
        return false;
    }

    public /* synthetic */ boolean reportForegroundUnexplained() {
        return true;
    }

    public /* synthetic */ boolean reportMemoryNumbers() {
        return true;
    }

    public /* synthetic */ boolean reportMemoryRedState() {
        return false;
    }

    public /* synthetic */ boolean reportMemoryTimelineData() {
        return false;
    }

    public /* synthetic */ boolean reportMemoryTimelineEvents() {
        return false;
    }

    public /* synthetic */ boolean reportRawLifecycleBufferOnCorruption() {
        return false;
    }

    public /* synthetic */ boolean reportRemoveTaskUBAD() {
        return false;
    }

    public /* synthetic */ boolean reportSoftErrors() {
        return true;
    }

    public /* synthetic */ int reportThrottlingMaxReportsInWindow() {
        return 25;
    }

    public /* synthetic */ int reportThrottlingThrottleWindowInMinutes() {
        return 5;
    }

    public /* synthetic */ boolean runUnexplainedDetectorOnNativeInit() {
        return false;
    }

    public /* synthetic */ int sampleRateNativeJvmStreamConfig() {
        return 1;
    }

    public /* synthetic */ boolean saveReboundTimeToDisk() {
        return false;
    }

    public /* synthetic */ boolean sendJavaStackOnCriticalReports() {
        return true;
    }

    public /* synthetic */ boolean sendLargeReport() {
        return true;
    }

    public /* synthetic */ boolean sendReboundProcessId() {
        return false;
    }

    public /* synthetic */ boolean sendSoftErrorOnSendError() {
        return false;
    }

    public /* synthetic */ boolean setDumpableOnNativeOomScoreReader() {
        return false;
    }

    public /* synthetic */ boolean shouldAddPendingJobsCollectorToJavaConfig() {
        return false;
    }

    public /* synthetic */ boolean shouldAttachMQDCollectorInLaterInit() {
        return false;
    }

    public /* synthetic */ boolean shouldAvoidLogcatCaptureReentry() {
        return false;
    }

    public /* synthetic */ boolean shouldCollectActivityManagerRequest() {
        return false;
    }

    public /* synthetic */ boolean shouldCollectActivityThreadMessage() {
        return false;
    }

    public /* synthetic */ boolean shouldCollectMixersDecoupled() {
        return false;
    }

    public /* synthetic */ boolean shouldCollectRecentParcelables() {
        return false;
    }

    public /* synthetic */ boolean shouldConsiderStartupUfadAsForeground() {
        return false;
    }

    public /* synthetic */ boolean shouldConvertSelfSigkillsToNativeCrashesWhenInForegroundAccordingToFADv2() {
        return false;
    }

    public /* synthetic */ boolean shouldDelayBroadcastReceiverConfig() {
        return false;
    }

    public /* synthetic */ boolean shouldDelayShutdownBootReceiver() {
        return false;
    }

    public /* synthetic */ boolean shouldDisableApplicationLifecycleDetectorCollections() {
        return false;
    }

    public /* synthetic */ boolean shouldDumpSelfKillSignals() {
        return false;
    }

    public /* synthetic */ boolean shouldEnterForegroundWhenProcessStateTop() {
        return false;
    }

    public /* synthetic */ boolean shouldIncludeAppExitTrace() {
        return false;
    }

    public /* synthetic */ boolean shouldIncludeAppExitTraceInCriticalReports() {
        return false;
    }

    public /* synthetic */ boolean shouldIncludeGlobalPropertiesRestartForAppDeath() {
        return false;
    }

    public /* synthetic */ boolean shouldIncludeQPL() {
        return true;
    }

    public /* synthetic */ boolean shouldKeepForegroundOnTransitionOutOfSplash() {
        return false;
    }

    public /* synthetic */ boolean shouldLoadSigQuitLibOnSameThread() {
        return false;
    }

    public /* synthetic */ boolean shouldLogHistoryBufferContentsOnSoftError() {
        return false;
    }

    public /* synthetic */ boolean shouldLookForMemoryProviderActivation() {
        return false;
    }

    public /* synthetic */ boolean shouldMaskSigquitInHandler() {
        return false;
    }

    public /* synthetic */ boolean shouldMonitorAllocatorTypeOnOom() {
        return false;
    }

    public /* synthetic */ boolean shouldMonitorThreadLocalKeyCreation() {
        return false;
    }

    public /* synthetic */ boolean shouldOnPauseHookUseHiddenApis() {
        return false;
    }

    public /* synthetic */ boolean shouldParseJavaExceptionHandlerLog() {
        return false;
    }

    public /* synthetic */ boolean shouldReportChromeOS() {
        return false;
    }

    public /* synthetic */ boolean shouldReportCrashLoops() {
        return false;
    }

    public /* synthetic */ boolean shouldReportFgImportance() {
        return false;
    }

    public /* synthetic */ boolean shouldReportKnownBuildFields() {
        return false;
    }

    public /* synthetic */ boolean shouldReportStartupProcessImportance() {
        return false;
    }

    public /* synthetic */ boolean shouldSetProcessStateSummary() {
        return false;
    }

    public /* synthetic */ boolean shouldTruncateLargeStringProperties() {
        return false;
    }

    public /* synthetic */ boolean shouldTryToSendJavaReportsAtCrashTime() {
        return false;
    }

    public /* synthetic */ boolean shouldUserRecordMarkersOnLifecycleBuffer() {
        return false;
    }

    public /* synthetic */ int softErrorsDeprecationSamplingRatio() {
        return 1;
    }

    public /* synthetic */ boolean trackLifecycleHistory() {
        return true;
    }

    public /* synthetic */ boolean trackOnRestart() {
        return false;
    }

    public /* synthetic */ boolean trackOnUserLeaveHint() {
        return false;
    }

    public /* synthetic */ boolean useIntentPeeker() {
        return false;
    }

    public /* synthetic */ boolean useLightMobileConfigDetector() {
        return false;
    }

    public /* synthetic */ boolean useLyra() {
        return false;
    }

    public /* synthetic */ boolean useNativeOomScoreReader() {
        return false;
    }

    public /* synthetic */ boolean useSeparateSignalHandlerForLogcatCapture() {
        return false;
    }

    public /* synthetic */ boolean useWorkManagerForRecovery() {
        return false;
    }

    public /* synthetic */ int viewWrongThreadListenerWhenToInit() {
        return 0;
    }

    public /* synthetic */ int whenToInitGlobalRefMonitor() {
        return 3;
    }

    public /* synthetic */ int whenToInitProfilingRequest() {
        return 0;
    }

    public /* synthetic */ int whenToTrackJavaExceptionHandlersExecution() {
        return 0;
    }

    public /* synthetic */ int whenToTriggerTraceUpload() {
        return 0;
    }

    public /* synthetic */ boolean writeThreadLocalMonitoringOnCreation() {
        return false;
    }
}
