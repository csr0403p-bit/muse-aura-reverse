package com.facebook.exoplayer.formatevaluator.configuration;

import X.AbstractC6126DwS;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C5092DXa;
import X.C5099DXq;
import X.C5100DXr;
import X.C5686DnS;
import X.C5691DnY;
import X.C5815Dpz;
import X.C5845Dqb;
import X.C5959Dsu;
import X.C6127DwT;
import X.C6285Dzh;
import X.C7384Etj;
import X.DF1;
import X.DqM;
import X.EnumC5744Dof;
import X.InterfaceC4887DDb;
import android.net.ConnectivityManager;

/* loaded from: classes5.dex */
public final class AbrContextAwareConfiguration {
    public static final long RRR_DIGITS_LOWER_BOUND = 2;
    public final C5686DnS abrSetting;
    public final DF1 audioRoutingInterface;
    public final C5092DXa connectivityManagerHolder;
    public final boolean enableForegroundPrefetchQualityExperimentation;
    public final boolean isBackgroundPrefetch;
    public final boolean isIGStory;
    public final boolean isLive;
    public final boolean isPrefetch;
    public final boolean isSponsored;
    public final boolean isStory;
    public final boolean isThumbnail;
    public final C5099DXq networkPropertiesMonitor;
    public final C5815Dpz playbackPreferences;
    public final InterfaceC4887DDb tasosSignalsInterface;

    public AbrContextAwareConfiguration(C5686DnS c5686DnS, C5092DXa c5092DXa, InterfaceC4887DDb interfaceC4887DDb, DF1 df1, C5815Dpz c5815Dpz, boolean z, boolean z2, C5099DXq c5099DXq) {
        AnonymousClass005.A11(c5686DnS, interfaceC4887DDb, df1, 0);
        C7384Etj.A0Y(c5815Dpz, 4);
        this.abrSetting = c5686DnS;
        this.connectivityManagerHolder = c5092DXa;
        this.tasosSignalsInterface = interfaceC4887DDb;
        this.audioRoutingInterface = df1;
        this.playbackPreferences = c5815Dpz;
        this.isLive = z;
        this.networkPropertiesMonitor = c5099DXq;
        String str = c5815Dpz.A03;
        String str2 = c5815Dpz.A04;
        this.isStory = "fb_stories".equalsIgnoreCase(str) || (c5686DnS.treatShortFormAsStories && ("fb_shorts_viewer".equalsIgnoreCase(str2) || "fb_shorts_native_in_feed_unit".equalsIgnoreCase(str2)));
        this.isIGStory = "reel_feed_timeline".equalsIgnoreCase(str);
        this.isThumbnail = false;
        this.isSponsored = c5815Dpz.A07;
        this.isBackgroundPrefetch = false;
        this.enableForegroundPrefetchQualityExperimentation = false;
        this.isPrefetch = z2;
    }

    private final C5845Dqb getDynamicSignalBasedStallRiskFactors() {
        return new C5845Dqb(isFwaOrTetheredConnection() ? (float) this.abrSetting.stallRiskFactorForFwaOrTetheredConnection : 0.0f, isFwaOrTetheredConnection());
    }

    public final AbrStallRiskConfig getAbrStallRiskConfig(boolean z, C5691DnY c5691DnY, EnumC5744Dof enumC5744Dof) {
        C7384Etj.A0Y(enumC5744Dof, 2);
        return new AbrStallRiskConfig(getAbrStallRiskFactors(z, c5691DnY, enumC5744Dof).A00, false, isOnWifi(), isFwaOrTetheredConnection());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.DqM getAbrStallRiskFactors(boolean r2, X.C5691DnY r3, X.EnumC5744Dof r4) {
        /*
            r1 = this;
            r0 = 2
            X.C7384Etj.A0Y(r4, r0)
            boolean r0 = r1.isLive
            if (r0 != 0) goto L23
            if (r2 == 0) goto L29
            X.DnS r0 = r1.abrSetting
            boolean r0 = r0.enableAudioManifestBasedABRTuning
            if (r0 == 0) goto L23
            if (r3 == 0) goto L23
            float r3 = r1.getStaticSignalBasedAudioStallRiskFactor(r3)
        L16:
            r2 = 0
            r0 = 0
            X.Dqb r1 = new X.Dqb
            r1.<init>(r0, r2)
            X.DqM r0 = new X.DqM
            r0.<init>(r1, r3, r3)
            return r0
        L23:
            double r0 = r1.getSystemicRiskFactor(r2, r4)
            float r3 = (float) r0
            goto L16
        L29:
            X.DqM r0 = r1.getSignalBasedStallRiskFactors(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.getAbrStallRiskFactors(boolean, X.DnY, X.Dof):X.DqM");
    }

    public final int getHighBwRiskConfPct(EnumC5744Dof enumC5744Dof) {
        int i;
        C7384Etj.A0Y(enumC5744Dof, 0);
        if (this.isLive) {
            EnumC5744Dof enumC5744Dof2 = EnumC5744Dof.A04;
            C5686DnS c5686DnS = this.abrSetting;
            return enumC5744Dof == enumC5744Dof2 ? c5686DnS.liveHighBwRiskConfPctUltraLowLatency : c5686DnS.liveHighBwRiskConfPct;
        }
        if (this.isBackgroundPrefetch && (i = this.abrSetting.backgroundPrefetchHighBwRiskConfPct) > 0) {
            return i;
        }
        if (this.isSponsored) {
            C5686DnS c5686DnS2 = this.abrSetting;
            int i2 = c5686DnS2.adHighBwRiskConfPct;
            if (i2 > 0) {
                return i2;
            }
            int i3 = this.isPrefetch ? c5686DnS2.adHighBwRiskConfPctPrefetch : c5686DnS2.adHighBwRiskConfPctOnScreen;
            if (i3 > 0) {
                return i3;
            }
        }
        return this.abrSetting.highBwRiskConfPct;
    }

    public final int getLatencyAdjustedLowestQualityIndex(int i, EnumC5744Dof enumC5744Dof) {
        int i2;
        C7384Etj.A0Y(enumC5744Dof, 1);
        return (enumC5744Dof != EnumC5744Dof.A04 || (i2 = this.abrSetting.ultraLowLatencyAdjustedLowestQualityIndex) < 0) ? i - 1 : Math.min(i2, i - 1);
    }

    public final double getRiskAdjFactor(boolean z, EnumC5744Dof enumC5744Dof) {
        C7384Etj.A0Y(enumC5744Dof, 1);
        boolean z2 = this.isLive;
        if (z) {
            C5686DnS c5686DnS = this.abrSetting;
            return z2 ? c5686DnS.liveAudioRiskAdjFactor : c5686DnS.audioRiskAdjFactor;
        }
        if (!z2 || enumC5744Dof == EnumC5744Dof.A02) {
            return 0.0d;
        }
        EnumC5744Dof enumC5744Dof2 = EnumC5744Dof.A04;
        C5686DnS c5686DnS2 = this.abrSetting;
        return enumC5744Dof == enumC5744Dof2 ? c5686DnS2.liveUserUltraLowLatencyRiskAdjFactor : c5686DnS2.liveRiskAdjFactor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float getStaticSignalBasedAudioStallRiskFactor(X.C5691DnY r7) {
        /*
            r6 = this;
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)
            boolean r0 = r6.isOnWifi()
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 == 0) goto L14
            float r3 = r7.A02
            double r1 = (double) r3
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L14
        L13:
            return r3
        L14:
            float r3 = r7.A01
            double r1 = (double) r3
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L13
            X.DnS r0 = r6.abrSetting
            double r1 = r0.systemicRiskAudioFactor
            float r0 = (float) r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.getStaticSignalBasedAudioStallRiskFactor(X.DnY):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float getStaticSignalBasedStallRiskFactor(X.C5691DnY r7) {
        /*
            r6 = this;
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)
            boolean r0 = r6.isOnWifi()
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 == 0) goto L14
            float r3 = r7.A04
            double r1 = (double) r3
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L14
        L13:
            return r3
        L14:
            float r3 = r7.A03
            double r1 = (double) r3
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L13
            X.DnS r0 = r6.abrSetting
            double r1 = r0.systemicRiskFactor
            float r0 = (float) r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.getStaticSignalBasedStallRiskFactor(X.DnY):float");
    }

    public final double getSystemicRiskFactor(boolean z, EnumC5744Dof enumC5744Dof) {
        C7384Etj.A0Y(enumC5744Dof, 1);
        boolean z2 = this.isLive;
        if (z) {
            C5686DnS c5686DnS = this.abrSetting;
            return z2 ? c5686DnS.liveSystemicRiskAudioFactor : c5686DnS.systemicRiskAudioFactor;
        }
        if (!z2) {
            return this.abrSetting.systemicRiskFactor;
        }
        if (enumC5744Dof == EnumC5744Dof.A02) {
            return this.abrSetting.liveUserLowLatencySystemicRiskFactor;
        }
        EnumC5744Dof enumC5744Dof2 = EnumC5744Dof.A04;
        C5686DnS c5686DnS2 = this.abrSetting;
        return enumC5744Dof == enumC5744Dof2 ? c5686DnS2.liveUserUltraLowLatencySystemicRiskFactor : c5686DnS2.liveSystemicRiskFactor;
    }

    public final double getVirtualBufferPercent(EnumC5744Dof enumC5744Dof) {
        C7384Etj.A0Y(enumC5744Dof, 0);
        if (enumC5744Dof == EnumC5744Dof.A02) {
            return this.abrSetting.liveLSBVirtualBufferPercent;
        }
        if (enumC5744Dof == EnumC5744Dof.A04) {
            return this.abrSetting.liveULSBVirtualBufferPercent;
        }
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveVirtualBufferPercent : c5686DnS.virtualBufferPercent;
    }

    public final boolean isSystemicRiskIBR(boolean z, C5691DnY c5691DnY) {
        if (z) {
            boolean z2 = this.isLive;
            C5686DnS c5686DnS = this.abrSetting;
            if (!z2 ? !c5686DnS.systemicRiskAudioEnableABR || c5691DnY == null || !c5691DnY.A0D : !c5686DnS.liveSystemicRiskAudioEnableABR) {
                return true;
            }
        }
        return false;
    }

    private final DqM getSignalBasedStallRiskFactors(C5691DnY c5691DnY) {
        C5686DnS c5686DnS = this.abrSetting;
        float staticSignalBasedStallRiskFactor = (!c5686DnS.enableManifestBasedABRTuning || c5691DnY == null) ? (float) c5686DnS.systemicRiskFactor : getStaticSignalBasedStallRiskFactor(c5691DnY);
        C5845Dqb dynamicSignalBasedStallRiskFactors = this.abrSetting.enableDynamicClientSignalBasedABRTuning ? getDynamicSignalBasedStallRiskFactors() : new C5845Dqb(0.0f, false);
        return new DqM(dynamicSignalBasedStallRiskFactors, Math.min(0.0f + dynamicSignalBasedStallRiskFactors.A00 + staticSignalBasedStallRiskFactor, (float) this.abrSetting.signalBasedStallRiskFactorUpperBound), staticSignalBasedStallRiskFactor);
    }

    public final boolean enableAndroidAPIBitrate() {
        return this.abrSetting.enableAndroidAPIBitrate;
    }

    public final boolean enableConfRiskBwCache() {
        return this.abrSetting.enableConfRiskBwCache;
    }

    public final boolean enableMosOverride() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.enableMosOverrideLive : c5686DnS.enableMosOverride;
    }

    public final boolean enableQoERationalGamblerAbr(boolean z) {
        if (this.isLive) {
            return false;
        }
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.enableQoERationalGamblerABRForAudio : c5686DnS.enableQoERationalGamblerABR;
    }

    public final boolean enableSmartCacheOverride(boolean z) {
        if (!this.isLive && z && this.isStory) {
            return this.abrSetting.enableSmartCacheOverride;
        }
        return false;
    }

    public final boolean enableSmartCacheOverrideForPrefetch() {
        if (this.isLive || !this.isStory) {
            return false;
        }
        return this.abrSetting.enableSmartCachePrefetchOverride;
    }

    public final boolean enableWifiBasedRewardSidnee() {
        return this.abrSetting.enableWifiBasedSidneeRewardTuning && isOnWifi();
    }

    public final boolean enableXPlatBweParity() {
        return this.abrSetting.enableXPlatBweParity;
    }

    public final long getAbrDurationForIntentional() {
        if (this.isLive) {
            return this.abrSetting.liveAbrDurationForIntentional;
        }
        return 0L;
    }

    public final int getAndroidBandwidthFallbackNumberOfSamples() {
        return this.abrSetting.androidBandwidthFallbackNumberOfSamples;
    }

    public final long getAocDefaultLimitIntentionalKbps() {
        if (this.isLive) {
            return this.abrSetting.liveAocDefaultLimitIntentionalKbps;
        }
        return 0L;
    }

    public final long getAocDefaultLimitUnintentionalKbps() {
        if (this.isLive) {
            return this.abrSetting.liveAocDefaultLimitUnintentionalKbps;
        }
        return 0L;
    }

    public final String getAudioAbrForceLane() {
        String str = this.abrSetting.audioAbrForceLane;
        C7384Etj.A0T(str);
        return str;
    }

    public final float getBWWeightLimitForBWEDampening() {
        return this.abrSetting.bwWeightLimitForBWEDampening;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r1 > 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r1 > 1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long getBaseRiskRewardPrecisionDigits(boolean r7, X.C5691DnY r8) {
        /*
            r6 = this;
            X.DnS r0 = r6.abrSetting
            r5 = 0
            r3 = 1
            if (r7 == 0) goto L2b
            boolean r0 = r0.enableAudioManifestBasedABRTuning
            if (r0 == 0) goto L5e
            if (r8 == 0) goto L5e
            boolean r0 = r6.isOnWifi()
            if (r0 == 0) goto L1e
            long r1 = r8.A06
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1e
        L19:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
        L1d:
            return r5
        L1e:
            boolean r0 = r6.isOnWifi()
            if (r0 != 0) goto L5e
            long r1 = r8.A05
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5e
            goto L19
        L2b:
            boolean r0 = r0.enableManifestBasedABRTuning
            if (r0 == 0) goto L4b
            if (r8 == 0) goto L4b
            boolean r0 = r6.isOnWifi()
            if (r0 == 0) goto L3e
            long r1 = r8.A08
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L3e
            goto L19
        L3e:
            boolean r0 = r6.isOnWifi()
            if (r0 != 0) goto L4b
            long r1 = r8.A07
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L4b
            goto L19
        L4b:
            boolean r0 = r6.isOnWifi()
            if (r0 == 0) goto L5e
            X.DnS r1 = r6.abrSetting
            boolean r0 = r1.enableWifiBasedSidneeRewardTuning
            if (r0 == 0) goto L5e
        L57:
            X.DwT r0 = r1.rationalGamblerConfig
            if (r0 == 0) goto L1d
            r1 = 2
            goto L19
        L5e:
            X.DnS r1 = r6.abrSetting
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.getBaseRiskRewardPrecisionDigits(boolean, X.DnY):java.lang.Long");
    }

    public final boolean getBypassWidthLimitsSponsoredVerticalVideos() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsSponsoredVerticalVideos;
    }

    public final boolean getBypassWidthLimitsStories() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsStories;
    }

    public final boolean getBypassWidthLimitsStoriesPrefetch() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsStoriesPrefetch;
    }

    public final int getCdnDebugHeadersMaxNextSegments() {
        C5686DnS c5686DnS = this.abrSetting;
        if (!c5686DnS.enableCdnDebugHeadersDecisionDetails || !c5686DnS.enableCdnDebugHeadersSsbwe) {
            return 0;
        }
        C6285Dzh c6285Dzh = c5686DnS.timeDomainRiskV2Config;
        if (c6285Dzh == null) {
            c6285Dzh = C6285Dzh.A00;
        }
        if (c6285Dzh.diagnostics.shouldIncludeDecisionDetailsInCdnHeader) {
            return c5686DnS.cdnDebugHeadersMaxNextSegments;
        }
        return 0;
    }

    public final boolean getCheckNetworkProperties() {
        return this.abrSetting.checkNetworkProperties;
    }

    public final boolean getClampPhysicalDisplaySizeToRenderSurface() {
        return this.abrSetting.clampPhysicalDisplaySizeToRenderSurface;
    }

    public final ConnectivityManager getConnectivityManager() {
        C5092DXa c5092DXa = this.connectivityManagerHolder;
        if (c5092DXa != null) {
            return c5092DXa.A00();
        }
        return null;
    }

    public final String getDataConnectionQuality() {
        return "UNKNOWN";
    }

    public final int getDefaultBwRiskConfPct() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveDefaultBwRiskConfPct : c5686DnS.defaultBwRiskConfPct;
    }

    public final long getDefaultInitialBitrateWhenNoEstimate() {
        return this.abrSetting.defaultInitialBitrateWhenNoEstimate;
    }

    public final float getDropRenderFrameRatioForPreventAbrUp() {
        return this.abrSetting.dropRenderFrameRatioForPreventAbrUp;
    }

    public final boolean getEnableLandscapeDisplayFix() {
        return this.abrSetting.enableLandscapeDisplayFix;
    }

    public final boolean getEnableOverallAudioMOSRewardSidnee() {
        return this.abrSetting.enableOverallAudioMOSBasedRewardSidnee;
    }

    public final boolean getEnableOverallMOSRewardSidnee() {
        return this.abrSetting.enableOverallMOSBasedRewardSidnee;
    }

    public final boolean getEnablePhysicalDisplaySize() {
        return this.abrSetting.enablePhysicalDisplaySize;
    }

    public final boolean getEnableSegmentBitrate() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.enableSegmentBitrate;
    }

    public final boolean getEnableUseLastPreCacheAudioFormat() {
        return this.abrSetting.enableUseLastPreCacheAudioFormat;
    }

    public final boolean getForceUpdateFormatListIfFormatSizeChanged() {
        return this.abrSetting.forceUpdateFormatListIfFormatSizeChanged;
    }

    public final boolean getHashUrlForUnique() {
        return this.abrSetting.hashUrlForUnique;
    }

    public final double getHighOrBetterMosThreshold() {
        return this.abrSetting.highOrBetterMosThreshold;
    }

    public final boolean getHonorDefaultBandwidthForSR() {
        return this.abrSetting.honorDefaultBandwidthSR;
    }

    public final boolean getHonorDefaultBandwidthWhenNoEstimate() {
        return this.abrSetting.honorDefaultBandwidthWhenNoEstimate;
    }

    public final int getInitSegmentBandwidthExclusionLimitBytes() {
        return this.abrSetting.initSegmentBandwidthExclusionLimitBytes;
    }

    public final boolean getIsPrefetch() {
        return this.isPrefetch;
    }

    public final int getLatencyBasedAbrTargetBufferSizeMs() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveAbrLatencyBasedAbrTargetBufferSizeMs : c5686DnS.latencyBasedTargetBufferSizeMs;
    }

    public final double getLiveLowBufferSystemicRiskFactor(boolean z, long j, boolean z2) {
        if (!this.isLive || z) {
            return 0.0d;
        }
        if (z2 && !this.abrSetting.liveLowBufferRiskFactorOnPrefetch) {
            return 0.0d;
        }
        C5686DnS c5686DnS = this.abrSetting;
        if (j < c5686DnS.liveLowBufferThresholdMs) {
            return c5686DnS.liveLowBufferSystemicRiskFactor;
        }
        return 0.0d;
    }

    public final int getLowestQualityMaxCachedBitratePct() {
        return this.abrSetting.lowestQualityMaxCachedBitratePct;
    }

    public final int getLowestQualityMaxCachedLongEdgePct() {
        return this.abrSetting.lowestQualityMaxCachedLongEdgePct;
    }

    public final double getMaxAlphaLowPassEMABwDown() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveMaxAlphaLowPassEMABwDown : c5686DnS.maxAlphaLowPassEMABwDown;
    }

    public final double getMaxAlphaLowPassEMABwUp() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveMaxAlphaLowPassEMABwUp : c5686DnS.maxAlphaLowPassEMABwUp;
    }

    public final double getMaxAlphaLowPassEMABwVol() {
        if (this.isLive) {
            return 0.0d;
        }
        return this.abrSetting.maxAlphaLowPassEMABwVol;
    }

    public final double getMaxAlphaLowPassEMATtfbDown() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveMaxAlphaLowPassEMATtfbDown : c5686DnS.maxAlphaLowPassEMATtfbDown;
    }

    public final double getMaxAlphaLowPassEMATtfbUp() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveMaxAlphaLowPassEMATtfbUp : c5686DnS.maxAlphaLowPassEMATtfbUp;
    }

    public final double getMaxAlphaLowPassEMATtfbVol() {
        if (this.isLive) {
            return 0.0d;
        }
        return this.abrSetting.maxAlphaLowPassEMATtfbVol;
    }

    public final float getMaxBandwidthMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMaxBandwidthMultiplier;
        }
        if (this.isStory) {
            return 2.0f;
        }
        return this.abrSetting.maxBandwidthMultiplier;
    }

    public final int getMaxInitialBitrate() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveInitialBitrate : c5686DnS.maxInitialBitrate;
    }

    public final int getMaxNumberSmallBwSamplesIgnored() {
        return this.abrSetting.maxNumberSmallBwSamplesIgnored;
    }

    public final long getMaxRationalGamblerABREvaluationDurationMs() {
        return this.abrSetting.maxRationalGamblerABREvaluationDurationMs;
    }

    public final double getMaxRationalGamblerMultiplier() {
        return this.abrSetting.maxRationalGamblerMultiplier;
    }

    public final float getMaxTTFBMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMaxTTFBMultiplier;
        }
        if (this.isStory) {
            return 3.0f;
        }
        return this.abrSetting.maxTTFBMultiplier;
    }

    public final int getMaxWidthCell() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveMaxWidthCell : c5686DnS.maxWidthCell;
    }

    public final int getMaxWidthInlinePlayer() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveMaxWidthInlinePlayer : c5686DnS.maxWidthInlinePlayer;
    }

    public final int getMaxWidthSphericalVideo() {
        return this.abrSetting.maxWidthSphericalVideo;
    }

    public final int getMaxWidthToPrefetch() {
        C5686DnS c5686DnS = this.abrSetting;
        if (c5686DnS.bypassPrefetchWidthLimits) {
            return Integer.MAX_VALUE;
        }
        if (this.playbackPreferences.A06) {
            return c5686DnS.maxWidthSphericalVideo;
        }
        boolean z = this.isLive;
        boolean zIsOnWifi = isOnWifi();
        C5686DnS c5686DnS2 = this.abrSetting;
        return z ? zIsOnWifi ? c5686DnS2.liveMaxWidthToPrefetchWifi : c5686DnS2.liveMaxWidthToPrefetchCell : zIsOnWifi ? c5686DnS2.maxWidthToPrefetchAbr : c5686DnS2.maxWidthToPrefetchAbrCell;
    }

    public final float getMinBandwidthMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMinBandwidthMultiplier;
        }
        return 0.3f;
    }

    public final long getMinBufferDurationMsRationalGambler() {
        return this.abrSetting.minBufferDurationMsRationalGambler;
    }

    public final int getMinBufferedDurationMsForMosAwareCache() {
        return 0;
    }

    public final int getMinFramesDropForPreventAbrUp() {
        return this.abrSetting.minFramesDropForPreventAbrUp;
    }

    public final int getMinFramesRenderedForPreventAbrUp() {
        return this.abrSetting.minFramesRenderedForPreventAbrUp;
    }

    public final int getMinMosConstraintLimit() {
        return this.abrSetting.minMosConstraintLimit;
    }

    public final int getMinMosForCachedQuality() {
        if (this.isLive) {
            return 0;
        }
        boolean z = this.isStory;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.storiesMinMosForCachedQuality : c5686DnS.minMosForCachedQuality;
    }

    public final double getMinOverallMosForABR() {
        return this.abrSetting.minOverallMosForABR;
    }

    public final float getMinPartiallyCachedSpan() {
        return this.abrSetting.minPartiallyCachedSpan;
    }

    public final double getMinRationalGamblerMultiplier() {
        return this.abrSetting.minRationalGamblerMultiplier;
    }

    public final float getMinTTFBMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMinTTFBMultiplier;
        }
        boolean z = this.isStory;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.storiesMinTTFBMultiplier : c5686DnS.minTTFBMultiplier;
    }

    public final int getMinWatchableMos() {
        return this.abrSetting.minWatchableMos;
    }

    public final float getMinWidthMultiplierFrameDrop() {
        return this.abrSetting.minWidthMultiplierFrameDrop;
    }

    public final int getModBwRiskConfPct() {
        return this.abrSetting.modBwRiskConfPct;
    }

    public final double getModOverallMosForABR() {
        return this.abrSetting.modOverallMosForABR;
    }

    public final int getModWatchableMos() {
        if (this.isLive) {
            return 0;
        }
        return this.abrSetting.modWatchableMos;
    }

    public final int getMosDiffPctForCachedQuality() {
        if (this.isLive || this.isStory) {
            return 0;
        }
        return this.abrSetting.mosDiffPctForCachedQuality;
    }

    public final long getPersonalizedAggressiveStallDuration() {
        return this.abrSetting.personalizedAggressiveStallDuration;
    }

    public final int getPersonalizedBWRiskConfPctNormal() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.livePersonalizedBWRiskConfPctNormal : c5686DnS.personalizedBWRiskConfPctNormal;
    }

    public final long getPersonalizedConservativeStallDuration() {
        return this.abrSetting.personalizedConservativeStallDuration;
    }

    public final double getPersonalizedRiskMultiplierAggressive() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.livePersonalizedRiskMultiplierAggressive : c5686DnS.personalizedRiskMultiplierAggressive;
    }

    public final double getPersonalizedRiskMultiplierConservative() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.livePersonalizedRiskMultiplierConservative : c5686DnS.personalizedRiskMultiplierConservative;
    }

    public final double getPersonalizedRiskMultiplierVeryAggressive() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.livePersonalizedRiskMultiplierVeryAggressive : c5686DnS.personalizedRiskMultiplierVeryAggressive;
    }

    public final double getPersonalizedRiskMultiplierVeryConservative() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.livePersonalizedRiskMultiplierVeryConservative : c5686DnS.personalizedRiskMultiplierVeryConservative;
    }

    public final long getPersonalizedVeryAggressiveStallDuration() {
        return this.abrSetting.personalizedVeryAggressiveStallDuration;
    }

    public final double getPersonalizedVirtualBufferPercent() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.livePersonalizedVirtualBufferPercent : c5686DnS.personalizedVirtualBufferPercent;
    }

    public final C5815Dpz getPlaybackPreferences() {
        return this.playbackPreferences;
    }

    public final C6127DwT getRationalGamblerConfig() {
        C5686DnS c5686DnS = this.abrSetting;
        return (c5686DnS.enableAdsTuningSidnee && this.isSponsored) ? c5686DnS.adsRationalGamblerConfig : c5686DnS.rationalGamblerConfig;
    }

    public final float getRiskRewardRatioUpperBound() {
        if (this.isLive) {
            return this.abrSetting.liveRiskRewardRatioUpperBound;
        }
        if (this.isStory) {
            float f = this.abrSetting.riskRewardRatioUpperBoundSfv;
            if (f > 0.0d) {
                return f;
            }
        }
        return this.abrSetting.riskRewardRatioUpperBound;
    }

    public final float getScreenWidthMultiplierLandscapeVideo() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveScreenWidthMultiplierLandscapeVideo : c5686DnS.screenWidthMultiplierLandscapeVideo;
    }

    public final float getScreenWidthMultiplierPortraitVideo() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveScreenWidthMultiplierPortraitVideo : c5686DnS.screenWidthMultiplierPortraitVideo;
    }

    public final boolean getShouldCountFirstChunkOnly() {
        return this.abrSetting.shouldCountFirstChunkOnly;
    }

    public final boolean getShouldEnableAudioIbrCache() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveEnableAudioIbrCache : c5686DnS.enableAudioIbrCache;
    }

    public final boolean getShouldTreatShortFormAsStories() {
        return this.abrSetting.treatShortFormAsStories;
    }

    public final double getSmartCacheOverrideThreshold() {
        return this.abrSetting.smartCacheOverrideThreshold;
    }

    public final double getSmartCacheOverrideThresholdForPrefetch() {
        return this.abrSetting.smartCacheOverridePrefetchThreshold;
    }

    public final int getSsAbrSampleMaxValidTimeAcrossVideosMs() {
        return 30000;
    }

    public final int getSsAbrSampleMaxValidTimeMs() {
        return 10000;
    }

    public final int getSystemicRiskAvgSegmentDurationMs() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveSystemicRiskAvgSegmentDurationMs : c5686DnS.systemicRiskAvgSegmentDurationMs;
    }

    public final double getSystemicRiskBitrateBoostFactor(boolean z) {
        if (!z) {
            return 1.0d;
        }
        boolean z2 = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z2 ? c5686DnS.liveSystemicRiskAudioBitrateBoostFactor : c5686DnS.systemicRiskAudioBitrateBoostFactor;
    }

    public final boolean getSystemicRiskEnableDynamicOtherBitrate(boolean z) {
        if (!z) {
            return false;
        }
        if (this.isLive) {
            return true;
        }
        return this.abrSetting.systemicRiskAudioEnableDynOtherBitrate;
    }

    public final double getSystemicRiskLowMosFactor(boolean z) {
        boolean z2 = this.isLive;
        if (z) {
            C5686DnS c5686DnS = this.abrSetting;
            return z2 ? c5686DnS.liveSystemicRiskAudioLowMosFactor : c5686DnS.systemicRiskAudioLowMosFactor;
        }
        if (z2) {
            return this.abrSetting.liveSystemicRiskLowMosFactor;
        }
        if (isOnWifi() && this.isBackgroundPrefetch) {
            double d = this.abrSetting.systemicRiskLowMosFactorForBgPrefetch;
            if (d > 0.0d) {
                return d;
            }
        }
        return this.abrSetting.systemicRiskLowMosFactor;
    }

    public final int getSystemicRiskMaxLookaheadDurationMs() {
        if (this.isLive) {
            return this.abrSetting.liveSystemicRiskMaxLookaheadDurationMs;
        }
        return 0;
    }

    public final double getSystemicRiskModMosFactor() {
        return this.abrSetting.systemicRiskModMosFactor;
    }

    public final int getSystemicRiskOtherBitrate(boolean z) {
        if (!z) {
            return 0;
        }
        boolean z2 = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z2 ? c5686DnS.liveSystemicRiskAudioOtherBitrate : c5686DnS.systemicRiskAudioOtherBitrate;
    }

    public final float getTTFBWeightLimitForBWEDampening() {
        return this.abrSetting.ttfbWeightLimitForBWEDampening;
    }

    public final boolean getTreatCurrentNullAsLowBuffer() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveTreatCurrentNullAsLowBuffer : c5686DnS.treatCurrentNullAsLowBuffer;
    }

    public final boolean getUseDefaultFormatForScreenWidthConstraints() {
        return this.abrSetting.useDefaultFormatAsBackupForScreenWidthConstraints;
    }

    public final boolean getUsePlaybackCsvqm() {
        return this.abrSetting.usePlaybackCsvqm;
    }

    public final boolean getUsePlaybackMosForLowMosABR() {
        return this.abrSetting.usePlaybackMosForLowMosABR;
    }

    public final AbstractC6126DwS getViewportAwareAbrConfig() {
        return null;
    }

    public final boolean isCdnDebugHeadersAudioMosEnabled() {
        return this.abrSetting.enableCdnDebugHeadersAudioMos;
    }

    public final boolean isCdnDebugHeadersDecisionDetailsEnabled() {
        return this.abrSetting.enableCdnDebugHeadersDecisionDetails;
    }

    public final boolean isCdnDebugHeadersExtendedEnabled() {
        return this.abrSetting.enableCdnDebugHeadersExtended;
    }

    public final boolean isCdnDebugHeadersPrefetchEnabled() {
        return this.abrSetting.enableCdnDebugHeadersPrefetch;
    }

    public final boolean isCdnDebugHeadersSsbweEnabled() {
        return this.abrSetting.enableCdnDebugHeadersSsbwe;
    }

    public final boolean isFwaOrTetheredConnection() {
        C5099DXq c5099DXq;
        C5100DXr c5100DXr;
        if (this.abrSetting.checkNetworkProperties && isOnWifi() && (c5099DXq = this.networkPropertiesMonitor) != null && (c5100DXr = c5099DXq.A04) != null) {
            Boolean bool = true;
            if (bool.equals(c5100DXr.A03) && !bool.equals(this.networkPropertiesMonitor.A04.A07)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final boolean isOnBuiltInSpeaker() {
        return false;
    }

    public final boolean isOnWifi() {
        C5092DXa c5092DXa = this.connectivityManagerHolder;
        if (c5092DXa != null) {
            return c5092DXa.A02();
        }
        return false;
    }

    public final boolean isPlaybackCacheSelectionEnabled() {
        C5959Dsu c5959Dsu = this.abrSetting.A00;
        return c5959Dsu != null && AnonymousClass003.A1Y(c5959Dsu.A00);
    }

    public final boolean overrideCacheWhenHighMos() {
        return this.isStory && this.abrSetting.overrideCacheWhenHighMos;
    }

    public final boolean overrideCacheWhenHighMosForPrefetch() {
        return this.isStory && this.abrSetting.overrideCacheWhenHighMosForPrefetch;
    }

    public final boolean shouldAlwaysPlayCachedData() {
        if (this.isLive) {
            return this.abrSetting.alwaysPlayLiveCachedData;
        }
        return false;
    }

    public final boolean shouldAvoidOnABR(boolean z) {
        if (this.isLive) {
            return false;
        }
        if (!z) {
            isOnWifi();
        }
        return this.abrSetting.shouldEnableAvoidOnABR;
    }

    public final boolean shouldAvoidOnCellular(boolean z) {
        return this.isLive ? this.abrSetting.liveShouldAvoidOnCellular : this.abrSetting.enableAvoidOnCellular;
    }

    public final boolean shouldDeprecateLiveInitialABR() {
        return this.abrSetting.shouldDeprecateLiveInitialABR;
    }

    public final boolean shouldLogInbandTelemetryBweDebugString() {
        return this.abrSetting.shouldLogInbandTelemetryBweDebugString;
    }

    public final boolean shouldLowestSelectorIgnoreCurrent() {
        return this.isThumbnail;
    }

    public final boolean shouldUseLogarithmicRisk() {
        return this.abrSetting.useLogarithmicRisk;
    }

    public final boolean shouldUseLowPassEMAAsymmetryForBWEstimation() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveShouldUseLowPassEMAAsymmetryForBWEstimation : c5686DnS.shouldUseLowPassEMAAsymmetryForBWEstimation;
    }

    public final boolean shouldUseLowPassEMAForBWEstimation() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.shouldUseLowPassEMAForBWEstimation;
    }

    public final boolean shouldUseLowPassWithWeightedEMAForBWEstimation() {
        boolean z = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z ? c5686DnS.liveShouldUseLowPassWithWeightedEMAForBWEstimation : c5686DnS.shouldUseLowPassWithWeightedEMAForBWEstimation;
    }

    public final boolean shouldUseMosAwareCachedSelection() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.useMosAwareCachedSelection;
    }

    public final boolean shouldUseRiskRewardRatio(boolean z) {
        if (z) {
            return false;
        }
        boolean z2 = this.isLive;
        C5686DnS c5686DnS = this.abrSetting;
        return z2 ? c5686DnS.liveUseRiskRewardRatio : c5686DnS.useRiskRewardRatio;
    }

    public final String tryToGetRewardCurveFromManifest(C5691DnY c5691DnY) {
        if (this.abrSetting.enableManifestBasedABRQualityRewardCurveTuning && c5691DnY != null) {
            String str = c5691DnY.A0B;
            if (!"".equals(str)) {
                return !isOnWifi() ? c5691DnY.A0A : str;
            }
        }
        return null;
    }

    public final boolean updateFormatsWithIntentionChange() {
        if (this.isLive) {
            return this.abrSetting.liveUpdateFormatsWithIntentionChange;
        }
        return false;
    }

    public final boolean useMaxBitrateForABRIfLower() {
        if (this.isLive) {
            return this.abrSetting.liveUseMaxBitrateForABRIfLower;
        }
        return false;
    }

    public final boolean useMaxBitrateForAOCIfLower() {
        if (this.isLive) {
            return this.abrSetting.liveUseMaxBitrateForAOCIfLower;
        }
        return false;
    }

    public final boolean useOverallMosForABR() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.useOverallMosForABR;
    }

    public final boolean usePersonalizedRiskMultipliers() {
        return false;
    }

    public final boolean usePersonalizedVirtualBuffer() {
        if (this.isLive) {
            return this.abrSetting.liveUsePersonalizedVirtualBuffer;
        }
        return false;
    }

    public final float getDynamicSignalBasedStallRiskFactor() {
        return 0.0f + getDynamicSignalBasedStallRiskFactors().A00;
    }

    public final Long getRiskRewardRatioPrecisionDigits(boolean z, C5691DnY c5691DnY) {
        Long baseRiskRewardPrecisionDigits = getBaseRiskRewardPrecisionDigits(z, c5691DnY);
        return baseRiskRewardPrecisionDigits != null ? Long.valueOf(Math.max(baseRiskRewardPrecisionDigits.longValue(), 2L)) : baseRiskRewardPrecisionDigits;
    }

    public final long getSupplementalRiskRewardPrecisionDigits(boolean z) {
        return 0L;
    }

    public final boolean isEgressPenaltyActiveOnCellular(boolean z) {
        return false;
    }

    public final boolean isEgressPenaltyActiveOnCurrentNetwork(boolean z) {
        isOnWifi();
        return false;
    }

    public final boolean isEgressPenaltyActiveOnWifi(boolean z) {
        return false;
    }

    public /* synthetic */ AbrContextAwareConfiguration(C5686DnS c5686DnS, C5092DXa c5092DXa, InterfaceC4887DDb interfaceC4887DDb, DF1 df1, C5815Dpz c5815Dpz, boolean z, boolean z2, C5099DXq c5099DXq, int i, C06H c06h) {
        this(c5686DnS, c5092DXa, interfaceC4887DDb, df1, c5815Dpz, z, z2, (i & 128) != 0 ? null : c5099DXq);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbrContextAwareConfiguration(C5686DnS c5686DnS, C5092DXa c5092DXa, InterfaceC4887DDb interfaceC4887DDb, DF1 df1, C5815Dpz c5815Dpz, boolean z, boolean z2) {
        this(c5686DnS, c5092DXa, interfaceC4887DDb, df1, c5815Dpz, z, z2, null);
        AnonymousClass005.A11(c5686DnS, interfaceC4887DDb, df1, 0);
        C7384Etj.A0Y(c5815Dpz, 4);
    }
}
