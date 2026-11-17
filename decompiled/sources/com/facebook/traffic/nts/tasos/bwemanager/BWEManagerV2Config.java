package com.facebook.traffic.nts.tasos.bwemanager;

/* loaded from: classes6.dex */
public interface BWEManagerV2Config {
    long getABRMaxBweConfidenceValue();

    long getABRMinBweConfidenceValue();

    double getBadNetworkQualityHighConfScaleFactor();

    double getBadNetworkQualityLowConfScaleFactor();

    double getBadNetworkQualityMediumConfScaleFactor();

    long getBadNetworkQualityScaleFactorThresholdBps();

    boolean getEnableBase64EncodingForSsBweCacheStore();

    boolean getEnableHistogramRateBweMetadata();

    boolean getEnableOptimizedStateGetter();

    boolean getEnableSSBweChangePointConfidenceConsumption();

    boolean getEnableSSBweDetailedLogging();

    boolean getEnableSSBweHttpStores();

    boolean getEnableSSBwePrefetchObservedScaling();

    boolean getEnableSSBweScaleFactorVodWifi();

    boolean getEnableSSBweTrailersProcessing();

    boolean getEnableSSBweTtfbAdjustmentForVod();

    boolean getEnableSconeRateCap();

    boolean getEnableServerThrottlingRateCap();

    boolean getEnableSsBweScalingRationalGambler();

    TasosBweSnapshotConfig getFBFeedBweSnapshotConfig();

    TasosBweSnapshotConfig getFBImageBweSnapshotConfig();

    boolean getReturnBweMetadataWithoutUsableSignals();

    long getSSBweAdjustmentValueBpsFNFStitchTuning();

    long getSSBweAdjustmentValueBpsLive();

    long getSSBweAdjustmentValueBpsVod();

    String getSSBweChangePointConfidenceKey();

    String getSSBweConfidenceValueKey();

    long getSSBweConfidenceValueThreshold();

    long getSSBweConfidenceValueThresholdImage();

    String getSSBweDebugHeaderPrefix();

    long getSSBweDefaultConfidenceForFNFStitchTuning();

    String getSSBweDetectedThrottlingRateKey();

    String getSSBweHeaderKeyImage();

    String getSSBweHeaderKeyLive();

    String getSSBweHeaderKeyVod();

    String getSSBweHeadersToRecord();

    double getSSBweHighConfidenceScaleFactorFNFStitchTuning();

    double getSSBweHighConfidenceScaleFactorLive();

    double getSSBweHighConfidenceScaleFactorVod();

    long getSSBweHighConfidenceThresholdPercent();

    String getSSBweHighConfidenceValueKey();

    String getSSBweLongTermSustainableRateValueKey();

    double getSSBweLowConfidenceScaleFactorFNFStitchTuning();

    double getSSBweLowConfidenceScaleFactorLive();

    double getSSBweLowConfidenceScaleFactorVod();

    long getSSBweLowConfidenceThresholdPercent();

    String getSSBweLowConfidenceValueKey();

    double getSSBweMaxScaleFactorLive();

    double getSSBweMaxScaleFactorVod();

    double getSSBweMaxScaleFactorVodWifi();

    String getSSBweMeanValueKey();

    double getSSBweMediumConfidenceScaleFactorFNFStitchTuning();

    double getSSBweMediumConfidenceScaleFactorLive();

    double getSSBweMediumConfidenceScaleFactorVod();

    long getSSBweMediumConfidenceThresholdPercent();

    String getSSBweMediumConfidenceValueKey();

    double getSSBweMinScaleFactorLive();

    double getSSBweMinScaleFactorVod();

    double getSSBweMinScaleFactorVodWifi();

    long getSSBwePrefetchActiveHistoryWindowMs();

    double getSSBwePrefetchObservedHighConfidenceScaleFactorLive();

    double getSSBwePrefetchObservedHighConfidenceScaleFactorVod();

    double getSSBwePrefetchObservedLowConfidenceScaleFactorLive();

    double getSSBwePrefetchObservedLowConfidenceScaleFactorVod();

    double getSSBwePrefetchObservedMediumConfidenceScaleFactorLive();

    double getSSBwePrefetchObservedMediumConfidenceScaleFactorVod();

    String getSSBweServerRecommendedScalingMaxKey();

    String getSSBweServerRecommendedScalingMaxPrefetchKey();

    String getSSBweServerRecommendedScalingMinKey();

    String getSSBweServerRecommendedScalingMinPrefetchKey();

    String getSSBweTrailerKeyImage();

    String getSSBweTrailerKeyLive();

    String getSSBweTrailerKeyVod();

    String getSSBweTransferTimesValueKey();

    String getSSBweTtfbValueKey();

    boolean getSSBweUseImageStoreForImage();

    boolean getSSbweStaleWindowDetectionEnabled();

    long getSSbweStaleWindowDetectionTime();

    boolean getSSbweStateLoadFromCacheStore();

    boolean getSSbweStateLoadFromCacheStoreImage();

    boolean getSSbweStateSaveToCacheStore();

    boolean getSSbweStateSaveToCacheStoreImage();

    long getSSbweStateStoreMinIntervalSecs();

    long getSSbweVsClientStaleDetectionTime();

    String getSconeRateCapHeaderKey();

    long getSconeRateCapLowerBoundBps();

    long getSconeRateCapMaxAgeSecs();

    double getTimeSinceSessionStartHighConfScaleFactor();

    double getTimeSinceSessionStartLowConfScaleFactor();

    double getTimeSinceSessionStartMediumConfScaleFactor();

    long getTimeSinceSessionStartScaleFactorThreshSecs();

    boolean getUseDirectClientEstimate();

    boolean getUseSSBweForFNFStitchTuning();

    boolean getUseSSBweForImage();

    boolean getUseSSBweForLive();

    boolean getUseSSBweForVod();

    boolean getUseSSBweForVodOnCell();

    boolean getUseServerRecommendedScaling();
}
