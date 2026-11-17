package com.facebook.traffic.nts.tasos.bwemanager;

/* loaded from: classes6.dex */
public interface ClientVideoEstimateSnapshot {
    long getEstimatedBitrate(long j, Long l);

    long getEstimatedRawBitrate();

    long getEstimatedRawBitrateStdDev();

    long getEstimatedTtfbMs();

    long getEstimatedTtfbStdDev();

    Long getTimestamp();

    boolean hasServerBwe();
}
