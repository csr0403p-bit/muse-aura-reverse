package com.facebook.rsys.mediastats.gen;

import X.AbstractC7609F5w;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV7;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8925Fth;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class MediaStats {
    public static G50<MediaStats> CONVERTER = C8925Fth.A00(48);
    public static long sMcfTypeId;
    public final Float audioBitrateKbps;
    public final Long audioBytesReceived;
    public final Long audioBytesSent;
    public final String audioCodec;
    public final ArrayList<Long> audioCsrcs;
    public final Long audioCtpLatencyMs;
    public final Long audioCtpRoundtripLatencyMs;
    public final Long audioE2eDelayMS;
    public final Double audioEchoReturnLoss;
    public final Double audioEchoReturnLossEnhancement;
    public final Long audioEstimatedPlayoutTimestampMS;
    public final Long audioFecPacketsReceived;
    public final Long audioInterruptLatencyMs;
    public final Long audioJitterMS;
    public final Long audioLevel;
    public final Long audioNackCount;
    public final Long audioPacketsLost;
    public final Long audioPacketsReceived;
    public final Long audioRetransmittedPacketsSent;
    public final Float audioSamplingRateKhz;
    public final String audioSsrc;
    public final Float audioTargetBitrateKbps;
    public final Long audioToolAnswerLatencyMs;
    public final Long availableOutgoingBitrate;
    public final Long avgRttMs;
    public final int channelType;
    public final Long concealedSamples;
    public final String connectionType;
    public final Long curRttMs;
    public final String currentIpVersion;
    public final DedicatedStunQualityStats dedicatedStunQualityStats;
    public final Integer localNetworkCost;
    public final String localType;
    public final Long maxBitrateKbps;
    public final int mediaPath;
    public final String mimeType;
    public final Long minBitrateKbps;
    public final Integer noiseSuppressionMode;
    public final Boolean nsCpuFallbackStatus;
    public final Long nsInferenceTime;
    public final Integer remoteNetworkCost;
    public final String remoteType;
    public final ScreenShareStats screenShareStats;
    public final Long startBitrateKbps;
    public final int streamDirection;
    public final String streamId;
    public final int streamType;
    public final Long stunLatencyMs;
    public final Long totalSamplesReceived;
    public final String userId;
    public final ArrayList<VideoStreamStats> videoStreams;

    public static native MediaStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    /* JADX WARN: Code restructure failed: missing block: B:280:0x02c6, code lost:
    
        if (r1.equals(r0) != false) goto L281;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rsys.mediastats.gen.MediaStats.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((AnonymousClass005.A0F(this.videoStreams, (((((((AnonymousClass005.A0I(this.userId, BV8.A0B(this.streamId)) + this.channelType) * 31) + this.streamDirection) * 31) + this.streamType) * 31) + AnonymousClass006.A0G(this.mimeType)) * 31) + AnonymousClass006.A0G(this.audioSsrc)) * 31) + AnonymousClass006.A0D(this.audioEstimatedPlayoutTimestampMS)) * 31) + AnonymousClass006.A0D(this.audioSamplingRateKhz)) * 31) + AnonymousClass006.A0D(this.audioE2eDelayMS)) * 31) + AnonymousClass006.A0G(this.audioCodec)) * 31) + AnonymousClass006.A0D(this.audioBitrateKbps)) * 31) + AnonymousClass006.A0D(this.audioTargetBitrateKbps)) * 31) + AnonymousClass006.A0D(this.audioBytesReceived)) * 31) + AnonymousClass006.A0D(this.audioBytesSent)) * 31) + AnonymousClass006.A0D(this.audioPacketsReceived)) * 31) + AnonymousClass006.A0D(this.audioPacketsLost)) * 31) + AnonymousClass006.A0D(this.audioFecPacketsReceived)) * 31) + AnonymousClass006.A0D(this.audioNackCount)) * 31) + AnonymousClass006.A0D(this.audioRetransmittedPacketsSent)) * 31) + AnonymousClass006.A0D(this.audioJitterMS)) * 31) + AnonymousClass006.A0D(this.audioCtpLatencyMs)) * 31) + AnonymousClass006.A0D(this.audioCtpRoundtripLatencyMs)) * 31) + AnonymousClass006.A0D(this.audioCsrcs)) * 31) + AnonymousClass006.A0D(this.audioInterruptLatencyMs)) * 31) + AnonymousClass006.A0D(this.audioToolAnswerLatencyMs)) * 31) + AnonymousClass006.A0D(this.audioEchoReturnLoss)) * 31) + AnonymousClass006.A0D(this.audioEchoReturnLossEnhancement)) * 31) + AnonymousClass006.A0D(this.minBitrateKbps)) * 31) + AnonymousClass006.A0D(this.startBitrateKbps)) * 31) + AnonymousClass006.A0D(this.maxBitrateKbps)) * 31) + AnonymousClass006.A0G(this.connectionType)) * 31) + AnonymousClass006.A0G(this.currentIpVersion)) * 31) + AnonymousClass006.A0D(this.avgRttMs)) * 31) + AnonymousClass006.A0D(this.curRttMs)) * 31) + AnonymousClass006.A0D(this.localNetworkCost)) * 31) + AnonymousClass006.A0G(this.localType)) * 31) + AnonymousClass006.A0D(this.remoteNetworkCost)) * 31) + AnonymousClass006.A0G(this.remoteType)) * 31) + this.mediaPath) * 31) + AnonymousClass006.A0D(this.concealedSamples)) * 31) + AnonymousClass006.A0D(this.totalSamplesReceived)) * 31) + AnonymousClass006.A0D(this.audioLevel)) * 31) + AnonymousClass006.A0D(this.availableOutgoingBitrate)) * 31) + AnonymousClass006.A0D(this.nsInferenceTime)) * 31) + AnonymousClass006.A0D(this.nsCpuFallbackStatus)) * 31) + AnonymousClass006.A0D(this.noiseSuppressionMode)) * 31) + AnonymousClass006.A0D(this.screenShareStats)) * 31) + AnonymousClass006.A0D(this.stunLatencyMs)) * 31) + C3cH.A02(this.dedicatedStunQualityStats);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("MediaStats{");
        FGI.A0v("streamId=", this.streamId, sbA0x);
        FGI.A0v(",userId=", this.userId, sbA0x);
        FGI.A0w(",channelType=", sbA0x, this.channelType);
        FGI.A0w(",streamDirection=", sbA0x, this.streamDirection);
        FGI.A0w(",streamType=", sbA0x, this.streamType);
        FGI.A0v(",mimeType=", this.mimeType, sbA0x);
        AbstractC7609F5w.A1I(this.videoStreams, C60O.A0x(",videoStreams="), sbA0x);
        FGI.A0v(",audioSsrc=", this.audioSsrc, sbA0x);
        AbstractC7609F5w.A1I(this.audioEstimatedPlayoutTimestampMS, C60O.A0x(",audioEstimatedPlayoutTimestampMS="), sbA0x);
        AbstractC7609F5w.A1I(this.audioSamplingRateKhz, C60O.A0x(",audioSamplingRateKhz="), sbA0x);
        AbstractC7609F5w.A1I(this.audioE2eDelayMS, C60O.A0x(",audioE2eDelayMS="), sbA0x);
        FGI.A0v(",audioCodec=", this.audioCodec, sbA0x);
        AbstractC7609F5w.A1I(this.audioBitrateKbps, C60O.A0x(",audioBitrateKbps="), sbA0x);
        AbstractC7609F5w.A1I(this.audioTargetBitrateKbps, C60O.A0x(",audioTargetBitrateKbps="), sbA0x);
        AbstractC7609F5w.A1I(this.audioBytesReceived, C60O.A0x(",audioBytesReceived="), sbA0x);
        AbstractC7609F5w.A1I(this.audioBytesSent, C60O.A0x(",audioBytesSent="), sbA0x);
        AbstractC7609F5w.A1I(this.audioPacketsReceived, C60O.A0x(",audioPacketsReceived="), sbA0x);
        AbstractC7609F5w.A1I(this.audioPacketsLost, C60O.A0x(",audioPacketsLost="), sbA0x);
        AbstractC7609F5w.A1I(this.audioFecPacketsReceived, C60O.A0x(",audioFecPacketsReceived="), sbA0x);
        AbstractC7609F5w.A1I(this.audioNackCount, C60O.A0x(",audioNackCount="), sbA0x);
        AbstractC7609F5w.A1I(this.audioRetransmittedPacketsSent, C60O.A0x(",audioRetransmittedPacketsSent="), sbA0x);
        AbstractC7609F5w.A1I(this.audioJitterMS, C60O.A0x(",audioJitterMS="), sbA0x);
        AbstractC7609F5w.A1I(this.audioCtpLatencyMs, C60O.A0x(",audioCtpLatencyMs="), sbA0x);
        AbstractC7609F5w.A1I(this.audioCtpRoundtripLatencyMs, C60O.A0x(",audioCtpRoundtripLatencyMs="), sbA0x);
        AbstractC7609F5w.A1I(this.audioCsrcs, C60O.A0x(",audioCsrcs="), sbA0x);
        AbstractC7609F5w.A1I(this.audioInterruptLatencyMs, C60O.A0x(",audioInterruptLatencyMs="), sbA0x);
        AbstractC7609F5w.A1I(this.audioToolAnswerLatencyMs, C60O.A0x(",audioToolAnswerLatencyMs="), sbA0x);
        AbstractC7609F5w.A1I(this.audioEchoReturnLoss, C60O.A0x(",audioEchoReturnLoss="), sbA0x);
        AbstractC7609F5w.A1I(this.audioEchoReturnLossEnhancement, C60O.A0x(",audioEchoReturnLossEnhancement="), sbA0x);
        AbstractC7609F5w.A1I(this.minBitrateKbps, C60O.A0x(",minBitrateKbps="), sbA0x);
        AbstractC7609F5w.A1I(this.startBitrateKbps, C60O.A0x(",startBitrateKbps="), sbA0x);
        AbstractC7609F5w.A1I(this.maxBitrateKbps, C60O.A0x(",maxBitrateKbps="), sbA0x);
        FGI.A0v(",connectionType=", this.connectionType, sbA0x);
        FGI.A0v(",currentIpVersion=", this.currentIpVersion, sbA0x);
        AbstractC7609F5w.A1I(this.avgRttMs, C60O.A0x(",avgRttMs="), sbA0x);
        AbstractC7609F5w.A1I(this.curRttMs, C60O.A0x(",curRttMs="), sbA0x);
        AbstractC7609F5w.A1I(this.localNetworkCost, C60O.A0x(",localNetworkCost="), sbA0x);
        FGI.A0v(",localType=", this.localType, sbA0x);
        AbstractC7609F5w.A1I(this.remoteNetworkCost, C60O.A0x(",remoteNetworkCost="), sbA0x);
        FGI.A0v(",remoteType=", this.remoteType, sbA0x);
        FGI.A0w(",mediaPath=", sbA0x, this.mediaPath);
        AbstractC7609F5w.A1I(this.concealedSamples, C60O.A0x(",concealedSamples="), sbA0x);
        AbstractC7609F5w.A1I(this.totalSamplesReceived, C60O.A0x(",totalSamplesReceived="), sbA0x);
        AbstractC7609F5w.A1I(this.audioLevel, C60O.A0x(",audioLevel="), sbA0x);
        AbstractC7609F5w.A1I(this.availableOutgoingBitrate, C60O.A0x(",availableOutgoingBitrate="), sbA0x);
        AbstractC7609F5w.A1I(this.nsInferenceTime, C60O.A0x(",nsInferenceTime="), sbA0x);
        AbstractC7609F5w.A1I(this.nsCpuFallbackStatus, C60O.A0x(",nsCpuFallbackStatus="), sbA0x);
        AbstractC7609F5w.A1I(this.noiseSuppressionMode, C60O.A0x(",noiseSuppressionMode="), sbA0x);
        AbstractC7609F5w.A1I(this.screenShareStats, C60O.A0x(",screenShareStats="), sbA0x);
        AbstractC7609F5w.A1I(this.stunLatencyMs, C60O.A0x(",stunLatencyMs="), sbA0x);
        AbstractC7609F5w.A1I(this.dedicatedStunQualityStats, C60O.A0x(",dedicatedStunQualityStats="), sbA0x);
        return BV7.A11(sbA0x);
    }

    public MediaStats(String str, String str2, int i, int i2, int i3, String str3, ArrayList<VideoStreamStats> arrayList, String str4, Long l, Float f, Long l2, String str5, Float f2, Float f3, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, ArrayList<Long> arrayList2, Long l13, Long l14, Double d, Double d2, Long l15, Long l16, Long l17, String str6, String str7, Long l18, Long l19, Integer num, String str8, Integer num2, String str9, int i4, Long l20, Long l21, Long l22, Long l23, Long l24, Boolean bool, Integer num3, ScreenShareStats screenShareStats, Long l25, DedicatedStunQualityStats dedicatedStunQualityStats) {
        AbstractC7609F5w.A1H(str, str2, arrayList);
        this.streamId = str;
        this.userId = str2;
        this.channelType = i;
        this.streamDirection = i2;
        this.streamType = i3;
        this.mimeType = str3;
        this.videoStreams = arrayList;
        this.audioSsrc = str4;
        this.audioEstimatedPlayoutTimestampMS = l;
        this.audioSamplingRateKhz = f;
        this.audioE2eDelayMS = l2;
        this.audioCodec = str5;
        this.audioBitrateKbps = f2;
        this.audioTargetBitrateKbps = f3;
        this.audioBytesReceived = l3;
        this.audioBytesSent = l4;
        this.audioPacketsReceived = l5;
        this.audioPacketsLost = l6;
        this.audioFecPacketsReceived = l7;
        this.audioNackCount = l8;
        this.audioRetransmittedPacketsSent = l9;
        this.audioJitterMS = l10;
        this.audioCtpLatencyMs = l11;
        this.audioCtpRoundtripLatencyMs = l12;
        this.audioCsrcs = arrayList2;
        this.audioInterruptLatencyMs = l13;
        this.audioToolAnswerLatencyMs = l14;
        this.audioEchoReturnLoss = d;
        this.audioEchoReturnLossEnhancement = d2;
        this.minBitrateKbps = l15;
        this.startBitrateKbps = l16;
        this.maxBitrateKbps = l17;
        this.connectionType = str6;
        this.currentIpVersion = str7;
        this.avgRttMs = l18;
        this.curRttMs = l19;
        this.localNetworkCost = num;
        this.localType = str8;
        this.remoteNetworkCost = num2;
        this.remoteType = str9;
        this.mediaPath = i4;
        this.concealedSamples = l20;
        this.totalSamplesReceived = l21;
        this.audioLevel = l22;
        this.availableOutgoingBitrate = l23;
        this.nsInferenceTime = l24;
        this.nsCpuFallbackStatus = bool;
        this.noiseSuppressionMode = num3;
        this.screenShareStats = screenShareStats;
        this.stunLatencyMs = l25;
        this.dedicatedStunQualityStats = dedicatedStunQualityStats;
    }
}
